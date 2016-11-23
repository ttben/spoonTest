package fr.unice.i3s.foo.spoon.processors;

import spoon.processing.AbstractProcessor;
import spoon.reflect.code.BinaryOperatorKind;
import spoon.reflect.code.CtBinaryOperator;

public class LTToGTProcessor extends AbstractProcessor<CtBinaryOperator> {

    @Override
    public void process(CtBinaryOperator op) {
        System.out.println("LTToGTProcessor");
        BinaryOperatorKind kind = op.getKind();
        if(BinaryOperatorKind.LT.equals(kind)) {
            op.setKind(BinaryOperatorKind.GT);
        }
    }
}
