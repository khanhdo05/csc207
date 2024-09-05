package edu.grinnell.csc207.experiments;
import edu.grinnell.csc207.util.ArrayUtils;

public class RevExperiments {
    /**
     * Run one experiment on the `min` method.
     *
     * @param pen
     *   Where we print the output
     * @param vals
     *   The values we'll be printing.
     */
    static void revExperiment(java.io.PrintWriter pen, int[] vals) {
      pen.print("rev(" + java.util.Arrays.toString(vals) + ") = ");
      pen.flush();
      ArrayUtils.rev(vals);
      for (int num : vals) {
        pen.print(num);
      }
    } 
  
    /**
     * Run our experiments.
     *
     * @param args
     *  Command-line arguments (ignored)
     */
    public static void main(String[] args) {
      java.io.PrintWriter pen = new java.io.PrintWriter(System.out, true);
      revExperiment(pen, new int[] {3, 7, 10, 2, 9, 1});
      revExperiment(pen, new int[] {1, 2, 3, 4, 5});
      revExperiment(pen, new int[] {-50, -40, -10, -80, -5});
    } // main(String[])
  } 
