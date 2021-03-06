package com.iancaffey.bytecode.util.debug;

import com.iancaffey.bytecode.model.attribute.ExceptionVisitor;

/**
 * DebugExceptionVisitor
 *
 * @author Ian Caffey
 * @since 1.0
 */
public class DebugExceptionVisitor extends DebugVisitor implements ExceptionVisitor {
    public DebugExceptionVisitor() {
    }

    public DebugExceptionVisitor(int indent) {
        super(indent);
    }

    @Override
    public void visit(int startIndex, int endIndex, int handlerIndex, int catchIndex) {
        log(String.format("Exception [startIndex=%d, endIndex=%d, handlerIndex=%d, catchIndex=%d]", startIndex, endIndex, handlerIndex, catchIndex), 1);
    }
}
