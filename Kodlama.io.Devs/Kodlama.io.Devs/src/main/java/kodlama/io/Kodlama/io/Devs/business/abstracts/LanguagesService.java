package kodlama.io.Kodlama.io.Devs.business.abstracts;

import java.util.List;

import kodlama.io.Kodlama.io.Devs.entities.concretes.Languages;

public interface LanguagesService {

	List<Languages> getAll();
	
	int add(Languages languages) throws Exception;
	
	int delete(int id);
	
	int update(Languages languages) throws Exception;
}
