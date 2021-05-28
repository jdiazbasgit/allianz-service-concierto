package curso.allianz.client.musicos;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import curso.allianz.client.anotaciones.Vigilante;
import curso.allianz.client.excepciones.InstrumentoRotoException;
import curso.allianz.client.instrumentos.Instrumento;
import lombok.Data;

@Component
@Data
public class Solista extends Musico{
	
	
	@Autowired
	@Qualifier("tambor")
	private Instrumento instrumento;

	@Override
	@Vigilante
	public void tocar() throws InstrumentoRotoException {
		System.out.println(instrumento.sonar());
		
	}

	

	

}
