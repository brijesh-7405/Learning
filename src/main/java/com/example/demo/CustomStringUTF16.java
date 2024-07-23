//package com.example.demo;
//
//public class CustomStringUTF16 {
//
//    private static native boolean isBigEndian();
//
//    static final int HI_BYTE_SHIFT;
//    static final int LO_BYTE_SHIFT;
//    static {
//        if (isBigEndian()) {
//            HI_BYTE_SHIFT = 8;
//            LO_BYTE_SHIFT = 0;
//        } else {
//            HI_BYTE_SHIFT = 0;
//            LO_BYTE_SHIFT = 8;
//        }
//    }
//    static char getChar(byte[] val, int index) {
//        assert index >= 0 && index < length(val) : "Trusted caller missed bounds check";
//        index <<= 1;
//        return (char)(((val[index++] & 0xff) << HI_BYTE_SHIFT) |
//                ((val[index]   & 0xff) << LO_BYTE_SHIFT));
//    }
//
//    public static int length(byte[] value) {
//        return value.length >> 1;
//    }
//}
