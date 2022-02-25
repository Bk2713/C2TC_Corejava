package com.corejavab9;

import java.io.*;
import java.util.*;

public class Caps {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
       
        int r = A.compareTo(B);
        String atemp = A.substring(0,1).toUpperCase()+A.substring(1);
        String btemp = B.substring(0,1).toUpperCase()+B.substring(1);;
        System.out.println(atemp+" "+btemp);
    }
}

