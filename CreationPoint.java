class Point{
   public int x;
   public int y;

   public Point(int x0, int y0){
       x=x0;
       y=y0;
   }
   public String afficher(){
       return new String(x + " " + y);
}

}


public class CreationPoint{
   public static void main (String [] args){
       System.out.println("Bonjour ! ");
       Point point1 = new Point(0,0);
       Point point2 = new Point(3,4);
       Point point3 = new Point(7,1);
       System.out.println(point1.afficher());
   }
}


