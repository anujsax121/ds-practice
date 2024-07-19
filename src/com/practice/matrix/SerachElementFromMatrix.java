package com.practice.matrix;

import javax.imageio.ImageTranscoder;
import java.util.List;
import java.util.stream.Collectors;

public class SerachElementFromMatrix {

    public static void main(String[] args) {

        int matrix[][] = new int[][]{{1,1}};
        int element = searchElement(matrix, 2);
        System.out.println(element);
        String  s ="anagram";
        List<Character> characterList =  s.chars().boxed().map(m -> (char)m.intValue()).collect(Collectors.toList());
        System.out.println(characterList);
    }

    private static int searchElement(int[][] n, int element) {

        int l = 0, j = n[0].length - 1;

        while (l <= n.length-1 &&  j >= 0) {
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
