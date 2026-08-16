public class OOPS {
  public static void main(String args[]) {



    // Basic example of Class and Object
    // Pen p1 = new Pen();
    // p1.setColor("Blue");
    // System.out.println(p1.color);
    // p1.setTip(5);
    // System.out.println(p1.tip);



    // Access Modifiers
    // BankAccount myAcc = new BankAccount();
    // myAcc.username = "shradhaKhapra";
    // myAcc.password = "abcdefghi"; 
    // myAcc.setPassword("abcdefghi");



    // Getters and Setters
    // Pen p1 = new Pen();
    // p1.setColor("Blue");
    // System.out.println(p1.getColor());
    // p1.setTip(5);
    // System.out.println(p1.getTip);
    // p1.setColor("Yellow");
    // System.out.println(p1.getColor());



    // Non-Parameterized Constructor
    // Student s1 = new Student();

    // Parameterized Constructor
    // Student s2 = new Student("Hitesh");

    // Shallow and Deep Copy Constructor
    // Student s1 = new Student();
    // s1.name = "Hitesh";
    // s1.roll = 456;
    // s1.marks[0] = 100;
    // s1.marks[1] = 90;
    // s1.marks[2] = 80;
    
    // Student s2 = new Student(s1);
    // s2.password = "xyz";
    // s1.marks[2] = 100;
    // for(int i=0; i<3; i++) {
    //     System.out.println(s2.marks[i]);
    // }



    // Single level Inheritance
    // Fish shark = new Fish();
    // shark.eat();

    // Multi level Inheritance
    // Dog dobby = new Dog();
    // dobby.eat();
    // dobby.legs = 4;
    // System.out.println(dobby.legs);

    // Hierarchial Inheritance
    // Mammals mammal = new Mammals();
    // mammal.eat();
    // Fish shark = new Fish();
    // shark.swim();
    // Bird parrot = new Bird();
    // parrot.color = "Green";
    // System.out.println(parrot.color);



    // Method Overloading
    // Calculator calc = new Calculator();
    // System.out.println(calc.sum(1, 2));
    // System.out.println(calc.sum((float)1.5, (float)2.5));
    // System.out.println(calc.sum(1, 2, 3));



    // Method Overriding
    // Deer d = new Deer();
    // d.eat();



    // Abstract Class and Method
    // Horse h = new Horse();
    // h.eat();
    // h.walk();
    // Hen hen = new Hen();
    // hen.walk();
    // Mustang myHorse = new Mustang();



    // Interfaces
    // Queen q = new Queen();
    // q.moves();



    // Static Keyword
    // Student s1 = new Student();
    // s1.schoolName = "JMV";
    // Student s2 = new Student();
    // System.out.println(s2.schoolName);



    // Super Keyword
    // Horse h = new Horse();
  }  
}



// Access Modifiers
// class BankAccount {
//     public String username;
//     private String password;
//     public void setPassword(String pwd) {
//         password = pwd;
//     }
// }

// class Pen {



    // Basic example of Class and Object
    // String color;
    // int tip;



    // Getters and Setters
    // String getColor() {
    //     return this.color;
    // }

    // int getTip() {
    //     return this.tip;
    // }

    // void setColor(String newColor) {
    //     color = newColor;
    // }

    // void setTip(int newTip) {
    //     tip = newTip;
    // }



    // Basic example of Class and Object
    // void setColor(String newColor) {
    //     color = newColor;
    // }

    // void setTip(int newTip) {
    //     tip = newTip;
    // }
// }



// Constructors
// class Student {
//     String name;
//     int roll;
//     String password;
//     int marks[];

    // Non-Parameterized Constructor
    // Student() {
        // System.out.println(("Constructor is called..."));
    // }

    // Parameterized Constructor
    // Student(String name) {
    //     this.name = name;
    // }

    // Shallow Copy Constructor
    // Student(Student s1) {
    //     marks = new int[3];
    //     this.name = s1.name;
    //     this.roll = s1.roll;
    //     this.marks = s1.marks;
    // }
    // Student() {
    //     marks = new int[3];
    //     System.out.println("Constructor is called...");
    // }
    // Student(String name) {
    //     marks = new int[3];
    //     this.name = name;
    // }
    // Student(int roll) {
    //     marks = new int[3];
    //     this.roll = roll;
    // }

    // Deep Copy Constructor
    // Student(Student s1) {
    //     marks = new int[3];
    //     this.name = s1.name;
    //     this.roll = s1.roll;
    //     for(int i=0; i<marks.length; i++) {
    //         this.marks[i] = s1.marks[i];
    //     }
    // }
    
// }



// Single and Multi level Inheritance Base Class
// class Animal {
//     String color;
//     void eat() {
//         System.out.println("eats");
//     }

//     void breathe() {
//         System.out.println("breathes");
//     }
// }

// Sinle level Inheritance Derived Class or SubClass
// class Fish extends Animal {
//     int fins;
    
//     void swim() {
//         System.out.println("swims in water");
//     }
// }


// Multi level Inheritance
// class Mammals extends Animal {
//     int legs;
// }

// class Dog extends Mammals {
//     String breed;
// }



// Hierarchial Inheritance
// class Mammals extends Animal {
//     void walk() {
//         System.out.println("walks");
//     }
// }

// class Fish extends Animal {
//     void swim() {
//         System.out.println("swim");
//     }
// }
// class Bird extends Animal {
//     void fly() {
//         System.out.println("fly");
//     }
// }



// Method Overloading
// class Calculator {
//     int sum(int a, int b) {
//         return a + b;
//     } float sum(float a, float b) {
//         return a + b;
//     }
//     int sum(int a, int b, int c) {
//         return a + b + c;
//     }
// }



// Method Overriding
// class Animal {
//     void eat() {
//         System.out.println("eat anything");
//     }
// }

// class Deer extends Animal {
//     void eat() {
//         System.out.println("eats grass");
//     }
// }



// Abstract Class and Method
// abstract class Animal {

//     Animal() {
//         System.out.println("animal constructor called");
//     }
    // Non-Abstract Method
    // void eat() {
    //     System.out.println("animal eats");
    // }

    // Abstract Method
    // abstract void walk();
// }

// class Horse extends Animal {

//     Horse() {
//         System.out.println("horse constructor called");
    // }
    // void walk() {
    //     System.out.println("walks on 4 legs");
    // }
// }

// class Mustang extends Horse {
//     Mustang() {
//         System.out.println("mustang constructor called");
//     }
// }

// class Hen extends Animal {
//     void walk() {
//         System.out.println("walks on 2 legs");
//     }
// }



// Interfaces
// interface ChessPlayer {
//     void moves();
// }

// class Queen implements ChessPlayer {
//     public void moves() {
//         System.out.println("up, down, left, right, diagonal(in all drns)");
//     }
// }

// class Rook implements ChessPlayer {
//     public void moves() {
//         System.out.println("up, down, left, right");
//     }
// }



// Static Keyword
// class Student {
//     String name;
//     int roll;
//     static String schoolName;

//     void setName(String name) {
//         this.name = name;
//     }
//     String getName() {
//         return this.name;
//     }
// }



// Super Keyword
// class Animal {
//     Animal() {
//         System.out.println("animal constructor is called");
//     }
// }
// class Horse extends Animal {
//     Horse() {
//         super();
//         System.out.println("horse constructor is called");
//     }
// }