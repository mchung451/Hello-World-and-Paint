package Java.com.example;

import java.util.Scanner;

public class paint {
    public static void main (String[] args) {

        Scanner user_input = new Scanner(System.in);

        // Welcome message
        System.out.println("Hello! Welcome to the Paint Calculator\nPlease follow the instructions below and enter values when prompted\n");

        // Volume of Paint in a can
        System.out.print("Enter the amount of paint in a can in m^3: ");
        float paintCan = user_input.nextFloat();

        float canPrice = 0.0f;

        // Writing an if/else statement for cost of a single can of paint
        if (paintCan > 0.1){
            canPrice += 1.50;
            System.out.println("This can of paint costs £"+canPrice);
        }
        else {
            canPrice += 2.50;
            System.out.println("This can of paint costs £" + canPrice);
        }

        // Inputting the room length
        System.out.print("Enter room length in meters: ");
        float roomLength = user_input.nextFloat();

        // Inputting the room width
        System.out.print("Enter room width in meters: ");
        float roomWidth = user_input.nextFloat();

        // Inputting the room height
        System.out.print("Enter room height in meters: ");
        float roomHeight = user_input.nextFloat();

        // Inputting the door length
        System.out.print("Enter door length: ");
        float doorLength = user_input.nextFloat();

        // Inputting the door height
        System.out.print("Enter door height: ");
        float doorHeight = user_input.nextFloat();

        // What is the thickness of the layer of paint
        System.out.print("Enter thickness of paint layer in meters: ");
        float paintThickness = user_input.nextFloat();

        // Inputting the number of windows
        System.out.print ("Enter number of windows: ");
        Integer windowNo = user_input.nextInt();

        // Inputting the window length
        System.out.print ("Enter the window length: ");
        float windowLength = user_input.nextFloat();

        // Inputting the window height
        System.out.print ("Enter the window height: ");
        float windowHeight = user_input.nextFloat();

        // Amount of paint needed
        float paintNeeded =((2*roomLength*roomHeight+2*roomWidth*roomHeight-doorLength*doorHeight-windowNo*windowHeight*windowLength)*paintThickness)/paintCan;
        paintNeeded++;
        int paintNeededInt = (int) paintNeeded;

        // Determining the number of cans needed
        System.out.println("The number of cans of paint needed is: " + paintNeededInt);

        // Message shows how many paint cans you need
        switch (paintNeededInt){
            case 1:
                System.out.println("   You only need 1 can of paint!");
                break;
            case 2,3,4:
                System.out.println("   You need a few cans of paint!");
                break;
            default:
                System.out.println("   You need a lot of paint!");
        }

        // Total cost
        float totalCost = canPrice*paintNeededInt;
        System.out.print(" The total cost of the paint required is £" + totalCost);
        System.out.println(windowNo);

        // There 10% discount for every paint can for a maximum of 10 per customer
        if (paintNeededInt <= 10){
            totalCost *= 0.9;
            System.out.print("A discount has been applied to your total. The total cost after the offer is £" + totalCost);
        }
        else{
            System.out.print("Sorry no discounts");
        }

        // In 1 day, a single painter can apply 0.5m^3 of paint
        float paintInADay = 0.5f;
        float days = 0f;
        float totalApplied = 0f;
        float totalPaintNeeded = (2*roomLength*roomHeight+2*roomWidth*roomHeight-doorHeight*doorHeight-windowNo*windowHeight*windowLength);

        while (totalApplied < totalPaintNeeded) {
            days += 1;
            totalApplied = days*paintInADay;
        }

        System.out.println("\nThe total number of days a single painter needs to paint the room is: " + days);

    }
}
