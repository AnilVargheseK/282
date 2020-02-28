    
package com.util.notistest;

import java.io.IOException;

public class MessageCode {

    public static String getMessageCode(String msg) throws IOException {

        String fieldIdentifier = msg.substring(0, 4);
        System.out.println(fieldIdentifier + "  fi");

        String validation = msg.substring(4);
        System.out.println(validation + "  v");

        
        String fi= PropertiesLoader.getinstance().getProperty(fieldIdentifier);
        String v= PropertiesLoader.getinstance().getProperty(validation);
        
        
                      
//        String fi = null;
//        switch (fieldIdentifier) {
//            case "0101":
//                fi = "Entire Message";
//            break;
//            case "0102":
//                fi = "Invalid parameter : msgId";
//            break;
//            case "0105":
//                fi = "Invalid parameter : msgPrepDt";
//            break;
//            case "0106":
//                fi = "Invalid parameter : msgPrepTm";
//            break;
//            case "0109":
//                fi = "Invalid parameter : isApproval";
//            break;
//            case "0107":
//                fi = "Invalid parameter : seqNo";
//            break;
//            case "0108":
//                fi = "Invalid parameter : srchFilter";
//            break;
//            case "0110":
//                fi = "Invalid parameter : noOfRec";
//            break;
//        }
        
//        String v = null;
//        switch (validation) {
//            case "0000":
//                fi = "Submitted to server successfully: Entire Message";
//            break;
//            case "0200":
//                fi = "Mismatch in control and data record: Entire Message";
//            break;
//            case "0201":
//                fi = "Minimum Required Length: msgId";
//            break;
//            case "0202":
//                fi = "Maximum Required Length: msgId";
//            break;
//            case "0204":
//                fi = "Mandatory field: msgId, isApproval, noOfRec, seqNo, srchFilter, trdDate";
//            break;
//            case "0206":
//                fi = "Data Format like Msg Id / Date Format: msgId, trdDate";
//            break;
//            case "0207":
//                fi = "Minimum allowed value: seqNo, noOfRec";
//            break;
//            case "0208":
//                fi = "Maximum allowed value: noOfRec";
//            break;
//            case "0209":
//                fi = "Invalid Value: seqNo, isApproval, srchFilter, trdDate";
//            break;
//            case "0241":
//                fi = "System Error";
//            break;
//            case "0242":
//                fi = "Service Unavailable";
//            break;
//            case "0243":
//                fi = "Request Parsing Error : Invalid Request Structure";
//            break;
//        }
   
        
        return fi+"\n"+v;
//        return null;
        
    }

}
