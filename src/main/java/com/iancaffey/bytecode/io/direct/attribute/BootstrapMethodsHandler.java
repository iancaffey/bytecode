package com.iancaffey.bytecode.io.direct.attribute;

import com.iancaffey.bytecode.io.BytecodeReader;
import com.iancaffey.bytecode.io.direct.AttributeModelVisitor;
import com.iancaffey.bytecode.io.direct.ClassModelVisitor;

import java.io.IOException;

/**
 * BootstrapMethodsHandler
 *
 * @author Ian Caffey
 * @since 1.0
 */
public class BootstrapMethodsHandler {
    public static void accept(BytecodeReader<ClassModelVisitor> reader, AttributeModelVisitor visitor) throws IOException {
        int count = reader.readUnsignedShort();
        BootstrapMethodVisitor bootstrapMethodVisitor = visitor.visitBootstrapMethods(count);
        for (int i = 0; i < count; i++)
            BootstrapMethodHandler.accept(reader, bootstrapMethodVisitor);
    }
}
