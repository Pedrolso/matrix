package application;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("digite numero de linhas da matriz: ");
        int l = sc.nextInt();

        System.out.println("digite numero de colunas da matriz");
        int c = sc.nextInt();

        int[][] matrix = new int[l][c];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        System.out.println("------");

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("digite numero para encontrar");
        int find = sc.nextInt();

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] == find) {
                    System.out.println("posicao "+i + "," + j);
                    if(){

                    }
                }
            }
        }
    }
}
