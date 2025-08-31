package org.example;

public class GATE_shortanswer_eval implements Evaluator{
    @Override
    public void evaluate(String response) {
        System.out.println("Evaluated "+ response + ": GATE SHORTANSWER EVALUATION SUCCESSFUL");
    }
}
