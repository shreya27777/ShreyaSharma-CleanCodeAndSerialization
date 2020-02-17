package com;

import java.io.*;
import java.util.Scanner;
public class App
{
    public static void main( String[] args )
    {
        Scanner sc=new Scanner(System.in);
        calculate c=new calculate();
        PrintWriter out=new PrintWriter(System.out);
        out.print("enter principal:");
        out.flush();
        double principal=sc.nextDouble();
        out.print("enter rateOfInterest:");
        out.flush();
        double rateOfInterest=sc.nextDouble();
        out.print("enter timeInYears:");
        out.flush();
        double timeInYears=sc.nextDouble();
        out.flush();
        out.print("Press 1 to calculate simple interest,press 2 to calculate compound interest:");
        out.flush();
        int p=sc.nextInt();
        if(p==1){
            out.print("cost is"+c.simpleInterest(principal,rateOfInterest,timeInYears));
        }else{
            out.print("cost is"+c.compoundInterest(principal,rateOfInterest,timeInYears));
        }
        out.flush();
    }
}


