package representation;

import dataPackage.Student;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Scanner;

public class HomePage
{
    private static Student studentList[];
    private static int     numberOfStudents;
    public static void main()
    {
        HomePage.readStudents();
    }

    public static void readStudents()
    {

        try
        {
            FileReader studentFileReader = new FileReader("StudentList.txt");
            BufferedReader bufferReader = new BufferedReader(studentFileReader);


            Scanner read;
            while (read.hasNext())
            {
                read.useDelimiter("#");
                title = read.nextLine();
                category = read.nextLine();
                runningTime = read.nextLine();
                year = read.nextLine();
                price = read.nextLine();
                System.out.println(title + " " + category + " " + runningTime + " " +
                        year + " " + price + "\n"); // just for debugging
            }
            read.close();
        }
        catch(Exception ex)
        {
            System.out.println("Student List file is not exist.");
        }
    }

    }
}
