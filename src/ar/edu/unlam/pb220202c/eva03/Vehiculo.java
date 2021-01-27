package ar.edu.unlam.pb220202c.eva03;

public abstract class Vehiculo implements Imultable, Comparable<Vehiculo>{

	//Se debe crear contructeres getters y Setters y loos que crean convenientes
	private String Patente;
	private Integer VelocidadActual;
	private Integer limiteVelocidad;

	
	public Vehiculo(String patente, Integer velocidadActual) {
		this.Patente = patente;
		this.VelocidadActual = velocidadActual;
		this.limiteVelocidad = 0;
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
	public String toString() {
		return "Vehiculo [Patente=" + Patente + ", VelocidadActual=" + VelocidadActual + ", limiteVelocidad="
				+ limiteVelocidad + "]";
	}
	
	
	
	
	
	
}
