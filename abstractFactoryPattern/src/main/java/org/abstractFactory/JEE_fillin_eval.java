package org.abstractFactory;

public class JEE_fillin_eval implements IFillin{
    @Override
    public void evaluateFillin(String response) {
        System.out.println("Evaluated "+ response + "JEE Fillin Evaluated");
    }
}
