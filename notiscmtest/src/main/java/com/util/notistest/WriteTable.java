package com.util.notistest;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JTable;

public class WriteTable {

    public static void setTableData(JTable jTable1) throws IOException {
        
        Date date = new Date();
        SimpleDateFormat formatter = new SimpleDateFormat("yyyyMMdd");
        String strDate = formatter.format(date);

        File file = new File("F:\\Notis\\TradeCM"+strDate+".txt");
        
        //if the file not exist create one
        if (!file.exists()) {
            file.createNewFile();
        }
//        FileWriter fw1 = new FileWriter(file.getAbsoluteFile());
//        BufferedWriter bw = new BufferedWriter(fw1);
        
        BufferedWriter bw = new BufferedWriter(new FileWriter(file, true));
        //loop for jtable rows
        for (int i = 0; i < jTable1.getRowCount(); i++) {
            //loop for jtable column
//            for (int j = 0; j < jTable1.getColumnCount(); j++) {
//                bw.write(jTable1.getModel().getValueAt(i, j) + "    ,");
//            }
//            String a = (String) jTable1.getValueAt(i, 0);
            
            
            String a=(String)jTable1.getModel().getValueAt(i, 0);
            String b=(String)jTable1.getModel().getValueAt(i, 1);
            String c=(String)jTable1.getModel().getValueAt(i, 2);
            String d=(String)jTable1.getModel().getValueAt(i, 3);
            String e=(String)jTable1.getModel().getValueAt(i, 4);
            String f=(String)jTable1.getModel().getValueAt(i, 5);
            String g=(String)jTable1.getModel().getValueAt(i, 6);
            String h=(String)jTable1.getModel().getValueAt(i, 7);
            String ij=(String)jTable1.getModel().getValueAt(i, 8);
            String j=(String)jTable1.getModel().getValueAt(i, 9);
            String k=(String)jTable1.getModel().getValueAt(i, 10);
            String l=(String)jTable1.getModel().getValueAt(i, 11);
            String m=(String)jTable1.getModel().getValueAt(i, 12);
            String n=(String)jTable1.getModel().getValueAt(i, 13);
            String no=(String)jTable1.getModel().getValueAt(i, 14);
            String o=(String)jTable1.getModel().getValueAt(i, 15);
            String p=(String)jTable1.getModel().getValueAt(i, 16);
            String q=(String)jTable1.getModel().getValueAt(i, 17);
            String r=(String)jTable1.getModel().getValueAt(i, 18);
            String s=(String)jTable1.getModel().getValueAt(i, 19);
            String t=(String)jTable1.getModel().getValueAt(i, 20);
            String u=(String)jTable1.getModel().getValueAt(i, 21);
            String v=(String)jTable1.getModel().getValueAt(i, 22);
            String w=(String)jTable1.getModel().getValueAt(i, 23);
            String x=(String)jTable1.getModel().getValueAt(i, 24);
            String y=(String)jTable1.getModel().getValueAt(i, 25);
            String z=(String)jTable1.getModel().getValueAt(i, 26);
            String ab=(String)jTable1.getModel().getValueAt(i, 27);
            String ac=(String)jTable1.getModel().getValueAt(i, 28);
            String ad=(String)jTable1.getModel().getValueAt(i, 29);
            String ae=(String)jTable1.getModel().getValueAt(i, 30);
//            String af=(String)jTable1.getModel().getValueAt(i, 31);
            
            
            
            
 bw.write(alignUtil.alignData(a, 1, 15)+ ",");
 bw.write(alignUtil.alignData(b, 1, 5)+ ",");
 bw.write(alignUtil.alignData(c, 1, 2)+ ",");
 bw.write(alignUtil.alignData(d, 1, 20)+ ",");
 bw.write(alignUtil.alignData(e, 1, 10)+ ",");
 bw.write(alignUtil.alignData(f, 1, 15)+ ",");
 bw.write(alignUtil.alignData(g, 1, 10)+ ",");
 bw.write(alignUtil.alignData(h, 1, 5)+ ",");
 bw.write(alignUtil.alignData(ij, 1, 10)+ ",");
 bw.write(alignUtil.alignData(j, 1, 15)+ ",");
 bw.write(alignUtil.alignData(k, 1, 5)+ ",");
 bw.write(alignUtil.alignData(l, 1, 20)+ ",");
 bw.write(alignUtil.alignData(m, 1, 5)+ ",");
 bw.write(alignUtil.alignData(n, 1, 10)+ ",");
 bw.write(alignUtil.alignData(no, 1, 5)+ ",");
 bw.write(alignUtil.alignData(o, 1, 10)+ ",");
 bw.write(alignUtil.alignData(p, 1, 10)+ ",");
 bw.write(alignUtil.alignData(q, 1, 5)+ ",");
 bw.write(alignUtil.alignData(r, 1, 20)+ ",");
 bw.write(alignUtil.alignData(s, 1, 20)+ ",");
 bw.write(alignUtil.alignData(t, 1, 15)+ ",");
 bw.write(alignUtil.alignData(u, 1, 10)+ ",");
 bw.write(alignUtil.alignData(v, 1, 5)+ ",");
 bw.write(alignUtil.alignData(w, 1, 20)+ ",");
 bw.write(alignUtil.alignData(x, 1, 5)+ ",");
 bw.write(alignUtil.alignData(y, 1, 10)+ ",");
 bw.write(alignUtil.alignData(z, 1, 10)+ ",");
 bw.write(alignUtil.alignData(ab, 1, 5)+ ",");
 bw.write(alignUtil.alignData(ac, 1, 5)+ ",");
 bw.write(alignUtil.alignData(ad, 1, 10)+ ",");
 bw.write(alignUtil.alignData(ae, 1, 10)+ ",");
// bw.write(alignUtil.alignData(af, 1, 10)+ "");
 
// bw.write(jTable1.getModel().getValueAt(i, 30) + "  ,");
// bw.write(jTable1.getModel().getValueAt(i, 31) + "  ,");
                   //break line at the begin 
            //break line at the end 
//                    bw.write("\n_________\n");
            bw.write(System.getProperty("line.separator"));
        }
        //close BufferedWriter
        bw.close();
        //close FileWriter 
//        fw1.close();

    }
}
