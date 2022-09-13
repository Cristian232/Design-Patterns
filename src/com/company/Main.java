package com.company;


import com.company.Behavioral.Command.FirstImplementation.AddMemberCommand;
import com.company.Behavioral.Command.FirstImplementation.Command;
import com.company.Behavioral.Command.FirstImplementation.EWSService;
import com.company.Behavioral.Command.FirstImplementation.MailTasksRunner;

public class Main {

    public static void main(String[] args) throws InterruptedException {

        EWSService service = new EWSService();

        Command command1 = new AddMemberCommand("Aaa@aaA","WorkGroup",service);

        MailTasksRunner.getInstance().addCommand(command1);


        Command command2 = new AddMemberCommand("Bbb@bbB","HomeGroup",service);

        MailTasksRunner.getInstance().addCommand(command2);


        Thread.sleep(3000);
        MailTasksRunner.getInstance().shutdown();

    }



}
