/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mavenproject1;

/**
 *
 * @author SAPNA
 */
public class Average {
    public static void main(String args[]){
        double nums[]={10.1,11.2,12.3,13.4,14.5};
        double result= 0;
        int i;
        for(i=0; i<5; i++)
            result = result + nums[i];
       System.out.println("Average is" + result /5);
       
        }
    }

