package espoch.edu.ec.ClinicaVeterinaria;

import java.util.Scanner;

public class ConsultaVeterinaria {
    Scanner entrada = new Scanner(System.in);
    String fechaConsulta;
    String motivoConsulta;
    // String nombreMascota;



    

    public double registrarPesoMascota() {
        System.out.println("Ingrese el peso de la mascota: ");
        
        double[] pesosDiarios = new double[5];

        for (int i = 0; i < pesosDiarios.length; i++) {
            System.out.print("Peso del día " + (i + 1) + ": ");
            pesosDiarios[i] = entrada.nextDouble();
        }

        double suma = 0;
        for (int i = 0; i < pesosDiarios.length; i++) {
            suma += pesosDiarios[i];
        }

        return suma / pesosDiarios.length;

    }

    public void mostrarInformacionPesoMascota() {
        System.out.println("El peso promedio de la mascota es: " + registrarPesoMascota());
    }

    
}
