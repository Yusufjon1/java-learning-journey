package Exercise1Modul;

public class Exercise4 {
    static void main(String[] args) {
        int[] temperatures = {3, 7, -2, 5, 10, 1, 4};
        printTemperatures(temperatures);
        int maxTemp = findMax(temperatures);
        int minTemp = findMin(temperatures);
        double averageTemp = calculateAverage(temperatures);
        int differenceTemp = difference(maxTemp, minTemp);
        int aboveAverageTemp = countAboveAverage(temperatures, averageTemp);

        System.out.println("Max: " + maxTemp + "°C");
        System.out.println("Min: " + minTemp + "°C");
        System.out.println("Average: " + averageTemp + "°C");
        System.out.println("Difference: " + differenceTemp + "°C");
        System.out.println("Days above average: " + aboveAverageTemp + "°C");
    }

    private static int difference(int maxTemp, int minTemp) {
        return maxTemp - minTemp;
    }

    private static double calculateAverage(int[] temperatures) {
        double sum = 0.0;
        for (int temperature : temperatures) {
            sum += temperature;
        }
        return sum / temperatures.length;
    }

    private static int findMin(int[] temperatures) {
        int min = temperatures[0];
        for (int i = 1; i < temperatures.length; i++) {
            if (temperatures[i] < min) {
                min = temperatures[i];
            }
        }
        return min;
    }

    private static int findMax(int[] temperatures) {
        int max = temperatures[0];
        for (int i = 1; i < temperatures.length; i++) {
            if (temperatures[i] > max) {
                max = temperatures[i];
            }
        }
        return max;
    }

    private static void printTemperatures(int[] temperatures) {
        for (int i = 0; i < temperatures.length; i++) {
            System.out.println("day " + (i + 1) + ": " + temperatures[i] + "°C");
        }
    }

    private static int countAboveAverage(int[] temperatures, double average) {
        int aboveAverage = 0;


        for (int temperature : temperatures) {
            if (temperature > average) {
                aboveAverage++;
            }
        }
        return aboveAverage;
    }

}
