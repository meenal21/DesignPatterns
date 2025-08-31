package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class ApplicationClient {
    public static void main(String[] args) {
        Exam gateExam = new GATEExam();
        Exam jeeExam = new JEEExam();

        System.out.println("--- Evaluating GATE Responses ---");
        Evaluator gateMcq = gateExam.createEvaluator("MCQ");
        gateMcq.evaluate("<GATE MCQ Response String>");

        Evaluator gateFillin = gateExam.createEvaluator("FILLIN");
        gateFillin.evaluate("<GATE Fill-in Response String>");

        Evaluator gateEssay = gateExam.createEvaluator("ESSAY");
        gateEssay.evaluate("<GATE Essay Response String>");

        Evaluator gateTf = gateExam.createEvaluator("TRUEFALSE");
        gateTf.evaluate("<GATE True/False Response String>");

        System.out.println("\n--- Evaluating JEE Responses ---");

        // 2. Create hard-coded sample responses for JEE 
        Evaluator jeeMcq = jeeExam.createEvaluator("MCQ");
        jeeMcq.evaluate("<JEE MCQ Response String>");

        Evaluator jeeFillin = jeeExam.createEvaluator("FILLIN");
        jeeFillin.evaluate("<JEE Fill-in Response String>");

        Evaluator jeeEssay = jeeExam.createEvaluator("ESSAY");
        jeeEssay.evaluate("<JEE Essay Response String>");

        Evaluator jeeTf = jeeExam.createEvaluator("TRUEFALSE");
        jeeTf.evaluate("<JEE True/False Response String>");
    }
}
