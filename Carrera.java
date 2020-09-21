package Data;

import Logic.Prueba;
import java.util.List;

public final class Carrera {
    private String nombre;
    private String sede;
    private long codigo;
    private int creditos;
    private List<Estudiante> estudiantesEn;
    private Facultad facultad;
    
    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getSede() {
        return this.sede;
    }

    public void setSede(String sede) {
        this.sede = sede;
    }

    public long getCodigo() {
        return this.codigo;
    }

    public void setCodigo(long codigo) {
        this.codigo = codigo;
    }

    public int getCreditos() {
        return this.creditos;
    }

    public void setCreditos(int creditos) {
        this.creditos = creditos;
    }

    public List<Estudiante> getEstudiantesEn() {
        return this.estudiantesEn;
    }

    public void setEstudiantesEn(List<Estudiante> estudiantesEn) {
        this.estudiantesEn = estudiantesEn;
    }

    public Facultad getFacultad() {
        return this.facultad;
    }

    public void setFacultad(Facultad facultad) {
        this.facultad = facultad;
    }
    
    public Carrera(String nombre, String sede,long codigo,int creditos, List<Estudiante> estudiantesEn,Facultad facultad){
        this.setNombre(nombre);
        this.setSede(sede);
        this.setCodigo(codigo);
        this.setCreditos(creditos);
        this.setEstudiantesEn(estudiantesEn);
        this.setFacultad(facultad);
    }
    public Carrera(String nombre, String sede,long codigo,int creditos){
        this.setNombre(nombre);
        this.setSede(sede);
        this.setCodigo(codigo);
        this.setCreditos(creditos);
    }
    
    public Carrera(){
        this(null,null,0,0);
    }
    
    @Override
    public String toString() {
        int opcion;
        opcion = Prueba.retornarOpcion();
        if (opcion!=2){
            return "Carrera: "+this.getNombre();
        }
        else{
            String codigostr = Long.toString(this.getCodigo());
            String creditostr = Integer.toString(this.getCreditos());
            String estudiantes="";
        /*
        for(int i=0;i < this.getEstudiantesEn().size();i++){
            estudiantes += this.getEstudiantesEn().get(i).toString();
        }
        */
//"\nEstudiantes de la carrera: "+this.getEstudiantesEn()+"\nFacultad: "+this.getFacultad()
        //String cadenaRetorno;
        
            return "Carrera: "+this.getNombre()+"\n"+"Sede: "+this.getSede()+"\n"+"Código: "+codigostr+"\n"+"Créditos totales: "+creditostr;
	    
        }
    }
    
}
