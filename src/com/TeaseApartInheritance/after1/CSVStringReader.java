package com.TeaseApartInheritance.after1;

import java.io.BufferedReader;
import java.io.StringReader;

public class CSVStringReader extends CSVReader {

    public CSVStringReader(String string) {
        super(new BufferedReader(new StringReader(string)));
    }
}
