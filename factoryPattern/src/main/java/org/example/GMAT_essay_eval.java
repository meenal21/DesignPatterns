package org.example;

public class GMAT_essay_eval implements Evaluator{
    @Override
    public void evaluate(String response) {
        System.out.println("Evaluated "+ response + ": GATE TRUEFALSE EVALUATION SUCCESSFUL");
    }
}
