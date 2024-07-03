import java.util.*;
public class AreaOfCircle {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the radius: ");
        float radius = sc.nextFloat();

        float area = (float) (3.14 * radius * radius);
        //float area = 3.14f * radius * radius;
        /* we use f bcoz compiler consider any decimal number as double */

        System.out.println("Area of Circle: " + area);
        sc.close();
    }
}
