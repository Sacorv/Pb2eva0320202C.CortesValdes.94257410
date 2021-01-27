package ar.edu.unlam.pb220202c.eva03;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class TestAutoPista {
	
	@Test
	public void queSePuedaRegistrarTelepase () {
		Autopista autopista = new Autopista();
		Integer numeroTelepase = 2;
		Automovil auto = new Automovil("222", 130);
		assertTrue(autopista.registrarTelepase(numeroTelepase, auto));
	}

	@Test (expected = VehiculoNotFounException.class)
	public void queAlSalirDelAutopistaNoestaEncirculacionLanceUnaExcepcion() throws VehiculoNotFounException {
		Autopista autopista = new Autopista();
		Automovil auto = new Automovil("222", 130);
		Integer numeroTelepase = 2;
		autopista.registrarTelepase(numeroTelepase, auto);
		
		autopista.salirAutpista(auto);
	}
	@Test
	public void queVerifiqueQueSeObtengaUnaListaDeAutosInsfractoresOrdenadaPorPatente() throws VehiculoNotFounException{
		Autopista autopista = new Autopista();
		Automovil auto = new Automovil("222", 130);
		Automovil auto2 = new Automovil("111", 130);
		Automovil auto3 = new Automovil("102", 130);
		Automovil auto4 = new Automovil("212", 130);
		autopista.registrarTelepase(2, auto);
		autopista.registrarTelepase(9, auto2);
		autopista.registrarTelepase(6, auto3);
		autopista.registrarTelepase(1, auto4);
		autopista.ingresarAutopista(2);
		autopista.ingresarAutopista(9);
		autopista.ingresarAutopista(6);
		autopista.ingresarAutopista(1);
		auto2.incrmentarVelocidad(80);
		auto3.incrmentarVelocidad(100);
		auto4.incrmentarVelocidad(200);
		autopista.obtenerVehiculosConExcesosDeVelocidadOrdenadosPorPatente();
		Integer valorEsp = 3;
		Integer valorObt = autopista.obtenerVehiculosConExcesosDeVelocidadOrdenadosPorPatente().size();
		assertEquals(valorEsp, valorObt);
	}

	
	@Test (expected = VehiculoNotFounException.class)
	public void queAlQuererIngresarEnAutopistaSinTelepaseRegistradoLanceUnaExcepcion() throws VehiculoNotFounException {
		Autopista autopista = new Autopista();
		Automovil auto1 = new Automovil("222", 130);
		Automovil auto2 = new Automovil("111", 130);
		autopista.registrarTelepase(2, auto2);
		autopista.ingresarAutopista(2);
		autopista.ingresarAutopista(1);
		
	}
	
	@Test
	public void quePuedanIngresarEnAutopistaDistintosVehiculos() throws VehiculoNotFounException {
		Autopista autopista = new Autopista();
		Vehiculo auto1 = new Automovil("555", 90);
		Vehiculo camion1 = new Camion("666", 60, 4);
		Vehiculo camion2 = new Camion("666", 70, 4);
		Vehiculo camion3 = new Camion("666", 85, 4);
		Vehiculo auto2 = new Automovil("555", 130);
		Vehiculo auto3 = new Automovil("555", 100);
		autopista.registrarTelepase(2, auto1);
		autopista.registrarTelepase(9, camion1);
		autopista.registrarTelepase(6, camion2);
		autopista.registrarTelepase(1, camion3);
		autopista.registrarTelepase(15, auto2);
		autopista.registrarTelepase(22, auto3);
		autopista.ingresarAutopista(2);
		autopista.ingresarAutopista(9);
		autopista.ingresarAutopista(6);
		autopista.ingresarAutopista(1);
		autopista.ingresarAutopista(15);
		autopista.ingresarAutopista(22);
		
		Integer cantidadAutos = autopista.cantidadDeVehiculosENCirculacion();
		Integer cantidadEsperada = 6;
		
		assertEquals(cantidadEsperada, cantidadAutos);
	}
	
}
