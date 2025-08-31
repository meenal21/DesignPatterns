package org.example;

public class JEE_mcq_eval implements Evaluator {
    @Override
    public void evaluate(String response) {
        System.out.println("Evaluated "+ response + ": JEE MCQ EVALUATION SUCCESSFUL");
    }
}
