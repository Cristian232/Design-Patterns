package com.company;

import com.company.Structural.Adapter.FirstImplementation.ClassAdapter.BusinessCardDesigner;
import com.company.Structural.Adapter.FirstImplementation.ClassAdapter.Employee;
import com.company.Structural.Adapter.FirstImplementation.ClassAdapter.EmployeeClassAdapter;
import com.company.Structural.Adapter.FirstImplementation.ObjectAdappter.EmployeeObjectAdapter;

public class Main {

    public static void main(String[] args) {

        // Using a Class/Two-Way adapter
        EmployeeClassAdapter adapter = new EmployeeClassAdapter();
        populateEmployeeData(adapter);
        BusinessCardDesigner designer = new BusinessCardDesigner();
        String card = designer.designCard(adapter);
        System.out.println(card);

        // Using Object Adapter
        Employee employee = new Employee();
        populateEmployeeData(employee);
        EmployeeObjectAdapter employeeObjectAdapter = new EmployeeObjectAdapter(employee);
        card = designer.designCard(employeeObjectAdapter);
        System.out.println(card);


    }

    private static void populateEmployeeData(Employee employee){
            employee.setFullName("Elliot Alderson");
            employee.setJobTitle("Security Engineer");
            employee.setOfficeLocation("Allsafe CyberSecurity, New York");
    }

}
