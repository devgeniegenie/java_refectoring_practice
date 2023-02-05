package com.TeaseApartInheritance.after1;

import java.io.IOException;

public abstract class CSVPrinter {
    protected final CSVReader _csvReader;
    protected CSVPrinter (CSVReader csvReader)  {
        this._csvReader = csvReader;
    }
    public abstract void print() throws IOException;
}
