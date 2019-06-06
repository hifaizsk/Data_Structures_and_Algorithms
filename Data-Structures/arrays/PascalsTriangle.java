import java.util.Scanner;

// Example of a use case of 2D / Multi dimension Array
public class PascalsTriangle {

  private static void printPascalsTriangle(int number) {

    int[][] pt = new int[number][];

    for (int i = 0; i < number; i++) {
      pt[i] = new int[i + 1];

      pt[i][0] = 1;

      for (int j = 1; j < i; j++) {
        pt[i][j] = pt[i - 1][j - 1] + pt[i - 1][j];
      }

      pt[i][i] = 1;
    }

    for (int i = 0; i < number; i++) {
      for (int j = 0; j < pt[i].length; j++) {
        System.out.printf("%s ", pt[i][j]);
      }
      System.out.println();
    }
  }

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int number = scanner.nextInt();

    scanner.close();

    printPascalsTriangle(number);
  }

}
