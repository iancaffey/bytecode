package com.iancaffey.bytecode.util.debug;

import com.iancaffey.bytecode.io.AttributeVisitor;
import com.iancaffey.bytecode.io.attribute.CodeVisitor;
import com.iancaffey.bytecode.io.attribute.ExceptionVisitor;
import com.iancaffey.bytecode.util.DebugVisitor;

/**
 * DebugCodeVisitor
 *
 * @author Ian Caffey
 * @since 1.0
 */
public class DebugCodeVisitor extends DebugVisitor implements CodeVisitor {
    public DebugCodeVisitor() {
        super("Code");
    }

    public DebugCodeVisitor(int indent) {
        super("Code", indent);
    }

    @Override
    public void visitDepth(int maxStack, int maxLocals) {

    }

    @Override
    public void visitData(byte[] data) {

    }

    @Override
    public ExceptionVisitor visitExceptionTable(int count) {
        return new DebugExceptionVisitor(indent() + 1);
    }

    @Override
    public AttributeVisitor visitAttributes(int count) {
        return new DebugAttributeVisitor(indent() + 1);
    }
}
