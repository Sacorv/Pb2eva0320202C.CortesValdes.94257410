package ar.edu.unlam.pb220202c.eva03;

public abstract class Vehiculo implements Imultable, Comparable{

	//Se debe crear contructeres getters y Setters y loos que crean convenientes
	private String Patente;
	private Integer VelocidadActual;
	private Integer limiteVelocidad;

	
	public Vehiculo(String patente, Integer velocidadActual, Integer limiteVelocidad) {
		this.Patente = patente;
		this.VelocidadActual = velocidadActual;
		this.limiteVelocidad = limiteVelocidad;
	}



	public void incrmentarVelocidad(Integer Velocidad) {
		this.VelocidadActual+= Velocidad;
	}



	public String getPatente() {
		return Patente;
	}



	public void setPatente(String patente) {
		Patente = patente;
	}



	public Integer getVelocidadActual() {
		return VelocidadActual;
	}



	public void setVelocidadActual(Integer velocidadActual) {
		VelocidadActual = velocidadActual;
	}



	public Integer getLimiteVelocidad() {
		return limiteVelocidad;
	}



	public void setLimiteVelocidad(Integer limiteVelocidad) {
		this.limiteVelocidad = limiteVelocidad;
	}



	@Override
	public int compareTo(Object o) {
		return this.Patente.compareTo(Patente);
	}
	
	
	
	
	
	
}
