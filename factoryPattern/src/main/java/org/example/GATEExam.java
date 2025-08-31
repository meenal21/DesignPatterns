package org.example;

public class GATEExam extends Exam{
    @Override
    public Evaluator createEvaluator(String questionType) {
        switch (questionType) {
            case "MCQ":
                return new GATE_mcq_eval();
            case "FILLIN":
                return new GATE_fillin_eval();
            case "ESSAY":
                return new GATE_essay_eval();
            case "TRUEFALSE":
                return new GATE_truefalse_eval();
            default:
                throw new IllegalArgumentException("Invalid question type");
        }
    }
}
