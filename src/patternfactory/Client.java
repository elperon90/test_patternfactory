package patternfactory;

public class Client {
	public static void main(String [] args) {
	Commesso c = new Commesso();
	
	Scarpe t = c.getScarpe("tennis");
	
	System.out.println(t.getClass());
	}
	

}
