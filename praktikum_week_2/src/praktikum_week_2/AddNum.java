/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum_week_2;
import java.io.*;
/**
 *<h1>Add two Numbers!</h1>
 * The AddNum program implements and application that
 * simply adds two given integer numbers and Prints
 * the output on the screen
 * <p>
 * <b>Note:</b> Giving proper comments in your program makes it more
 * user friendly and it is assumed as a high quality code
 * 
 * @author alfien sukma prawira
 * @version 1.0
 * @since 2014-03-31
 */
public class AddNum {
    /**
     * this method is used to add two integer. this is
     * a the simplest form of a class method, just to 
     * show the usage of various javadoc Tags,
     * @param numA this is the first parameter to addNum method
     * @param numB this is the second parameter to addNum method
     * @return int this return sum of numA and numB.
     */
    public int addNum(int numA, int numB){
        return numA + numB;
    }
    
    /**
     * this is the main method which makes use of addNum method
     * @param args  unused
     * @exception IOException on input error.
     * @see IOException
     */
    
    public static void main(String[] args) {
        AddNum obj = new AddNum();
        int sum = obj.addNum(10,20);
        
        System.out.println("Sum of 10 and 20 is :"+sum);
    }
}
