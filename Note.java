import java.io.*;
import java.util.Scanner;
import java.io.FileNotFoundException;
import java.io.IOException;
class NoteFunctions{

    public static final String FileName = "Note.txt";
    public void addNote(String Note){
        File file = new File(FileName);
        try{
            FileWriter fw = new FileWriter(file,true);
            fw.write(Note + "\n");
            System.out.println("Note Added Successfully");
            fw.close();
        }
        catch(IOException e){
            System.out.println("Error in adding note" + e.getMessage());
        }
    }

    public void readNote(){
        File file = new File(FileName);
        try{
            Scanner sc = new Scanner(file);
            while(sc.hasNextLine()){
                System.out.println(sc.nextLine());
            }
            sc.close();
        }
        catch(FileNotFoundException e){
            System.out.println("File Not Found : " + e.getMessage());
        }
    }

    public void deleteNote(){
        File file = new File(FileName);
        if(file.delete()){
            System.out.println("File Deleted Successfully");
            
        }
        else{
            System.out.println("File Not Deleted");
           

        }
    }
}

public class Note{
    public static void main(String[] args){
        NoteFunctions nf = new NoteFunctions();
        Scanner sc = new Scanner(System.in);
        while(true){       
            System.out.println("1. Add Note");
            System.out.println("2. Read Note");
            System.out.println("3. Delete Note");
            System.out.println("4. Exit");
    
            int choice = sc.nextInt();
            sc.nextLine(); // Add this line to consume the leftover newline
            switch(choice){
                case 1:
                    System.out.println("Enter the Note");
                    String note = sc.nextLine();
                    nf.addNote(note);
                    break;
                case 2:
                    nf.readNote();
                    break;
                case 3:
                    nf.deleteNote();
                    break;
                case 4:
                    sc.close(); 
                    System.out.println("Exiting the program");
                    return;
                default:
                    System.out.println("Invalid Choice");   
            } 
        }
    }
}