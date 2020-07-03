package com.aipabot.Matrices;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
/*
public class App
{
    public static void main( String[] args ) {
    
    	    int i, j, k; //indexes
    	    int[][] A = new int[2][2];
    	    int[][] B = new int[2][2];
    	    int[][] C = new int [2][2];



    	    Scanner input = new Scanner(System.in);

    	    System.out.println("Enter size of array A");
    	    int rowa = input.nextInt();
    	    int cola = input.nextInt();

    	    System.out.println("Enter size of array B");
    	    int rowb = input.nextInt();
    	    int colb = input.nextInt();


    	    //read a and b

    	    System.out.println("Enter elements of array A");
    	    for (i = 0; i < rowa; i++) {
    	        for (j = 0; j < colb; j++) {

    	            A[i][j] = input.nextInt();

    	        }
    	        System.out.println();
    	    }
    	    System.out.println("Enter elements of array B");
    	    for (i = 0; i < rowb; i++) {
    	        for (j = 0; j < cola; j++) {

    	            B[i][j] = input.nextInt();

    	        }
    	        System.out.println("\n");
    	    }

    	    //print a and b

    	    System.out.println("the elements of array A");
    	    for (i = 0; i < rowa; i++) {
    	        for (j = 0; j < cola; j++) {

    	            System.out.print(A[i][j]);
    	            System.out.print("\t");

    	        }
    	        System.out.println("\n");
    	    }
    	    System.out.println("the elements of array B");
    	    for (i = 0; i < rowb; i++) {
    	        for (j = 0; j < colb; j++) {

    	            System.out.print(B[i][j]);
    	            System.out.print("\t");

    	        }
    	        System.out.println("\n");

    	    }

    	    //multiply a and b

    	    for (i = 0; i < rowa; i++) {

    	        for (j = 0; j < colb; j++) {
    	            C[i][j] = 0;
    	            for (k = 0; k < cola; ++k) {
    	                C[i][j] += A[i][k] * B[k][j];
    	            }
    	        }
    	    }


    	    //print multi result

    	    System.out.println("result of multiplication of array A and B is ");
    	    for (i = 0; i < rowa; i++) {
    	        for (j = 0; j < colb; j++) {

    	            System.out.print(C[i][j]);
    	            System.out.print("\t");
    	        }
    	        System.out.println("\n");
    	    }
    	}
    	}

public class App
{
    public static void main( String[] args ) {

		
    int[][] A = new int[2][2];
    int[][] B = new int[2][2];
    int[][] C = new int[2][2];
    
        public static int[][] multiplicar(int[][] A, int[][] B) {

        int aRows = A.length;
        int aColumns = A[0].length;
        int bRows = B.length;
        int bColumns = B[0].length;

        if (aColumns != bRows) {
            throw new IllegalArgumentException("A:Rows: " + aColumns + " did not match B:Columns " + bRows + ".");
        }

        
        for (int i = 0; i < aRows; i++) {
            for (int j = 0; j < bColumns; j++) {
                
            }
        }

        for (int i = 0; i < aRows; i++) { // aRow
            for (int j = 0; j < bColumns; j++) { // bColumn
                for (int k = 0; k < aColumns; k++) { // aColumn
                    C[i][j] += A[i][k] * B[k][j];
                    
                    System.out.println (C[i][j] + " ");
                    System.out.println();
                }
            }
        }

        return C;
    

           	
               
        }
        }
*/


public class App
{
    public static void main( String[] args ) {

		
    int[][] A = new int[2][2];
    int[][] B = new int[2][2];
    int[][] C = new int[2][2];
    
    Scanner input = new Scanner(System.in);
    System.out.println("Enter the value for Element of Matrix A" + " Row 0 and Column 0 ");
    int row0Col0A = input.nextInt();
    A[0][0]=row0Col0A;
    System.out.println("Enter the value for Element of Matrix A" + "Row 0 and Column 1 ");
    int row0Col1A = input.nextInt();
    A[0][1]=row0Col1A;
    System.out.println("Enter the value for Element of Matrix A" + " Row 1 and Column 0 ");
    int row1Col0A = input.nextInt();
    A[1][0]=row1Col0A;
    System.out.println("Enter the value for Element of Matrix A" + "Row 1 and Column 1 ");
    int row1Col1A = input.nextInt();
    A[1][1]=row1Col1A;
       
    System.out.println("Enter the value for Element of Matrix B" + "Row 0 and Column 0 ");
    int row0Col0B = input.nextInt();
    B[0][0]=row0Col0B;
    System.out.println("Enter the value for Element of Matrix B" + " Row 0 and Column 1 ");
    int row0Col1B = input.nextInt();
    B[0][1]=row0Col1B;
    System.out.println("Enter the value for Element of Matrix B" + "Row 1 and Column 0 ");
    int row1Col0B = input.nextInt();
    B[1][0]=row1Col0B;
    System.out.println("Enter the value for Element of Matrix B" + "Row 1 and Column 1 ");
    int row1Col1B = input.nextInt();
    B[1][1]=row1Col1B;
    
    int sum = 0;
    for (int i =0; i<2; i++) {
    	for (int j = 0; j<2; j++) {
    		for (int k = 0; k<2; k++) {
    			sum+= A[i][k] * B [k][j];
    			
    		}
    		C[i][j] = sum;
    		sum = 0;
    	}
    }
    for(int i=0; i<2; i++) {
    	System.out.print("|");
    	for(int j=0; j<2; j++) {
    		System.out.print(C[i][j]+ " \t");
    	}
    	System.out.println("|");   
    }
    
    }
}
