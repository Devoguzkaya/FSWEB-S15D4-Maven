package org.example;

import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }

    public static boolean checkForPalindrome(String text) {
        StringBuilder cleanTextBuilder = new StringBuilder();

        for (char c : text.toCharArray()) {
            if (Character.isLetterOrDigit(c)) {
                cleanTextBuilder.append(Character.toLowerCase(c));
            }
        }
        String originalCleanText = cleanTextBuilder.toString();

        String reversedText = new StringBuilder(originalCleanText).reverse().toString();

        return originalCleanText.equals(reversedText);
    }

    public static String convertDecimalToBinary(int number) {
        if (number == 0) {
            return "0";
        }

        Stack<Integer> stack = new Stack<>();

        while (number > 0) {
            int remainder = number % 2;
            stack.push(remainder);
            number = number / 2;
        }

        StringBuilder binaryString = new StringBuilder();
        while (!stack.isEmpty()) {
            binaryString.append(stack.pop());
        }

        return binaryString.toString();
    }
}