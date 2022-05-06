package patternfactoryabstract;

public class BorsaTennis implements Borsa{

	@Override
	public Borsa create() {
System.out.println("creazione borsa tennis completata");
return this;
	}

}
