package com.company;

import java.util.Random;

public class Main {

  public static void main(String[] args) {
    // write your code here
    Random r = new Random();
    int low = 0;
    int high = 3;

    for (int i = 0; i < 100; i++) {
      int randInt = r.nextInt(high + 1);
      System.out.println(randInt);
    }
  }
}