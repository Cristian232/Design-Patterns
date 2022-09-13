package com.company.Behavioral.Command.FirstImplementation;

// This class is the receiver

public class EWSService {

    // add a new member to the mailing list
    public void addMember(String contact, String contactGroup){
        // contact exchange
        System.out.println("Added " + contact + " to " + contactGroup);
    }

    // remove member from mailing list
    public void removeMember(String contact, String contactGroup){
        // contact exchange
        System.out.println("Removed " + contact + " from " + contactGroup);
    }
}
