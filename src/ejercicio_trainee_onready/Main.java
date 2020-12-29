package ejercicio_trainee_onready;

import java.util.ArrayList;
import java.util.Collections;

public class Main {

	public static void listarVehiculos(ArrayList<Vehiculo> vehiculos) {

		try {

			for (Vehiculo vehiculo : vehiculos) {
				System.out.println(vehiculo.toString());
			}

		} catch (Exception e) {

		}

	}

	public static Vehiculo obtenerVehiculoMasCaro(ArrayList<Vehiculo> vehiculos) {

		Vehiculo vehiculoMasCaro = vehiculos.get(0);

		for (Vehiculo vehiculo : vehiculos) {

			if (vehiculo.getPrecio() > vehiculoMasCaro.getPrecio()) {
				vehiculoMasCaro = vehiculo;
			}

		}

		return vehiculoMasCaro;

	}

	public static void mostrarPorConsolaVehiculoMasCaro(Vehiculo vehiculoMasCaro) {

		try {

			System.out.println("Vehículo más caro: " + vehiculoMasCaro.getMarca() + " " + vehiculoMasCaro.getModelo());

		} catch (Exception e) {

			System.out.println("Hubo un error al mostrar el vehículo más caro");

		}

	}

	public static Vehiculo obtenerVehiculoMasBarato(ArrayList<Vehiculo> vehiculos) {

		Vehiculo vehiculoMasBarato = vehiculos.get(0);

		for (Vehiculo vehiculo : vehiculos) {

			if (vehiculo.getPrecio() < vehiculoMasBarato.getPrecio()) {
				vehiculoMasBarato = vehiculo;
			}

		}

		return vehiculoMasBarato;

	}

	public static void mostrarPorConsolaVehiculoMasBarato(Vehiculo vehiculoMasBarato) {

		try {

			System.out.println(
					"Vehículo más barato: " + vehiculoMasBarato.getMarca() + " " + vehiculoMasBarato.getModelo());

		} catch (Exception e) {

			System.out.println("Hubo un error al mostrar el vehículo más barato");

		}

	}

	public static Vehiculo obtenerVehiculoQueContieneEnSuModeloLaLetraY(ArrayList<Vehiculo> vehiculos) {

		Vehiculo vehiculoQueContieneLetraYEnElModelo = null;

		for (Vehiculo vehiculo : vehiculos) {

			if (vehiculo.getModelo().toLowerCase().contains("y")) {
				vehiculoQueContieneLetraYEnElModelo = vehiculo;
			}

		}

		return vehiculoQueContieneLetraYEnElModelo;

	}

	public static void mostrarPorConsolaVehiculoQueContieneEnSuModeloLaLetraY(
			Vehiculo vehiculoQueContieneLetraYEnElModelo) {

		try {

			if (vehiculoQueContieneLetraYEnElModelo != null) {
				System.out.println("Vehículo que contiene en el modelo la letra 'Y': "
						+ vehiculoQueContieneLetraYEnElModelo.getMarca() + " "
						+ vehiculoQueContieneLetraYEnElModelo.getModelo() + " $"
						+ vehiculoQueContieneLetraYEnElModelo.getPrecio());
			} else {
				System.out.println("No existe algún vehículo cuyo modelo contenga la letra 'Y'");
			}

		} catch (Exception e) {

			System.out.println("Hubo un error al mostrar el vehículo cuyo modelo contenga la letra 'Y'");

		}

	}

	public static void listarVehiculosOrdenadosPorPrecioDeMayorAMenor(ArrayList<Vehiculo> vehiculos) {

		try {

			Collections.sort(vehiculos);

			System.out.println("Vehículos ordenados por precio de mayor a menor:\n");

			for (Vehiculo vehiculo : vehiculos) {
				System.out.println(vehiculo.getMarca() + " " + vehiculo.getModelo());

			}

		} catch (Exception e) {

			System.out
					.println("Hubo un error al ordenar los vehículos en orden descendente por sus respectivos precios");

		}

	}

	public static void main(String[] args) {

		Motocicleta honda = new Motocicleta("Honda", "Titan", 60000F, 125);
		Automovil peugeot208 = new Automovil("Peugeot", "208", 250000F, 5);
		Motocicleta yamaha = new Motocicleta("Yamaha", "YBR", 80500.50F, 160);
		Automovil peugeot206 = new Automovil("Peugeot", "206", 200000F, 4);

		ArrayList<Vehiculo> vehiculos = new ArrayList<Vehiculo>();
		vehiculos.add(peugeot206);
		vehiculos.add(honda);
		vehiculos.add(peugeot208);
		vehiculos.add(yamaha);

		listarVehiculos(vehiculos);

		System.out.println("\n=============================\n");

		Vehiculo vehiculoMasCaro = obtenerVehiculoMasCaro(vehiculos);
		mostrarPorConsolaVehiculoMasCaro(vehiculoMasCaro);

		Vehiculo vehiculoMasBarato = obtenerVehiculoMasBarato(vehiculos);
		mostrarPorConsolaVehiculoMasBarato(vehiculoMasBarato);

		Vehiculo vehiculoQueContieneEnSuModeloLaLetraY = obtenerVehiculoQueContieneEnSuModeloLaLetraY(vehiculos);
		mostrarPorConsolaVehiculoQueContieneEnSuModeloLaLetraY(vehiculoQueContieneEnSuModeloLaLetraY);

		System.out.println("\n=============================\n");

		listarVehiculosOrdenadosPorPrecioDeMayorAMenor(vehiculos);

	}

}
