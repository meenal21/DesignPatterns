package org.abstractFactory;

public class JEEEvaluatorFactory implements IQuestionEvaluatorFactory{
    @Override
    public ITrueFalse createTrueFalse(){
        return new JEE_truefalse_eval();
    }

    @Override
    public IFillin createFillin(){
        return new JEE_fillin_eval();
    }

    @Override
    public IMCQ createIMCQ(){
        return new JEE_mcq_eval();
    }

    @Override
    public IEssay createEssay(){
        return new JEE_essay_eval();
    }
}
