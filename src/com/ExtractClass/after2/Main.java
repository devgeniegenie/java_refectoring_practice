package com.ExtractClass.after2;

public class Main {
    public static void main(String[] args) {
        Book refactorying = new Book(
                "Refactorying: improving the design of existing code",
                "ISBN0201485672",
                "$44.95",
                "Martin Fowler",
                "fowler@acm.org"
        );

        Book math = new Book(
                "프로그래머 수학",
                "ISBN4797329734",
                "30000원",
                "유키 히로시",
                "hyuki@hyuki.com"
        );

        System.out.println("refactorying:");
        System.out.println(refactorying.toXml());

        System.out.println("math");
        System.out.println(math.toXml());
    }
}
