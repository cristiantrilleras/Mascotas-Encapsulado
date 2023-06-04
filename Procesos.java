import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Procesos {

	public void iniciar() {
		ArrayList<Mascota> mascotas = new ArrayList<>();

		int cantidadMascotas = Integer.parseInt(JOptionPane.showInputDialog("Ingresa la cantidad de mascotas a crear"));
		; // Cambiar la cantidad de mascotas según sea necesario

		for (int i = 0; i < cantidadMascotas; i++) {
			Mascota mascota = crearMascota();
			mascotas.add(mascota);
		}

		for (Mascota mascota : mascotas) {
			mascota.ingresarDatos();
			mascota.mostrarInformacion();
			mascota.hacerSonido();
			mascota.incrementarEdad();
		}
	}

	private static Mascota crearMascota() {
		String nombre = "Mascota" + (int) (Math.random() * 100);
		String especie = "Perro";
		int edad = (int) (Math.random() * 10);
		String identificacion = "ID" + (int) (Math.random() * 1000);

		return new Mascota(identificacion, nombre, especie, edad);

	}

}
