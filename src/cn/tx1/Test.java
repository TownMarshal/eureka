package cn.tx1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Test {


    public static void main(String[] args) throws IOException {


        BufferedReader br   = new BufferedReader(new InputStreamReader((System.in)));
        String line = null;
        while((line = br.readLine()) != null){
            System.out.println(line);
        }
    }
}
