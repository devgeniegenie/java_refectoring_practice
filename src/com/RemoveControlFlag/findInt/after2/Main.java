package com.RemoveControlFlag.findInt.after2;

public class Main {
    public static void main(String[] args) {
        int[] data = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11};
        if(FindInt.find(data, 5)) System.out.println("Found");
        else System.out.println("Not found");
    }
}
