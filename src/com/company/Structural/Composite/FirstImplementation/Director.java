package com.company.Structural.Composite.FirstImplementation;

// Composite in composite pattern

import java.util.ArrayList;
import java.util.List;

public class Director extends File{

    private List<File> list = new ArrayList<>();

    public Director(String name) {
        super(name);
    }

    @Override
    public void ls() {
        System.out.println(getName());
        list.forEach(File::ls);
    }

    @Override
    public void addFile(File file) {
        list.add(file);
    }

    @Override
    public File[] getFiles() {
        return list.toArray(new File[list.size()]);
    }

    @Override
    public boolean removeFiles(File file) {
        return removeFiles(file);
    }
}
