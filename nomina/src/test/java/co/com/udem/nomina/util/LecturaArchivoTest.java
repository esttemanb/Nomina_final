package co.com.udem.nomina.util;


import static org.junit.Assert.assertNotNull;
import java.io.InputStream;


import org.junit.Test;



public class LecturaArchivoTest {

	@Test
	public void chekeoArchivo() {		
		 InputStream archivoTxt = this.getClass().getResourceAsStream("/nominaEmpleados.txt");
		 assertNotNull(archivoTxt);
	}
	
	@Test
	public void leerArchivo() {		
		 String mensaje = LecturaArchivo.leerArchivo();
		 assertNotNull(mensaje);
	}
	
//////////////////////////////////////////////////////////////////////////	
	
	
	
	
	
}
