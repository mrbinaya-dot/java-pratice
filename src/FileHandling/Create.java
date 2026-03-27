package FileHandling;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Field;
import java.sql.SQLOutput;
import java.util.Scanner;

public class Create {
    String name;
    public String fullPath = "C:\\Users\\user\\Documents\\" + name;

    Create(String name) {
        this.name = name;
    }

    public void createFile() {
        try {

            File myObj = new File(fullPath);
            if (myObj.createNewFile()) {
                System.out.println("file created" + name);
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



        try {
            FileWriter writeFile = new FileWriter(fullPath);
            writeFile.write("This is an file example for java file handling");
            {

                System.out.println("Sucessfully file written" + name);
                writeFile.close();

            }

        } catch (IOException e) {
            System.out.println("error in writting in " + name);
            e.printStackTrace();
        }
    }

       public void readFile(){

            File myObj = new File(fullPath);
            try(Scanner myRead = new Scanner(myObj)){
              while (myRead.hasNextLine()){
                  String data = myRead.nextLine();
                  System.out.println(data);
              }

          }catch (IOException e){
              System.out.println("Cannor read data");
              e.printStackTrace();
          }

        }

        public void deleteFile(){
            File obj = new File(fullPath);
            if (obj.delete()) {
                System.out.println("file Deleted sucessfully \n" + name);
            } else{
                    System.out.println("file cannot be deleted");
                }
            }
        }



