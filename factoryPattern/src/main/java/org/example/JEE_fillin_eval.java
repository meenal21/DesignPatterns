package org.example;

public class JEE_fillin_eval implements Evaluator{
    @Override
    public void evaluate(String response) {
        System.out.println("Evaluated "+ response + ": JEE FILLIN EVALUATION SUCCESSFUL");
    }
}
