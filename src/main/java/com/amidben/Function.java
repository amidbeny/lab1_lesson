package com.amidben;/**
 * Created by amid on 21.05.2017.
 */
public class Function implements Functions
{
   // private static int sum;
  //  private static double sum1;

    public void  getSumNumbers(int[] numbers) {
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum = sum + numbers[i];
        }

        System.out.println("Sum=" + sum);
    }

    public void getSrNumber(int[] numbers) {
        int sum = 0 ,sr;
        for (int i = 0; i < numbers.length; i++) {
            sum = sum + numbers[i];
        }
        System.out.println("Sr=" + (double)(sum)/numbers.length);
    }

    public void getMinNumber(int[] numbers) {
        int min;
        min = numbers[0];
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] < min) {
                min = numbers[i];
            }
        }
        System.out.println("Min=" + min);
    }

    public void getMaxNumber(int[] numbers) {
        int max;
        max = numbers[0];
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }
        System.out.println("Max=" + max);
    }

    public void getPrNumbers(int[] numbers) {
        int sum = 1;
        for (int i = 0; i < numbers.length; i++) {
            sum = sum * numbers[i];
        }
        System.out.println("Pr=" + sum);

    }

    public void getRazNumbers(int[] numbers) {
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum = sum - numbers[i];
        }
        System.out.println("Raz=" +sum);
    }

    public void getSumNumbers(double[] numbers) {
        double sum1 = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum1 = sum1 + numbers[i];
        }
        System.out.println("Sum=" + sum1);
    }

    public void getSrNumber(double[] numbers) {
        double sum1 = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum1 = sum1 + numbers[i];
        }
        System.out.println("Sr=" + sum1/numbers.length);
    }

    public void getMinNumber(double[] numbers) {
        double min;
        min = numbers[0];
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] < min) {
                min = numbers[i];
            }
        }
        System.out.println("Min=" + min);
    }

    public void getMaxNumber(double[] numbers) {
        double max;
        max = numbers[0];
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }
        System.out.println("Max=" + max);
    }

    public void getPrNumbers(double[] numbers) {
        int  sum = 1;
        double sum1=1;
        for (int i = 0; i < numbers.length; i++) {
            sum1 = sum1 * numbers[i];
        }
        System.out.println("Pr=" + sum1);

    }

    public void getRazNumbers(double[] numbers) {
        int sum = 0;
        double sum1=0;
        for (int i = 0; i < numbers.length; i++) {
            sum1 = sum1 - numbers[i];
        }
        System.out.println("Raz=" + sum1);
    }
}