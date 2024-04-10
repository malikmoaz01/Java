import java.io.*;
import java.util.*;

class Employee {
    int id;
    String name;
    static double salary;
    String rank;

    public Employee(int id, String name, double salary, String rank) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.rank = rank;
    }

    public void print() {
        System.out.println("Object Contents = " + id + " :: " + name + " :: " + salary + " :: " + rank);
    }
}

public class Practice {
    public ArrayList<Employee> emp;

    public Practice() {
        emp = new ArrayList<>();
    }

    public void addEmployee() {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter id : ");
        int id = in.nextInt();
        in.nextLine(); // Consume newline character
        System.out.println("Enter Name : ");
        String name = in.nextLine();
        System.out.println("Enter Salary : ");
        double salary = in.nextDouble();
        in.nextLine(); // Consume newline character
        System.out.println("Enter Rank : ");
        String rank = in.nextLine();
        Employee e = new Employee(id, name, salary, rank);
        e.print();
        emp.add(e);
        System.out.println("Record Added Successfully\n");
    }

    public void loadEmployee() {
        String tokens[];
        String name, rank;
        int id;
        double salary;
        try {
            FileReader rf = new FileReader("EmployeeData.csv");
            BufferedReader br = new BufferedReader(rf);
            String line = br.readLine();
            while (line != null) {
                tokens = line.split("\t");
                name = tokens[0];
                id = Integer.parseInt(tokens[1]);
                salary = Double.parseDouble(tokens[2]);
                rank = tokens[3];
                Employee emp1 = new Employee(id, name, salary, rank);
                emp1.print(); 
                emp.add(emp1);
                line = br.readLine();
            }
            rf.close();
            br.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void writeEmployee() {
        try {
            FileWriter fw = new FileWriter("employees.txt");
            PrintWriter pw = new PrintWriter(fw);
            for (Employee em : emp) {
                pw.println(em.id + ", " + em.name + ", " + em.salary + ", " + em.rank);
            }
            fw.close();
            pw.close();
            System.out.println("Employee records written to employees.txt successfully");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public boolean removeEmployee(int id1) {
        Iterator<Employee> iterator = emp.iterator();
        while (iterator.hasNext()) {
            Employee emp1 = iterator.next();
            if (emp1.id == id1) {
                iterator.remove();
                System.out.println("Employee with ID " + id1 + " removed successfully");
                return true;
            }
        }
        System.out.println("Employee with ID " + id1 + " not found");
        return false;
    }

    public static void main(String[] args) {
        Practice obj = new Practice();
        Scanner in = new Scanner(System.in);

        while (true) {
            System.out.println("Choose an option :: ");
            System.out.println("1. Add Employee");
            System.out.println("2. Remove Employee");
            System.out.println("3. Read CSV and Write TXT");
            System.out.println("4. Exit program\n");
            System.out.print("Enter your choice :: ");

            int option = in.nextInt();
            switch (option) {
                case 1:
                    obj.addEmployee();
                    break;
                case 2:
                    System.out.println("Enter ID :: ");
                    int id = in.nextInt();
                    obj.removeEmployee(id);
                    break;
                case 3:
                    obj.loadEmployee();
                    obj.writeEmployee();
                    break;
                case 4:
                    System.exit(0);
                default:
                    System.out.println("Invalid Choice!\n");
            }
        }
    }
}




// public boolean removeEmployee(int id1)
// {
//     for(Employee em : emp)
//     {
//         if(id1.getid().equals(id))
//         {
//             emp.remove(id1);
//             return true;
//         }
//     }
//     System.out.println("Employee doesnt found \n");
//     return false;
// }

