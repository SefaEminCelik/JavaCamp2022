package kodlama.io.KodlamaIoDevs.webApi.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlama.io.KodlamaIoDevs.business.abstracts.LanguageTechnologyService;
import kodlama.io.KodlamaIoDevs.business.requests.LanguageTechnology.CreateLanguageTechnologiesRequest;
import kodlama.io.KodlamaIoDevs.business.requests.LanguageTechnology.DeleteLanguageTechnologiesRequest;
import kodlama.io.KodlamaIoDevs.business.requests.LanguageTechnology.UpdateLanguageTechnologiesRequest;
import kodlama.io.KodlamaIoDevs.business.responses.LanguageTechnology.GetAllLanguageTechnologiesResponse;
import kodlama.io.KodlamaIoDevs.business.responses.LanguageTechnology.GetByIdLanguageTechnologiesResponse;

@RestController
@RequestMapping("/api/tecnologies")
public class LanguageTechnologyController {

	private LanguageTechnologyService technologyService;

	@Autowired
	public LanguageTechnologyController(LanguageTechnologyService technologyService) {
		super();
		this.technologyService = technologyService;
	}
	
	@GetMapping("/getall")
	public List<GetAllLanguageTechnologiesResponse> getAll(){
		return technologyService.getAll();
	}
	
	@GetMapping("/getbyid")
	public GetByIdLanguageTechnologiesResponse getById(int id) {
		return technologyService.getById(id);
	}
	
	@PostMapping("/add")
	public void add (CreateLanguageTechnologiesRequest createLanguageRequest) throws Exception {
		this.technologyService.add(createLanguageRequest);
	}
	
	@DeleteMapping("/deletebyid")
	public void deleteById(DeleteLanguageTechnologiesRequest deleteLanguageTechnologiesRequest) {
		technologyService.delete(deleteLanguageTechnologiesRequest);
	}
	 
	@PutMapping("/update")
	public void update(int id,UpdateLanguageTechnologiesRequest languageTechnologiesRequest) throws Exception {
		technologyService.update(id, languageTechnologiesRequest);
	}
	
	@DeleteMapping("/deleteall")
	public void deleteAll() {
		technologyService.deleteAll();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
