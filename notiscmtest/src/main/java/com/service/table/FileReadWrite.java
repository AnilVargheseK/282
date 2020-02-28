package com.service.table;

import com.util.notistest.PropertiesLoader;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class FileReadWrite {
   
    public static String getSeqNum() throws IOException {
        Date date = new Date();
        SimpleDateFormat formatter = new SimpleDateFormat("ddMMyyyy");
        String strDate = formatter.format(date);
        String file = PropertiesLoader.getinstance().getProperty("sequence_num")+strDate+".txt";
        return file;
    }
    
    public String seqNumWrite(String seqNo) {
        try {
//            FileWriter writer = new FileWriter("F:\\Notis\\notisCM-Test-SeqNo.txt");
            FileWriter writer = new FileWriter(getSeqNum());
            writer.write(seqNo);
            System.out.println("File write  :" + seqNo);
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    public static String seqNumRead() throws IOException {

//        File file = new File("F:\\Notis\\notisCM-Test-SeqNo.txt");
        File file = new File(getSeqNum());
        //if the file not exist create one
        String tradeInquiry ;
        String line = "0";
        if (!file.exists()) {
            file.createNewFile();
            
//            try (FileWriter writer = new FileWriter("F:\\Notis\\notisCM-Test-SeqNo.txt")) {
            try (FileWriter writer = new FileWriter(getSeqNum())) {
                writer.write(line);
            }
            
        }
            try {
                BufferedReader bufferreader = new BufferedReader(new FileReader(getSeqNum()));
                while ((line = bufferreader.readLine()) != null) {
                    System.out.println("read line : " + line);
                    break;
//                    line = bufferreader.readLine();
                    // You can append it to another String to get the whole text or anything you like
                }
                bufferreader.close();
            } catch (IOException ex) {
                ex.printStackTrace();
            }
       
         tradeInquiry = line + "," + "ALL" + "," + ",";
         System.out.println(tradeInquiry);
        return tradeInquiry;
        

    }

//    public static void main(String[] args) throws IOException {
//        seqNumRead();
//    }
    
}
