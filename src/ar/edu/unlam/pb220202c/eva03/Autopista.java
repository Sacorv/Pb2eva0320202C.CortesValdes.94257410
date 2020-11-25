package ar.edu.unlam.pb220202c.eva03;

import java.util.HashMap;
import java.util.HashSet;
import java.util.TreeSet;

public class Autopista {
	//Si es necesario Utilice herencia o implemente de Interfaces
	//Se debe crear contructeres getters y Setters y los atributos o metodos que crean convenientes
	private HashMap <Integer,Vehiculo> telepase;
	private HashSet <Vehiculo> vehiculosEnCirculacion;
	
	
	public Autopista() {
		this.telepase = new HashMap<Integer, Vehiculo>();
		this.vehiculosEnCirculacion = new HashSet<Vehiculo>();
	}
	
	
	public Boolean registrarTelepase (Integer numeroTelpase, Vehiculo vehiculo) {
		Boolean registroExitoso = false;
		
		if(this.telepase.put(numeroTelpase, vehiculo)!=null) {
			registroExitoso = true;
		}
		return registroExitoso;
	}
	
	
	public Boolean ingresarAutopista (Integer numeroTelepase) throws VehiculoNotFounException {
		//si el telepase no esta registrado lanza una Exceptios del tipo VehiculoNotFounException
	   // y no permite ingresar al autopista
		Boolean ingresoExitoso = false;
		Vehiculo vehiculo = this.telepase.get(numeroTelepase);
		if(vehiculo == null) {
			throw new VehiculoNotFounException("El numero de Telepase no existe");
		}
		else {
			this.vehiculosEnCirculacion.add(vehiculo);
		}
		return ingresoExitoso;
	}
	
	public void salirAutpista (Vehiculo vehiculo) throws VehiculoNotFounException {
		//lanza Una exception VehiculoNotFounException si no esta en circulacion
		Boolean estaEnCirculacion = this.telepase.containsValue(vehiculo);
		
		if(estaEnCirculacion == false) {
			throw new VehiculoNotFounException("El vehiculo no esta en circulacion");
		}
		else {
			this.vehiculosEnCirculacion.remove(vehiculo);
		}
	
	}
	
	public TreeSet<Vehiculo> obtenerVehiculosConExcesosDeVelocidadOrdenadosPorPatente(){
		TreeSet<Vehiculo> vehiculosOrdenados = new TreeSet<Vehiculo>();
		
		for(Imultable vehiculo : this.vehiculosEnCirculacion) {
			if(vehiculo.enInfraccion()) {
				vehiculosOrdenados.add((Vehiculo) vehiculo);
			}
		}
		return vehiculosOrdenados;
    }

	public Integer cantidadDeVehiculosENCirculacion() {
	
		return this.vehiculosEnCirculacion.size();
	}
	
	
	
	
	
	
	
	
}
