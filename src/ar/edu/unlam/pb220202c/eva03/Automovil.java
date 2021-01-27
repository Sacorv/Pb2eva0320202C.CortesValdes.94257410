package ar.edu.unlam.pb220202c.eva03;

public class Automovil extends Vehiculo implements Imultable{
	
	public Automovil(String patente, Integer velocidadActual) {
		super(patente, velocidadActual);
		this.limiteDeVelocidadestablecido();
	}
	
	//Si es necesario Utilice herencia o implemente de Interfaces
//	Se debe crear contructeres getters y Setters y loos que crean convenientes
	
//el Limite de velociadad para autos es de 130km
//en caso que supere dicho limite el este sera multado

	
	public void limiteDeVelocidadestablecido() {
		this.setLimiteVelocidad(130);
	}

	@Override
	public Boolean enInfraccion() {
		Boolean estaEnInfraccion = false;
		if(this.getVelocidadActual()>this.getLimiteVelocidad()) {
			estaEnInfraccion = true;
		}
		return estaEnInfraccion;
	}

	@Override
	public int compareTo(Vehiculo vehiculo) {
		return this.getPatente().compareTo(vehiculo.getPatente());
	}



	
   
	
	
}
