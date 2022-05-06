package patternfactoryabstract;

public class ScarpaGinnastica  implements Scarpa{

	public Scarpa create() {
		System.out.println("creazione scarpa da ginnastica completata");
		return this;
	}
}
