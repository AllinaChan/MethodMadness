public class AChenLib {
    //Allen Chen Period 9
    /**
     *
     * @param a- The a value of a standard quadratic equation
     * @param b- The b value of a standard quadratic equation
     * @param c- The c value of a standard quadratic equation
     */
    public static String quadSolver(double a, double b, double c)
    {
        //This is the quadSolver 4000 ;)
        String result="";
        double root1=0, root2=0, discrim =0 , discrim2=0; //initializing the answer: root1 and 2 of the quadratic
        //discrim = the discriminant of the quadratic
        //discrim2 = the square root of the quadratic

        //Now let's check if the quadratic will have imaginary solutions
        discrim = (b*b)+(-4*a*c);
        discrim2= Math.sqrt(discrim);
        if (discrim < 0) {
            result ="This quadratic equation has imaginary solutions because the discriminant is negative";
        }

        //to check if the quadratic has one root
        if(discrim ==0) {
            root1= (-1*b)+discrim2;
            root1 /= 2*a;
            result= "This quadratic equation only has one root and its "+ root1;
        }

        //to check if the quadratic has two roots
        if(discrim >0) {
            root1= (-1*b)+discrim2;
            root1 /= 2*a;
            root2= (-1*b)-discrim2;
            root2 /= 2*a;
            result="The first root is: " + root1+ " and "+ "the second root is: " + root2;
        }
        return result;
    }

    /**
     *
     * @param num1- The first number of the three to check for the least common multiple
     * @param num2- The second number of the three to check for the least common multiple
     * @param num3- The third number of the three to check for the least common multiple
     */

    public static int leastCommonMultiple(int num1, int num2, int num3)
    {
        int result=0;
        for(int lcm=1; lcm <= (num1*num2*num3); lcm++)
        {
            // this for loop runs through all the numbers and check if num1*num2*num3 are all factors of the numbers.
            //Once the condition is met, the system will return the lcm of the three number.
            if (lcm % num1 ==0 && lcm %num2 ==0 && lcm %num3 == 0){
                result = lcm;
                break;
            }
        }
        return result;

    }

    /**
     *
     * @param num- The number of
     */
    public static void primePrinter(int num) {
        String primeNumbers = "";
        int primeCount=0;
        int possiblePrime =2; //start off with 2 because 0 and 1 and both not prime
        //The while loop will keep looping until the first 'num' prime numbers are added to the primeNumbers String
        //I don't know why the for loop didn't work "for (a=2; a<= num; a++)" It only printed first half of the num of prime numbers
       while(primeCount!=num) {
            //isPrime has to be reinitialized everytime.
            boolean isPrime = true;
            //Basically, we take each number as we approach the targeted "num" and test if it's prime. If it is, add it to our String!
           for (int i=2; i <=Math.sqrt(possiblePrime); i++)
           {
               if(possiblePrime%i==0) //credits to Method Madness Helper Day 1
               {
                    isPrime= false;
               }
           }
           if(isPrime == true)
           {
               primeCount+=1; //add to the prime count so we are one step closer to completing the firsst "num" prime numbers
               primeNumbers= primeNumbers + possiblePrime+ " ";
           }
           possiblePrime++; //Next prime number to check please!
        }
            System.out.println("The first " +num+ " prime numbers are: "+primeNumbers);

    }

    /**
     *
     * @param word- Any word that the user want to check if it is a palindrome
     */
    public static boolean isPalindrome(String word) {
        boolean result;
        String reverse = "";
        //To have a String that stores the reverse of the word.
        for (int i = word.length() - 1; i >= 0; i--) {
            reverse += word.substring(i, i + 1);
        }
        //If the reverse of the word is equal to the original word, then the word is a palindrome
        if (reverse.equals(word)) {
            result=true;
        } else {
            result=false;
        }
        return result;
    }

    /**
     *
     * @param message
     * @param key
     */
    public static String vigCipher(String message, String key) {
        String result="";
        String addKey = ""; //String to store the key that is mapped to the message
        String encryptedMessage = ""; //the encrypted message
        int encryptedLetter=0; //the ASCII code of the encrypted letter
        message = message.toUpperCase(); //Change all the letters in the message to upper case
        key = key.toUpperCase();  //Change all the letters in the key to upper case
        int stringDiff = message.length() - key.length(); //the difference in length of the message and the key
        //the two if-statements are for mapping the key to be the same length as the message
        if (message.length() != key.length()) {
            if (stringDiff > 0) {
                //keeps adding letters until the length of the key is equal to the length of the message
                for (int i = 0; addKey.length() < message.length(); i++) {
                    if (i >= key.length()) {
                        i = 0;
                    }
                    //adding spaces to the key, to mirror the message string, 32 is the ASCII number for a space
                    if(message.charAt(i)==32){
                        addKey= addKey+" ";
                    }
                    addKey = addKey + key.substring(i, i + 1);
                }
            }
            if (stringDiff < 0) {
                addKey = key.substring(0, message.length());
            }
        }
        //if message.length() = key.length() the addKey string will just be key, a little problem that took me forever to figure out
            if (stringDiff==0)
            {
                addKey = key;
            }
        for (int i=0;  i< message.length(); i++)
        {
            if(message.charAt(i)==32) {
                encryptedMessage+= " ";

            }
            else {

                //After testing to know the number associated with each letter of the CAPITALIZE alphabet, I found out that JAVA uses ASCII
                encryptedLetter = (message.charAt(i) - 65) + (addKey.charAt(i) - 65); //I subtracted 65 to make the alphabet go from 0-26
                encryptedLetter = encryptedLetter % 26;
                encryptedLetter += 65;
                encryptedMessage += (char) ((encryptedLetter));
            }
        }
        result= encryptedMessage;
        return result;
    }
}
