package org.abstractFactory;

public class GATE_shortanswer_eval implements IShortAnswer {
    @Override
    public void evaluate(String response) {
        System.out.println("Evaluated "+ response + "GATE SHORTANSWER Evaluated");
    }
}
