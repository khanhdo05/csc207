package edu.grinnell.csc207.main;
public class FizzBuzzOne {
    /**
     * Print 100 rounds of FizzBuzz to stdout.
     *
     * @param args
     *   The standard command-line arguments (which we ignore).
     * @exception Exception
     *   When something goes wrong with the I/O.
     */
    public static void main(String[] args) throws Exception {
      java.io.PrintWriter stdpen = new java.io.PrintWriter(System.out, true);

      edu.grinnell.csc207.util.FizzBuzz.fizzbuzz(stdpen, 100);
      stdpen.close();
    } // main(String[])
}