package kodlama.io.KodlamaIoDevs.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlama.io.KodlamaIoDevs.entities.concretes.LanguageTechnology;

public interface LanguageTechnologyRepository extends JpaRepository<LanguageTechnology,Integer>{

}
