package miniSIA; 

import Data.Nota;
import Data.Estudiante;
import Data.Asignatura;
import Data.Profesor;
import java.util.Arrays;
import java.util.List;
import Logic.Prueba;

public class Grupo {
    
    private int numero;
    private String[] diasPorSemana;
    private String[] horario;
    private List<Nota> notasGrupo;
    private List<Estudiante> estudiantesDelGrupo;
    private Asignatura asignatura;
    private Profesor profesor;

    public int getNumero () {
        return this.numero;
    }

    public void setNumero (int numero) {
        this.numero = numero;
    }

    public String[] getDiasPorSemana () {
        return this.diasPorSemana;
    }

    public void setDiasPorSemana (String[] diasPorSemana) {
        this.diasPorSemana = diasPorSemana;
    }

    public String getHorario () {
        return this.horario;
    }

    public void setHorario (String horario) {
        this.horario = horario;
    }
    
    public List<Nota> getNotasGrupo () {
    	return this.notasGrupo;
    }
    
    public void setNotasGrupo (List<Nota> notasGrupo) {
    	this.notasGrupo = notasGrupo;
    }

    public List<Estudiante> getEstudiantesDelGrupo () {
        return this.estudiantesDelGrupo;
    }

    public void setEstudiantesDelGrupo (List<Estudiante> estudiantesDelGrupo) {
        this.estudiantesDelGrupo = estudiantesDelGrupo;
    }

    public Asignatura getAsignatura () {
        return this.asignatura;
    }

    public void setAsignatura (Asignatura asignatura) {
        this.asignatura = asignatura;
    }
    
    public Profesor getProfesor () {
        return this.profesor;
    }

    public void setProfesor (Profesor profesor) {
        this.profesor = profesor;
    }
    
     public void setGruposAsignatura(List<Grupo> gruposAsignatura) {
        this.GruposAsignatura = gruposAsignatura;
    }
    public Grupo(int numero,String[] diasPorSemana, String[] horario, List<Nota> notasGrupo, List<Estudiante> estudiantesDelGrupo, Asignatura asignatura, Profesor profesor){
        this.setNumero(numero);
        this.setDiasPorSemana(diasPorSemana);
        this.setHorario(horario);
        this.setNotasGrupo(notasGrupo);
        this.setEstudiantesDelGrupo(estudiantesDelGrupo);
        this.setAsignatura(asignatura);
        this.setProfesor(profesor);
    }
    public Grupo(int numero, String[] diasPorSemana,String[] horario){
        this.setNumero(numero);
        this.setDiasPorSemana(diasPorSemana);
        this.setHorario(horario);
    }
     public Grupo(){
        this(0,null,null);
    }
     @Override
    public String toString() {
        int opcion;
        opcion = Prueba.retornarOpcion();
        if (opcion!=5){
            return "Grupo: "+this.getNumero();
        }
        String diasPorSemanastr = Arrays.toString(diasPorSemana);
        String horariostr = Arrays.toString(Horario);
        
        
	return "Numero: "+this.getNumero()+"\n"+"DiasPorSemana: "+this.getDiasPorSemana+"\n"+"Horario: "+this.getHorario()+"\n"+"Asignatura: "+this.getAsignatura+"\n"Profesor: "+ this.getProfesor();
	}
}
