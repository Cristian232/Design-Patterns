package com.company;


import com.company.Behavioral.Visitor.FirstImplementation.*;

public class Main {



    public static void main(String[] args) {

        Employee employee = buildOrganization();
        Visitor visitor = new PrintVisitor();
        visitOrg(employee,visitor);


    }

    private static Employee buildOrganization(){

        Programmer p1 = new Programmer("Rachel","c++");
        Programmer p2 = new Programmer("Andy","java");

        Programmer p3 = new Programmer("Josh","c#");
        Programmer p4 = new Programmer("Bill","c++");

        ProjectLead pl1 = new ProjectLead("Tina",p1,p2);
        ProjectLead pl2 = new ProjectLead("Joey",p3,p4);

        Manager m1 = new Manager("Chad",pl1);
        Manager m2 = new Manager("Chad II",pl2);

        VicePresident vp = new VicePresident("Richard",m1,m2);

        return vp;
    }

    private static void visitOrg(Employee employee, Visitor visitor){
        employee.accept(visitor);
        employee.getDirectReports().forEach(e->visitOrg(e, visitor));
    }
}
