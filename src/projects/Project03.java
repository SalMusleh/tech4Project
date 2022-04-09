package projects;

public class Project03 {
    public static void main(String[] args) {

        System.out.println("\n\nTask1\n\n");

        String s1 ="24", s2 = "5";

        int num1 = Integer.parseInt(s1);
        int num2 = Integer.parseInt(s2);
        System.out.println(num1 + num2);
        System.out.println(num1 - num2);
        System.out.println((double)num1 / (double)num2);
        System.out.println(num1 * num2);
        System.out.println(num1 % num2);

        System.out.println("\n\nTask2\n\n");


        int randNum = (int)((Math.random() * 35) + 1);
            System.out.println("Random number = " + randNum);

        if (randNum % 2==0 || randNum % 3==0){
            System.out.println("THE NUMBER IS NOT A PRIME NUMBER");
        }else
            System.out.println("THE NUMBER IS A PRIME NUMBER");

        System.out.println("\n\nTask3\n\n");

        int numb1 =(int)(Math.random() * 50) + 1;
        int numb2 =(int)(Math.random() * 50) + 1;
        int numb3 =(int)(Math.random() * 50) + 1;

        int max = Math.max(Math.max(numb1, numb2),numb3);
        int min = Math.min(Math.min(numb1, numb2),numb3);

        System.out.println("Lowest Number is = " + min);
        if (numb1 != max && numb1 != min){
            System.out.println("Middle number is = " + numb1);
        }else if (numb2 != max && numb2 != min){
            System.out.println("Middle number is = " + numb2);
        }else{
            System.out.println("Middle number is = "+ numb3);
        }
        System.out.println("Greatest number is = " + max);


        System.out.println("\n\nTask4\n\n");

        char c = 'a';

        if (c >= 'a' && c <= 'z'){
            System.out.println("The letter is lowercase");
        }else if (c >= 'A' && c <= 'Z'){
            System.out.println("The letter is uppercase");
        }else{
            System.out.println("invalid character detected!!");
        }

        System.out.println("\n\nTask5\n\n");

        if ((c >= 'a' && c <= 'z') || (c >= 'A' && c <='Z')){
            //Letters

            switch (c){
                case 97: //a
                case 101: //e
                case 105: //i
                case 111: //o
                case 117: //u
                case 65: //A
                case 69: //E
                case 73: //I
                case 79: //O
                case 85: //U
                    System.out.println("The letter is vowel");
                    break;
                default:
                    System.out.println("The letter is consonant");
            }
        }else{
            System.out.println("invalid character detected");
        }

        System.out.println("\n\nTask6\n\n");

        if((c >= 'a' && c <= 'z') || (c >= 'A' && c <='Z') || (c >= '0' && c <= '9')){
            // Letters upper case and lowercase
            // digits
            System.out.println("invalid character detected");
        }else{
            System.out.println("Special character is = " + c);
        }

        System.out.println("\n\nTask7\n\n");
        c = '%';

        if ((c >= 'a' && c <= 'z') || (c >= 'A' && c <='Z')){
            // letters
            System.out.println("character is a letter");
        } else if(c >= '0' && c <= '9'){
            // digits
            System.out.println("character is a digit");
        }else{
            System.out.println("character is a special character");
        }

    }
}
