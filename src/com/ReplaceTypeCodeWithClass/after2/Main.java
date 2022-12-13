package com.ReplaceTypeCodeWithClass.after2;

public class Main {
    public static void main(String[] args) {
        Item book = new Item(
                ItemType.BOOK,
                "세계 역사",
                4800
        );
        Item dvd = new Item(
                ItemType.DVD,
                "한국 역사",
                2800
        );
        Item soft = new Item(
                ItemType.SOFTWARE,
                "근현대 역사",
                3800
        );

        System.out.println("bood = " + book.toString());
        System.out.println("dvd = " + dvd.toString());
        System.out.println("soft = " + soft.toString());

    }
}
