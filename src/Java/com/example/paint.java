package Java.com.example;

import java.util.Scanner;

public class paint {
    public static void main (String[] args) {

        Scanner user_input = new Scanner(System.in);

        // Volume of Paint in a can
        System.out.print("Enter the amount of paint in a can in m^3: ");
        float paintCan = user_input.nextFloat();

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
        System.out.print("Enter thickness of paint in meters: ");
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
        System.out.println("The number of cans of paint needed is: ");
        System.out.println(paintNeededInt);
    }
}
