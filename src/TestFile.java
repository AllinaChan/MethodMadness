public class TestFile{
    //Allen Chen Period 9
    public static void main(String[] args){
        System.out.println("Hello Method Madness");
        System.out.println(AChenLib.quadSolver(1,7,6)); //solves a quadratic equation
        System.out.println(AChenLib.leastCommonMultiple(12,20,30)); //find the least common multiple of 3 numbers
        AChenLib.primePrinter(20); //prints the first "num" prime numbers
        System.out.println(AChenLib.isPalindrome("racecar")); //checks if the inputted word is a palindrome
         System.out.println(AChenLib.vigCipher("Method Madness", "MrLevin")); //encodes a message using vigenere cipher
    }
}