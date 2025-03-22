import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        boolean condition=true;
        List<Vehiculo> lsVehculos = new ArrayList<>();
        do {
            System.out.println("""
                        1) Agregar Auto.
                        2) Agregar Motocicleta.
                        3) Mostrar la lista de Vehiculos.
                        4) Buscar modelo en especifico.
                        5) Calcular precio.
                        6) Salir del programa.""");
            Scanner entrada = new Scanner(System.in);
            int caso = entrada.nextInt();




            switch (caso){
                case 1->{
                    entrada.nextLine();
                    System.out.println("Ingrese la marca del auto:");
                    String marca = entrada.nextLine();
                    System.out.println("Ingrese el modelo del auto:");
                    String modelo = entrada.nextLine();
                    System.out.println("Ingrese el año del auto:");
                    String agno = entrada.nextLine();
                    System.out.println("Ingrese el precio base del auto:");
                    double precioBase = entrada.nextDouble();
                    System.out.println("Ingrese el número de puertas del auto:");
                    int numPuertas = entrada.nextInt();

                    lsVehculos.add(new Auto(agno, marca, modelo, precioBase, numPuertas));
                }
                case 2->{
                    entrada.nextLine();
                    System.out.println("Ingrese la marca de la motocicleta:");
                    String marca = entrada.nextLine();
                    System.out.println("Ingrese el modelo de la motocicleta");
                    String modelo= entrada.nextLine();
                    System.out.println("Ingrese el año de la motocicleta");
                    String agno = entrada.nextLine();
                    System.out.println("Ingrese el precio base de la motocicleta:");
                    double precioBase = entrada.nextDouble();
                    System.out.println("Ingrese el cilindraje de la motocicleta:");
                    int cilindraje = entrada.nextInt();

                    lsVehculos.add(new Motocicleta(agno,marca,modelo,precioBase,cilindraje));

                }
                case 3->{
                        /*for(Vehiculo i: lsVehculos){
                            System.out.println(i);
                        }*/
                    //System.out.println(lsVehculos);
                    if (lsVehculos.isEmpty()) {
                        System.out.println("No hay vehículos registrados.");
                    } else {
                        lsVehculos.forEach(System.out::println);
                    }
                }
                case 4 -> { //hacer el filtro con ayuda de el for each
                    entrada.nextLine();
                    System.out.println("Ingrese el modelo a buscar:");
                    String modeloBuscado = entrada.nextLine();
                    boolean encontrado = false;
                    for (Vehiculo vehiculo : lsVehculos) {
                        if (vehiculo.getModelo().equalsIgnoreCase(modeloBuscado)) {
                            System.out.println(vehiculo);
                            encontrado = true;
                        }
                    }
                    if (!encontrado) {
                        System.out.println("No se encontró el modelo.");
                    }
                }

                case 5 -> {
                    entrada.nextLine();
                    System.out.println("Ingrese el modelo del vehículo para calcular el precio final:");
                    String modeloBuscado = entrada.nextLine();
                    boolean encontrado = false;

                    for (Vehiculo vehiculo : lsVehculos) {
                        if (vehiculo.getModelo().equalsIgnoreCase(modeloBuscado)) {
                            System.out.println("Precio final: " + vehiculo.calcularPrecioFinal());
                            encontrado = true;
                            break;
                        }
                    }

                    if (!encontrado) {
                        System.out.println("No se encontró el modelo.");
                    }
                }

                case 6->{
                    System.out.println("Gracias por usar nuestro servicio!!!!");
                    condition=false;
                }default -> System.out.println("caso no encontrado");

            }
        }while (condition);
    }
}
