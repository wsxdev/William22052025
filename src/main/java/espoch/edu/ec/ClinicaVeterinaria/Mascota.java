package espoch.edu.ec.ClinicaVeterinaria;

import java.util.Scanner;
public class Mascota {
    Scanner entrada = new Scanner(System.in);
    String nombre;
    int edad;
    String TipoMascota;
    

    public Mascota(String nombre, int edad, String TipoMascota) {
        this.nombre = nombre;
        this.edad = edad;
        this.TipoMascota = TipoMascota;
    }

    public Boolean permitirMostrarEdadMascota(boolean mostrarEdad) {
        return mostrarEdad;
    }

    public int actualizarEdadMascota(int edad) {
        this.edad = edad;
        return this.edad;
    }
}
