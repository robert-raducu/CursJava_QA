package curs13;

import java.util.HashMap;
import java.util.Map;

public class CoduriPostale {

	
	Map <Integer, String> coduriPostale = new HashMap<>();
	
	public CoduriPostale() {
		coduriPostale.put(100, "Iasi");
		coduriPostale.put(202, "Bacau");
		coduriPostale.put(400, "Bucuresti");
		coduriPostale.put(309, "Ploiesti");
		coduriPostale.put(999, "Brasov");
		coduriPostale.put(704, "Oradea");
	}
	
	public String gasesteOras(int codPostal) throws CodPostalException {
		
		if(coduriPostale.containsKey(codPostal)) {
			return coduriPostale.get(codPostal);
		}
		else {
			throw new CodPostalException("Codul postal nu exista");
		}
	}
}
