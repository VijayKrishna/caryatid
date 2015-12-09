package org.spideruci.analysis.util.caryatid;

import org.objectweb.asm.Opcodes;
import org.objectweb.asm.Type;

public class ByteCodeUtil {

	public static String opcodeToText(int opcode) {
		String string = null;
		switch(opcode) {
		case Opcodes.NOP: string = "NOP"; break;
		case Opcodes.INEG: string = "INEG"; break;
		case Opcodes.LNEG: string = "LNEG"; break;
		case Opcodes.FNEG: string = "FNEG"; break;
		case Opcodes.DNEG: string = "DNEG"; break;
		case Opcodes.ARRAYLENGTH: string = "ARRAYLENGTH"; break;
		case Opcodes.CHECKCAST: string = "CHECKCAST"; break;
		case Opcodes.I2B: string = "I2B"; break;
		case Opcodes.I2C: string = "I2C"; break;
		case Opcodes.I2S: string = "I2S"; break;
		case Opcodes.D2L: string = "D2L"; break;
		case Opcodes.L2D: string = "L2D"; break;
		case Opcodes.I2F: string = "I2F"; break;
		case Opcodes.F2I: string = "F2I"; break;
		case Opcodes.GOTO: string = "GOTO"; break;
		case Opcodes.IINC: string = "IINC"; break;
		case Opcodes.RET: string = "RET"; break;
		case Opcodes.JSR: string = "JSR"; break;
		case Opcodes.RETURN: string = "RETURN";	break;
		case Opcodes.ACONST_NULL: string = "ACONST_NULL"; break;
		case Opcodes.ICONST_M1: string = "ICONST_M1"; break;
		case Opcodes.ICONST_0: string = "ICONST_0"; break;
		case Opcodes.ICONST_1: string = "ICONST_1"; break;
		case Opcodes.ICONST_2: string = "ICONST_2"; break;
		case Opcodes.ICONST_3: string = "ICONST_3"; break;
		case Opcodes.ICONST_4: string = "ICONST_4"; break;
		case Opcodes.ICONST_5: string = "ICONST_5"; break;
		case Opcodes.BIPUSH: string = "BIPUSH"; break;
		case Opcodes.SIPUSH: string = "SIPUSH"; break;
		case Opcodes.LDC: string = "LDC"; break;
		case Opcodes.LCONST_0: string = "LCONST_0"; break;
		case Opcodes.LCONST_1: string = "LCONST_1"; break;
		case Opcodes.FCONST_0: string = "FCONST_0"; break;
		case Opcodes.FCONST_1: string = "FCONST_1"; break;
		case Opcodes.FCONST_2: string = "FCONST_2"; break;
		case Opcodes.DCONST_0: string = "DCONST_0"; break;
		case Opcodes.DCONST_1: string = "DCONST_1"; break;
		case Opcodes.ILOAD: string = "ILOAD"; break;
		case Opcodes.FLOAD: string = "FLOAD"; break;
		case Opcodes.ALOAD: string = "ALOAD"; break;
		case Opcodes.LLOAD: string = "LLOAD"; break;
		case Opcodes.DLOAD: string = "DLOAD"; break;
		case Opcodes.AALOAD: string = "AALOAD"; break;
		case Opcodes.IALOAD: string = "IALOAD"; break;
		case Opcodes.BALOAD: string = "BALOAD"; break;
		case Opcodes.CALOAD: string = "CALOAD"; break;
		case Opcodes.SALOAD: string = "SALOAD"; break;
		case Opcodes.FALOAD: string = "FALOAD"; break;
		case Opcodes.LALOAD: string = "LALOAD"; break;
		case Opcodes.DALOAD: string = "DALOAD"; break;
		case Opcodes.I2L: string = "I2L"; break;
		case Opcodes.F2L: string = "F2L"; break;
		case Opcodes.I2D: string = "I2D"; break;
		case Opcodes.F2D: string = "F2D"; break;
		case Opcodes.L2I: string = "L2I"; break;
		case Opcodes.D2I: string = "D2I"; break;
		case Opcodes.L2F: string = "L2F"; break;
		case Opcodes.D2F: string = "D2F"; break;
		case Opcodes.ISTORE: string = "ISTORE";	break;
		case Opcodes.FSTORE: string = "FSTORE"; break;
		case Opcodes.ASTORE: string = "ASTORE"; break;
		case Opcodes.LSTORE: string = "LSTORE"; break;
		case Opcodes.DSTORE: string = "DSTORE"; break;
		case Opcodes.IASTORE: string = "IASTORE"; break;
		case Opcodes.BASTORE: string = "BASTORE"; break;
		case Opcodes.CASTORE: string = "CASTORE"; break;
		case Opcodes.SASTORE: string = "SASTORE"; break;
		case Opcodes.FASTORE: string = "FASTORE"; break;
		case Opcodes.AASTORE: string = "AASTORE"; break;
		case Opcodes.LASTORE: string = "LASTORE"; break;
		case Opcodes.DASTORE: string = "DASTORE"; break;
		case Opcodes.POP: string = "POP"; break;
		case Opcodes.IFEQ: string = "IFEQ"; break;
		case Opcodes.IFNE: string = "IFNE"; break;
		case Opcodes.IFLT: string = "IFLT"; break;
		case Opcodes.IFGE: string = "IFGE"; break;
		case Opcodes.IFGT: string = "IFGT"; break;
		case Opcodes.IFLE: string = "IFLE"; break;
		case Opcodes.IFNULL: string = "IFNULL"; break;
		case Opcodes.IFNONNULL: string = "IFNONNULL"; break;
		case Opcodes.IF_ICMPEQ: string = "IF_ICMPEQ"; break;
		case Opcodes.IF_ICMPNE: string = "IF_ICMPNE"; break;
		case Opcodes.IF_ICMPLT: string = "IF_ICMPLT"; break;
		case Opcodes.IF_ICMPGE: string = "IF_ICMPGE"; break;
		case Opcodes.IF_ICMPGT: string = "IF_ICMPGT"; break;
		case Opcodes.IF_ICMPLE: string = "IF_ICMPLE"; break;
		case Opcodes.IF_ACMPEQ: string = "IF_ACMPEQ"; break;
		case Opcodes.IF_ACMPNE: string = "IF_ACMPNE"; break;
		case Opcodes.TABLESWITCH: string = "TABLESWITCH"; break;
		case Opcodes.LOOKUPSWITCH: string = "LOOKUPSWITCH"; break;
		case Opcodes.ATHROW: string = "ATHROW"; break;
		case Opcodes.MONITORENTER: string = "MONITORENTER"; break;
		case Opcodes.MONITOREXIT: string = "MONITOREXIT"; break;
		case Opcodes.POP2: string = "POP2"; break;
		case Opcodes.DUP: string = "DUP"; break;
		case Opcodes.DUP_X1: string = "DUP_X1"; break;
		case Opcodes.DUP_X2: string = "DUP_X2"; break;
		case Opcodes.DUP2: string = "DUP2"; break;
		case Opcodes.DUP2_X1: string = "DUP2_X1"; break;
		case Opcodes.DUP2_X2: string = "DUP2_X2"; break;
		case Opcodes.SWAP: string = "SWAP"; break;
		case Opcodes.IADD: string = "IADD"; break;
		case Opcodes.ISUB: string = "ISUB"; break;
		case Opcodes.IMUL: string = "IMUL"; break;
		case Opcodes.IDIV: string = "IDIV"; break;
		case Opcodes.IREM: string = "IREM"; break;
		case Opcodes.IAND: string = "IAND"; break;
		case Opcodes.IOR: string = "IOR"; break;
		case Opcodes.IXOR: string = "IXOR"; break;
		case Opcodes.ISHL: string = "ISHL"; break;
		case Opcodes.ISHR: string = "ISHR"; break;
		case Opcodes.IUSHR: string = "IUSHR"; break;
		case Opcodes.FCMPL: string = "FCMPL"; break;
		case Opcodes.FCMPG: string = "FCMPG"; break;
		case Opcodes.FADD: string = "FADD"; break;
		case Opcodes.FSUB: string = "FSUB"; break;
		case Opcodes.FMUL: string = "FMUL"; break;
		case Opcodes.FDIV: string = "FDIV"; break;
		case Opcodes.FREM: string = "FREM"; break;
		case Opcodes.LADD: string = "LADD"; break;
		case Opcodes.LSUB: string = "LSUB"; break;
		case Opcodes.LMUL: string = "LMUL"; break;
		case Opcodes.LDIV: string = "LDIV"; break;
		case Opcodes.LREM: string = "LREM"; break;
		case Opcodes.LAND: string = "LAND"; break;
		case Opcodes.LOR: string = "LOR"; break;
		case Opcodes.LXOR: string = "LXOR"; break;
		case Opcodes.DADD: string = "DADD"; break;
		case Opcodes.DSUB: string = "DSUB"; break;
		case Opcodes.DMUL: string = "DMUL"; break;
		case Opcodes.DDIV: string = "DDIV"; break;
		case Opcodes.DREM: string = "DREM"; break;
		case Opcodes.LSHL: string = "LSHL"; break;
		case Opcodes.LSHR: string = "LSHR"; break;
		case Opcodes.LUSHR: string = "LUSHR"; break;
		case Opcodes.LCMP: string = "LCMP"; break;
		case Opcodes.DCMPL: string = "DCMPL"; break;
		case Opcodes.DCMPG: string = "DCMPG"; break;
		case Opcodes.GETSTATIC: string = "GETSTATIC"; break;
		case Opcodes.PUTSTATIC: string = "PUTSTATIC"; break;
		case Opcodes.GETFIELD: string = "GETFIELD"; break;
		case Opcodes.INVOKEINTERFACE: string = "INVOKEINTERFACE"; break;
		case Opcodes.INVOKESPECIAL: string = "INVOKESPECIAL"; break;
		case Opcodes.INVOKEVIRTUAL: string = "INVOKEVIRTUAL"; break;
		case Opcodes.INVOKESTATIC: string = "INVOKESTATIC"; break;
		case Opcodes.IRETURN: string = "IRETURN"; break;
		case Opcodes.FRETURN: string = "FRETURN"; break;
		case Opcodes.ARETURN: string = "ARETURN"; break;
		case Opcodes.LRETURN: string = "LRETURN"; break;
		case Opcodes.DRETURN: string = "DRETURN"; break;
		case Opcodes.NEW: string = "NEW"; break;
		case Opcodes.ANEWARRAY: string = "ANEWARRAY"; break;
		case Opcodes.NEWARRAY: string = "NEWARRAY"; break;
		case Opcodes.INSTANCEOF: string = "INSTANCEOF"; break;
		case Opcodes.MULTIANEWARRAY: string = "MULTIANEWARRAY";	break;
		default: string = "NA";
		}
		return string;
	}
	
	public static String FrameTypeToText(int type) {
		String string = null;
		switch(type) {
		case Opcodes.F_APPEND: string = "F_APPEND"; break;
		case Opcodes.F_CHOP: string = "F_CHOP"; break;
		case Opcodes.F_FULL: string = "F_FULL"; break;
		case Opcodes.F_NEW: string = "F_NEW:"; break;
		case Opcodes.F_SAME: string = "F_SAME"; break;
		case Opcodes.F_SAME1: string = "F_SAME1"; break;
		default: string = "NA"; break;
		}
		return string;
	}

	public static String TypeToText(int type) {
		String string = null;
		switch(type) {
		case Type.ARRAY: string = "ARRAY"; break;
		case Type.BOOLEAN: string = "BOOLEAN"; break;
		case Type.BYTE: string = "BYTE"; break;
		case Type.CHAR: string = "CHAR"; break;
		case Type.DOUBLE: string = "DOUBLE"; break;
		case Type.FLOAT: string = "FLOAT"; break;
		case Type.INT: string = "INT"; break;
		case Type.LONG: string = "LONG"; break;
		case Type.METHOD: string = "METHOD"; break;
		case Type.OBJECT	: string = "OBJECT"; break;
		case Type.SHORT: string = "SHORT"; break;
		case Type.VOID: string = "VOID"; break;
		default: string = "NA";
		}
		return string;
	}
}
