package com.company.Behavioral.Mediator.FirstImplementation;


//Mediator

import java.util.ArrayList;
import java.util.List;

public class UIMediator {

    List<UIControl> colleagues = new ArrayList<>();

    public void register(UIControl uiControl){
        colleagues.add(uiControl);
    }

    public void valuesChanged(UIControl uiControl){
        colleagues.stream().filter(c->c != uiControl).forEach(c->c.controlChanged(uiControl));
    }
}
