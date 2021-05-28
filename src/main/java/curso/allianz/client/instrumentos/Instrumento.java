package curso.allianz.client.instrumentos;

import java.io.Serializable;

import curso.allianz.client.excepciones.InstrumentoRotoException;

public class Instrumento implements Serializable {

	
	private String sonido;
	
	
	public String sonar() throws InstrumentoRotoException {
		// TODO Auto-generated method stub
		
		if(getSonido().equals("nada"))
			throw new InstrumentoRotoException();
		return  getSonido();
	}
	public String getSonido() {
		return sonido;
	}
	public void setSonido(String sonido) {
		this.sonido = sonido;
	}

}
