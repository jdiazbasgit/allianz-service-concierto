package curso.allianz.client.musicos;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import curso.allianz.client.anotaciones.Vigilante;
import curso.allianz.client.excepciones.InstrumentoRotoException;
import curso.allianz.client.instrumentos.Instrumento;
import lombok.Data;

@Component
@Data
public class HombreOrquesta extends Musico {
	
	@Autowired
	@Qualifier("tocameAMi")
	private List<Instrumento> instrumentos;

	@Override
	@Vigilante
	public void tocar() throws InstrumentoRotoException {
		for (Instrumento instrumento : instrumentos) {
			System.out.println(instrumento.sonar());
		}
	}
}
