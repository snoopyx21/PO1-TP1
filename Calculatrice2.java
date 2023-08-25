import java.io.*;
import java.util.Scanner;

public class Calculatrice2{
    public static void main(String[] args){
    Scanner s = new Scanner(System.in); 
    int op1=s.nextInt();
    char op =s.next().charAt( 0);
    int op2=s.nextInt();

    System.out.println("premiere operande =" + op1);
    System.out.println("deuxieme operande =" + op2);
    switch (op){
        case '+' : System.out.println(op1+op2);
          break;
        case '-' : System.out.println(op1-op2);
          break;
        case '*' : System.out.println(op1*op2);
          break;
        case '/' : if (op2==0){
          System.out.println("Division par zero");
          break;
        }
        else{
          System.out.println("op1/op2");
	  break;
  	}
        case '%' : System.out.println(op1%op2);
	  break;
	case '^' : System.out.println( (int) Math.pow(  (double)op1, (double)op2 ) );
	  break;
	default : System.out.println("operateur inconnu ...");
	}
     }
  }
