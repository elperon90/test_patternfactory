package patternfactoryabstract;

public class CommessoTennis implements Commesso{

	@Override
	public Scarpa getScarpa() {
		// TODO Auto-generated method stub
		return new ScarpaTennis();
	}

	@Override
	public Borsa getBorsa() {
		// TODO Auto-generated method stub
		return new BorsaTennis();
	}

}
