package ejercicio_trainee_onready;

public class Automovil extends Vehiculo {

	private Integer cantidadDePuertas;

	public Automovil(String marca, String modelo, Float precio, Integer cantidadDePuertas) {
		super(marca, modelo, precio);
		this.cantidadDePuertas = cantidadDePuertas;
	}

	public Integer getCantidadDePuertas() {
		return cantidadDePuertas;
	}

	public void setCantidadDePuertas(Integer cantidadDePuertas) {
		this.cantidadDePuertas = cantidadDePuertas;
	}

	@Override
	public String toString() {
		return "Marca: " + marca + " // Modelo: " + modelo + " // Puertas: " + cantidadDePuertas + " //Precio: $"
				+ precio;
	}

	public Vehiculo obtenerVehiculoMasCaro(Vehiculo[] vehiculos) {

		return vehiculos[0];

	}

}
