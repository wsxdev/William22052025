package espoch.edu.ec.ClinicaVeterinaria;
 
import java.util.Scanner;

public class ClinicaVeterinaria {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        ConsultaVeterinaria objConsultaVeterinaria = new ConsultaVeterinaria();

        System.out.println("| Bienvenido a la clinica veterinaria |");
        System.out.println("Por favor, ingrese los datos de su mascota.");
        System.out.println("Ingrese el nombre de la mascota: ");
        String nombreMascota;
        nombreMascota = entrada.nextLine();
        System.out.println("Ingrese la edad de la mascota: ");
        int edadMascota;
        edadMascota = entrada.nextInt();
        System.out.println("Ingrese el tipo de mascota (Perro, gato, ave): ");
        String tipoMascota;
        tipoMascota = entrada.next();
        
        
        
        Mascota objMascota = new Mascota(nombreMascota, edadMascota, tipoMascota);
        objConsultaVeterinaria.mostrarInformacionPesoMascota();
    }
}
