package patternfactoryabstract;

public class ScarpaTennis implements Scarpa{
	public Scarpa create() {
		System.out.println("creazione scarpa da tennis completata");
		return this;
	}

}
