package org.abstractFactory;

public class JEE_shortanswer_eval implements IShortAnswer{
    @Override
    public void evaluate(String response){
        System.out.println("Evaluated "+ response + "JEE SHORTANSWER Evaluated");
    }
}
