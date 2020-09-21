package IU;
import Data.Asignatura;
import Data.Carrera;
import Data.Estudiante;
import Data.Facultad;
import Data.Grupo;
import Data.Nota;
import Data.Profesor;

import java.util.Scanner;

public class Interfaz {
    public static void iniciar(){
        System.out.println("\tBienvenido al Mini Sia");
    }
    public static void preguntar(){
        System.out.println("Escoja la opción que desea ver:\n1. Asignatura\n2. Carrera\n3. Estudiante\n4. Facultad\n5. Grupo\n6. Nota\n7. Profesor\n");
    }
    public static int responder(){
        Scanner x=new Scanner(System.in);
	int opcion = x.nextInt();
	return opcion;
    }
}
