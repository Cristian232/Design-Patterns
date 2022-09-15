package com.company.Behavioral.Mediator.FirstImplementation;


import javafx.scene.control.TextField;

public class Textbox extends TextField implements UIControl {

    private UIMediator uiMediator;

    private boolean mediatorUpdate;

    public Textbox(UIMediator uiMediator) {
        this.setText("TextBox");
        this.uiMediator = uiMediator;
        this.uiMediator.register(this);

        this.textProperty().addListener((v,o,n) -> {
            if (!mediatorUpdate)
            this.uiMediator.valuesChanged(this);
        });
    }

    @Override
    public void controlChanged(UIControl uiControl) {
        this.mediatorUpdate = true;
        this.setText(uiControl.getControlValue());
        this.mediatorUpdate = false;
    }

    @Override
    public String getControlValue() {
        return getText();
    }

    @Override
    public String getControlName() {
        return null;
    }
}
