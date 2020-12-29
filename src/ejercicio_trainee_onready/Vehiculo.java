package ejercicio_trainee_onready;

public abstract class Vehiculo implements Comparable<Vehiculo> {

	protected String marca;
	protected String modelo;
	protected Float precio;

	public Vehiculo(String marca, String modelo, Float precio) {
		this.marca = marca;
		this.modelo = modelo;
		this.precio = precio;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public Float getPrecio() {
		return precio;
	}

	public void setPrecio(Float precio) {
		this.precio = precio;
	}

	@Override
	public int compareTo(Vehiculo v) {

		if (v.getPrecio() < precio) {

			return -1;

		} else if (v.getPrecio() < precio) {

			return 0;

		} else {

			return 1;

		}

	}

}
