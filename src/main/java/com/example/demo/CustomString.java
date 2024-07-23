package com.example.demo;



import java.lang.annotation.Native;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;

public class CustomString implements java.io.Serializable, CharSequence{

    static final boolean COMPACT_STRINGS;
    private final byte coder;
    private final byte[] value;

    static {
        COMPACT_STRINGS = true;
    }

    public CustomString() {
        CustomString cs = new CustomString();
        this.value = cs.value;
        this.coder = cs.coder;
    }
    public CustomString(CustomString original) {
        this.value = original.value;
        this.coder = original.coder;
    }

    @Native
    static final byte LATIN1 = 0;
    @Native static final byte UTF16  = 1;

    byte[] value() {
        return value;
    }
    byte coder() {
        return COMPACT_STRINGS ? coder : UTF16;
    }
    public int length() {
        return value.length >> coder();
    }

    @Override
    public char charAt(int index) {
        return 0;
    }

    @Override
    public CharSequence subSequence(int start, int end) {
        return null;
    }
//    private final byte[] value;
//    private final byte coder;
//    static final byte UTF16  = 1;
//    static final boolean COMPACT_STRINGS;
//    static {
//        COMPACT_STRINGS = true;
//    }
//
//    static final byte LATIN1 = 0;
//
//
//    public CustomString(byte[] value, byte coder) {
//
//        this.value = value;
//        this.coder = coder;
//    }
//
//    byte coder() {
//        return COMPACT_STRINGS ? coder : UTF16;
//    }
//
//    private static byte[] encode(byte coder, byte[] val) {
//        int dp = 0;
//        int sp = 0;
//        int sl = val.length >> 1;
//        byte[] dst = new byte[sl * 3];
//        while (sp < sl) {
//            // ascii fast loop;
//            char c = CustomStringUTF16.getChar(val, sp);
//            if (c >= '\u0080') {
//                break;
//            }
//            dst[dp++] = (byte)c;
//            sp++;
//        }
//        while (sp < sl) {
//            char c = CustomStringUTF16.getChar(val, sp++);
//            if (c < 0x80) {
//                dst[dp++] = (byte)c;
//            } else if (c < 0x800) {
//                dst[dp++] = (byte)(0xc0 | (c >> 6));
//                dst[dp++] = (byte)(0x80 | (c & 0x3f));
//            } else if (Character.isSurrogate(c)) {
//                int uc = -1;
//                char c2;
//                if (Character.isHighSurrogate(c) && sp < sl &&
//                        Character.isLowSurrogate(c2 = CustomStringUTF16.getChar(val, sp))) {
//                    uc = Character.toCodePoint(c, c2);
//                }
//                if (uc < 0) {
//                    dst[dp++] = '?';
//                } else {
//                    dst[dp++] = (byte)(0xf0 | ((uc >> 18)));
//                    dst[dp++] = (byte)(0x80 | ((uc >> 12) & 0x3f));
//                    dst[dp++] = (byte)(0x80 | ((uc >>  6) & 0x3f));
//                    dst[dp++] = (byte)(0x80 | (uc & 0x3f));
//                    sp++;  // 2 chars
//                }
//            } else {
//                // 3 bytes, 16 bits
//                dst[dp++] = (byte)(0xe0 | ((c >> 12)));
//                dst[dp++] = (byte)(0x80 | ((c >>  6) & 0x3f));
//                dst[dp++] = (byte)(0x80 | (c & 0x3f));
//            }
//        }
//        if (dp == dst.length) {
//            return dst;
//        }
//        return Arrays.copyOf(dst, dp);
//    }

//    boolean isLatin1() {
//        return COMPACT_STRINGS && coder == LATIN1;
//    }

//    public int indexOf(String str) {
//        byte coder = coder();
//        if (coder == str.coder()) {
//            return isLatin1() ? StringLatin1.indexOf(value, str.value)
//                    : StringUTF16.indexOf(value, str.value);
//        }
//        if (coder == LATIN1) {  // str.coder == UTF16
//            return -1;
//        }
//        return StringUTF16.indexOfLatin1(value, str.value);
//    }

}
