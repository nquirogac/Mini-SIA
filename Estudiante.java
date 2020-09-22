package miniSIA;

import Data.Grupo;
import Data.Carrera;
import Data.Nota;
import java.text.DateFormat;
import java.util.Date;
import java.util.List;
import Logic.Prueba;

public class Estudiante {
    
    private String nombre;
    private String apellido;
    private long id;
    private String usuario;
    private Date fechaNacimiento;
    private List<Grupo> grupos;
    private List<Carrera> carrera;
    private List<Nota> notasEstudiante;
    private double PAPA;


    public String getNombre () {
        return this.nombre;
    }

    public void setNombre (String nombre) {
        this.nombre = nombre;
    }

    public String getApellido () {
        return this.apellido;
    }

    public void setApellido (String apellido) {
        this.apellido = apellido;
    }

    public long getId () {
        return this.id;
    }

    public void setId (long id) {
        this.id = id;
    }

    public String getUsuario () {
        return this.usuario;
    }

    public void setUsuario (String usuario) {
        this.usuario = usuario;
    }

    public Date getFechaNacimiento () {
        return this.fechaNacimiento;
    }

    public void setFechaNacimiento (Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public List<Grupo> getGrupos () {
        return this.grupos;
    }

    public void setGrupos (List<Grupo> grupos) {
        this.grupos = grupos;
    }

    public List<Carrera> getCarrera () {
        return this.carrera;
    }

    public void setCarrera (List<Carrera> carrera) {
        this.carrera = carrera;
    }
    
    public List<Nota> getNotasEstudiante () {
    	return this.notasEstudiante;
    }
    
    public void setNotasEstudiante (List<Nota> notasEstudiante) {
    	this.notasEstudiante = notasEstudiante;
    }
    
    public double getPAPA () {
    	return this.PAPA;
    }
    
    public void setPAPA (double PAPA) {
    	this.PAPA = PAPA;
    	
    }
    public Estudiante(String nombre,String apellido,long id,String usuario,Date fechaNacimiento,double PAPA){
    	this.setNombre(nombre);
        this.setApellido(apellido);
        this.setId(id);
        this.setUsuario(usuario);
        this.setFechaNacimiento(fechaNacimiento);
        this.setPAPA(PAPA);
    }
    public Estudiante(){
        this(null,null,0,null,null,0);
        this.setGrupos(null);
        this.setCarrera(null);
        this.setNotasEstudiante(null);
    }
    @Override
    public String toString() {
        
        int opcion;
        opcion = Prueba.retornarOpcion();
        if (opcion!=3){
            return "Estudiante: "+this.getNombre()+" "+this.getApellido();
        }
        else{
        String idstr = Long.toString(this.getId());
        String fecha = DateFormat.getDateInstance().format(this.getFechaNacimiento());
        
	return "Nombre: "+this.getNombre()+" "+this.getApellido()+"\n"+"Id: "+idstr+"\n"+"Usuario: "+this.getUsuario()+"\n"+"Fecha de nacimiento: "+fecha +"\n"+ "PAPA: "+this.getPAPA();
	   
        }
    }
          
}
