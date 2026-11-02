package com.Bmethods;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
       // App a = new App(); 
       // a.add(i: 1, j: 2);
       // a.greet(name: "j"); 
           // }

           // private void greet (String name) {
               // System.out.println("hello" + name);
           // }
           // private void greet() {
               // System.out.println("hello");
           // }

           // private void add(int i, int j) {
       // System.out.println(i + j);
           // }

    Scanner scanner = new Scanner(System.in);

    System.out.println("name: ");
    String name = scanner.nextLine();
    System.out.println(name);

    System.out.println("age: ");
    int age = scanner.nextInt();
    System.out.println(age); 

    System.out.println("score: ");
    double score = scanner.nextDouble(); 
    System.out.println(score);

    }
}
