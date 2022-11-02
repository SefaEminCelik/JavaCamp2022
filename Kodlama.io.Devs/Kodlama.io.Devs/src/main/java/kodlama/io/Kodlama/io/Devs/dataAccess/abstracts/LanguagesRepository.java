package kodlama.io.Kodlama.io.Devs.dataAccess.abstracts;

import java.util.List;

import kodlama.io.Kodlama.io.Devs.entities.concretes.Languages;

public interface LanguagesRepository {

	List<Languages> getAll();
	
	int add(Languages languages);
	
	int delete(int id);
	
	int update(Languages languages);
	
	
}
