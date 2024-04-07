import javax.swing.JOptionPane;
public class Practice1 
{
    int add(int a , int b )
    {
        return a+b; 
    }
    int subtract(int a , int b )
    {
         return a - b ;
    }
    int multiply(int a , int b )
    {
         return a * b ;
    }
    public static void main(String args[])
    {
        Practice calculator =  new Practice();
        String numm = JOptionPane.showInputDialog("Enter Number 1 : ");
        int num1 = Integer.parseInt(numm);
        String num = JOptionPane.showInputDialog("Enter Number 2 : ");
        int num2= Integer.parseInt(num);
        String choiceMessage = "1. Add\n2. Subtract\n3. Multiply";
        int choice = Integer.parseInt(JOptionPane.showInputDialog(choiceMessage));
        switch(choice)
        {
            case 1:
                JOptionPane.showMessageDialog(null , calculator.add(num1 , num2));
                break;
            case 2 :
                JOptionPane.showMessageDialog(null , calculator.subtract(num1 , num2));
                break;
            case 3:
                JOptionPane.showMessageDialog(null, "Result: " + calculator.multiply(num1, num2));
                break;
            default:
                JOptionPane.showMessageDialog(null, "Invalid choice!");
                break;
        }
    }
}