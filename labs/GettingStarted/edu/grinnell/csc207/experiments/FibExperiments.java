package edu.grinnell.csc207.experiments;
import edu.grinnell.csc207.util.ArrayUtils;

/**
 * Some experiments with the <code>longestIncreasingSubsequence</code> method.
 */
public class FibExperiments {
  /**
   *
   * @param pen
   *   Where we print the output
   * @param vals
   *   The values we'll be printing.
   */
  static void fibExperiments(java.io.PrintWriter pen, int val) {
    pen.print("fibs (" + val + ") = ");
    pen.flush();
    int[] arr = ArrayUtils.fibs(val);
    for (int num : arr) {
      pen.println(num);
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
    fibExperiments(pen, 10);
  } // main(String[])
}