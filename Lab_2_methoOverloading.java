// Java program to demonstrate method overloading
// by creating multiple add() methods with different parameter types.


//creating class name methodOverloading
public class Lab_2_methoOverloading {

    // create method to add two integers
    public int add(int a, int b) {
        return a + b;
    }

    // create method to add two double values
    public double add(double a, double b) {
        return a + b;
    }

    
    // create method to add an integer and a double
    public double add(int a, double b) {
        return a + b;
    }
    
    // create method to add a double and an integer
    public double add(double a, int b) {
      return a + b;
    }
    
    // create method to add three integers
    public int add(int a, int b, int c) {
        return a + b + c;
    }


    public static void main(String[] args) {

        // Create an object of the class
        Lab_2_methoOverloading calc = new Lab_2_methoOverloading();

        // Call and print the results of different add() methods
        System.out.println("adding two Integer  :" + calc.add(10, 20));          
        System.out.println("adding two double   :" + calc.add(5.5, 4.5));   
        System.out.println("adding One Integer and One Double :" + calc.add(10, 3.5));       
        System.out.println("adding One Double and One Integer :" + calc.add(2.5, 5));        
        System.out.println("adding Three Integer Value  :" + calc.add(1, 2, 3));     
    }
}

/*
 OutPut:
adding two Integer  :30
adding two double   :10.0
adding One Integer and One Double :13.5
adding One Double and One Integer :7.5
adding Three Integer Value  :6
 */