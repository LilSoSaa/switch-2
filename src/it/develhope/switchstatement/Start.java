package it.develhope.switchstatement;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Start {
    public static void main(String[] args) {


        List <String> list = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true){
            System.out.println("Enter a string: ");
            String value = scanner.nextLine();


            switch (value) {

                case "size":
                    System.out.println("The size of the list is: " + list.size());
                    break;


                case "clear":
                    list.clear();
                    System.out.println("The list has been cleared!");
                    break;


                case "print":
                    System.out.println("This is the print of the list: " + list.toString());
                    break;

                default:
                    list.add(value);
            }

        }

    }
}







