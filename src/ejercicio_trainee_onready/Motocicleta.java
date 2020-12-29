package ejercicio_trainee_onready;

public class Motocicleta extends Vehiculo {

	private Integer cilindrada;

	public Motocicleta(String marca, String modelo, Float precio, Integer cilindrada) {
		super(marca, modelo, precio);
		this.cilindrada = cilindrada;
	}

	public Integer getCilindrada() {
		return cilindrada;
	}

	public void setCilindrada(Integer cilindrada) {
		this.cilindrada = cilindrada;
	}

	@Override
	public String toString() {
		return "Marca: " + marca + " // Modelo: " + modelo + " // Cilindrada: " + cilindrada + "cc // Precio: $"
				+ precio;
	}

}
