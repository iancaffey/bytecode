package com.iancaffey.bytecode.io.attribute;

import com.iancaffey.bytecode.BytecodeHandler;
import com.iancaffey.bytecode.ClassReader;
import com.iancaffey.bytecode.VerificationTypeInfoVisitor;

import java.io.IOException;

/**
 * VerificationUninitializedThisInfoHandler
 *
 * @author Ian Caffey
 * @since 1.0
 */
public class VerificationUninitializedThisInfoHandler implements BytecodeHandler<ClassReader, VerificationTypeInfoVisitor> {
    @Override
    public void accept(ClassReader reader, VerificationTypeInfoVisitor visitor) throws IOException {
        visitor.visitUninitializedThis();
    }
}