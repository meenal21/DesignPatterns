package org.example;

public abstract class Exam {

    // factory method to be overridden
    public abstract Evaluator createEvaluator(String questionType);
}
