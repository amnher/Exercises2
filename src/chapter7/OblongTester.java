package chapter7;
import java.util.Scanner;

public class OblongTester {
    public static void main(String[] args) {
        double length, height;
        Scanner sc = new Scanner(System.in);
        Oblong myOblong;

        System.out.print("Enter length: ");
        length = sc.nextDouble();;
        System.out.print("Enter height: ");
        height = sc.nextDouble();;

        myOblong = new Oblong(length, height);

        System.out.println("The length is " + myOblong.getLength());
        System.out.println("The height is " + myOblong.getHeight());
        System.out.println("The area is " + myOblong.calculateArea());
        System.out.println("The perimeter is " + myOblong.calculatePerimeter());
    }
}

