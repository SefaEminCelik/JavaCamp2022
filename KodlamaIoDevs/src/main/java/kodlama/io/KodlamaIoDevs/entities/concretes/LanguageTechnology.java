package kodlama.io.KodlamaIoDevs.entities.concretes;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="languagesTechnology")
public class LanguageTechnology {

	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	@Column(name="techId")
	private int techId;
	
	
	@Column(name="techName")
	private String techName;
	
	@ManyToOne (fetch = FetchType.EAGER,cascade = CascadeType.ALL)
	@JoinColumn(name="language")
	@JsonIgnore
	private Language language;
	
}
