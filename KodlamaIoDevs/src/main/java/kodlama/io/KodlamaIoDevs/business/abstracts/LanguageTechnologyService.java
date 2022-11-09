package kodlama.io.KodlamaIoDevs.business.abstracts;

import java.util.List;

import kodlama.io.KodlamaIoDevs.business.requests.LanguageTechnology.CreateLanguageTechnologiesRequest;
import kodlama.io.KodlamaIoDevs.business.requests.LanguageTechnology.DeleteLanguageTechnologiesRequest;
import kodlama.io.KodlamaIoDevs.business.requests.LanguageTechnology.UpdateLanguageTechnologiesRequest;
import kodlama.io.KodlamaIoDevs.business.responses.LanguageTechnology.GetAllLanguageTechnologiesResponse;
import kodlama.io.KodlamaIoDevs.business.responses.LanguageTechnology.GetByIdLanguageTechnologiesResponse;

public interface LanguageTechnologyService {
	
	List<GetAllLanguageTechnologiesResponse> getAll();
	GetByIdLanguageTechnologiesResponse getById(int id);
	
	void add(CreateLanguageTechnologiesRequest createLanguageTechnologiesRequest) throws Exception;
	void update(int id,UpdateLanguageTechnologiesRequest updateLanguageTechnologiesRequest) throws Exception;
	void delete(DeleteLanguageTechnologiesRequest deleteLanguageTechnologiesRequest);
	
	void deleteAll();
	
	
}
