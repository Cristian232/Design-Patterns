package com.company.Behavioral.Memento.FirstImplementation;

public class WorkflowDesigner {

    private Workflow workflow;

    public void createWorkflow(String name){
        this.workflow = new Workflow(name);
    }

    public Memento getMemento(){
        if (workflow == null){
            return new Memento();
        }
        return new Memento(workflow.getSteps(), workflow.getName());
    }

    public void setMemento(Memento memento){
        if (memento.isEmpty()){
            this.workflow = null;
        }else {
            this.workflow = new Workflow(memento.getName() , memento.getSteps());
        }
    }

    public void addStep(String step){
        workflow.addStep(step);
    }

    public void removeStep(String step){
        workflow.removeStep(step);
    }

    public void print(){
        System.out.println(workflow);
    }

    public class Memento {

        private String[] steps;

        private String name;

        public Memento(){

        }

        public Memento(String[] steps, String name) {
            this.steps = steps;
            this.name = name;
        }

        private String[] getSteps(){
            return steps;
        }

        private String getName(){
            return name;
        }


        public boolean isEmpty() {
            if (this.steps == null && this.name == null){
                return true;
            }
            return false;
        }
    }
}
