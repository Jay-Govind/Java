package Practice.Basics;

import java.util.*;

public class Basic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // System.out.print("Enter the cost of pencil : ");
        // float pencil = sc.nextFloat();
        // System.out.print("Enter the cost of pen : ");
        // float pen = sc.nextFloat();
        // System.out.print("Enter the cost of eraser : ");
        // float eraser = sc.nextFloat();

        // float total = pencil + pen + eraser;
        // System.out.println("The total cost price : " + total);

        // float gstTotal = total + (float) (total * 0.18);
        // System.out.println("The total cost after GST : " + gstTotal);

        // boolean val = false;
        // boolean val = "0"; // --> String can't be converted into boolean
        // System.out.println(val);

        int add = 3 + "5"; // --> error (String cannot be converted to int)
        System.out.println();

        // System.out.print("Enter an integer: ");
        // int a = (new Scanner(System.in).nextInt());
        // System.out.print(a);

        sc.close();
    }
}