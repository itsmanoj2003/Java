package Training;

import java.util.Scanner;

public class Assignment1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

//        1st Program
//        System.out.print("Enter the interger value: ");
//        int n1 = sc.nextInt();
//        int n1cpy = n1;
//        System.out.print("Enter the float value: ");
//        float n2 = sc.nextFloat();
//        System.out.print("Enter the character: ");
//        char c = sc.next().charAt(0);
//        float conint = n1;
//        float floatadd = conint+n2;
//        System.out.println("Float Addition result is "+floatadd);
//        int casci = (int)c;
//        int asciadd = n1+casci;
//        System.out.println("Character Addition result is "+asciadd);



//        2nd Program
//        System.out.print("Enter the 1st Integer value: ");
//        int n1 = sc.nextInt();
//        System.out.print("Enter the 2nd Integer value: ");
//        int n2 = sc.nextInt();
//        System.out.print("Enter the Double value: ");
//        double d = sc.nextDouble();
//        System.out.println("Addition: "+(n1+n2));
//        System.out.println("Subtraction: "+(n1-n2));
//        System.out.println("Multiplication: "+(n1*n2));
//        System.out.println("Division: "+(n2/n1));
//        double doubleadd = (n1+n2)*d;
//        System.out.println("Double Multiplication: "+doubleadd);



//        3rd Program
        System.out.print("Enter the 1st Integer value: ");
        int n1 = sc.nextInt();
        System.out.print("Enter the 2st Integer value: ");
        int n2 = sc.nextInt();
        System.out.println("AND Operation: "+(n1&n2));
        System.out.println("OR Operation: "+(n1|n2));
        System.out.println("XOR Operation: "+(n1^n2));
        System.out.println("Left Shift");
        System.out.println("Left Shift of n1 by 2 Bits: "+(n1<<2));
        System.out.println("Left Shift of n2 by 2 Bits: "+(n2<<2));
        System.out.println("Right Shift");
        System.out.println("Right Shift of n1 by 2 Bits: "+(n1>>2));
        System.out.println("Right Shift of n2 by 2 Bits: "+(n2>>2));


    }

}
