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
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Date;

public class Prueba {
    public static void main(String[] args) throws ParseException {  
        List <Carrera> carrerasingenieria= new ArrayList<Carrera>();
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
        
        Facultad ingenieria = new Facultad("Ingenieria",1298373,"Bogota",DepartamentosIngenieria);
        
        carrera1.setFacultad(ingenieria);
        
        carrerasingenieria.add(carrera1);
        carrerasingenieria.add(carrera2);
        
        ingenieria.setCarrerasFacultad(carrerasingenieria);
        
        Asignatura poo = new Asignatura("Programacion Orientada a Objetos",10001029,"Practica",3);
        
        
        System.out.println(nota1);
        System.out.println(profe1);
        System.out.println(carrera1);
        System.out.println(poo);
        
    }  
}
