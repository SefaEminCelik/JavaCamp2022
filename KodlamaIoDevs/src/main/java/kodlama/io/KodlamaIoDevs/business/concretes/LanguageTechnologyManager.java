package kodlama.io.KodlamaIoDevs.business.concretes;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlama.io.KodlamaIoDevs.business.abstracts.LanguageTechnologyService;
import kodlama.io.KodlamaIoDevs.business.requests.LanguageTechnology.CreateLanguageTechnologiesRequest;
import kodlama.io.KodlamaIoDevs.business.requests.LanguageTechnology.DeleteLanguageTechnologiesRequest;
import kodlama.io.KodlamaIoDevs.business.requests.LanguageTechnology.UpdateLanguageTechnologiesRequest;
import kodlama.io.KodlamaIoDevs.business.responses.LanguageTechnology.GetAllLanguageTechnologiesResponse;
import kodlama.io.KodlamaIoDevs.business.responses.LanguageTechnology.GetByIdLanguageTechnologiesResponse;
import kodlama.io.KodlamaIoDevs.dataAccess.abstracts.LanguageRepository;
import kodlama.io.KodlamaIoDevs.dataAccess.abstracts.LanguageTechnologyRepository;
import kodlama.io.KodlamaIoDevs.entities.concretes.LanguageTechnology;

@Service
public class LanguageTechnologyManager implements LanguageTechnologyService {
	
 private LanguageTechnologyRepository languageTechnologyRepository;
 private LanguageRepository languageRepository;
 
 @Autowired
public LanguageTechnologyManager(LanguageTechnologyRepository languageTechnologyRepository,
		LanguageRepository languageRepository) {
	this.languageTechnologyRepository = languageTechnologyRepository;
	this.languageRepository = languageRepository;
}


@Override
public List<GetAllLanguageTechnologiesResponse> getAll() {
	List<LanguageTechnology> technologies = languageTechnologyRepository.findAll();
	List<GetAllLanguageTechnologiesResponse> languageTechnologiesResponses = new ArrayList<GetAllLanguageTechnologiesResponse>();
	for (LanguageTechnology lang : technologies) {
		GetAllLanguageTechnologiesResponse responseItem = new GetAllLanguageTechnologiesResponse();
		responseItem.setTechName(lang.getTechName());
		responseItem.setTechId(lang.getTechId());
		
		languageTechnologiesResponses.add(responseItem);
	}
	return languageTechnologiesResponses;
}

@Override
public GetByIdLanguageTechnologiesResponse getById(int id) {
	LanguageTechnology languageTechnology = languageTechnologyRepository.findById(id).get();
	GetByIdLanguageTechnologiesResponse responseItem = new GetByIdLanguageTechnologiesResponse();
	responseItem.setTechName(languageTechnology.getTechName());
	return responseItem;
}

@Override
public void add(CreateLanguageTechnologiesRequest createLanguageTechnologiesRequest) throws Exception {
	LanguageTechnology languageTechnology = new LanguageTechnology();
	languageTechnology.setTechName(createLanguageTechnologiesRequest.getTechName());
	
	if(languageTechnology.getTechName().isEmpty()) {
		throw new Exception("Program Teknolojileri Adı Boş Olamaz");}
	for (GetAllLanguageTechnologiesResponse x : getAll()) {
		if(x.getTechName().equals(languageTechnology.getTechName())) {
			throw new Exception("İsim Tekrar Edemez");
		}
	}
	languageTechnologyRepository.save(languageTechnology);
}

@Override
public void update(int id, UpdateLanguageTechnologiesRequest updateLanguageTechnologiesRequest) throws Exception {
	for (GetAllLanguageTechnologiesResponse x : getAll()) {
		if(x.getTechName().equals(updateLanguageTechnologiesRequest.getTechName())) {
			throw new Exception("İsim Tekrar Edemez");
		}
	}
	LanguageTechnology languageTechnology = languageTechnologyRepository.findById(id).get();
	languageTechnology.setTechName(updateLanguageTechnologiesRequest.getTechName());
	
	languageTechnologyRepository.save(languageTechnology);
	
}

@Override
public void delete(DeleteLanguageTechnologiesRequest deleteLanguageTechnologiesRequest) {
	languageTechnologyRepository.deleteById(deleteLanguageTechnologiesRequest.getTechId());
	
}

@Override
public void deleteAll() {
	languageTechnologyRepository.deleteAll();
	
}
 
 
 
}
