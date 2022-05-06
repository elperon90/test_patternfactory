package patternfactoryabstract;

public class CommessoGinnastica implements Commesso{

	@Override
	public Scarpa getScarpa() {
		// TODO Auto-generated method stub
		return new ScarpaGinnastica();
	}

	@Override
	public Borsa getBorsa() {
		// TODO Auto-generated method stub
		return new BorsaGinnastica();
	}

}
