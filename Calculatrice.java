public class Calculatrice{
    public static void main(String[] args){
        if (args.length !=3){
            System.out.println("Nombre d'arguments incorrect !");
        }

    else{
    int op1=Integer.parseInt(args[0]);
    int op2=Integer.parseInt(args[2]);
    switch (args[1].charAt(0)){
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
}
