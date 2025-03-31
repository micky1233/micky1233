import java.util.Scanner;

public class group3 {
    public static void main(String[] args) {
        //* Question 3 */
        System.out.println("Name: Benitta King\n" +
                           "Address: 6 Adenta Paul, Accra, 2341203\n" +
                           "Telephone Number: 0534920580\n" +
                           "College Major: Computer Science");

                             //* Question 8 */

           int cookiesPerBag = 40,totalServings = 10, caloriesPerServing = 300,caloriesPerCookie, cookiesEaten,totalCaloriesConsumed; 
     
         caloriesPerCookie = (caloriesPerServing * totalServings) / cookiesPerBag;

    
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of cookies you ate: ");
        cookiesEaten = scanner.nextInt();

        totalCaloriesConsumed = cookiesEaten * caloriesPerCookie;

      
        System.out.println("Total calories consumed: " + totalCaloriesConsumed); 

          //* Question 13 */
        
       final double taxRate = 0.0675, tipRate = 0.20;
        double taxAmount,tipAmount,totalAfterTax,totalBill,mealCost;
       
        System.out.print("Enter the meal cost: ");
           mealCost = scanner.nextDouble();

               taxAmount = mealCost * taxRate; 
               totalAfterTax = mealCost + taxAmount;
               tipAmount = totalAfterTax * tipRate;
               totalBill = totalAfterTax + tipAmount;

        System.out.println("Meal Cost: $" + Math.ceil(mealCost));
        System.out.println("Tax Amount: $" + Math.ceil(taxAmount));
        System.out.println("Tip Amount: $" +  Math.ceil(tipAmount));
        System.out.println("Total Bill: $" + Math.ceil(totalBill));
        
          //* Question 18 */
        scanner.nextLine();
        
        System.out.println("Enter your name: ");
        String name = scanner.nextLine();

        System.out.println("Enter your age: ");
        int age = scanner.nextInt();
        scanner.nextLine();  

        System.out.println("Enter the name of a city: ");
        String city = scanner.nextLine();

        System.out.println("Enter the name of a college: ");
        String college = scanner.nextLine();

        System.out.println("Enter a profession: ");
        String profession = scanner.nextLine();

        System.out.println("Enter a type of animal: ");
        String animal = scanner.nextLine();

        System.out.println("Enter your pet's name: ");
        String petName = scanner.nextLine();

      
        System.out.println("\nHere is your story:");
        System.out.println("There once was a person named " + name + " who lived in " + city + ". At the age of " + age +
                           ", " + name + " went to college at " + college + ". " + name +
                           " graduated and went to work as a " + profession + ". Then, " + name +
                           " adopted a " + animal + " named " + petName + ". They both lived happily ever after!");
    
    }

}
