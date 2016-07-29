package com.iancaffey.bytecode.util.debug;

import com.iancaffey.bytecode.io.attribute.MethodParameterVisitor;
import com.iancaffey.bytecode.util.DebugVisitor;

/**
 * DebugMethodParameterVisitor
 *
 * @author Ian Caffey
 * @since 1.0
 */
public class DebugMethodParameterVisitor extends DebugVisitor implements MethodParameterVisitor {
    public DebugMethodParameterVisitor() {
        super("MethodParameter");
    }

    public DebugMethodParameterVisitor(int indent) {
        super("MethodParameter", indent);
    }

    @Override
    public void visit(int nameIndex, int access) {

    }
}
