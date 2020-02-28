package com.util.notistest;

import com.bean.notiscmtest.TradeStructure;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

public class DataText {

//    public static void readData(String[] arrData,String mktSts,String currTrdDate,String maxSeqNo,String noOfRec) throws IOException, ParseException {
    public static void readData(List<String> ctrl,String[] arrData) throws IOException, ParseException {
//    public static void readData(TradeStructure ts) throws IOException, ParseException {

        Date date = new Date();
        SimpleDateFormat formatter = new SimpleDateFormat("yyyyMMdd");
        String strDate = formatter.format(date);

        String filePath = PropertiesLoader.getinstance().getProperty("data_write");

        File file = new File(filePath + strDate + ".txt");

        if (!file.exists()) {
            file.createNewFile();
        }

        BufferedWriter bw = new BufferedWriter(new FileWriter(file, true));
        
        
        
        System.out.println("ctrl  : " + ctrl.toString());
        TradeStructure t = new TradeStructure(ctrl.get(0), ctrl.get(1), ctrl.get(2), ctrl.get(3), ctrl.get(4), ctrl.get(5));
        
        
        

        for (String ar : arrData) {
            List<String> items = Arrays.asList(ar.split("\\s*,\\s*"));
            System.out.println("arrayitems  : " + items.toString());
            
            
            String mktSts=ctrl.get(0);
            String currTrdDate=ctrl.get(1);
            String maxSeqNo=ctrl.get(4);
            String noOfRec=ctrl.get(5);

            String seqNo = items.get(0);
            String mkt = items.get(1);
            String trdNo = items.get(2);
            String trdTm = items.get(3);
////            long longtime = Long.valueOf(trdTm);;
////            SimpleDateFormat dateFormat = new SimpleDateFormat("dd MMM yyyy HH:mm:ss");
////            Date time = new Date(longtime);
////            String tradeTime = dateFormat.format(time);

            String tkn = items.get(4);
            String trdQty = items.get(5);
            String trdPrc = items.get(6);
            String bsFlg = items.get(7);
            String ordNo = items.get(8);
            String brnCd = items.get(9);
            String usrId = items.get(10);
            String proCli = items.get(11);
            String cliActNo = items.get(12);
            String cpCd = items.get(13);
            String remarks = items.get(14);
            String actTyp = items.get(15);
            String TCd = items.get(16);
            String ordTm = items.get(17);
////            int time1 = Integer.parseInt(ordTm);
////            SimpleDateFormat sdf = new SimpleDateFormat("dd MMM yyyy HH:mm:ss");
////            Date resultdate = new Date(time1);
////            String orderTime = sdf.format(resultdate);

            String mktTyp = items.get(18);
            String aucNo = items.get(19);
            String stpTyp = items.get(20);
            String oppBrokerCd = items.get(21);
            String trdTrigPrc = items.get(22);
            String ctclId = items.get(23);
            String ordInst = items.get(24);
            String secIdentifier = items.get(25);
            String sym = items.get(26);
            String ser = items.get(27);
            String secName = items.get(28);
            String intrumentType = items.get(29);
//            bw.write(alignUtil.alignData(seqNo, 1, 8) + ",");
//            bw.write(alignUtil.alignData(mkt, 1, 1) + ",");
//            bw.write(alignUtil.alignData(trdNo, 1, 8) + ",");
//            bw.write(alignUtil.alignData(trdTm, 1, 8) + ",");
//            bw.write(alignUtil.alignData(tkn, 1, 4) + ",");
//            bw.write(alignUtil.alignData(trdQty, 1, 4) + ",");
//            bw.write(alignUtil.alignData(trdPrc, 1, 4) + ",");
//            bw.write(alignUtil.alignData(bsFlg, 1, 1) + ",");
//            bw.write(alignUtil.alignData(ordNo, 1, 8) + ",");
//            bw.write(alignUtil.alignData(brnCd, 1, 4) + ",");
//            bw.write(alignUtil.alignData(usrId, 1, 5) + ",");
//            bw.write(alignUtil.alignData(proCli, 1, 2) + ",");
//            bw.write(alignUtil.alignData(cliActNo, 1, 20) + ",");
//            bw.write(alignUtil.alignData(cpCd, 1, 12) + ",");
//            bw.write(alignUtil.alignData(remarks, 1, 25) + ",");
//            bw.write(alignUtil.alignData(actTyp, 1, 2) + ",");
//            bw.write(alignUtil.alignData(TCd, 1, 2) + ",");
//            bw.write(alignUtil.alignData(ordTm, 1, 8) + ",");
//            bw.write(alignUtil.alignData(booktype, 1, 2) + ",");
//            bw.write(alignUtil.alignData(oppTmCd, 1, 1) + ",");
//            bw.write(alignUtil.alignData(ctclId, 1, 8) + ",");
//            bw.write(alignUtil.alignData(status, 1, 1) + ",");
//            bw.write(alignUtil.alignData(TmCd, 1, 5) + ",");
//            bw.write(alignUtil.alignData(sym, 1, 10) + ",");
//            bw.write(alignUtil.alignData(ser, 1, 2) + ",");
//            bw.write(alignUtil.alignData(inst, 1, 6) + ",");
//            bw.write(alignUtil.alignData(expDt, 1, 4) + ",");
//            bw.write(alignUtil.alignData(strPrc, 1, 4) + ",");
//            bw.write(alignUtil.alignData(optType, 1, 2) + ",");
            
            
           
            bw.write(mktSts + "|");
            bw.write(currTrdDate + "|");
            bw.write(maxSeqNo + "|");
            bw.write(noOfRec + "|");

            bw.write(seqNo + "|");
            bw.write(mkt + "|");
            bw.write(trdNo + "|");
            bw.write(trdTm + "|");
            bw.write(tkn + "|");
            bw.write(trdQty + "|");
            bw.write(trdPrc + "|");
            bw.write(bsFlg + "|");
            bw.write(ordNo + "|");
            bw.write(brnCd + "|");
            bw.write(usrId + "|");
            bw.write(proCli + "|");
            bw.write(cliActNo + "|");
            bw.write(cpCd + "|");
            bw.write(remarks + "|");
            bw.write(actTyp + "|");
            bw.write(TCd + "|");
            bw.write(ordTm + "|");
            bw.write(mktTyp + "|");
            bw.write(aucNo + "|");
            bw.write(stpTyp + "|");
            bw.write(oppBrokerCd + "|");
            bw.write(trdTrigPrc + "|");
            bw.write(ctclId + "|");
            bw.write(ordInst + "|");
            bw.write(secIdentifier + "|");
            bw.write(sym + "|");
            bw.write(ser + "|");
            bw.write(secName + "|");
            bw.write(intrumentType + "|");
            bw.write(System.getProperty("line.separator"));
            
            TradeStructure ts = new TradeStructure(items.get(0), items.get(1), items.get(2), items.get(3), items.get(4), items.get(5), items.get(6),
                        items.get(7), items.get(8), items.get(9), items.get(10), items.get(11), items.get(12),
                        items.get(13), items.get(14), items.get(15), items.get(16), items.get(17), items.get(18), items.get(19),
                        items.get(20), items.get(21), items.get(22), items.get(23), items.get(24), items.get(25), items.get(26), items.get(27), items.get(28),items.get(29));
            
        bw.write(t.getMktSts()+ "|");
        bw.write(t.getCurrTrdDate()+ "|");
        bw.write(t.getMaxSeqNo()+ "|");
        bw.write(t.getNoOfRec()+ "|");

        bw.write(ts.getSeqNo() + "|");
        bw.write(ts.getMkt() + "|");
        bw.write(ts.getTrdNo() + "|");
        bw.write(ts.getTrdTm() + "|");
        bw.write(ts.getTkn() + "|");
        bw.write(ts.getTrdQty() + "|");
        bw.write(ts.getTrdPrc() + "|");
        bw.write(ts.getBsFlg() + "|");
        bw.write(ts.getOrdNo() + "|");
        bw.write(ts.getBrnCd() + "|");
        bw.write(ts.getUsrId() + "|");
        bw.write(ts.getProCli() + "|");
        bw.write(ts.getCliActNo() + "|");
        bw.write(ts.getCpCd() + "|");
        bw.write(ts.getRemarks() + "|");
        bw.write(ts.getActTyp() + "|");
        bw.write(ts.getTCd() + "|");
        bw.write(ts.getOrdTm() + "|");
        bw.write(ts.getMktTyp() + "|");
        bw.write(ts.getAucNo() + "|");
        bw.write(ts.getStpTyp() + "|");
        bw.write(ts.getOppBrokerCd() + "|");
        bw.write(ts.getTrdTrigPrc() + "|");
        bw.write(ts.getCtclId() + "|");
        bw.write(ts.getOrdInst() + "|");
        bw.write(ts.getSecIdentifier() + "|");
        bw.write(ts.getSym() + "|");
        bw.write(ts.getSer() + "|");
        bw.write(ts.getSecName() + "|");
        bw.write(ts.getIntrumentType() + "|");
        bw.write(System.getProperty("line.separator"));

            bw.write("Market Status : "+mktSts +"\n");
            bw.write("Current Trade Date : "+currTrdDate +"\n");
            bw.write("Max sequence number sent in response : "+maxSeqNo +"\n");
            bw.write("Count of trades sent in the response : "+noOfRec +"\n");
            
            bw.write("Unique Sequence Number : "+seqNo +"\n");
            bw.write( "Market Type : "+mkt + "  "+ts.getMkt() +"\n");
            bw.write( "Trade Number : "+trdNo+"\n");
            bw.write(  "Trade Time : "+trdTm +"  "+ts.getTrdTm()+"\n");
            bw.write("Token :"+ tkn +"\n");
            bw.write("Trade Quantity : " + trdQty+"\n");;
            bw.write("Trade Price : "+ trdPrc+"\n");
            bw.write( "Buy Sell Flag : "+bsFlg+"    "+ts.getBsFlg()+"\n");
            bw.write( "Order Number : "+ordNo+"\n");
            bw.write( "Branch Code : "+brnCd+"\n");;
            bw.write( "User Id : " + usrId+"\n");
            bw.write( "Client Type : " + proCli+"   " + ts.getProCli()+"\n");
            bw.write( "Client account number : "+cliActNo+"\n");
            bw.write(  "Custodial participant Id : "+cpCd+"\n");
            bw.write( "Remarks : "+ remarks+"\n");
            bw.write( "Activity Type : "+ actTyp+"  "+ts.getActTyp()+"\n");
            bw.write(  "Transaction Code :"+TCd+"  "+ts.getTCd()+"\n");
            bw.write( "Order Time : "+ ordTm+"  "+ts.getOrdTm()+"\n");
            bw.write( "Market Book Type : "+ mktTyp+"  "+ts.getMktTyp()+"\n");
            bw.write( "Auction Number : "+ aucNo+"\n");
            bw.write( "Trade Settlement Type : "+stpTyp+"\n");
            bw.write(  "Opposite Broker Code : " +oppBrokerCd+"\n");
            bw.write(  "Trade Trigger Price : "+trdTrigPrc+"\n");
            bw.write( "CTCL code : "+ ctclId+"\n");
            bw.write( "Order Institution : "+ ordInst+"\n");
            bw.write( "Trade Secondary Identifier : "+ secIdentifier+"\n");
            bw.write( "Symbol : "+ sym+"\n");
            bw.write(  "Series : "+ser+"\n");
            bw.write(  "Security Name : "+secName+"\n");
            bw.write(  "Instrument Type : "+intrumentType+"\n");
            bw.write(System.getProperty(  "line.separator"));
        }
        bw.close();
    }
}
