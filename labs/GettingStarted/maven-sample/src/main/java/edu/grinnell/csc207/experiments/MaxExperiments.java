package edu.grinnell.csc207.experiments;
import edu.grinnell.csc207.util.ArrayUtils;

/**
 * Some experiments with the <code>min</code> method.
 */
public class MaxExperiments {
  /**
   * Run one experiment on the `max` method.
   *
   * @param pen
   *   Where we print the output
   * @param vals
   *   The values we'll be printing.
   */
  static void maxExperiment(java.io.PrintWriter pen, int[] vals) {
    pen.print("max(" + java.util.Arrays.toString(vals) + ") = ");
    pen.flush();
    pen.println(ArrayUtils.max(vals));
  } // minExperiment(java.io.PrintWriter, int[])

  /**
   * Run our experiments.
   *
   * @param args
   *  Command-line arguments (ignored)
   */
  public static void main(String[] args) {
    java.io.PrintWriter pen = new java.io.PrintWriter(System.out, true);
    maxExperiment(pen, new int[] {3, 7, 10, 2, 9, 1});
    maxExperiment(pen, new int[] {1, 2, 3, 4, 5});
    maxExperiment(pen, new int[] {-50, -40, -10, -80, -5});
  } // main(String[])
} 