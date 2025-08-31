package org.abstractFactory;

public class GATE_mcq_eval implements IMCQ{
    @Override
    public void evaluateMCQ(String response){
        System.out.println("Evaluated "+ response + "GATE MCQ Evaluated");
    }
}
