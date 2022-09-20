package com.company;

import com.company.Behavioral.Visitor.FirstImplementation.Manager;
import com.company.Behavioral.Visitor.FirstImplementation.Programmer;
import com.company.Behavioral.Visitor.FirstImplementation.ProjectLead;
import com.company.Behavioral.Visitor.FirstImplementation.VicePresident;

public interface Visitor {

    void visit(Programmer programmer);

    void visit(ProjectLead projectLead);

    void visit(Manager manager);

    void visit(VicePresident vicePresident);

}
