package kodlama.io.KodlamaIoDevs.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlama.io.KodlamaIoDevs.entities.concretes.Language;

public interface LanguageRepository extends JpaRepository<Language,Integer>{


	
	
}
