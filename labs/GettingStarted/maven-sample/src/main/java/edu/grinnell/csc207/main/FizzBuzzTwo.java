package edu.grinnell.csc207.main;
import edu.grinnell.csc207.util.FizzBuzz;
import java.io.PrintWriter;
public class FizzBuzzTwo {
    /**
     * Print 1000 rounds of FizzBuzz to the file zz.txt.
     *
     * @param args
     *   The standard command-line arguments (which we ignore).
     * @exception Exception
     *   When something goes wrong with the I/O.
     */
    public static void main(String[] args) throws Exception {
      PrintWriter filepen = 
          new java.io.PrintWriter(new java.io.File("zz.txt"));
      FizzBuzz.fizzbuzz(filepen, 1000);
      filepen.close();
    } // main(String[])
}