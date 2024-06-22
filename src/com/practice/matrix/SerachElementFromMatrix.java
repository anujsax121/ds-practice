package com.practice.matrix;

public class SerachElementFromMatrix {

    public static void main(String[] args) {

        int matrix[][] = new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int element = searchElement(matrix, 9);
        System.out.println(element);
    }

    private static int searchElement(int[][] n, int element) {

        int l = 0, j = n[0].length - 1;

        while (l <= j) {
            if (n[l][j] == element) {
                return n[l][j];
            } else if (n[l][j] < element) {
                l++;
            } else {
                j--;
            }
        }
        return -1;
    }


}
