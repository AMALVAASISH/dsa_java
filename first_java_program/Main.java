// package dsa_java.first_java_program;
//
// public class Main {
//     public static void main(String[] args) {
//         System.out.println("Hello, World!");
//     }
// }

// ==================================


//  package dsa_java.first_java_program;
//
//  public class Main{
// 	public static void main(String[] args){
// 		System.out.println(args[1]);
// 	}
// }

// commands that are run

// javac dsa_java/first_java_program/Main.java
// java dsa_java.first_java_program.Main 30 amal


// Java -d . Main.java
// (the -d is used for setting a folder to create the .class file, . creates it in the current directory)

//=============================================================
//
//  package dsa_java.first_java_program;
//  import java.util.Scanner;
//
//  public class Main{
// 	public static void main(String[] args){
// 		Scanner input = new Scanner(System.in);
//        System.out.println(input.next()); // next is used for string and nextint is used for integer values
// 	}
// }


//  Here scanner is a class that allows us to take inputs.
//
//  System.in is used to insert values from the command line
//
//  nextInt takes in only integer values
//  Use next() to take in string values and then print them
//  nextLine() is used for inputting an entire line


// primitive datatypes in java
//
//package dsa_java.first_java_program;
//
//public class Main{
//    public static void main(String[] args) {
//        int rollno = 3;// default is int
//        char letter = 'e';
//        float marks = 89.6f;// so f is used to make it store in float
//        double largeDecimalNumbers = 33325345.43; // by default all the values are in double
//        long largeNumber = 345345435345L;
//        boolean check = false;
//    }
//}

//
//int input program

package dsa_java.first_java_program;

import java.util.Scanner;


//public class Main{
//    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        int a = 10; // a is the identifier and 10 is the literal
//        int b = 23_000_000; // here _ is in place of the ,
//        int rollno = input.nextInt();
//        System.out.println("your roll number is: " + rollno);
//    }
//}



public class Main{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num1 = input.nextInt();
        int num2 = input.nextInt();

        int sum = num1 + num2;
        System.out.println("the sum is" + sum);
    }
}

// time - 1.09 hr