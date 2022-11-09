package kodlama.io.KodlamaIoDevs.entities.concretes;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Table(name="languages")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity // Sen bir veri tabanı varlığısın veritabanında karşılığın var
public class Language {

	@Column(name="name")
	private String name;
	
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	
	@JsonIgnore
	@OneToMany (mappedBy = "language", fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	private List<LanguageTechnology> technologies;
	
}
