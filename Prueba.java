package Logic;
import java.util.List;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import Data.Asignatura;
import Data.Carrera;
import Data.Estudiante;
import Data.Facultad;
import Data.Grupo;
import Data.Nota;
import Data.Profesor;
import IU.Interfaz;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Date;

public class Prueba {
    static int opcion;
    public static void main(String[] args) throws ParseException {  
        List <Carrera> carrerasingenieria= new ArrayList<>();
        List <Carrera> carrerasciencias= new ArrayList<>();
        List <Carrera> carrerasfce= new ArrayList<>();
        Carrera carrera1 = new Carrera("Ingeniería de sistemas","Bogotá",2879,165); //
        Carrera carrera2 = new Carrera("Economía","Bogotá",2578,155); //
        SimpleDateFormat d = new SimpleDateFormat("dd-MM-yy");
        Date fecha1 = d.parse("23-09-1981"); 
        Date fecha2 = d.parse("29-01-1972");
        
        Profesor profe1 = new Profesor("Marta","Torres",56938456,"mtorresh",fecha2);
        Profesor profe2 = new Profesor("Felipe","Castro",68097547,"fcastroh",fecha1);
        
        Nota nota1 = new Nota(4.2);
        Nota nota2 = new Nota(3.7);
        Nota nota3 = new Nota(4.8);
        
        String[] DepartamentosIngenieria={"Sistemas e Industrial","Macanica","Electrica y Electronica"};
        String[] DepartamentosCiencias={"Biologia","Farmacia","Matematicas","Quimica"};
        String[] DepartamentosCienciasE={""};
	    
	Facultad ciencias = new Facultad("Ciencias",1232432,"Bogota",DepartamentosCiencias);
        Facultad fce = new Facultad("Ciencias Economicas",90288282,"Bogota",DepartamentosCienciasE);
        Facultad ingenieria = new Facultad("Ingenieria",1298373,"Bogota",DepartamentosIngenieria);
        
        carrera1.setFacultad(ingenieria);
        carrera2.setFacultad(fce);
        
        carrerasfce.add(carrera2);
        carrerasingenieria.add(carrera1);
        
        ingenieria.setCarrerasFacultad(carrerasingenieria);
        ciencias.setCarrerasFacultad(carrerasciencias);
        fce.setCarrerasFacultad(carrerasfce);
        
        Asignatura poo = new Asignatura("Programacion Orientada a Objetos",10001029,"Disciplinar o profesional",3);
        Asignatura macEconomia = new Asignatura("Macroeconomia I",88199210,"Disciplinar",4);
        
        poo.setFacultad(ingenieria);
        macEconomia.setFacultad(fce);
        
        profe1.setFacultad(fce);
        profe2.setFacultad(ingenieria);
        
        Interfaz.iniciar();
        Interfaz.preguntar();
        opcion = Interfaz.responder();
        switch (opcion) {
		case 1:
                    System.out.println("\tAsignaturas");
                    System.out.println(poo+"\n");
                    System.out.println(macEconomia+"\n");
                    break;
		case 2:
                    System.out.println("\tCarreras");
                    System.out.println(carrera1+"\n");
                    System.out.println(carrera2+"\n");
                    break;
                case 3:
                    System.out.println("\tEstudiantes");
                    break;
                case 4:
                    System.out.println("\tFacultades");
                    System.out.println(ingenieria+"\n");
                    System.out.println(fce+"\n");
                    System.out.println(ciencias+"\n");
                    break;
                case 5: 
                    System.out.println("\tGrupos");
                    break;
                case 6:
                    System.out.println("\tNotas");
                    System.out.println(nota1+"\n");
                    System.out.println(nota2+"\n");
                    System.out.println(nota3+"\n");
                    break;
                case 7:
                    System.out.println("\tProfesores");
                    System.out.println(profe1+"\n");
                    System.out.println(profe2+"\n");
                    break;
		default: 
                    System.out.println("Error");
        } 
        
    }
    public static int retornarOpcion(){
        return opcion;
    }
}
