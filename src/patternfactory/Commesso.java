package patternfactory;

public class Commesso {

	public Scarpe getScarpe(String tipo) {
		Scarpe s = null;

		if(tipo.equals("ginnastica"))
			s = CommessoGinnastica.getScarpe();			
		if(tipo.equals("tennis"))
			s = CommessoTennis.getScarpe();		
		return s;
	}
}
