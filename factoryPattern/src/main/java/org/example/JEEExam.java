package org.example;

public class JEEExam extends Exam{
    @Override
    public Evaluator createEvaluator(String questionType){
        return switch (questionType) {
            case "MCQ" -> new JEE_mcq_eval();
            case "FILLIN" -> new JEE_fillin_eval();
            case "ESSAY" -> new JEE_essay_eval();
            case "TRUEFALSE" -> new JEE_truefalse_eval();
            default -> throw new IllegalArgumentException("Invalid question type");
        };
    }
}
