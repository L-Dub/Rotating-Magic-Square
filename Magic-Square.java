package com.Algorithms;


import java.util.Scanner;

public class MagicSquare{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size: ");
        int n = scanner.nextInt();
        System.out.print("Enter rotation: ");
        int rotate = scanner.nextInt();
        int[][] magicSquare = new int[n][n];
        int row = 0;
        int col = 0;

        if(rotate == 0){
            row = 0;
            col = n/2;
            for(int i = 1; i<=n*n; i++) {
                magicSquare[row][col] = i;

                if (i % n == 0) {
                    row++;
                } else {

                    if (row == 0) {
                        row = n - 1;
                    } else
                        row--;

                    if (col == n - 1) {
                        col = 0;
                    } else
                        col++;
                }
            }
        }
        else if(rotate == 1){
            row = n/2;
            col = n - 1;
            for(int i = 1; i<=n*n; i++){
                magicSquare[row][col] = i;
                if(i%n == 0){
                    col--;
                }
                else{
                    if(col == n - 1){
                        col = 0;
                    }
                    else
                        col++;

                    if(row == n - 1){
                        row = 0;
                    }
                    else
                        row++;
                }
            }
        }
        else if(rotate == 2){
            row = n - 1;
            col = n/2;
            for(int i = 1; i<=n*n; i++){
                magicSquare[row][col] = i;
                if(i%n == 0){
                    row--;
                }
                else{
                    if(row == n-1){
                        row = 0;
                    }
                    else
                        row++;

                    if(col == 0){
                        col = n - 1;
                    }
                    else
                        col--;
                }
            }
        }

        else if(rotate == 3){
            row = n/2;
            col = 0;
            for(int i = 1; i<=n*n; i++){
                magicSquare[row][col] = i;
                if(i%n == 0){
                    col++;
                }
                else{
                    if(col == 0){
                        col = n-1;
                    }
                    else
                        col--;

                    if(row == 0){
                        row = n-1;
                    }
                    else
                        row--;
                }
            }
        }


        for(int i = 0; i<n; i++){
            for(int j = 0; j<n; j++){
                System.out.print(magicSquare[i][j]);
                System.out.print(" ");
            }
            System.out.println();

        }
    }
}
