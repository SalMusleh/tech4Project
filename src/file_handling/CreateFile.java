package file_handling;

import java.io.File;
import java.io.IOException;

public class CreateFile {
    public static void main(String[] args) {
        //To create a file we use some classes

        File myFile = new File("myFirstFile.xls");

        try {
            myFile.createNewFile();

        } catch (IOException e) {
            e.printStackTrace();
        }


        System.out.println("End of the program");
    }
}
