package com.company.lesson3.homeWork;

public class Convert {
    public static void main(String[] args) {
        toByte();
        toChar();
        toDouble();
        toFloat();
        toInt();
        toLong();
        toShort();
    }

    public static void toByte() {
        byte b1;
        byte b2 = 2;
        b1 = b2; //тождество
        short s1 = 22;
        byte b3 = (byte) s1; //явное
        int i1 = 221;
        byte b4 = (byte) i1; //явное
        long l1 = 82652;
        byte b5 = (byte) l1; //явное
        char c1 = 'r';
        byte b6 = (byte) c1; //явное
        float f1 = 13.4f;
        byte b7 = (byte) f1; //явное
        double d1 = 451.4;
        byte b8 = (byte) d1; //явное
    }

    public static void toShort() {
        byte b1 = 1;
        short s1 = b1; //неявное
        short s3 = 232;
        short s2 = s3; //тождество
        int i1 = 726;
        short s6 = (short) i1; //явное
        long l1 = 285;
        short s5 = (short) l1; //явное
        float f1 = 13.54f;
        short s7 = (short) f1; //явное
        double d1 = 457.87;
        short s8 = (short) d1; //явное
        char c1 = 't';
        short s9 =(short) c1; //явное
    }

    public static void toChar() {
        char c1 = 'j';
        char c2 = 'r';
        c1 = c2; //тождетсво
        byte b1 = 3;
        char c3 = (char) b1; //явное
        short s1 = 23;
        char c4 = (char) s1; //явное
        int i1 = 36;
        char c5 = (char) i1; //явное
        long l1 = 123;
        char c6 = (char) l1; //явное
        float f1 = 37.32f;
        char c7 = (char) f1; //явное
        double d1 = 373;
        char c8 = (char) d1; //явное
    }

    public static void toInt() {
        byte b1 = 2;
        int i1 = b1; //неявное
        short s1 = 47;
        int i2 = s1; //неявное
        int i3 = 974;
        int i4 = i3; //тождество
        long l1 = 218461846;
        int i5 = (int) l1; //явное
        float f1 = 24.512f;
        int i6 = (int) f1; //явное
        double d1 = 2384.213512;
        int i7 = (int) d1; //явное
        char c1 = 23;
        int i8 = c1; //неявное
    }

    public static void toLong() {
        byte b1 = 3;
        long l1 = b1; //неявное
        short s1 = 235;
        long l2 = s1; //неявное
        int i1 = 245;
        long l3 = i1; //неявное
        long l4 = 21842946;
        long l5 = l4; //тождество
        float f1 = 1.431251f;
        long l6 = (long) f1; //явное
        double d1 = 45212.1235;
        long l7 = (long) d1; //явное
        char c1 = 'j';
        long l8 = c1; //неявное
    }

    public static void toFloat() {
        float f1 = 23.125f;
        float f2 = f1; //тождество
        double d1 = 4512.314;
        float f3 = (float) d1; //явное
        byte b1 = 6;
        float f4 = (float) b1; //явное
        short s1 = 34;
        float f5 = (float) s1; //явное
        int i1 = 234;
        float f6 = i1; //явное
        long l1 = 2836;
        float f7 = l1; //неявное
        char c1 = 'r';
        float f8 = c1; //неявное
    }

    public static void toDouble() {
        double d1 = 12351.534;
        double d2 = d1; //тождество
        float f1 = 235.243f;
        double d3 = f1; //неявное
        byte b1 = 2;
        double d4 = b1; //явное
        short s1 = 33;
        double d5 = s1; //явное
        int i1 = 234;
        double d6 = i1; //явное
        long l1 = 21751;
        double d7 = l1; //явное
        char c1 = 'u';
        long l8 = c1; //неявное
    }
}
