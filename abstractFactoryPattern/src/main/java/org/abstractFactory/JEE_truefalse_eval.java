package org.abstractFactory;

public class JEE_truefalse_eval implements ITrueFalse{
    @Override
    public void evaluateTrueFalse(String response) {
        System.out.println("Evaluated "+ response + "JEE TrueFalse Evaluated");
    }
}
