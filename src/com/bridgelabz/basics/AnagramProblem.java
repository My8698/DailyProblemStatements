package com.bridgelabz.basics;
import java.util.Arrays;
import java.util.Scanner;
public class AnagramProblem {
    public static boolean isAnagram(String str1,String str2){
        if (str1.length()!=str2.length())
        return false;
        else {
            char[] str1Array=str1.toCharArray();
            char[] str2Array=str2.toCharArray();
            Arrays.sort(str1Array);
            Arrays.sort(str2Array);

            return Arrays.equals(str1Array,str2Array);
        }
    }
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        System.out.println("Enter First String:");
        String str1=scn.nextLine();
        System.out.println("Enter Second String:");
        String str2=scn.nextLine();
        str1=str1.replaceAll("\\s"," ").toLowerCase();
        str2=str2.replaceAll("\\s"," ").toLowerCase();

        if (isAnagram(str1,str2))
            System.out.println("Strings: "+str1+" and "+str2+ " are Anagram");
        else
            System.out.println("Strings: " + str1 +" and "+str2+ " are not Anagram");
    }
}
