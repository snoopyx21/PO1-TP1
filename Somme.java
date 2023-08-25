public class Somme{

	public static int minV=0;
	public static int maxV=0;
	public static int moyenne=0;

	public static int min(int a, int b){
		return a<b?a:b;
	}

	public static int max(int a, int b){
		return a>b?a:b;	 
	}

	public static void main(String[] args)
	{
		minV=Integer.parseInt(args[0]);
		maxV=Integer.parseInt(args[0]);
		moyenne=Integer.parseInt(args[0]);

		for (int i=1; i<args.length; i++){
			minV=min(minV, Integer.parseInt(args[i]));
			maxV=max(maxV, Integer.parseInt(args[i]));
			moyenne+=Integer.parseInt(args[i]);
		}
		moyenne=(int)(moyenne/args.length);
		System.out.println("moyenne : " + moyenne);
		System.out.println("min : " + minV);
		System.out.println("max : " + maxV);

	}

}
