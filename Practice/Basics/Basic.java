// package Practice.Basics;

// import java.util.*;

// public class Basic {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         // System.out.print("Enter the cost of pencil : ");
//         // float pencil = sc.nextFloat();
//         // System.out.print("Enter the cost of pen : ");
//         // float pen = sc.nextFloat();
//         // System.out.print("Enter the cost of eraser : ");
//         // float eraser = sc.nextFloat();

//         // float total = pencil + pen + eraser;
//         // System.out.println("The total cost price : " + total);

//         // float gstTotal = total + (float) (total * 0.18);
//         // System.out.println("The total cost after GST : " + gstTotal);

//         // boolean val = false;
//         // boolean val = "0"; // --> String can't be converted into boolean
//         // System.out.println(val);

//         // int add = 3 + "5"; // --> error
//         // System.out.println();

//         System.out.print("Enter an integer: ");
//         int a = (new Scanner(System.in).nextInt());
//         System.out.print(a);

//         sc.close();
//     }
// }

package Practice.Basics;

import java.util.*;

public class Basic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the cost of pencil : ");
        float pencil_cost = sc.nextFloat();
        System.out.print("Enter the cost of pen : ");
        int pen_cost = sc.nextInt();

        float total_cost = pencil_cost + pen_cost;
        System.out.print("The total cost price : " + total_cost);
    }
}