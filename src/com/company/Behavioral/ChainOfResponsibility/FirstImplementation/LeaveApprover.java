package com.company.Behavioral.ChainOfResponsibility.FirstImplementation;

// Handler in the chain of responsibility

public interface LeaveApprover {

    void processLeaveApplication(LeaveApplication application);

    String getApproverRole();

}
