package com.company.experiments;

import java.util.Arrays;

class Any{
    String inside;
}

public class ObjectsExperiment {
    public static void main(String[] args) {
        name();
    }
    private static void name() {
        Any [] anyArray = new Any[20];
        for (int i=0;i<anyArray.length;i++){
            anyArray[i]=new Any();
            anyArray[i].inside="Inside "+i;
            System.out.println(anyArray[i]);
            System.out.println(anyArray[i].inside);
        }
        System.out.println(Arrays.toString(anyArray));
    }
}