package array2d;

import java.util.*;

public class Array2d {

  public static void inputMatrix(int[][] matrix) {
    // INPUT Matrix
    Scanner sc = new Scanner(System.in);
    for (int i = 0; i < matrix.length; i++) {
      for (int j = 0; j < matrix[0].length; j++) {
        matrix[i][j] = sc.nextInt();
      }
    }
  }

  // OUTPUT Matrix
  public static void outputMatrix(int[][] matrix) {
    for (int i = 0; i < matrix.length; i++) {
      for (int j = 0; j < matrix[0].length; j++) {
        System.out.print(matrix[i][j] + " ");
      }
      System.out.println();
    }
  }

  // SEARCH IN MATRIX
  public static boolean searchInMatrix(int[][] matrix, int key) {
    for (int i = 0; i < matrix.length; i++) {
      for (int j = 0; j < matrix[0].length; j++) {
        if (matrix[i][j] == key) {
          System.out.println("Found element at (" + i + "," + j + ")");
          return true;
        }
      }
    }

    System.out.println("Key not Exist");
    return false;
  }

  // BIGGEST IN MATRIX
  public static int biggestInMatrix(int[][] matrix) {
    int biggest = Integer.MIN_VALUE;

    for (int i = 0; i < matrix.length; i++) {
      for (int j = 0; j < matrix[0].length; j++) {
        if (biggest < matrix[i][j]) {
          biggest = matrix[i][j];
        }
      }
    }

    return biggest;
  }

  public static void main(String[] args) {
    int[][] matrix = new int[4][3];

    inputMatrix(matrix);
    outputMatrix(matrix);
    System.out.println("Biggest = " + biggestInMatrix(matrix));
  }
}
