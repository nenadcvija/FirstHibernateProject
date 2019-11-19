package ponavljanje;

import java.util.List;

public class Metode {
	
	public int vratiGramazu(List<KonditorskiProizvod> proizvodi, String ime) {
		
		for(KonditorskiProizvod k: proizvodi) {		
			if(ime.equals(k.getIme())) {
				return k.getGramaza();
			}
		}
		return 0;		
	}

}
