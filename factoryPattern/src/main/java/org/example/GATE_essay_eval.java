package org.example;

public class GATE_essay_eval implements Evaluator {
    @Override
    public void evaluate(String response) {
        System.out.println("Evaluated "+ response + ": GATE ESSAY EVALUATION SUCCESSFUL");
    }
}
