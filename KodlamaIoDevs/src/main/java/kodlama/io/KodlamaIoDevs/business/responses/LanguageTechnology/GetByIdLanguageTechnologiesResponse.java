package kodlama.io.KodlamaIoDevs.business.responses.LanguageTechnology;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
@AllArgsConstructor
public class GetByIdLanguageTechnologiesResponse {
	
	private int techId;
	private String techName;
	
}
