package kodlama.io.KodlamaIoDevs.webApi.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlama.io.KodlamaIoDevs.business.abstracts.LanguageService;
import kodlama.io.KodlamaIoDevs.business.requests.Language.CreateLanguageRequest;
import kodlama.io.KodlamaIoDevs.business.requests.Language.DeleteLanguageRequest;
import kodlama.io.KodlamaIoDevs.business.requests.Language.UpdateLanguageRequest;
import kodlama.io.KodlamaIoDevs.business.responses.Language.GetAllLanguagesResponse;
import kodlama.io.KodlamaIoDevs.business.responses.Language.GetByIdLanguageResponse;

@RestController
@RequestMapping("/api/languages")
public class LangageController {

	private LanguageService languageService;

	public LangageController(LanguageService languageService) {
		this.languageService = languageService;
	}
	
	@GetMapping("/getall")
	public List<GetAllLanguagesResponse> getAll(){
		return languageService.getAll();
	}
	
	@GetMapping("/getbyid")
	public GetByIdLanguageResponse getById(int id) {
		return languageService.getById(id);
	}
	
	@PostMapping("/add")
	public void add (CreateLanguageRequest createLanguageRequest) throws Exception {
		this.languageService.add(createLanguageRequest);
	}
	
	@DeleteMapping("/deletebyid")
	public void deleteById(DeleteLanguageRequest deleteLanguageRequest) {
		languageService.delete(deleteLanguageRequest);
	}
	 
	@PutMapping("/update")
	public void update(int id,UpdateLanguageRequest updateLanguageRequest) throws Exception {
		languageService.update(id, updateLanguageRequest);
	}
	
	@DeleteMapping("/deleteall")
	public void deleteAll() {
		languageService.deleteAll();
	}
}
