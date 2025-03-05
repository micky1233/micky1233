

//NOTES//

//A class serves as a template that outlines an object's structure and behavior. 
//It defines the attributes (data members) and methods (functions) that describe what an object can store and do.
 //An object is a concrete instance of a class, holding real data and executing actions as specified by the class.

//Classes and objects are fundamental in Object-Oriented Programming (OOP) 
//as they enable encapsulation, modularity, reusability, and abstraction.
 //Objects simplify program design by representing real-world concepts effectively.

//A constructor is a unique method that initializes objects upon creation.
 //Attributes store object-specific data, while methods determine its functionalities.

 class CoffeeMachine {
    String type;
    int sugar;
    boolean milk;

    // Constructor
    CoffeeMachine(String t, int s, boolean m) {
        type = t;
        sugar = s;
        milk = m;
    }

    // Method to display coffee details
    void showDetails() {
        System.out.println("Coffee: " + type + ", Sugar: " + sugar + " spoon(s), Milk: " + (milk ? "Yes" : "No"));
    }

    // Method to make coffee
    void brew() {
        System.out.println("Making " + type + " with " + sugar + " spoon(s) of sugar...");
        if (milk) System.out.println("Adding milk...");
        System.out.println("Coffee is ready! Enjoy!");
    }
}






