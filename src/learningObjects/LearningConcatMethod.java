package learningObjects;

public class LearningConcatMethod {
    public static void main(String[] args){

        String tech = "Tech";
        String global = "Global";

        String schoolName1 = tech + global; // + operator
        String schoolName2 = tech.concat(global); //concat method

        System.out.println(schoolName1 + "\n" + schoolName2);

        System.out.println("\"Hello\"");
        System.out.println(tech + global);
        System.out.println(tech.concat(global));

        String myName = "Salah";
        String myLastName = "Musleh";


        String fullName1 = "Salah Musleh";
        String fullName2 = myName + " " + myLastName;
        String fullName3 = myName+ " ".concat(myLastName);
        //                 myName.concat(" "myLastName);
        //                 myName.(" "concat(myLastName));
        System.out.println(fullName1);
        System.out.println(fullName2);
        System.out.println(fullName3);



    }
}
