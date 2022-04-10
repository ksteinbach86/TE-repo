package com.techelevator;

public class Tutorial {

    public static void main(String[] args) {

        int i;

        for (i = 0; i <= 5; i++) {
            System.out.println(i);
        }

        for (i =10; i >= 0; i--) {
            System.out.println(i);
        }

        int[] forecastTemperatures = new int[5];
        forecastTemperatures[0] = 72;
        forecastTemperatures[0] = 78;
        forecastTemperatures[0] = 58;
        forecastTemperatures[0] = 79;
        forecastTemperatures[0] = 74;

        forecastTemperatures[2] += 10;

        for (i = 0; i < forecastTemperatures.length; i++) {
            System.out.println(forecastTemperatures[i]);
        }

        int highestTemperatureValue = forecastTemperatures[0];
        int highestTemperatureIndex = 0;

        for(int j = 1; j < forecastTemperatures.length; j++);

        for (int j = 1; j < forecastTemperatures.length; j++) {
            if (forecastTemperatures[j] > highestTemperatureValue) {
                highestTemperatureValue = forecastTemperatures[j];
                highestTemperatureIndex = j;
            }
        }

        System.out.println("The highest temperature is " + highestTemperatureValue);

        System.out.println("The highest temperature is in " + (highestTemperatureIndex + 1) + " days");




    }
}
