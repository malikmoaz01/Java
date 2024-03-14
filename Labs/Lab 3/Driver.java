import java.util.*;
import java.io.*;

class Bank {
    
	String name;
	
    int account_no;
    
	double amount;

    Bank() {
        amount = 1000;
    }

    Bank(String name, int account_no, double amount) {
		
        this.name = name;
        
		this.account_no = account_no;
        
		this.amount = amount;
    
	}

    String getname() {
        return name;
    }

    int getaccountno() {
        return account_no;
    }

    double getamount() {
        return amount;
    }

    void setname(String name) {
        this.name = name;
    }

    void setaccountno(int account_no) {
        this.account_no = account_no;
    }

    void setamount(double amount) {
        this.amount = amount;
    }

    void print() {
		    System.out.println(name + " ; " + account_no + " ; " + amount);
    }
}

class NoAccountAvailableException extends Exception {
	
    public NoAccountAvailableException(String message) 
	
	{
        super(message);
    }
}


public class Driver {

    public ArrayList<Bank> bank1;

    public Driver() {
        bank1 = new ArrayList<Bank>();
    }

    public void addNewRecord() {
		
        Scanner in = new Scanner(System.in);
		
        System.out.println("Enter Banker Name: ");
        
		String name = in.nextLine();
		
        System.out.println("Enter Account Number : ");
        
		int account_no = in.nextInt();
        
		in.nextLine();
        
		Bank newAccount = new Bank(name, account_no, 1000);
		
		bank1.add(newAccount);
        
		saveBank();
        
		System.out.println("Record Added Successfully.");
    
	}

    public void transfer() {
        try {
            
			Scanner in = new Scanner(System.in);
            
			System.out.println("Enter Account No in which u want to Send: ");
            
			int senderAccNo = in.nextInt();
            
			Bank sender = findAccount(senderAccNo);
            
			if (sender == null) 
			{
                throw new NoAccountAvailableException("Sender Account not Found.");
            }
			
			
            System.out.println("Enter Account No in which u want to Recieve:");
			
            int recipientAccNo = in.nextInt();
            
			Bank recipient = findAccount(recipientAccNo);
            
			if (recipient == null) 
			
			{
                throw new NoAccountAvailableException("Recipient's account not found.");
            }
			
            System.out.println("Enter Amount for Transfer: ");
			
            double amount = in.nextDouble();
			
			
            if (amount > sender.getamount())
			
			{
                throw new IllegalArgumentException("Insufficient balance.");
            }
			
            sender.setamount(sender.getamount() - amount);
			
            recipient.setamount(recipient.getamount() + amount);
            
			saveBank();
            
			System.out.println("Transfer Successful.");
        
		} catch (NoAccountAvailableException e) 
		{
            System.out.println(e.getMessage());
        } 
    }

    public void saveBank() {
        try {
            FileWriter fw = new FileWriter("Bank.txt");
            PrintWriter pw = new PrintWriter(fw);
			
            for (Bank b : bank1) 
			
			{
                pw.println(b.name + " ; " + b.account_no + " ; " + b.amount);
            }
            pw.close();
            fw.close();
        } catch (IOException e) {
            System.err.println("Error occurred " + e.getMessage());
        }
    }

    public Bank findAccount(int account_no) {
        for (Bank b : bank1) 
		{
            if (b.getaccountno() == account_no) 
			{
                return b;
            }
        }
		
        return null;
    }

    public static void main(String[] args) {
		
        Driver obj = new Driver();
        
		obj.readBank();

        Scanner in = new Scanner(System.in);

        while (true) {
            System.out.println("\nChoose an option :: ");
        
		System.out.println("1. Add New Account");

            System.out.println("2. Transfer");

        System.out.println("3. Exit program");

            System.out.print("Enter your choice :: ");

        int option = in.nextInt();
		
            switch (option) {
                case 1:
                    obj.addNewRecord();
                    break;
                case 2:
                    obj.transfer();
                    break;
                case 3:
					System.out.println("Happy Coding Jani ! ");
                    System.exit(0);
                default:
                    System.out.println("Invalid Choice!");
            }
        }
    }

    public void readBank() {
        try {
            
			FileReader fr = new FileReader("Bank.txt");
            
			BufferedReader br = new BufferedReader(fr);
            
			String line;
			
            while ((line = br.readLine())!= null) {
                String[] tokens = line.split(" ; ");
				
                
				String name = tokens[0];
                
				int account_no = Integer.parseInt(tokens[1]);
                
				double amount = Double.parseDouble(tokens[2]);
                
				Bank b = new Bank(name, account_no, amount);
                
				bank1.add(b);
            
			}
            br.close();
            fr.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found.");
        } catch (IOException e) {
            System.out.println("Error reading file.");
        }
    }
}
