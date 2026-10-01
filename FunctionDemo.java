class Calculator {
// method 1
    int add(int a, int b) {
        return a+b;
    }
// method 2    
    int add(int a, int b, int c) {
        return a+b+c;
    }
// method 3    
    double add(double a, double b) {
        return a+b;
    }
}

class student {
    String name;
    int age;
// default constructor
    student() {
        name = "unknown";
        age = 0;
    }
// parameterized constructor
    student(String n, int a) {
        name = n;
        age = a;
    }
// copy constructor    
    student(student s) {
        this.name = s.name;
        age = s.age;
    }
// method to display student details   
    void display() {
        System.out.println("Name: " + name +" Age: " + age);
      
    }
//method to returning reference to current object   
    student getStudent() {
        return this;
    }

}

public class FunctionDemo {
    public static void main(String[] args) {
// ----- Function Overloading -----
        Calculator calc = new Calculator();
        System.out.println("Addition of two integers: " + calc.add(5, 10));
        System.out.println("Addition of three integers: " + calc.add(5, 10, 15));
        System.out.println("Addition of two double : " + calc.add(5.5, 4.5));

        student s1 = new student();                  // default constructor
        student s2 = new student("Niraj",19);   // parameterized constructor
        student s3 = new student(s2);                // copy constructor

        s1.display();
        s2.display();       
        s3.display();
// ----- Returning by reference -----
        student s4 = s2.getStudent(); // returning reference of s2
        System.out.println("Student s4 details (reference to s2): ");
  
    }
}
