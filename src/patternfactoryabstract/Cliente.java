package patternfactoryabstract;

public class Cliente {

	public static void main(String[] args) {

		String scelta = "tennis"; //ci dovrebbe essere l input dell utente
		Commesso commesso = null;
		if(scelta.equals("tennis"))
			commesso = new CommessoTennis();
		if(scelta.equals("ginnastica"))
			commesso = new CommessoGinnastica();
		
		
		Scarpa s = commesso.getScarpa();
		s.create();
		
		Borsa b = commesso.getBorsa();
		b.create();
	}

}
