package org.example;

public class GATE_mcq_eval implements  Evaluator {
    @Override
    public void evaluate(String response) {
        System.out.println("Evaluated " + response + ": GATE MCQ EVALUATION SUCCESSFUL");
    }
}
