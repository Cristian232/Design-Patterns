package com.company.Behavioral.Mediator.FirstImplementation;


//Abstract colleague

public interface UIControl {

    void controlChanged(UIControl uiControl);

    String getControlValue();

    String getControlName();

}
