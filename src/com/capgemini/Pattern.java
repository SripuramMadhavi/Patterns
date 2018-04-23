package com.capgemini;

/**
 * @author madhavs
 *
 */
public class Pattern {

  public static void main(String[] args) {

    for (int i = 1; i <= 4; i++) {
      for (int j = 1; j < i; j++) {

        if (i == 2) {
          System.out.print(" ");
        }
        System.out.print("*");
      }
      System.out.println();
    }
  }

}
