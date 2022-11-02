package kodlama.io.Kodlama.io.Devs.business.concretes;

import java.util.List;

import kodlama.io.Kodlama.io.Devs.business.abstracts.LanguagesService;
import kodlama.io.Kodlama.io.Devs.dataAccess.abstracts.LanguagesRepository;
import kodlama.io.Kodlama.io.Devs.entities.concretes.Languages;


public class LanguagesManager implements LanguagesService {
	
	List<Languages> diller;
	
	private LanguagesRepository languagesRepository;
	
	
	public LanguagesManager(LanguagesRepository languagesRepository) {
		this.languagesRepository = languagesRepository;
	}


	@Override
	public List<Languages> getAll() {
		return languagesRepository.getAll();
	}



	@Override
	public int add(Languages languages) throws Exception {
		if(languages.getName()== null) {
			throw new Exception("Programlama dili boş olamaz");
		}
		for (Languages x :diller) {
			if (x.getName()==languages.getName()) {
				throw new Exception("İsim tekrar edemez");
			}
		}
		return languagesRepository.add(languages);
	}


	@Override
	public int delete(int id) {
		return languagesRepository.delete(id);
	}


	@Override
	public int update(Languages languages) throws Exception {
		for (Languages x :diller) {
			if (x.getName()==languages.getName()) {
				throw new Exception("İsim tekrar edemez");
			}
		}
		return languagesRepository.update(languages);
	}


}
