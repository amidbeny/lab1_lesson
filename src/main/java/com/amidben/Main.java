package com.amidben;
import com.amidben.*;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Objects;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        int m;
        Function Sum = new Function();

        Scanner in = new Scanner(System.in);
        System.out.println("Load array:");
        m = in.nextInt();
        //  int[] ints;
        // double[] doub;
        int[] ints = new int[m];
        //double[] doub=new doub[m];

        System.out.println("Print ints:");
        try {
          //  int[] ints = new int[m];
           // double[] doub = new double[m];
            for (int n = 0; n < ints.length; n++)

            {
                ints[n] = in.nextInt();}
                Sum.getSumNumbers(ints);
                Sum.getSrNumber(ints);
                Sum.getMinNumber(ints);
                Sum.getMaxNumber(ints);
                Sum.getPrNumbers(ints);
                Sum.getRazNumbers(ints);

                // doub[n]=in.nextDouble();
                // Sum.getSumNumbers(doub);
                // Sum.getSrNumber(doub);
                //  Sum.getMinNumber(doub);
                //  Sum.getMaxNumber(doub);
                //  Sum.getPrNumbers(doub);
                //  Sum.getRazNumbers(doub);




        }
        catch (Exception e)
        {System.out.println("Error type");};

        }

    }

