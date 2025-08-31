package org.abstractFactory;

public class JEE_essay_eval implements IEssay{
    @Override
    public void evaluate(String response) {
        System.out.println("Evaluated "+ response + "JEE Essay Evaluated");
    }
}
