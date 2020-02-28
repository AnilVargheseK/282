/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.util.notistest;

/**
 *
 * @author trainee4
 */
public class alignUtil {
    
    public static String alignData(String abc,int alignTo,int totWidth){
            String space="",data="";
            if(abc.length()<totWidth){
                int itr=0;
                while(itr<totWidth-abc.length()){
                    space+=" ";
                    itr++;
                }
            }
            if(alignTo==0)
                data=space+abc;
            else
                 data=abc+space;
            return data;
    }
    
    
}
