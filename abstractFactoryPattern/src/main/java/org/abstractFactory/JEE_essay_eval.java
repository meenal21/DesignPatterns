package org.abstractFactory;

public class JEE_essay_eval implements IEssay{
    @Override
    public void evaluateEssay(String response) {
        System.out.println("Evaluated "+ response + "JEE Essay Evaluated");
    }
}
