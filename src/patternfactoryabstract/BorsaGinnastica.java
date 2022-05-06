package patternfactoryabstract;

public class BorsaGinnastica implements Borsa{

	@Override
	public Borsa create() {
System.out.println("creazione borsa completata");		
return this;
	}

}
