package kodlama.io.Kodlama.io.Devs.dataAccess.concretes;

import java.util.ArrayList;
import java.util.List;

import kodlama.io.Kodlama.io.Devs.dataAccess.abstracts.LanguagesRepository;
import kodlama.io.Kodlama.io.Devs.entities.concretes.Languages;

public class InMemoryLanguagesRepository implements LanguagesRepository{

	List<Languages> languages;
	
	
	public InMemoryLanguagesRepository() {
		languages = new ArrayList<Languages>();
		languages.add(new Languages(1, "C#"));
		languages.add(new Languages(2, "Java"));
		languages.add(new Languages(3, "Pyhton"));
	}

	@Override
	public List<Languages> getAll() {
		return languages;
	}

	@Override
	public int add(Languages languages) {
		return languages.getId() ;
	}

	@Override
	public int delete(int id) {
		return id ;
	}

	@Override
	public int update(Languages languages) {
		return languages.getId() ;
	}

}
