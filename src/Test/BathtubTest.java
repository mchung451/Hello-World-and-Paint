package Test;

import Java.com.example.Bathtub;
import org.junit.Test;

import static Java.com.example.Bathtub.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class BathtubTest {

    Bathtub testing = new Bathtub();

    @Test
    public void testBathtubHeight(){
        assertEquals(bathtubHeight = 2, bathtubHeight = 2, "The height of the bathtub is incorrect");
    }

    @Test
    public void testBathtubLength(){
        assertEquals(bathtubLength = 5, bathtubLength = 10, "The length of the bathtub is incorrect");
    }

    @Test
    public void testBathtubWidth(){
        assertEquals(bathtubWidth = 3, bathtubWidth = 9, "The width of the bathtub is incorrect");
    }

}
