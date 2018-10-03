public class AChenLib {
    public static void quadSolver(double a, double b, double c)
    {
        //This is the quadSolver 4000 ;)
        double root1=0, root2=0, discrim =0 , discrim2=0; //initializing the answer: root1 and 2 of the quadratic
        //discrim = the discriminant of the quadratic and discrim2 = the square root of the quadratic

        //asking for user inputs
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

        //for when there is one root
        if(discrim ==0) {
            root1= (-1*b)+discrim2;
            root1 /= 2*a;
            System.out.println("This quadratic equation only has one root and its "+ root1);
        }

        //for when there is two roots
        if(discrim >0) {
            root1= (-1*b)+discrim2;
            root1 /= 2*a;
            root2= (-1*b)-discrim2;
            root2 /= 2*a;
            System.out.println ("The first root is: " + root1);
            System.out.println ("The second root is: " + root2);
        }
    }

    public static void leastCommonMultiple(int num1, int num2, int num3)
    {
        for(int lcm=1; lcm <= (num1*num2*num3); lcm++)
        {
            if (lcm % num1 ==0 && lcm %num2 ==0 && lcm %num3 == 0){
                System.out.println("The least common multiple of the three numbers is: " + lcm);
                break;
            }
        }
    }
    public static void isPalindrome(String word) {
        String reverse = "";
        for (int i = word.length() - 1; i <= 0; i--) {
            reverse += word.substring(i, i + 1);
        }
        System.out.println(reverse);
        if (reverse.equals(word)) {
            System.out.println("True: the inputted word is a Palindrome");
        } else {
            System.out.println("False: the inputted word is not a Palindrome");
        }
    }
    public static void dataStr(String date)
    {
       int slashIndex = date.indexOf("/");
        String day= date.substring(slashIndex+1, slashIndex+3);
        String month= date.substring(0,2);
        String year= date.substring(date.length()-4, date.length());
        System.out.println (day + " - "+ month +" - " + year);
    }
    public static void vigCipher(String Message, String Key){
        if (Message.length() != Key.length()){
            
        }
    }
}
