package com.company.Behavioral.Null.FirstImplementation;

import java.io.FileNotFoundException;

public class ComplexService {

    private StorageService storage;

    private String reportName;

    public ComplexService(StorageService storage) {
        this.storage = storage;
        reportName = "A Complex report";
    }

    public ComplexService(StorageService storage, String reportName) {
        this.storage = storage;
        this.reportName = reportName;
    }

    public void generateReport() throws FileNotFoundException, InterruptedException {
        System.out.println("Starting a complex Report build");

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e){
            e.printStackTrace();
        }

        System.out.println("Done with report");

        storage.save(new Report(reportName));
    }
}
