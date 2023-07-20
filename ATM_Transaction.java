import java.util.Scanner;
class ATM_Transaction
  {
    public static void main(String[] args)
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("enter the balance");
      double balance=sc.nextDouble();
      System.out.println("enter your choice");
      System.out.println("1.pin validation");
      System.out.println("2.check balance");
      System.out.println("3.deposite");
      System.out.println("4.with draw");
      int choice=sc.nextInt();
      switch(choice)
        {
          case 1:
            System.out.println("enter pin number");
            int pin=sc.nextInt();
            if(pin==123)
            {
              System.out.println("pin is valid");
            }
            else {
              System.out.println("pin is invalid");
            }
            break;
          case 2:
            System.out.println("blanace :"+balance);
            break;
          case 3:
            System.out.println("enter money to deposite");
            int deposite=sc.nextInt();
             balance=balance+deposite;
            System.out.println("balanec money is"+balance);
            break;
          case 4:
            System.out.println("enter the money for with draw");
            int withdraw=sc.nextInt();
            if(balance>=withdraw)
            {
              System.out.println("collect your money");
            }
               else   
            {
      System.out.println("insufficient amount");
            }
            break;
            
          default :
            System.out.println("exit from the transaction") ;
        }
    }  
  }
