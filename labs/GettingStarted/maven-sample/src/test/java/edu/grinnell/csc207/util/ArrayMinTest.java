package edu.grinnell.csc207.util;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

/**
 * Tests of the ArrayUtils.min method.
 */
public class ArrayMinTest {
  /**
   * An array with one value.
   */
  @Test
  public void oneValueTest() {
    assertEquals(0, ArrayUtils.min(new int[] { 0 }), "Just zero");
  } // oneValueTest()

  /**
   * Smallest at the front.
   */
  @Test
  public void testSmallestFirstTest() {
    assertEquals(1, ArrayUtils.min(new int[] { 1, 2, 3 }), "Smallest first");
  } // smallestFirstTest()

  /**
   * Smallest at the end
   */
  @Test
  public void testSmallestLastTest() {
    assertEquals(2, ArrayUtils.min(new int[] { 7, 4, 3, 8, 2 }),
        "Smallest last");
  } // smallestLastTest()
} // class ArrayMinTests