package com.iancaffey.bytecode.model.attribute.target;

import com.iancaffey.bytecode.io.BytecodeReader;
import com.iancaffey.bytecode.model.ClassModelVisitor;
import com.iancaffey.bytecode.model.attribute.annotation.TypeTargetVisitor;

import java.io.IOException;

/**
 * TypeParameterHandler
 *
 * @author Ian Caffey
 * @since 1.0
 */
public class TypeParameterHandler {
    public static void accept(BytecodeReader<ClassModelVisitor> reader, TypeTargetVisitor visitor) throws IOException {
        visitor.visitTypeParameter(reader.readUnsignedByte());
    }
}
