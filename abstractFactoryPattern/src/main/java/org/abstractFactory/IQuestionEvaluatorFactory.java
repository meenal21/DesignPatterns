package org.abstractFactory;

public interface IQuestionEvaluatorFactory{
    IEssay createEssay();
    IFillin createFillin();
    ITrueFalse createTrueFalse();
    IMCQ createIMCQ();
    IShortAnswer createShortAnswer();
}
