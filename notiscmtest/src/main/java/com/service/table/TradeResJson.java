package com.service.table;

import com.service.notistest.TradeInquiryService;
import com.util.notistest.MessageCode;
import com.util.notistest.PropertiesLoader;
import java.awt.Component;
import java.io.IOException;
import java.sql.SQLException;
import javax.swing.JOptionPane;
//import org.codehaus.jackson.JsonNode;
//import org.codehaus.jackson.map.ObjectMapper;
import org.json.JSONObject;
import samptable.Notis2;

public class TradeResJson {

    public String getTradeRes(String nonce, String accessToken) throws IOException, SQLException, Exception {

        TradeInquiryService tis = new TradeInquiryService();
        String json = tis.getAllTradeData(nonce, accessToken);

//        ObjectMapper objectMapper = new ObjectMapper();
//        JsonNode jsonNode = objectMapper.readTree(json);
//        System.out.println(jsonNode.toString());
//
////        JsonNode tradesInquiry = jsonData.get("tradesInquiry");
////        System.out.println(tradesInquiry);
//        JsonNode status = jsonNode.path("status");
//        System.out.println(status.getTextValue());
//        String status1 = status.asText();
//        System.out.println(status1);
        JSONObject j = new JSONObject(json);
        System.out.println(j.toString());
        String status1 = j.getString("status");
        System.out.println(status1);

//////////
//        List<String> items = Arrays.asList(status1.split("\\s*,\\s*"));
//        System.out.println("items  : " + items.toString());
////////////////////
        System.out.println("-----------------");

//        JsonNode msg = jsonNode.path("messages");
//        JsonNode getCode = msg.get("code");
//        String messageCode=getCode.asText();
        String msg = j.getString("messages");
        JSONObject j1 = new JSONObject(msg);
        String messageCode = j1.getString("code");

        String messageCodeValid = null;
        if (!"success".equals(status1)) {
            messageCodeValid = MessageCode.getMessageCode(messageCode);
            Component frame = null;
            JOptionPane.showMessageDialog(frame, messageCodeValid, "Error Message", JOptionPane.PLAIN_MESSAGE);
            System.exit(0);
        }

//        JsonNode drNode = jsonNode.path("data");
////        Iterator<JsonNode> itr = drNode.getElements();
////        System.out.println("\n data :");
//        JsonNode get = drNode.get("tradesInquiry");
//         String tradesInquiry = get.asText();
        String data = j.getString("data");
        JSONObject j2 = new JSONObject(data);

        String tradesInquiry = j2.getString("tradesInquiry");

        return tradesInquiry;
    }

    public static void main(String[] args) throws IOException, SQLException {

        String configFile = args[0];
        System.out.println("Config :" + configFile);
        PropertiesLoader.getinstance().initialise(configFile);
        Notis2 n = new Notis2();
        n.setVisible(true);

    }

}
