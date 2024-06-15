package com.practice.matrix;

public class Matrix90Roration {

    public static void main(String[] args) {
        int matrix[][] = new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        get90Roration(matrix);
    }

    private static void get90Roration(int[][] n) {

        for (int i = 0; i < n.length; i++) {

            System.out.println();
            for (int j = 0; j < n[0].length; j++) {
                System.out.print(n[i][j] + " ");
            }
        }
        for (int i = 0; i < n.length; i++) {
            for (int j = i + 1; j < n[0].length; j++) {
                int temp = n[i][j];
                n[i][j] = n[j][i];
                n[j][i] = temp;
            }
        }

        System.out.print("Transope Matrix...");
        for (int i = 0; i < n.length; i++) {

            System.out.println();
            for (int j = 0; j < n[0].length; j++) {
                System.out.print(n[i][j] + " ");
            }
        }


    System.out.println(" Matrix..90 Rorated.");
        for(int i = 0; i < n.length; i++) {
            System.out.println();
        for (int j = n.length-1; j >=0; j--) {
            System.out.print(n[i][j] + " ");
        }
    }
}
}
