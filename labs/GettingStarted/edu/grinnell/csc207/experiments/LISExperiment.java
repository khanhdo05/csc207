package edu.grinnell.csc207.experiments;
import edu.grinnell.csc207.util.ArrayUtils;

/**
 * Some experiments with the <code>longestIncreasingSubsequence</code> method.
 */
public class LISExperiment {
  /**
   *
   * @param pen
   *   Where we print the output
   * @param vals
   *   The values we'll be printing.
   */
  static void lisExperiment(java.io.PrintWriter pen, int[] vals) {
    pen.print("longest increasing subsequence count (" + java.util.Arrays.toString(vals) + ") = ");
    pen.flush();
    pen.println(ArrayUtils.longestIncreasingSubsequence(vals));
  } 

  /**
   * Run our experiments.
   *
   * @param args
   *  Command-line arguments (ignored)
   */
  public static void main(String[] args) {
    java.io.PrintWriter pen = new java.io.PrintWriter(System.out, true);
    lisExperiment(pen, new int[] {3, 7, -10, 2, 8, 9, 5, 1});
  } // main(String[])
}