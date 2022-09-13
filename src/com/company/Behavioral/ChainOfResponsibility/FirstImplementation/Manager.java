package com.company.Behavioral.ChainOfResponsibility.FirstImplementation;

public class Manager extends Employee{


    public Manager( LeaveApprover successor) {
        super("Manager", successor);
    }

    @Override
    protected boolean processRequest(LeaveApplication application) {

        switch(application.getType()){
            case SICK:
                application.approve(getApproverRole());
                return true;
            case PTO:
                if (application.getNoOfDays() <= 5){
                    application.approve(getApproverRole());
                    return true;
                }
        }

        return false;
    }
}
