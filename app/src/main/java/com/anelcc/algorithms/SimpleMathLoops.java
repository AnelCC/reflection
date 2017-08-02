package com.anelcc.algorithms;

import java.util.ArrayList;

public class SimpleMathLoops {

    public ArrayList<String> simpleMathLoops(int N) {
        ArrayList<String> mathList= new ArrayList<>();
        String math;
        int counter = 0;
        int limit = 10;
        do {
            counter = counter+1;
            //System.out.println(N+" x " + counter + " = " + (counter*N));
            math = N+" x " + counter + " = " + (counter*N);
            mathList.add(math);
        } while (counter < limit);
        return mathList;
    }

}
