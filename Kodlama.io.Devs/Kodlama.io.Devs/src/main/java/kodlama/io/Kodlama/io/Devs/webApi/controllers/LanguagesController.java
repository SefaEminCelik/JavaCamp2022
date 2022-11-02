package kodlama.io.Kodlama.io.Devs.webApi.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlama.io.Kodlama.io.Devs.business.abstracts.LanguagesService;
import kodlama.io.Kodlama.io.Devs.entities.concretes.Languages;

@RestController
@RequestMapping ("/api/languages")
public class LanguagesController {

	private LanguagesService languagesService;

	
	@Autowired
	public LanguagesController(LanguagesService languagesService) {
		this.languagesService = languagesService;
	}
	
	@GetMapping ("/getall")
	public List<Languages> getAll(){
		return languagesService.getAll();
	}
	
	@PostMapping("/add")
	public void add(Languages languages) throws Exception {
		languagesService.add(languages);
	}
	
	@DeleteMapping("/delete")
	public void delete(int id) {
		languagesService.delete(id);
	
	}
	
	@PutMapping("/update")
	public void update(Languages languages) throws Exception {
		languagesService.update(languages);
	}
}
