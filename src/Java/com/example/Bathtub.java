package Java.com.example;

public class Bathtub{

    ////////////////Attributes/////////////////
    public static float bathtubLength;
    public static float bathtubWidth;
    public static float bathtubHeight;
    public static float bathtubWallArea;
    public float setBathtubHeight;
    public float setBathtubLength;
    public float setBathtubWidth;


    //////////////Constructors/////////////////


    /////////////Methods///////////////////////
    public static void setBathtubLength(float newBathtubLength){
        bathtubLength = newBathtubLength;

    }

    public static void setBathtubWidth(float newBathtubWidth){
        bathtubWidth = newBathtubWidth;
    }

    public static void setBathtubHeight(float newBathtubHeight){
        bathtubHeight = newBathtubHeight;
    }

    public static void bathtubWallArea(){
        bathtubWallArea = (bathtubHeight*bathtubLength+bathtubHeight*bathtubWidth);
        System.out.println("The wall area covered by the bathtub is: " + bathtubWallArea);
    }
}
