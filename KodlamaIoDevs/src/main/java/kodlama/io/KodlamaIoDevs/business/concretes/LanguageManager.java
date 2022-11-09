package kodlama.io.KodlamaIoDevs.business.concretes;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlama.io.KodlamaIoDevs.business.abstracts.LanguageService;
import kodlama.io.KodlamaIoDevs.business.requests.Language.CreateLanguageRequest;
import kodlama.io.KodlamaIoDevs.business.requests.Language.DeleteLanguageRequest;
import kodlama.io.KodlamaIoDevs.business.requests.Language.UpdateLanguageRequest;
import kodlama.io.KodlamaIoDevs.business.responses.Language.GetAllLanguagesResponse;
import kodlama.io.KodlamaIoDevs.business.responses.Language.GetByIdLanguageResponse;
import kodlama.io.KodlamaIoDevs.dataAccess.abstracts.LanguageRepository;
import kodlama.io.KodlamaIoDevs.entities.concretes.Language;


@Service
public class LanguageManager implements LanguageService {
	
	
	private LanguageRepository languageRepository;
	
	@Autowired
	public LanguageManager(LanguageRepository languageRepository) {
		this.languageRepository = languageRepository;
	}

	@Override
	public List<GetAllLanguagesResponse> getAll() {
		List<Language> languages = languageRepository.findAll();
		List<GetAllLanguagesResponse> languagesResponse = new ArrayList<GetAllLanguagesResponse>();
		for(Language langu: languages) {
			GetAllLanguagesResponse responseItem = new GetAllLanguagesResponse();
			responseItem.setId(langu.getId());
			responseItem.setName(langu.getName());
			
			languagesResponse.add(responseItem);
			
		}
		return languagesResponse;
	}

	@Override
	public GetByIdLanguageResponse getById(int id) {
	 Language language = languageRepository.findById(id).get();
	 GetByIdLanguageResponse responseItem = new GetByIdLanguageResponse();
	 responseItem.setName(language.getName());
	 return responseItem;
	}
	
	
	
	
	
	@Override
	public void add(CreateLanguageRequest createLanguageRequest) throws Exception {
		Language language = new Language();
		language.setName(createLanguageRequest.getName());
		
		if (language.getName().isEmpty()) {
			throw new Exception("Programlama Dili Boş olamaz");}
		for (GetAllLanguagesResponse x :getAll()) {
			if (x.getName().equals(language.getName())) {
				throw new Exception("İsim tekrar edemez");
			}
		}
		languageRepository.save(language);
	}

	@Override
	public void delete(DeleteLanguageRequest deleteLanguageRequest) {
		languageRepository.deleteById(deleteLanguageRequest.getId());
	}

	@Override
	public void update(int id,UpdateLanguageRequest updateLanguageRequest) throws Exception {
		for (GetAllLanguagesResponse x :getAll()) {
			if (x.getName().equals(updateLanguageRequest.getName())) {
				throw new Exception("İsim tekrar edemez");
			}
		}
		Language language = languageRepository.findById(id).get();
		language.setName(updateLanguageRequest.getName());
		languageRepository.save(language);
		
	}

	

	@Override
	public void deleteAll() {
		languageRepository.deleteAll();
	}

}
