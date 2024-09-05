package edu.grinnell.csc207.util;

import java.io.PrintWriter;
public class FizzBuzz {
    public static void main(String[] args) {
        PrintWriter pen = new PrintWriter(System.out,true);
        fizzbuzz(pen, 20);
    }

    public static void fizzbuzz(PrintWriter pen, int n) {
        for (int i = 0; i <= n; i++) {
            if (i == 0) {
                pen.println(0);
            }
            else if (i % 3 == 0 && i % 5 == 0) {
                pen.println("fizzbuzz");
            }
            else if (i % 5 == 0) {
                pen.println("buzz");
            }
            else if (i % 3 == 0) {
                pen.println("fizz");
            } 
            else {
                pen.println(i);
            }
        }
    }
}