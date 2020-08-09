import java.util.Scanner;
public class app1
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int userInput;
        int size = 0;
        double[] accountBalances = new double[2];
        String[] accountNames = new String[2];


       



        
        while(true)
        {
            System.out.println("Bank Admin Menu: ");
            System.out.println("Please enter a menu option : ");
            System.out.println("(1): Add customer to the bank");
            System.out.println("(2): Change customer name ");
            System.out.println("(3): Check account balance ");
            System.out.println("(4): Modify account balance ");
            System.out.println("(5): Summary of all account ");
            System.out.println("(-1): Quit");

            userInput = in.nextInt();
        if (userInput == 1)
        {
            System.out.println("Bank Add customer Menu: ");
            System.out.println("Please enter an account balance ");
            double balance = in.nextDouble();
            accountBalances[size] = balance;
            System.out.println("Please enter the account name: ");
            in.nextLine();
            String name = in.nextLine();
            accountNames[size] = name;
            System.out.println("Customer ID is : "+ size);
            size++;
        }
        else if(userInput == 2)
        {
            System.out.println("Bank Change Name Menu");
            System.out.println("Please enter a customer ID to change their name : ");
            int index = in.nextInt();
            System.out.println("What is the customer's new name ? ");
            in.nextLine();
            accountNames[index] = in.nextLine();
        }
        else if(userInput == 3)
        {
            System.out.println("Bank Check Balance Menu");
            System.out.println("Please enter a customer ID to check the balance : ");
            int index = in.nextInt();
            double balance = accountBalances[index];
            System.out.println("This customer has $" + balance + " in their account");
        }
        else if(userInput == 4)
        {
            System.out.println("Bank Modify Balance Menu");
            System.out.println("Please enter a customer ID to modify the balance : ");
            int index = in.nextInt();
            System.out.println("Please enter your new balance : ");
            accountBalances[index] = in.nextDouble();
        }
        else if(userInput == 5)
        {
            System.out.println("Bank All Customer Summery Menu : ");
            double total = 0;
            for (int i = 0; i < size; i++)
            {
                total += accountBalances[i];
                System.out.println(accountNames[i]+ " has $"+accountBalances[i]+" in their account.");
            }
            System.out.println("In total , there is $"+total+" in the bank.");
        }
        else if(userInput == -1)
        {
            System.exit(-1);
        }
        else 
        {
            System.out.println("ERROR: Invalid input");
        }
        }


    }
}