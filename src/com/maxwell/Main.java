package com.maxwell;

import java.io.*;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        // write your code here
        try {
            BufferedReader br = new BufferedReader(
                    new FileReader("C:\\Users\\thelo\\Desktop\\output.txt"));

            String o;
            while ((o = br.readLine()) != null) {
                System.out.println(o);
            }
            br.close();
        } catch (Exception exception) {
            return;
        }
    }
}

