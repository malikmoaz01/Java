import java.io.*;
class Student implements Serializable
{
    int roll_no;
    String name;
    String university;

    // Constructor
    Student(int roll_no, String name, String university) {
        this.roll_no = roll_no;
        this.name = name;
        this.university = university;
    }

    // Getter methods
    int getRollNo() {
        return roll_no;
    }

    String getName() {
        return name;
    }

    String getUniversity() {
        return university;
    }

    void setRollNo(int roll_no) {
        this.roll_no = roll_no;
    }
    void setname(String name )
    {
        this.name = name ;
    }
    void setuniversity(String university)
    {
        this.university = university;
    }
    void display_student_data()
    {
       System.out.println(name + "\t" + roll_no + "\t" + university);
    }
}

public class Serialization{
    public static void main(String args[])
    {
        try
        {
        Student obj = new Student(517  , "Malik Moaz" ,"PUCIT");
        FileOutputStream fos = new FileOutputStream("ob.txt" );
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(obj);
        oos.close();
        fos.close();
        }catch(IOException e)
        {
            e.printStackTrace();
        }
    }
}