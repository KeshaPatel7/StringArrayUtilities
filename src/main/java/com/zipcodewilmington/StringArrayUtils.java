package com.zipcodewilmington;

import java.util.Arrays;
import java.util.Collections;
import java.util.*;
import java.util.Objects;

/**
 * Created by leon on 1/29/18.
 */
public class StringArrayUtils {
    /**
     * @param array array of String objects
     * @return first element of specified array
     */ // TODO
    public static String getFirstElement(String[] array) {

        return array[0];
    }

    /**
     * @param array array of String objects
     * @return second element in specified array
     */
    public static String getSecondElement(String[] array) {

        return array[1];
    }

    /**
     * @param array array of String objects
     * @return last element in specified array
     */ // TODO
    public static String getLastElement(String[] array) {


        return array [array.length - 1];
    }

    /**
     * @param array array of String objects
     * @return second to last element in specified array
     */ // TODO
    public static String getSecondToLastElement(String[] array) {

        return array[array.length-2];
    }

    /**
     * @param array array of String objects
     * @param value value to check array for
     * @return true if the array contains the specified `value`
     */ // TODO
    public static boolean contains(String[] array, String value) {
            for (String s : array) {   //s is an identifier for each element in array. This is for each loop statement.
                if (s.equals(value)) {
                    return true;
                }
            }
            return false;
        }


    /**
     * @param array of String objects
     * @return an array with identical contents in reverse order
     */ // TODO
    public static String[] reverse(String[] array) {
        Collections.reverse(Arrays.asList(array));

        return array;
    }

    /**
     * @param array array of String objects
     * @return true if the order of the array is the same backwards and forwards
     */ // TODO
    public static boolean isPalindromic(String[] array) {
        String[] s1 = Arrays.copyOf(array , array.length);
        Collections.reverse(Arrays.asList(s1));
        return Arrays.equals(s1,array); //.equals is used for comparing two parameters. .equals is only for array.
    }

    /**
     * @param array array of String objects
     * @return true if each letter in the alphabet has been used in the array
     */ // TODO
    public static boolean isPangramic(String[] array) {
        String s2 = Arrays.toString(array).toLowerCase();
        for (char i = 'a'; i <= 'z'; i++) {
            if (s2.indexOf(i) == -1) { //-1 means it's not there.
                return false;
            }
        } return true;
    }

    /**
     * @param array array of String objects
     * @param value value to check array for
     * @return number of occurrences the specified `value` has occurred
     */ // TODO
    public static int getNumberOfOccurrences(String[] array, String value) {
        int count = 0;
        for (String s3 : array) {
            if(s3.equals(value)){
              count += 1; // or count++
            }
        }
        return count;
    }

    /**
     * @param array         array of String objects
     * @param valueToRemove value to remove from array
     * @return array with identical contents excluding values of `value`
     */ // TODO
    public static String[] removeValue(String[] array, String valueToRemove) {
        ArrayList<String> arrList = new ArrayList<>();
        for(String s4 : array) {
            arrList.add(s4);
        }
        arrList.remove(valueToRemove);
        return arrList.toArray(new String[0]);
    }
//        for (int i = 0; i <array.length ; i++) {
//            if(array[i].equals(valueToRemove)){
//               array = ArrayUtils.removeElement(array,array[i]);
//
//            }
//
//       }
//
//        return null;
//    }



    /**
     * @param array array of chars
     * @return array of Strings with consecutive duplicates removes
     */ // TODO
    public static String[] removeConsecutiveDuplicates(String[] array) {
        ArrayList<String> s5 = new ArrayList<>();
        s5.add(array[0]);
        for (int i = 1; i < array.length; i++) {
            if (!Objects.equals(array[i], array[i - 1])) {
                s5.add(array[i]);
            }
        }
        return s5.toArray(new String[0]);
    }

    /**
     * @param array array of chars
     * @return array of Strings with each consecutive duplicate occurrence concatenated as a single string in an array of Strings
     */ // TODO
    public static String[] packConsecutiveDuplicates(String[] array) {
        ArrayList<String> arrList = new ArrayList<>();
        String temporary = array[0];                        // s6 is going to be temp
        for (int i = 1; i < array.length; i++) {
            if (array[i].equals(array[i-1]) ) {
                temporary += array[i];
            } else {
                arrList.add(temporary);
                temporary = array[i];
            }
        } arrList.add(temporary);
        return arrList.toArray(new String[0]);
    }


}
