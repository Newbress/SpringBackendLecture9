package org.example.Head04_Algorithm.example02;

import java.io.*;

public class BufferedReaderWriterExample {
    public static void main(String[] args) {
//        try(BufferedWriter bw = new BufferedWriter(new FileWriter("example.txt"))) {
//            bw.write("this is first line.");
//            bw.newLine();
//            bw.write("this is second line.");
//            bw.newLine();
//            bw.write("this is third line.");
//            bw.newLine();
//        }catch(IOException e) {
//            e.printStackTrace();
//        }

        try(BufferedReader br = new BufferedReader(new FileReader("example.txt"))) {
            String line;
            while((line = br.readLine()) != null) {
                System.out.println(line);
            }
        }catch(IOException e) {
            e.printStackTrace();
        }

        try(BufferedWriter bw = new BufferedWriter(new FileWriter("output.txt"))) {
            bw.write("Hello File I/O");
            bw.newLine();
            bw.write("Using BufferedWriter for better performance");
            bw.newLine();
        }catch(IOException e) {
            e.printStackTrace();
        }
    }
}
