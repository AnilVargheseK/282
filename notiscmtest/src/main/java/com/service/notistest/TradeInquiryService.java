package com.service.notistest;

import com.service.table.FileReadWrite;
import com.util.notistest.PropertiesLoader;
import com.util.notistest.Util;
import java.awt.Component;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.URL;
import javax.net.ssl.HttpsURLConnection;
import javax.swing.JOptionPane;
import org.json.JSONObject;

public class TradeInquiryService {

    private static final String DATA_FORMAT = "CSV:CSV";
    private static final String VERSION = "1.0";

    public String getAllTradeData(String nonce,String accessToken) throws Exception {

        String authorization = Util.getinstance().getInqAuthorization(accessToken);

//        String msgId = Util.getMsgId();
        System.out.println(nonce + "<- nonce");

        String postData = this.AllTradeRequestData();
        System.out.println("post Data  : " + postData);
//        String tradeInquirytHost = "www.devconnect2nse.com";
        String tradeInquirytHost = PropertiesLoader.getinstance().getProperty("tradeinquiry.host");
        String tradeInquiryEndpoint = PropertiesLoader.getinstance().getProperty("tradeinquiry.endpoint");
//        String tradeInquiryEndpoint = "/inquiry-fo/trades-inquiry";
//        String tradeInquiryEndpoint = "/inquiry-fo/trades-inquiry";
        String urlString = "https://" + tradeInquirytHost + tradeInquiryEndpoint;
        
        System.out.println(urlString);

        URL url = new URL(urlString);
        HttpsURLConnection connection = (HttpsURLConnection) url.openConnection();
        connection.setRequestMethod("POST");
        connection.setRequestProperty("Content-Type", "application/json");
        connection.setRequestProperty("Authorization", authorization);
        connection.setRequestProperty("nonce", nonce);                                 //
        connection.setDoOutput(true);

        try (OutputStream os = connection.getOutputStream()) {
            byte[] input = postData.getBytes("utf-8");
            os.write(input, 0, input.length);
            os.flush();
            os.close();
        }
        int responseCode = connection.getResponseCode();
        String rcode=Integer.toString(responseCode);
        System.out.println("POST Response Code Trade Inquiry :: " + responseCode);
        if(responseCode!=200){
            String resCode=PropertiesLoader.getinstance().getProperty(rcode);
            Component frame = null;
                JOptionPane.showMessageDialog(frame,resCode,"Error Message",JOptionPane.PLAIN_MESSAGE);
                System.exit(0);
        }

        String responseLine = "";
        StringBuilder respone = new StringBuilder();
        try (BufferedReader br = new BufferedReader(new InputStreamReader(connection.getInputStream(), "utf-8"))) {
//            StringBuilder respone = new StringBuilder();
            responseLine = null;
            while ((responseLine = br.readLine()) != null) {
//                    System.out.println(responseLine);
                respone.append(responseLine.trim());
            }
            System.out.println("respone  : " + respone.toString());
//                br.close();
        }
        System.out.println("resLine......");
        return respone.toString();
    }
    /////   
    public String AllTradeRequestData() throws Exception {

        
        JSONObject j = new JSONObject();
        JSONObject data = new JSONObject();
        data.put("msgId", Util.getinstance().getMsgId());
        data.put("dataFormat", DATA_FORMAT);
        data.put("tradesInquiry", "0,ALL,,");   // 0 <- last sequence number
//        data.put("tradesInquiry", FileReadWrite.seqNumRead());   // 0 <- last sequence number
//        data.put("tradesInquiry", seqNumRead();   
        j.put("version", VERSION);
        j.put("data", data);

        System.out.println("trade request data: " + j);

        return j.toString();
    }

}
