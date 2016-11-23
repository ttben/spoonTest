package fr.unice.i3s.foo.spoon.processors;

import spoon.processing.AbstractProcessor;
import spoon.reflect.code.BinaryOperatorKind;
import spoon.reflect.code.CtBinaryOperator;

public class GTToLTProcessor extends AbstractProcessor<CtBinaryOperator> {

    @Override
    public void process(CtBinaryOperator op) {
        BinaryOperatorKind kind = op.getKind();
        if(BinaryOperatorKind.GT.equals(kind)) {
            op.setKind(BinaryOperatorKind.LT);
        }
    }
}
