package org.abstractFactory;

public class JEEEvaluatorFactory implements IQuestionEvaluatorFactory{
    @Override
    public ITrueFalse createTrueFalse(){
        return new GATE_truefalse_eval();
    }

    @Override
    public IFillin createFillin(){
        return new GATE_fillin_eval();
    }

    @Override
    public IMCQ createIMCQ(){
        return new GATE_mcq_eval();
    }

    @Override
    public IEssay createEssay(){
        return new GATE_essay_eval();
    }
}
