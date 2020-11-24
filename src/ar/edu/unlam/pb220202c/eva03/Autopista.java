package ar.edu.unlam.pb220202c.eva03;

import java.util.HashMap;
import java.util.HashSet;
import java.util.TreeSet;

public class Autopista {
	//Si es necesario Utilice herencia o implemente de Interfaces
	//Se debe crear contructeres getters y Setters y los atributos o metodos que crean convenientes
	private HashMap <Integer,Vehiculo> telepase;
	private HashSet <Vehiculo> vehiculosEnCirculacion;
	
	public Boolean registrarTelepase (Integer numeroTelpase, Vehiculo vehiculo) {
		
		return null;
	}
	public Boolean ingresarAutopista (Integer numeroTelepase) {
		//si el telepase no esta registrado lanza una Exceptios del tipo VehiculoNotFounException
	   // y no permite ingresar al autopista	
	
		
		return null;
	}
	
	public void salirAutpista (Vehiculo vehiculo) {
		//lanza Una exception VehiculoNotFounException si no esta en circulacion
		
	}
	
	public TreeSet<Vehiculo> obtenerVehiculosConExcesosDeVelocidadOrdenadosPorPatente(){
	
	return null;
    }

	public Integer cantidadDeVehiculosENCirculacion() {
	
		return 0;
}
	}
