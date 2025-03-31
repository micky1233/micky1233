import java.util.Scanner;

public class question13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
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
    }
}
