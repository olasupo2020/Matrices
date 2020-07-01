package com.aipabot.TeamA;

/**
 * Hello world!
 *
 */
import java.util.Scanner;

public class App {

public static void main(String[] args) {

    int i, j, k;
    int[][] A = new int[2][2];
    int[][] B = new int[2][2];
    int[][] C = new int[2][2];



    Scanner input = new Scanner(System.in);

    System.out.println("Enter size of array A");
    int rowA = input.nextInt();
    int colA = input.nextInt();

    System.out.println("Enter size of array B");
    int rowB = input.nextInt();
    int colB = input.nextInt();


    //read 1 and 2

    System.out.println("Enter elements of array A");
    for (i = 0; i < rowA; i++) {
        for (j = 0; j < colA; j++) {

            A[i][j] = input.nextInt();

        }
        System.out.println();
    }
    System.out.println("Enter elements of array B");
    for (i = 0; i < rowB; ++i) {
        for (j = 0; j < colB; ++j) {

            B[i][j] = input.nextInt();

        }
        System.out.println("\n");
    }

    //print a and b

    System.out.println("the elements of array A");
    for (i = 0; i < rowA; i++) {
        for (j = 0; j < colA; j++) {

            System.out.print(A[i][j]);
            System.out.print("\t");

        }
        System.out.println("\n");
    }
    System.out.println("the elements of array B");
    for (i = 0; i < rowB; i++) {
        for (j = 0; j < colB; j++) {

            System.out.print(B[i][j]);
            System.out.print("\t");

        }
        System.out.println("\n");

    }

    //multiply A and B

    for (i = 0; i < rowA; i++) {

        for (j = 0; j < colB; j++) {
            C[i][j] = 0;
            for (k = 0; k < colA; k++) {
                C[i][j] += A[i][k] * B[k][j];
            }
        }
    }


    //print multi result

    System.out.println("result of multiplication of array A and B is ");
    for (i = 0; i < rowA; i++) {
        for (j = 0; j < colB; j++) {

            System.out.print(C[i][j]);
            System.out.print("\t");
        }
        System.out.println("\n");
    }
}
}