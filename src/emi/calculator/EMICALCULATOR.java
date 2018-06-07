/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package emi.calculator;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class EMICALCULATOR {

    public static void main(String[] args) {
        double a,b,c,d;
        
        Scanner scn =new Scanner(System.in);
        System.out.println("Enter Principal Amt:");
        a =scn.nextFloat();
        System.out.println("Enter Rate of Interest:");
        b =scn.nextFloat();
        System.out.println("Enter Time in years:");
        c =scn.nextFloat();
    
   d =(a*b*Math.pow(1+b,c))/(Math.pow(1+b,c)-1);
        System.out.println("Monthly EMI is =" +d);
    }
    
}
