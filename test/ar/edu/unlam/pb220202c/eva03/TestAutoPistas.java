package ar.edu.unlam.pb220202c.eva03;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class TestAutoPistas {
	
	@Test
	public void queSePuedaRegistrarTelepase () {
		Autopista autopista = new Autopista();
		Integer numeroTelepase = 2;
		Vehiculo auto = new Automovil("222", 130, 130);
		assertTrue(autopista.registrarTelepase(numeroTelepase, auto));
	}

	public void queAlSalirDelAutopistaNoestaEncirculacionLanceUnaExcepcion() {
		
	}
	
	public void queVerifiqueQueSeObtengaUnaListaDeAutosInsfractoresOrdenadaPorPatente(){
		
	}

	public void generetestAEleccion1() {
		
	}
	
	public void generetestAEleccion2() {
		
	}
	
}
