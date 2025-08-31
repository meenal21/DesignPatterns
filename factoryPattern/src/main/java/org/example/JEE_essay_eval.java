package org.example;

public class JEE_essay_eval implements Evaluator {
    @Override
    public void evaluate(String response) {
        System.out.println("Evaluated "+ response + ": JEE ESSAY EVALUATION SUCCESSFUL");
    }
}
