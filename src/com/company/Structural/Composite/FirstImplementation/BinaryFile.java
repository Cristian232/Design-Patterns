package com.company.Structural.Composite.FirstImplementation;

//Leaf node in composite pattern

public class BinaryFile extends File{

    private long size;

    public BinaryFile(String name, long size) {
        super(name);
        this.size = size;
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public void ls() {
        System.out.println(getName() + " " + size);
    }

    @Override
    public void addFile(File file) {
        throw new UnsupportedOperationException("Leaf node does not support add operation");
    }

    @Override
    public File[] getFiles() {
        throw new UnsupportedOperationException("Leaf node does not support add operation");
    }

    @Override
    public boolean removeFiles(File file) {
        throw new UnsupportedOperationException("Leaf node does not support add operation");
    }
}
