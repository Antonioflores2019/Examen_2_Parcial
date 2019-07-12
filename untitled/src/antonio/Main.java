package antonio;

import java.util.ArrayList;
import java.util.Scanner;

    public class Main {

        public static void main(String[] args) {

            ArrayList<Alumno> alumnos = new ArrayList();
            Scanner lector = new Scanner(System.in);
            System.out.println("********************");
            System.out.println("\tBienvenido a La Biblioteca");
            System.out.println("********************");
            while (true) {
                System.out.println("1. Registro de Ingreso de Alumno");
                System.out.println("2. Registro de Salida de Alumno");
                System.out.println("3. Mostrar Informacion de Alumnos dentro de la biblioteca");
                System.out.println("4. Salir");


                int opcion = lector.nextInt();

                switch (opcion) {
                    case 1:
                        int i = 0;
                        while (i == 0) {


                            Alumno nuevoAlumno= new Alumno();

                            System.out.println("**Creando un Registro de Alumno**");
                            System.out.printf("Escoja la operacion que desea realizar");
                            System.out.println("\t 1. Crear Registro");
                            System.out.println("\t 2. Salir al menu");
                            int op = lector.nextInt();
                            if (op == 1) {

                                System.out.println("Ingrese su numero de Cuenta :");
                                String numeroCuenta = lector.next();
                                nuevoAlumno.setNumerocuentas(numeroCuenta);




                                System.out.println("Ingrese su Nombre :");
                                String nombre = lector.next();
                                nuevoAlumno.setNombre(nombre);

                                System.out.println("Ingrese su Apellido :");
                                String apellido = lector.next();
                                nuevoAlumno.setApellido(apellido);

                                System.out.println("Ingrese su edad :");
                                int edad = lector.nextInt();
                                nuevoAlumno.setEdad(edad);

                                System.out.println("**El registro  ha sido creado**");
                            } else if (op == 2) {
                                i = lector.nextInt();
                            } else {
                                System.out.println("Desea crear otro Registro : Si(0)---No(-1)");
                                i = lector.nextInt();

                            }

                            break;
                            case 2:


                            case 3 :

                                if (alumnos.isEmpty()) {
                                    System.out.println("-- No hay estudiantes  en la biblioteca--");
                                } else {
                                    System.out.println("** Mostrando Estudiantes **");
                                }
                                for (Alumno e : alumnos){
                                    System.out.println(e.getNumerocuenta() + " - " + e.getNumerocuenta()  + " - " + e.getedad() );
                                }
                                break;
                            case 4:
                                System.out.println("Adios Gracias por su atencion");
                                break;
                            default:
                                System.out.println("Opcion no valida");
                        }
                        if (opcion == 4){
                            break;
                        }
                }
            }
        }








