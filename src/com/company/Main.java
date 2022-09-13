package com.company;


import com.company.Behavioral.ChainOfResponsibility.FirstImplementation.*;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {

        LeaveApplication application = LeaveApplication.getBuilder()
                                        .withType(LeaveApplication.Type.SICK)
                                        .from(LocalDate.now())
                                        .to(LocalDate.of(2022,10,8))
                                        .build();

        System.out.println(application);
        System.out.println("*******************************");
        LeaveApprover approver = createChain();
        approver.processLeaveApplication(application);
        System.out.println(application);

    }

    public static LeaveApprover createChain(){
        Director director = new Director(null);
        Manager manager = new Manager(director);
        ProjectLead projectLead = new ProjectLead(manager);
        return projectLead;
    }

}
