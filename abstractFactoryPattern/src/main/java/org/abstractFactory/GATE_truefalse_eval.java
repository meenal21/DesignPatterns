package org.abstractFactory;

public class GATE_truefalse_eval implements ITrueFalse{
    @Override
    public void evaluate(String response) {
        System.out.println("Evaluated "+ response + "GATE TrueFalse Evaluated");
    }
}
