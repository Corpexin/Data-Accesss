package Rep;

import java.io.Serializable;

public class Eje08Persona implements Serializable{

	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String nombre;
	private String telefono;
	private String direccion;
	private int codPostal;
	private boolean deboDinero;
	private float cantidadDeber;
	
	
	public Eje08Persona(String nombre, String telefono, String direccion, int codPostal, boolean deboDinero, float cantidadDeber) {
		this.nombre = nombre;
		this.telefono = telefono;
		this.direccion = direccion;
		this.codPostal = codPostal;
		this.deboDinero = deboDinero;
		this.cantidadDeber = cantidadDeber;
	}

	public String toString(){
		return String.format("\n-Nombre: %s\n-Telefono: %s\n-Direccion: %s\n-Codigo Postal: %d\n-Debe Dinero? %s\n-Cantidad: %.2f", nombre, telefono, direccion, codPostal, deboDinero?"Si":"No", cantidadDeber);
	}

	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getTelefono() {
		return telefono;
	}


	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}


	public String getDireccion() {
		return direccion;
	}


	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}


	public int getCodPostal() {
		return codPostal;
	}


	public void setCodPostal(int codPostal) {
		this.codPostal = codPostal;
	}


	public boolean isDeboDinero() {
		return deboDinero;
	}


	public void setDeboDinero(boolean deboDinero) {
		this.deboDinero = deboDinero;
	}


	public float getCantidadDeber() {
		return cantidadDeber;
	}


	public void setCantidadDeber(float cantidadDeber) {
		this.cantidadDeber = cantidadDeber;
	}


	public static long getSerialversionuid() {
		return serialVersionUID;
	}
}
