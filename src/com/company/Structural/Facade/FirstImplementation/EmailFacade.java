package com.company.Structural.Facade.FirstImplementation;

// Facade provides simple methods for clients to use

public class EmailFacade {

    public boolean sendOrderEmail(Order order){

        Template template = TemplateFactory.creteTemplateFor(TemplateType.Email);
        Stationary stationary = StationaryFactory.createStationary();
        Email email = Email.getBuilder()
                .withTemplate(template)
                .withStationary(stationary)
                .forObject(order)
                .build();
        Mailer mailer = Mailer.getMailer();
        return mailer.send(email);

    }

    public boolean sendOrderEmail() {
        return true;
    }
}
