package com.iancaffey.bytecode.io.direct.attribute;

import com.iancaffey.bytecode.io.BytecodeReader;
import com.iancaffey.bytecode.io.direct.AttributeModelVisitor;
import com.iancaffey.bytecode.io.direct.ClassModelVisitor;

import java.io.IOException;

/**
 * MethodParametersHandler
 *
 * @author Ian Caffey
 * @since 1.0
 */
public class MethodParametersHandler {
    public static void accept(BytecodeReader<ClassModelVisitor> reader, AttributeModelVisitor visitor) throws IOException {
        int count = reader.readUnsignedByte();
        MethodParameterVisitor methodParameterVisitor = visitor.visitMethodParameters(count);
        for (int i = 0; i < count; i++)
            methodParameterVisitor.visit(reader.readUnsignedShort(), reader.readUnsignedShort());
    }
}
