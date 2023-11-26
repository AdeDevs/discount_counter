import java.util.Scanner;

public class App {
    public static void main(String[] args){
        //Declaration of Variables
        double unitPrice;
        int noOfItems;
        double discountRate = 0; // This should be the default discount in case the no of items is less than 200
        double undiscountedPrice;
        double discount;
        double discountedPrice;
        Scanner scanner = new Scanner(System.in);

        //Asking for input of unit price and no. of litres
        System.out.print("Enter the Unit price: $");
        unitPrice = scanner.nextDouble();
        System.out.print("Enter the no. of Items: ");
        noOfItems = scanner.nextInt();

        undiscountedPrice = noOfItems*unitPrice;

        if(noOfItems>=200){
            discountRate = 0.05;
        }

        discount = discountRate * undiscountedPrice;

        discountedPrice = undiscountedPrice-discount;

        System.out.println("Unit Price: " + unitPrice);
        System.out.println("No of Items: " +noOfItems);
        System.out.println("Discount: $" +discount);
        System.out.println("Total Price: $"+discountedPrice);

    }

}
