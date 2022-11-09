package kodlama.io.KodlamaIoDevs.business.abstracts;

import java.util.List;

import kodlama.io.KodlamaIoDevs.business.requests.Language.CreateLanguageRequest;
import kodlama.io.KodlamaIoDevs.business.requests.Language.DeleteLanguageRequest;
import kodlama.io.KodlamaIoDevs.business.requests.Language.UpdateLanguageRequest;
import kodlama.io.KodlamaIoDevs.business.responses.Language.GetAllLanguagesResponse;
import kodlama.io.KodlamaIoDevs.business.responses.Language.GetByIdLanguageResponse;

public interface LanguageService {
	
	
	List<GetAllLanguagesResponse> getAll();
	GetByIdLanguageResponse getById(int id);
	
	
	
	void add (CreateLanguageRequest createLanguageRequest) throws Exception;
	void update (int id,UpdateLanguageRequest updateLanguageRequest) throws Exception;
	void delete (DeleteLanguageRequest deleteLanguageRequest);
	
	
	
	void deleteAll();
}
