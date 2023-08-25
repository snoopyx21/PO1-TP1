public class Types {
   public static void main(...){
   	int nb = lirePos();
   	double [] notes = lireTableau(nb);
   	Terminal.ecrireStringln("Notes obtenues : ");
   	afficheTab(notes);
   	Terminal.ecrireString("Moyenne : ");
   	Terminal.ecrireDoubleln(moyenneTab(notes));
   }
}
