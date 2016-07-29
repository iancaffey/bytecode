package com.iancaffey.bytecode.io.attribute.target;

import com.iancaffey.bytecode.BytecodeHandler;
import com.iancaffey.bytecode.ClassReader;
import com.iancaffey.bytecode.TypeTargetVisitor;

import java.io.IOException;

/**
 * CatchHandler
 *
 * @author Ian Caffey
 * @since 1.0
 */
public class CatchHandler implements BytecodeHandler<ClassReader, TypeTargetVisitor> {
    @Override
    public void accept(ClassReader reader, TypeTargetVisitor visitor) throws IOException {
        visitor.visitCatch(reader.readUnsignedShort());
    }
}