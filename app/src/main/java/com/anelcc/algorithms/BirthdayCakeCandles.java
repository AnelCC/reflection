package com.anelcc.algorithms;

public class BirthdayCakeCandles {

    // Complete the BirthdayCakeCandles function below.
    static int BirthdayCakeCandles(int[] candlesList) {
        int counter = 0; //Count the highest candles
        int candleValue = 0;
        int height[] = new int[candlesList.length];//List of the highest candles


        // loop stop when is less of the number of candles
        for(int i = 0; i < candlesList.length; i++){
            height[i] = candlesList[i]; //We assignee the value in the highest candles list
            if (height[i] > candleValue) { //Validate if the new candles is biggest at current value
                candleValue = height[i]; //assignee current highest value in candleValue
            }
        }
        // loop stop when is less of the number of height candles
        for (int i = 0; i < height.length; i++) {
            if (candleValue == height[i]) { // validate highest candles list with current highest value in candleValue
                counter++; //increase the value in case has a duplicate number
            }
        }
        //System.out.println(counter);
        return counter; //return the sum of the highest candles
    }

}
