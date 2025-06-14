/*
 * Java Coding examples
 */
package javacodingexamples;


public class App {
    public static void main(String[] args) {
        App app = new App();
        System.out.println(app.getGreeting());
        app.runBasicExample();
        System.out.println("Basic example completed.");
        app.javaMethodExamples();
        System.out.println("Java method examples completed.");
        app.dataStructuresExamples();
        System.out.println("Data structures examples completed.");
        app.examplesForOOPConcepts();
    }
  
    public String getGreeting() {
        return "Hello World!";
    }

    public void simpleVariableDeclaration() {
        /*
         * Multiple line comments 
         * Below is an example of declaring a variable. 
         * Each variable has a type,  a name and a value 
         * Integer examples below, Integer is a type, startingPoint is a name and 0 is a value
         */

        Integer startingPoint = 0;
        Integer b = 1;
        Integer c = startingPoint + b; // This is an equation
        System.out.println("C is " + c);
    }

    public void loopExample() {
        /*
         * A loop is a control structure that allows you to execute a block of code multiple times
         * There are three types of loops in Java: for, while and do-while
         * A for loop is used when you know the number of iterations in advance
         * A while loop is used when you don't know the number of iterations in advance
         * A do-while loop is similar to a while loop, but it guarantees that the block of code will be executed at least once
         */
        for (int i = 0; i < 5; i++) {
            System.out.println("i is " + i);
        }
         
        for (int i = 0; i <= 15; i++) {
            if (i % 2 == 0) {
                System.out.println("Even : " + i);
            } else {
                System.out.println("Odd : " + i);
            }
        }
    }

    public void arrayAndLoopExample() {
        /*
         * An array is a collection of elements of the same type
         * An array can be of any type, including primitive types and reference types
         * An array is a fixed-size data structure, meaning that once it is created, its size cannot be changed
         * An array can be declared using the type followed by square brackets, e.g. int[] myArray = new int[10];
         * An array can also be initialized with values, e.g. int[] myArray = {1, 2, 3, 4, 5};
         * An array can be accessed using an index, e.g. myArray[0] will return the first element of the array
         * An array can also be iterated using a for loop or a for-each loop
         * A for-each loop is a special type of loop that is used to iterate over arrays and collections
         */
        String oneCar = "tesla";
        // Integer oneCar = 1;
        String[] cars = { "Volvo", "BMW", "Ford", "Mazda" };
        Integer[] listOfValues = { 1, 2, 3, 4 };
        Integer[] list_of_values = { 5, 6, 7, 8, 9, 10 };

        for (String i : cars) {
            System.out.println(i);
        }

        for (Integer i : listOfValues) {
            System.out.println(i);
        }

    }

    public void nestedLoopExample() {
        /*
         * A nested loop is a loop inside another loop
         * A nested loop can be used to iterate over a two-dimensional array or a collection of collections
         * A nested loop can also be used to perform a complex operation that requires multiple iterations
         */
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.println("i is " + i + " and j is " + j);
            }
        }
    }

    public void whileAndDoWhileExample() {
        /*
         * A while loop is a control structure that allows you to execute a block of code multiple times
         * A while loop is used when you don't know the number of iterations in advance
         * A do-while loop is similar to a while loop, but it guarantees that the block of code will be executed at least once
         */
        int i = 0;
        while (i < 5) {
            System.out.println("i is " + i);
            i++;
        }

        i = 0;
        do {
            System.out.println("i is " + i);
            i++;
        } while (i < 5);
    }
    public void ifAndElseExample() {
        /*
         * An if statement is a control structure that allows you to execute a block of code based on a condition
         * An if statement can be followed by an else statement, which will be executed if the condition is false
         * An if statement can also be followed by an else if statement, which allows you to check multiple conditions
         */
        int x = 10;
        int y = 20;

        if (x < y) {
            System.out.println("x is less than y");
        } else if (x > y) {
            System.out.println("x is greater than y");
        } else {
            System.out.println("x is equal to y");
        }
    }

    public void loopBreakAndContinueExample() {
        /*
         * The break statement is used to exit a loop prematurely
         * The continue statement is used to skip the current iteration of a loop and move to the next iteration
         */
        for (int i = 0; i < 10; i++) {
            if (i == 5) {
                System.out.println("Breaking at i = " + i);
                break; // Exit the loop when i is 5
            }
            System.out.println("i is " + i);
        }

        for (int i = 0; i < 10; i++) {
            if (i % 2 == 0) {
                System.out.println("Skipping even number: " + i);
                continue; // Skip the rest of the loop for even numbers
            }
            System.out.println("Odd number: " + i);
        }
    }

    public void runBasicExample() {
        System.out.println("Running basic example...");

        /*
         * An equation is a mathematical expression that can be evaluated
         * An equation can be a simple addition, subtraction, multiplication or division
         * An equation can also be a complex expression that involves multiple operations
         * An equation can also be a comparison, such as checking if two values are equal
         * An equation can also be a logical expression, such as checking if a value is greater than another value
         * equation has operands and operators
         * An operand is a value that is used in an equation
         * An operator is a symbol that represents an operation to be performed on the operands
         * For example, in the equation 2 + 3, 2 and 3 are operands and + is the operator
         *
         * ++ in the example below is a unary operator which means it only needs one operand
         */
        simpleVariableDeclaration();    

    
        /*
         * A loop is a control structure that allows you to execute a block of code multiple times
         * There are three types of loops in Java: for, while and do-while
         * A for loop is used when you know the number of iterations in advance
         * A while loop is used when you don't know the number of iterations in advance
         * A do-while loop is similar to a while loop, but it guarantees that the block of code will be executed at least once
         */
        loopExample();

        /*
         * Types: two kind of types in Java: 
         * Native: int, long, float, double, char, boolean
         * Reference: String, Integer, Double, Boolean, and Custom classes
         *          
         */
        arrayAndLoopExample();
        whileAndDoWhileExample();
        loopBreakAndContinueExample();
        nestedLoopExample();

        ifAndElseExample();
    }

    public void javaMethodExamples() {
        methodWithParameters("Hello", 42);
        int i = methodWithReturnValue(5, 10);    
        System.out.println("Result from methodWithReturnValue: " + i);
        overloadedMethod("Hello");
        overloadedMethod(42);

    }

    public void methodWithParameters(String message, int number) {
        /*
         * A method is a block of code that can be executed when called
         * A method can take parameters, which are values that are passed to the method when it is called
         * A method can also return a value, which is the result of the method's execution
         */
        System.out.println("Message: " + message + ", Number: " + number);
    }
    public int methodWithReturnValue(int a, int b) {
        /*
         * A method can return a value using the return statement
         * The return type of the method must match the type of the value being returned
         */
        return a + b;
    }
    public void overloadedMethod(String str) {
        /*
         * Method overloading is a feature that allows you to define multiple methods with the same name but different parameter types or counts
         * The Java compiler determines which method to call based on the arguments passed
         */
        System.out.println("Overloaded method with String: " + str);
    }
    public void overloadedMethod(int num) {
        /*
         * This is an overloaded method with a different parameter type
         */
        System.out.println("Overloaded method with int: " + num);
    }

    public void dataStructuresExamples() {
        /*
         * Java provides several built-in data structures, such as arrays, lists, sets, and maps
         * These data structures can be used to store and manipulate collections of data
         * Each data structure has its own characteristics and use cases
         */
        // Example of using an ArrayList
        java.util.ArrayList<String> list = new java.util.ArrayList<>();
        list.add("Apple");
        list.add("Banana");
        list.add("Cherry");
        System.out.println("ArrayList: " + list);
        // Example of using a HashMap
        java.util.HashMap<String, Integer> map = new java.util.HashMap<>();
        map.put("One", 1);
        map.put("Two", 2);
        map.put("Three", 3);
        System.out.println("HashMap: " + map);
        // Example of using a HashSet
        java.util.HashSet<String> set = new java.util.HashSet<>();
        set.add("Red");
        set.add("Green");
        set.add("Blue");
        System.out.println("HashSet: " + set);

    }

    public void examplesForOOPConcepts() {
        /*
         * Object-Oriented Programming (OOP) is a programming paradigm that uses objects to represent data and behavior
         * OOP concepts include classes, objects, inheritance, polymorphism, encapsulation, and abstraction
         */
        // Example of a class and object
        Car myCar = new Car("Tesla", "Model S", 2020);
        myCar.displayInfo();
        // Example of inheritance
        ElectricCar myElectricCar = new ElectricCar("Tesla", "Model 3", 2021, 75);
        myElectricCar.displayInfo();
    }
    
}

class Car {
    private String make;
    private String model;
    private int year;

    // Constructor to initialize the Car object
    public Car(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }

    public void displayInfo() {
        System.out.println("Car Make: " + make + ", Model: " + model + ", Year: " + year);
    }
}

// Example of a class that extends another class (inheritance)
class ElectricCar extends Car {
    private int batteryCapacity; // in kWh

    // Constructor to initialize the ElectricCar object
    public ElectricCar(String make, String model, int year, int batteryCapacity) {
        super(make, model, year); // Call the constructor of the parent class
        this.batteryCapacity = batteryCapacity;
    }

    @Override
    public void displayInfo() {
        super.displayInfo(); // Call the parent class method
        System.out.println("Battery Capacity: " + batteryCapacity + " kWh");
    }
}
