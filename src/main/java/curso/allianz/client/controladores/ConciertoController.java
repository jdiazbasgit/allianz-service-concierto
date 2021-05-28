package curso.allianz.client.controladores;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import curso.allianz.client.musicos.HombreOrquesta;
import curso.allianz.client.musicos.Solista;
import lombok.Data;

@RestController
@Data
public class ConciertoController {
	@Autowired
	private Solista solista;
	
	@Autowired
	private HombreOrquesta hombreOrquesta;
	
	@GetMapping("/solista")
	public Solista solista() {
		return getSolista();
		
	}
	
	
	@GetMapping("/hombreOrquesta")
	public HombreOrquesta hombreOrquesta() {
		return getHombreOrquesta();
		
	}

}
