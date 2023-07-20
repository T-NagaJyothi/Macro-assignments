import java.util.Scanner;
class Calculator_switch
  {
    public static void main(String[] args)
    {
      double result;
      Scanner sc=new Scanner(System.in);
      System.out.println("enter the desired operator from +,-,*,/,%");
      char ch=sc.next().charAt(0);
      System.out.println("enter the num 1");
      double num1=sc.nextDouble();
      System.out.println("enter the num2");
      double num2=sc.nextDouble();
      switch(ch)
        {
          case '+' :
            result=num1+num2;
            System.out.println("addition operation"+result);
            break;
          case '-' :
            result=num1-num2;
            System.out.println("subtraction operation"+result);
            break;
          case '*' :
            result=num1*num2;
            System.out.println("multiplication operation"+result);
             break;                 
          case '/' :
            result=num1/num2;
            System.out.println("division operation"+result);
            break;
          case '%' :
            result=num1%num2;
            System.out.println("remainder"+result);
            break;
         default :
            System.out.println("enter the operator from +,-,*,/,% only");
            break;
            
        }
    }
  }