package Java.com.example;

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class paint {

    // Created a method which calculates the total cost of paint and labour
    public static float newMethod(float paintCostTotal, float labourCostTotal) {
        System.out.println("The current total cost of the project is: £" + (paintCostTotal + labourCostTotal));
        return (paintCostTotal + labourCostTotal);
    }

    public static void main(String[] args) {
        Scanner user_input = new Scanner(System.in);

        // Welcome message
        System.out.println("\n\n\nHello! Welcome to the Paint Calculator\nPlease follow the instructions below and enter values when prompted\n");

        // Volume of Paint in a can
        System.out.println("Enter the amount of paint in a can in m^3: ");
        float paintCan = user_input.nextFloat();

        float canPrice = 0.0f;

        // Writing an if/else statement for cost of a single can of paint
        if (paintCan > 0.1) {
            canPrice += 1.55;
            System.out.println("This can of paint costs £" + canPrice);
        }
        else {
            canPrice += 2.55;
            System.out.println("This can of paint costs £" + canPrice);
        }

        // Inputting the room length
        System.out.println("Enter room length in meters: ");
        float roomLength = user_input.nextFloat();

        // Inputting the room width
        System.out.println("Enter room width in meters: ");
        float roomWidth = user_input.nextFloat();

        // Inputting the room height
        System.out.println("Enter room height in meters: ");
        float roomHeight = user_input.nextFloat();

        // Inputting the door length
        System.out.println("Enter door length: ");
        float doorLength = user_input.nextFloat();

        // Inputting the door height
        System.out.println("Enter door height: ");
        float doorHeight = user_input.nextFloat();

        // What is the thickness of the layer of paint
        System.out.println("Information about paint layer thickness can be found using the link below:\nhttps://askinglot.com/how-many-microns-are-in-a-paint-coat\n\nEnter thickness of paint layer in meters: ");
        float paintThickness = user_input.nextFloat();

        // Inputting the number of windows
        System.out.println("Enter number of windows: ");
        Integer windowNo = user_input.nextInt();

        float windowLength = 0f;
        float windowHeight = 0f;

        if (windowNo == 0) {
            ;
        }
        else {
            System.out.println("Enter the window length: ");
            windowLength += windowLength + user_input.nextFloat();

            System.out.println("Enter the window height: ");
            windowHeight += windowHeight + user_input.nextFloat();
        }

        // Amount of paint needed
        float paintNeeded = ((2 * roomLength * roomHeight + 2 * roomWidth * roomHeight - doorLength * doorHeight - windowNo * windowHeight * windowLength) * paintThickness) / paintCan;
        paintNeeded++;
        int paintNeededInt = (int) paintNeeded;

        // Determining the number of cans needed
        System.out.println("The number of cans of paint needed is: " + paintNeededInt);

        // Message shows how many paint cans you need
        switch (paintNeededInt) {
            case 1:
                System.out.println("You only need 1 can of paint!");
                break;
            case 2, 3, 4:
                System.out.println("You need a few cans of paint!");
                break;
            default:
                System.out.println("You need a lot of paint!");
        }

        // Total cost of the paint
        float totalCostPaint = canPrice * paintNeededInt;
        System.out.println("The total cost of the paint required is: £" + totalCostPaint);

        // There 10% discount for every paint can upto a maximum of 10 cans per customer. Any cans purchased after this limit will not recieve a discount
        if (paintNeededInt <= 10) {
            totalCostPaint *= 0.9;
            System.out.println("\nA discount has been applied to your total. The total cost of paint after the discount is £" + totalCostPaint);
        }
        else {
            System.out.println("\nSorry no discounts");
        }

        // Payment Methods
        if (totalCostPaint < 10) {
            System.out.println("\nCash Payments Only. £10 minimum card spend");
        }
        else if (totalCostPaint < 45) {
            System.out.println("\nCash, Card and Contactless Payments accepted");
        }
        else {
            System.out.print("\nCash and Card Payments only. £45 contactless limit");
        }
        // In 1 day, a single painter can apply 0.5m^3 of paint
        float paintInADay = 0.5f;
        float days = 0f;
        float totalApplied = 0f;
        float totalPaintNeeded = (2 * roomLength * roomHeight + 2 * roomWidth * roomHeight - doorHeight * doorHeight - windowNo * windowHeight * windowLength);

        // Given we know the volume of paint a painter can apply in a day, create a while loop to see how long it takes to paint the room
        while (totalApplied < totalPaintNeeded) {
            days += 1;
            totalApplied = days * paintInADay;
        }

        System.out.println("\n\nThe total number of days a single painter needs to paint the room is: " + days);

        // Determining labour costs. Assume a painter is payed £100 a day;
        float totalLabourCost = 100 * days;
        System.out.println("--------------------------------------------------------------------\nA painter costs £100 per day\n--------------------------------------------------------------------\nThe total cost of labour is: £" + totalLabourCost + "\n--------------------------------------------------------------------");
        float finalCost = newMethod(totalLabourCost, totalCostPaint);

        // Asking what colour paint they want

        System.out.println("\n\nPick a colour that you would like to paint your walls\nPlease enter the number paired with each colour shown below\nEnter '1' for red\nEnter '2' for blue\nEnter '3' for green");
        Integer wallColour = user_input.nextInt();
        System.out.println(wallColour);
        Integer[] paintColours = {1, 2, 3};

        for (Integer colour : paintColours) {
            if (wallColour == colour) {
                System.out.println("There is paint available\nYour room will be painted in " + days + " days");
                break;
            }
            else if (wallColour > 3) {
                System.out.println("Sorry we don't have that colour of paint\nPlease restart the program and pick a valid paint colour");
                break;
            }
            else {
                ;
            }
        }

        List<Brands> brands1 = new ArrayList<Brands>();
        brands1.add(new Brands());

        for (Brands b: brands1){
            System.out.println("\n\n");
            System.out.println(b.getClass());
            b.name();
        }


        // Asking the user if they have a bathtub
        System.out.println("Do you have a bathtub? Answer either '1' for yes or '2' for no");
        Integer bathtubConfirmation = user_input.nextInt();

        // Bathtub variables

        Bathtub myBathtub = new Bathtub();

        if (bathtubConfirmation == 1) {
            System.out.println("Enter the height of the bathtub in meters:");
            myBathtub.setBathtubHeight(user_input.nextFloat());
            System.out.println("Enter the length of the bathtub in meters:");
            myBathtub.setBathtubLength(user_input.nextFloat());
            System.out.println("Enter the width of the bathtub in meters:");
            myBathtub.setBathtubWidth(user_input.nextFloat());
            myBathtub.bathtubWallArea();
        }
        else{
            ;
        }

    }
}