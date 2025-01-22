package org.Exercise1Level2.Main;

import org.Exercise1Level2.Exceptions.InputWrongException;
import org.Exercise1Level2.Model.Input;

public class Main {


    public static void main(String[] args) {

        System.out.println("Age input: " + Input.readByte("Enter your age"));
        System.out.println("Phone number input: " + Input.readInt("Enter your phone number"));
        System.out.println("Float number input: " + Input.readFloat("Enter a float number"));
        System.out.println("Double number input: " + Input.readDouble("Enter a double number"));

        try {
            System.out.println("Your name input: " + Input.readString("Enter your name"));
            System.out.println("Letter of your ID input: " + Input.readChar("Enter the letter of your DNI"));
            System.out.println("Y/N input: " + Input.readYesNo("Do you want to continue (Y/N)"));

        } catch (InputWrongException e) {
            System.out.println("Error: " + e.getMessage());
        }

    }



}