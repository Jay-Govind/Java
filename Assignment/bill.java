import java.util.*;
public class bill {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the price of Pencil: ");
        float pencil = sc.nextFloat();
        System.out.print("Enter the price of eraser: ");
        float eraser = sc.nextFloat();
        System.out.print("Enter the price of pen: ");
        float pen = sc.nextFloat();

        float total = pencil + eraser + pen;
        float gst = (float)(total * 0.18);
        float grandTotal = total + gst;

        System.out.println("--------------------");
        System.out.println("| Total       : " + total);
        System.out.println("| GST         : " + gst);
        System.out.println("| Grand Total : " + grandTotal);
        System.out.println("--------------------");
        sc.close();
    }
}