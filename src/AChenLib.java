public class AChenLib {
    //Allen Chen Period 9
    /**
     *
     * @param a- The a value of a standard quadratic equation
     * @param b- The b value of a standard quadratic equation
     * @param c- The c value of a standard quadratic equation
     */
    public static void quadSolver(double a, double b, double c)
    {
        //This is the quadSolver 4000 ;)
        double root1=0, root2=0, discrim =0 , discrim2=0; //initializing the answer: root1 and 2 of the quadratic
        //discrim = the discriminant of the quadratic and discrim2 = the square root of the quadratic

        //asking for user inputs- turned off
        /*
        java.util.Scanner input = new java.util.Scanner(System.in);
        System.out.println("Hi! Please give me the a, b and c values of the quadratic equation: ax^2 + bx + c");
        System.out.print("Enter the a value:");
        a = input.nextInt();
        System.out.print("Enter the b value:");
        b = input.nextInt();
        System.out.print("Enter the c value:");
        c = input.nextInt();
        System.out.println("The equation you want to solve is:"+ a +"x^2 + "+b+"x + "+c);
        System.out.println("If you made a typo, please restart the program and double check next time! Thank you :D");
*/
        //Now let's check if the quadratic will have imaginary solutions
        discrim = (b*b)+(-4*a*c);
        discrim2= Math.sqrt(discrim);
        if (discrim < 0) {
            System.out.println("This quadratic equation has imaginary solutions because the discriminant is negative");
        }

        //to check if the quadratic has one root
        if(discrim ==0) {
            root1= (-1*b)+discrim2;
            root1 /= 2*a;
            System.out.println("This quadratic equation only has one root and its "+ root1);
        }

        //to check if the quadratic has two roots
        if(discrim >0) {
            root1= (-1*b)+discrim2;
            root1 /= 2*a;
            root2= (-1*b)-discrim2;
            root2 /= 2*a;
            System.out.println ("The first root is: " + root1);
            System.out.println ("The second root is: " + root2);
        }
    }

    /**
     *
     * @param num1- The first number of the three to check for the least common multiple
     * @param num2- The second number of the three to check for the least common multiple
     * @param num3- The third number of the three to check for the least common multiple
     */

    public static void leastCommonMultiple(int num1, int num2, int num3)
    {
        for(int lcm=1; lcm <= (num1*num2*num3); lcm++)
        {
            // this for loop runs through all the numbers and check if num1*num2*num3 are all factors of the numbers.
            //Once the condition is met, the system will print out the lcm of the three number.
            if (lcm % num1 ==0 && lcm %num2 ==0 && lcm %num3 == 0){
                System.out.println("The least common multiple of the three numbers is: " + lcm);
                break;
            }
        }
    }

    /**
     *
     * @param word- Any word that the user want to check if it is a palindrome
     */
    public static void isPalindrome(String word) {
        String reverse = "";
        //To have a String that stores the reverse of the word.
        for (int i = word.length() - 1; i >= 0; i--) {
            reverse += word.substring(i, i + 1);
        }
        //If the reverse of the word is equal to the original word, then the word is a palindrome
        if (reverse.equals(word)) {
            System.out.println("True: the inputted word is a Palindrome");
        } else {
            System.out.println("False: the inputted word is not a Palindrome");
        }
    }
    public static void vigCipher(String message, String key) {

        String addKey = "";
        String encryptedMessage = "";
        message = message.toUpperCase();
        key = key.toUpperCase();
        int stringDiff = message.length() - key.length();
        //the 2 if statements are for mapping the key to be the same length as the message
        if (message.length() != key.length()) {
            if (stringDiff > 0) {
                //keeps adding letters until the length of the key is equal to the length of the message
                for (int i = 0; addKey.length() < message.length(); i++) {
                    if (i > key.length() - 1) {
                        i = 0;
                    }
                    addKey = addKey + key.substring(i, i + 1);
                }
            }
            if (stringDiff < 0) {
                addKey = key.substring(0, message.length());
            }
        }
        //if message.length() = key.length() the addKey string will just be key, a little problem that took me forever to figure out
        addKey=key;
        System.out.println(addKey);
        System.out.println( message.charAt(1));
        for (int i=0;  i< message.length(); i++)
        {
            //After testing to know the number associated with each letter of the CAPITALIZE alphabet, I found out that JAVA uses ASCII
            int encryptedLetter=((message.charAt(i)-65)+(addKey.charAt(i)-65)% 26 ); //I subtracted 65 to make the alphabet go from 0-26
            encryptedMessage+=(char)((encryptedLetter));
        }
        System.out.println("The encrypted message is: "+ encryptedMessage);
    }
}
