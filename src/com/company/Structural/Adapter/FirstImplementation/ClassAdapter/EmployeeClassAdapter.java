package com.company.Structural.Adapter.FirstImplementation.ClassAdapter;

// Class Adapter works as a two-way Adapter

public class EmployeeClassAdapter extends Employee implements Customer{
    @Override
    public String getName() {
        return this.getFullName();
    }

    @Override
    public String getDesignation() {
        return this.getJobTitle();
    }

    @Override
    public String getAddress() {
        return this.getOfficeLocation();
    }
}
