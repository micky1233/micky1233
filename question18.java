import java.util.Scanner;
public class question18 {

    public static void main(String[] args) {
             Scanner scanner = new Scanner(System.in);
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
