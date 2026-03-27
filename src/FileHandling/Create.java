package FileHandling;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.SQLOutput;

public class Create {
    String name;

    Create(String name) {
        this.name = name;
    }

    public void createFile() {
        try {

            File myObj = new File("C:\\Users\\user\\Documents\\" + name);
            if (myObj.createNewFile()) {
                System.out.println("file created" + myObj.getName());
            } else {
                System.out.println("not created,already existed");
            }
        } catch (
                IOException e) {
            System.out.println("error while creating");
            e.printStackTrace();
        }
    }

    public void writeFile() {


        String fullPath = "C:\\Users\\user\\Documents\\" + name;
        try {
            FileWriter writeFile = new FileWriter(fullPath);
             writeFile.write("This is an file example for java file handling"); {

                System.out.println("Sucessfully file written" + name);
                writeFile.close();

                }

            }catch(IOException e){
                System.out.println("error in writting in " + name);
                e.printStackTrace();
            }



    }
}
