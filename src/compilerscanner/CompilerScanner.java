/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package compilerscanner;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author mostafayehya
 */
public class CompilerScanner {

    /**
     * @param args the command line arguments
     */
    public static String[] javaKeywords = {
        "abstract", "continue", "for", "new", "switch",
        "assert", "default", "goto", "package", "synchronized",
        "boolean", "do", "if", "private", "this",
        "break", "double", "implements", "protected", "throw",
        "byte", "else", "import", "public", "throws",
        "case", "enum", "instanceof", "return", "transient",
        "catch", "extends", "int", "short", "try",
        "char", "final", "interface", "static", "void",
        "class", "finally", "long", "strictfp", "volatile",
        "const", "float", "native", "super", "while"
    };

    public static char[] javaSingleCharOperators = {
        '>', '<', '=',
        '+', '-', '&', '|', '*', '!', '/', '%'
    };

    public static String[] javaMultiCharOperators = {
        "+=", " -=", " *=",
        "/=", "%=", "&=", "^=", "|=", "<<", "=>", ">=", ">>", ">="
    };

    public static char[] javaSpecialCharacter = {'\'', ';', ':', ',', '.', '?', '@', '#', '$', '_', '[', ']',
        '{', '}', '(', ')'};

    public static String content;
    public static Scanner inputAsScanner;
    public static String bigToken;
    public static char[] slicedToken;

    public static void main(String[] args) {

        try {

            inputAsScanner = new Scanner(new File("sampleInput"));

        } catch (FileNotFoundException e) {
            System.out.println("Error Reading File");
            e.printStackTrace();
        }

        Analyze(inputAsScanner);

    }

    public static void Analyze(Scanner input) {

        while (input.hasNext()) {

            bigToken = input.next();
            slicedToken = bigToken.toCharArray();

            //check if the current string is a keyword 
            if (isInArrayString(javaKeywords, bigToken)) {
                System.out.println(bigToken + " -----> Keyword");

                //it is not a javakeyword   
            } else {

                for (int j = 0; j < slicedToken.length; j++) {

                    //it is a single char operator 
                    if (isInArrayChar(javaSingleCharOperators, slicedToken[j])) {
                        System.out.println(slicedToken[j] + " -----> Operator");
                    }

                    //it is s special character
                    if (isInArrayChar(javaSpecialCharacter, slicedToken[j])) {
                        System.out.println(slicedToken[j] + " -----> Special character");
                    }

                    //TODO : check for the the multichar operators 
                }
            }

        }
    }

    public static boolean isInArrayString(String[] array, String s) {

        for (int i = 0; i < array.length; i++) {
            if (array[i].equals(s)) {
                return true;
            }
        }
        return false;
    }

    public static boolean isInArrayChar(char[] array, char s) {

        for (int i = 0; i < array.length; i++) {
            if (array[i] == s) {
                return true;
            }
        }
        return false;
    }

}
