package org.abstractFactory;

public class GATE_essay_eval implements IEssay {
    @Override
    public void evaluate(String response) {
        System.out.println("Evaluated "+ response + "GATE Essay Evaluated");
    }
}
