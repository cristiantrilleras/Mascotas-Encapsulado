import javax.swing.JOptionPane;

public class Mascota {
    private String nombre;
    private String especie;
    private int edad;
    private String identificacion;

    public Mascota() {
        nombre = "max";
        especie = "perro";
        edad = 1;
        identificacion = "";
    }

    public Mascota(String identificacion, String nombre, String especie, int edad) {
        this.nombre = nombre;
        this.especie = especie;
        this.edad = edad;
        this.identificacion = identificacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(String identificacion) {
        this.identificacion = identificacion;
    }

    public void ingresarDatos() {
        nombre = JOptionPane.showInputDialog("Ingrese el nombre de la mascota");
        especie = JOptionPane.showInputDialog("Ingrese la especie de la mascota");
        edad = Integer.parseInt(JOptionPane.showInputDialog("Ingresa la edad de la mascota"));
        identificacion = JOptionPane.showInputDialog("Ingrese la identificación de la mascota");
    }

    public void mostrarInformacion() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Especie: " + especie);
        System.out.println("Edad: " + edad + " años");
    }

    public void hacerSonido() {
        if (especie.equalsIgnoreCase("perro")) {
            System.out.println("¡Guau guau!");
        } else if (especie.equalsIgnoreCase("gato")) {
            System.out.println("¡Miau miau!");
        } else {
            System.out.println("La mascota no hace sonidos conocidos.");
        }
    }

    public void comer() {
        if (especie.equalsIgnoreCase("perro")) {
            System.out.println("el perro come croquetas");
        } else if (especie.equalsIgnoreCase("gato")) {
            System.out.println("el gato come atun");
        } else {
            System.out.println("la mascota no come.");
        }
    }

    public void dormir() {
        System.out.println("la mascota duerme");
    }

    public void incrementarEdad() {
        edad++;
        System.out.println("La mascota ha cumplido " + edad + " años.");
        System.out.println("----------------------------");
    }

    public void cambiarNombre(String nuevoNombre) {
        nombre = nuevoNombre;
        System.out.println("El nombre de la mascota ha sido cambiado a: " + nombre);
    }
}
