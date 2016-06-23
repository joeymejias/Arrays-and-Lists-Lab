package ga.lab;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args){

        String charString;
        double summedDoubles;
        int middleValue;

        //Problem 1:
        stringLengthOrValue("I said");
        stringLengthOrValue("hey");
        stringLengthOrValue("whats up?");
        stringLengthOrValue("hello!");

        //Problem 2:
        reversedOrder();

        //Problem 3:
        maxValue(new int[]{2, 52, 7, 91, 10, 12});
        maxValue(new int[]{12, 1, 11});
        maxValue(new int[]{0, 14});
        maxValue(new int[]{100, 23, 29, 101, 1});

        //Problem 4:

        summedDoubles = sumOfValues(new double[]{12.1, 13.9, 7.0});
        System.out.println(summedDoubles);
        //how do we print a variable to the command line

        summedDoubles = sumOfValues(new double[]{1.23, 2.09, 9.2});
        System.out.println(summedDoubles);
        //how do we print a variable to the command line

        summedDoubles = sumOfValues(new double[]{1.01, 15.1, 22.27, 19.99});
        System.out.println(summedDoubles);
        //how do we print a variable to the command line

        summedDoubles = sumOfValues(new double[]{3.08, 4.1, 7.2, 3.0});
        System.out.println(summedDoubles);
        //how do we print a variable to the command line


        //Problem 5:
        charString = charsToString(new char[]{'h', 'e', 'l', 'l', 'o'});
        System.out.println(charString);
        //how do we print a variable to the command line

        charString = charsToString(new char[]{'t', 'h', 'e', 'r', 'e', '!'});
        System.out.println(charString);
        //how do we print a variable to the command line

        charString = charsToString(new char[]{'I', ' ', 'a','m', ' '});
        System.out.println(charString);
        //how do we print a variable to the command line

        charString = charsToString(new char[]{'A', ' ', 'S', 't', 'r', 'i', 'n', 'g', '.'});
        System.out.println(charString);
        //how do we print a variable to the command line

        //Problem 6:
        //Put your code for problem 6 here
        /**
         * Create a List of type String with the variable name myStringList.
         * At least 5 String values to the list. (You can put any 5 String values you want).
         */
        List<String> myStringList = new ArrayList<>();
        myStringList.add(0, "bacon");
        myStringList.add(1, "egg");
        myStringList.add(2, "cheese");
        myStringList.add(3, "avocado");
        myStringList.add(4, "everything bagel");

        //Problem 7:
        reversedStringOrder(myStringList);

        //Problem 8:
        printOrAdd(myStringList);

        //Problem 9:
        //Create an int array of an odd size, with the variable name 'oddSizedArray'
        //Make sure the size is at least 5.
        /**
         * Create an int array of an odd size with
         * the variable name oddSizedArray. Make sure the size is at least 5.
         */
        int[] oddSizedArray = new int[5];

        //Problem 10:
        middleValue = findMiddle(oddSizedArray);
        System.out.println(middleValue);
        //how do we print a variable to the command line

        middleValue = findMiddle(new int[]{2,7,9,12,15});
        System.out.println(middleValue);
        //how do we print a variable to the command line

        middleValue = findMiddle(new int[]{13, 91, 27, 99, 14, 36, 10});
        System.out.println(middleValue);
        //how do we print a variable to the command line

        middleValue = findMiddle(new int[]{100, 1, 45, 1092, 76, 12, 34, 11, 145});
        System.out.println(middleValue);
        //how do we print a variable to the command line

    }

    /**
     * Write a function stringLengthOrValue that accepts one String parameter.
     * This function should print the value of the String parameter
     * to the command line if the length of the String is greater than 5.
     * If the length of the String is less than 5, print the length of the String parameter.
     *
     */
    public static void stringLengthOrValue(String string1){
        if (string1.length() > 5){
            System.out.println(string1);
        } else {
            System.out.println(string1.length());
        }
    }

    /**
     *Write a function reversedOrder that accepts no parameters.
     * This function should create an int array of size 10 and
     * assign values 0-9 to each index in the array by using a for loop.
     * It should then print out the values in reverse order
     * using a separate for loop inside the function.
     */
    public static void reversedOrder(){
        int[] theseNums = new int[10];
        int i;
        for (i = 0; i <= theseNums.length - 1; i++){
            theseNums[i] = i;
            System.out.println(i + "");
        }
        int j;
        for (j = 9; j >= 0; j--){
            theseNums[j] = j;
            System.out.println(j + "");
        }
    }

    /**
     * Write a function maxValue that accepts one int array parameter.
     * This function should loop through the array to return the max value in that array.
     * If the array is of size 1, the max value is the only item in the array.
     * If the array is of size 10, how do we keep a record of the current max value when looping through the array?
     */
    public static void maxValue(int[] int1){
        int i;
        int highestInt = 0;
        for (i = 0; i <= int1.length - 1; i++){
            if (int1[i] >= highestInt){
                highestInt = int1[i];
            }
        }
        System.out.println(highestInt);
    }

    /**
     * Write a function sumOfValues that accepts a double array parameter.
     * This function should loop through the array and ADD all the values in the array.
     * It should then return the sum of the values.
     * The sum must then be assigned to the variable summedDoubles and
     * the value of the variable should then be printed to the command line.
     */
    public static int sumOfValues(double[] double1){
        int i;
        int summedDoubles = 0;
        for (i = 0; i <= double1.length - 1; i++){
            summedDoubles += double1[i];
        }
        System.out.println(summedDoubles);
        return summedDoubles;
    }

    /**
     * Write a function charsToString that takes in a char array parameter.
     * This function should loop through the array and concatenate each char value into a String.
     * It should then return the String that was created.
     * The String must then be assigned to the variable charString and
     * the value of the variable should then be printed to the command line.
     */
    public static String charsToString(char[] char1){
        int i;
        String charToString = "";
        for (i = 0; i <= char1.length - 1; i++){
            charToString += char1[i];
        }
        return charToString;
    }

    /**
     * Write a function reversedStringOrder that accepts a List parameter of type String.
     * The function should loop through the List and
     * print each String in reverse order to the command line (last String first).
     * Use the List you created in problem 6 as the parameter you give to the function.
     */
    public static void reversedStringOrder(List<String> list1){
        int currentIndex;
        for (currentIndex = list1.size() - 1; currentIndex >= 0; currentIndex--){
            System.out.println(list1.get(currentIndex));
        }
    }

    /**
     * Write in a function printOrAdd that accepts a List parameter of type String.
     * The function should print all values in the list if the size of the List is equal to 10.
     * If the size of the list is less than 10,
     * add a String value to the list that consists of the word "Java" concatenated with
     * the current size of the list. Use the List you created in problem 6.
     */
    public static void printOrAdd(List<String> list1){
        if (list1.size() == 10){
            int i;
            for (i = 0; i <= list1.size() - 1; i++ ){
                System.out.println(list1.get(i));
            }
        } else if (list1.size() < 10){
            list1.add("Java " + list1.size());
            System.out.println(list1.get(list1.size() - 1));
        }
    }

    /**
     * Write a function findMiddle that accepts a int array parameter.
     * The function should access the value of the item at the middle
     * of the array. The function should then return that value and
     * assign it to the int variable middleValue. Print the value of middleValue to the command line.
     * Use the array you created in problem 9 for one of the examples.
     */
    public static int findMiddle(int[] array1){
        System.out.println((Integer) (Math.round((array1.length/2) + 1)));
        return Math.round((array1.length/2) + 1);
    }
}
