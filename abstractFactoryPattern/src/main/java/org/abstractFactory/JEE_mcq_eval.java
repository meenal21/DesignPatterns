package org.abstractFactory;

public class JEE_mcq_eval implements IMCQ{
    @Override
    public void evaluateMCQ(String response){
        System.out.println("Evaluated "+ response + "JEE MCQ Evaluated");
    }
}
