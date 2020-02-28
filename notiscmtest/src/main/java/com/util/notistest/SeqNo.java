package com.util.notistest;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class SeqNo {

//    public static void main(String[] args) throws IOException {
//        SeqNo n = new SeqNo();
//        n.seqNum();
//    }
//    public void newfile() {
//    }

    public int seqNum() throws FileNotFoundException, IOException {
        int a = 0;
        String last1 = null;
        // checking if file is empty
        // if file doesn't exits then also length() method will consider
        // it empty.
        Date date = new Date();
        SimpleDateFormat formatter = new SimpleDateFormat("ddMMyyyy");
        String strDate = formatter.format(date);
        
//        String file = "F:\\Notis\\NotisMsg" + strDate + "-CM.txt";
        String file = PropertiesLoader.getinstance().getProperty("message_seq_num")+ strDate + "-CM.txt";

        File newFile = new File(file);
        boolean result;
        try {
            result = newFile.createNewFile();  //creates a new file  
            if (result) {      // test if successfully created a new file    
                System.out.println("file created " + newFile.getCanonicalPath()); //returns the path string  
            } else {
                System.out.println("File already exist at location: " + newFile.getCanonicalPath());
            }
        } catch (IOException e) {
            e.printStackTrace();    //prints exception if any  
        }

        if (newFile.length() == 0) {
            System.out.println("File is empty ...");
            try {
                FileWriter writer = new FileWriter(file);
                a = 1;
                writer.write(Integer.toString(a));
                writer.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        } else {

            BufferedReader input = new BufferedReader(new FileReader(file));
            String last = null;
            String line;
            while ((line = input.readLine()) != null) {
                last = line;
            }
            System.out.println(last + " <---last line");
            System.out.println("File is not empty ...");

            a = Integer.parseInt(last) + 1;
            String last2 = Integer.toString(a);
            try {
                FileWriter writer = new FileWriter(file, true);
                BufferedWriter bufferedWriter = new BufferedWriter(writer);
                bufferedWriter.newLine();
                bufferedWriter.write(last2);

//            bufferedWriter.write("See You Again!");
//                System.out.println("---bufff");
                bufferedWriter.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        BufferedReader input1 = new BufferedReader(new FileReader(file));

        String line1;
        while ((line1 = input1.readLine()) != null) {
            last1 = line1;
        }
        System.out.println(last1 + " <---last line");
        System.out.println("File is not empty ...");

        a = Integer.parseInt(last1);
        System.out.println(a);
        return a;
    }
}
