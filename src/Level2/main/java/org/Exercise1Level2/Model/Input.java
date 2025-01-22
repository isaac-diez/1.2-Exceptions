package org.Exercise1Level2.Model;

import org.Exercise1Level2.Exceptions.InputWrongException;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Input {

    private static Scanner input = new Scanner(System.in);

    public static byte readByte(String message) {

        byte age = 0;
        boolean correctInput = false;

        while (!correctInput) {
            try {
                System.out.println(message);
                age = input.nextByte();

                if (age > 0 && age < 120){
                    correctInput = true;
                }


            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Enter a valid byte.");
                input.next();
            }

        }
        return age;

    }

    public static int readInt(String message){

        int phoneNumber = 0;
        boolean correctInput = false;

        while (!correctInput) {

            try {
                System.out.println(message);
                phoneNumber = input.nextInt();
                if (String.valueOf(phoneNumber).length() == 9 && String.valueOf(phoneNumber).startsWith("6")) {
                    correctInput = true;
                } else {
                    System.out.println("Phone number must be 9 digits and start with 6");
                }


            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Enter a valid integer.");
                input.next();
            }

        }
        input.nextLine();
        return phoneNumber;
    }

    public static float readFloat(String message) {
        String inputFloat;
        float floatNumber = 0;
        boolean correctInput = false;

        while (!correctInput) {
            try {
                System.out.println(message);
                inputFloat = input.nextLine();

                String regex = "^[0-9]+$";

                if (inputFloat.matches(regex)) {
                    floatNumber = Float.parseFloat(inputFloat);
                    correctInput = true;
                } else {
                    System.out.println("Invalid input. Enter a valid float");
                }

            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter a valid float number.");
            }
        }
        return floatNumber;
    }

    public static double readDouble(String message) {
        double coffeePrice = 0;
        boolean correctInput = false;
        String regex = "^[0-9]+(\\.[0-9]+)?$"; // Acepta números con o sin decimales

        while (!correctInput) {
            try {
                System.out.println(message);
                String userInput = input.nextLine();

                if (userInput.contains(".") && userInput.matches(regex)) {
                    coffeePrice = Double.parseDouble(userInput);
                    correctInput = true;
                } else {
                    System.out.println("Invalid input. Enter a valid double.");
                }

            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Enter a valid double.");

            }

        }

        return coffeePrice;
    }

    public static char readChar(String message) throws InputWrongException {

        char idLetter = 0;
        boolean correctInput = false;
        String regex = "^[a-zA-Z]+$";

        while (!correctInput) {
            try {
                System.out.println(message);
                String charInput = input.nextLine();


                if (charInput.length() == 1 && charInput.matches(regex)) {
                    idLetter = charInput.charAt(0);
                    correctInput = true;

                } else {
                    throw new InputWrongException("Invalid input. Enter a valid Char.");

                }
            } catch (InputWrongException e) {
                System.out.println("Error: " + e.getMessage());
            }

        }

        return idLetter;
    }

    public static String readString(String message) throws InputWrongException {

        boolean correctInput = false;
        String name = null;
        String regex = "^[a-zA-Z]+$";


        while (!correctInput) {
            try {
                System.out.println(message);
                name = input.nextLine();

                if (!name.isEmpty() && name.matches(regex)) {
                    correctInput = true;

                } else {
                    throw new InputWrongException("The name can't have numbers or be empty. Try again.");

                }
            } catch (InputWrongException e) {
                System.out.println(e.getMessage());
            }

        }
        return name;
    }

    public static boolean readYesNo(String message) throws InputWrongException {

        Boolean yesNo = false;
        boolean correctInput = false;

        while (!correctInput) {
            try {
                System.out.println(message);
                String reply = input.nextLine().trim().toLowerCase();

                if (reply.equals("y")) {
                    yesNo = true;
                    correctInput = true;
                } else if (reply.equals("n")) {
                    yesNo = false;
                    correctInput = true;

                } else {
                    throw new InputWrongException("Invalid input. Try again.");
                }
            } catch (InputWrongException e) {
                System.out.println("Error: " + e.getMessage());

            }
        }
        return yesNo;
    }

}
