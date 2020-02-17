package com;

import java.io.PrintWriter;
import java.util.Scanner;

public class contructionCost {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        material m=new material();
        PrintWriter out=new PrintWriter(System.out);
        out.print("Press 1200 to use standard material,press 1500 to use above standard, 1800 to use" +
                "high stadard material,2500 to use above standard " +
                "and automated home");
        out.flush();
        int materialCost=sc.nextInt();
        out.print("enter area of house");
        out.flush();
        int area=sc.nextInt();

        out.print("cost is :"+m.cost(materialCost,area));
        out.flush();
    }
}
