import java.time.LocalDate;
import java.util.Date;
import java.time.temporal.ChronoUnit;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;
import java.util.*;
import java.util.random.*;

import static java.lang.Math.random;

public class esep1 {
    public static void main(String[] args) {
        HashMap < Integer, String > map = new HashMap < Integer, String> ();
        map.put(1, "Red");
        map.put(2, "Green");
        map.put(3, "Black");

        System.out.println("The Original map: " + map);
        if (map.containsValue("orange")) {
            System.out.println("yes!");
        }
        else {

            System.out.println("no!");

        }


        /*
        long start = System.currentTimeMillis();
        for (int i = 0; i<=10000; i++){
            System.out.println(Math.random()*10);
        }
        double finish = System.currentTimeMillis() - start;
        System.out.println(finish/1000);


        LocalTime ld1 = LocalTime.parse("21:42");
        LocalTime ld2 = LocalTime.parse("22:15");
        System.out.println(ChronoUnit.MINUTES.between(ld1,ld2));

        Date md1 = new Date();

        long start = md1.getTime();
        try {
            Thread.sleep(1000);
        }catch (Exception ex){

        }
        Date md2 = new Date();
        long finish =  md2.getTime();

        System.out.println((double)(finish - start)/1000);


        int arr[] = {1,2,3,4};
        System.out.println("do: ");
        for(int i = 0; i < arr.length; i++){
            System.out.println(arr[i]);
        }
        System.out.println("posle");
        for (int i = arr.length-1; i >= 0; i--){
            System.out.println(arr[i]);
        }
        int a = 587;
        int sum = 0;
        sum = a/100 + (a/10)%10 + a%10;

        System.out.println(sum);

        int i, s, j, p;
        int arr[] = new int[100];
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of an array:");
        s = sc.nextInt();

        System.out.print("Enter array elements:");
        for (i = 0; i < s; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("All prime numbers are:");

        for (i = 0; i < s; i++) {
            j = 2;
            p = 1;
            while (j < arr[i]) {
                if (arr[i] % j == 0) {
                    p = 0;
                    break;
                }
                j++;
            }
            if (p == 1) {
                System.out.print(" " + arr[i]);
            }
        }*/

    }
}

