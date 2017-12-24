package com.company.lesson3.homeWork;

public class Convert {
    public static void main(String[] args) {
    }

    public static void ToByte() {
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
        byte b6 = (byte) c1;
    }

    public static void ToShort(String[] args) {
        byte b1 = 1;
        short s1 = b1; //неявное
        short s3 = 232;
        short s2 = s3; //тождество
        int i1 = 726;
        short s6 = (short) i1; //явное
        long l1 = 285;
        short s5 = (short) l1; //явное
    }

    public static void ToChar(String[] args) {
        char c1 = 'j';
        char c2 = 'r';
        c1 = c2; //тождетсво
        int i1 = 36;
        char c3 = (char) i1; //явное
    }

    public static void ToInt(String[] args) {
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

    public static void ForLong(String[] args) {
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
    }

    public static void ForFloat(String[] args) {
        float f1 = 23.125f;
        float f2 = f1; //тождество
        double d1 = 4512.314;
        float f3 = (float) d1; //явное
        int i1 = 234;
        float f4 = (float) i1; //явное
        long l1 = 2836;
        float f5 = (float) l1; //явное
    }

    public static void ForDouble(String[] args) {
        double d1 = 12351.534;
        double d2 = d1; //тождество
        float f1 = 235.243f;
        double d3 = f1; //неявное
        int i1 = 234;
        double d4 = (double) i1; //явное
        long l1 = 21751;
        double d5 = (double) l1; //явное
    }
}
