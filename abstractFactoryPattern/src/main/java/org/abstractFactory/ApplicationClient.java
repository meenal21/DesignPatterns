package org.abstractFactory;

public class ApplicationClient {
    public static void main(String[] args) {
        IQuestionEvaluatorFactory gateFactory = new GateEvaluatorFactory();
        IQuestionEvaluatorFactory jeeFactory = new JEEEvaluatorFactory();

        System.out.println("--- Evaluating GATE Responses ---");
        gateFactory.createIMCQ().evaluate("Gate MCQ Response");
        gateFactory.createFillin().evaluate("Gate Fillin Response");
        gateFactory.createEssay().evaluate("Gate Essay Response");
        gateFactory.createTrueFalse().evaluate("Gate True-False Response");

        System.out.println("--- Evaluating JEE Responses ---");
        jeeFactory.createIMCQ().evaluate("Jee MCQ Response");
        jeeFactory.createFillin().evaluate("Jee Fillin Response");
        jeeFactory.createEssay().evaluate("Jee Essay Response");
        jeeFactory.createTrueFalse().evaluate("Jee True-False Response");
    }
}
