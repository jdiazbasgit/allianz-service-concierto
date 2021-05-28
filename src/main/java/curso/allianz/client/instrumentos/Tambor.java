package curso.allianz.client.instrumentos;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Tambor extends Instrumento {
	
	
	@Value("${allianz.concierto.sonido.tambor}")
	private String sonido;

	

	public String getSonido() {
		return sonido;
	}

	public void setSonido(String sonido) {
		this.sonido = sonido;
	}

}
