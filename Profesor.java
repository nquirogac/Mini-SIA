package Data;

import Data.Grupo;
import Data.Facultad;
import java.text.DateFormat;
import java.util.Date;
import java.util.List;

public final class Profesor {
    
    private String nombre;
    private String apellido;
    private long id;
    private String usuario;
    private Date fechaNacimiento;
    private List<Grupo> gruposEnseñanza;
    private Facultad facultad;

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return this.apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public long getId() {
        return this.id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getUsuario() {
        return this.usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public Date getFechaNacimiento() {
        return this.fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public List<Grupo> getGruposEnseñanza() {
        return this.gruposEnseñanza;
    }

    public void setGruposEnseñanza(List<Grupo> gruposEnseñanza) {
        this.gruposEnseñanza = gruposEnseñanza;
    }

    public Facultad getFacultad() {
        return this.facultad;
    }

    public void setFacultad(Facultad facultad) {
        this.facultad = facultad;
    }
    public Profesor(String nombre,String apellido,long id,String usuario,Date fechaNacimiento){
        this.setNombre(nombre);
        this.setApellido(apellido);
        this.setId(id);
        this.setUsuario(usuario);
        this.setFechaNacimiento(fechaNacimiento);
    }
    public Profesor(){
        this(null,null,0,null,null);
        this.setFacultad(null);
        this.setGruposEnseñanza(null);
    }
    @Override
    public String toString() {
        String idstr = Long.toString(this.getId());
        String fecha = DateFormat.getDateInstance().format(this.getFechaNacimiento());
        //+"\nGrupos a cargo: "+this.getGruposEnseñanza()+"\nFacultad: "+this.getFacultad().toString()
        
	return "Nombre: "+this.getNombre()+" "+this.getApellido()+"\nId: "+idstr+"\n"+"Usuario: "+this.getUsuario()+"\n"+"Fecha de nacimiento: "+fecha ;
	}
            
}
