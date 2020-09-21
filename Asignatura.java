
package Data;
import java.util.List;
public final class Asignatura {
    private String Nombre;
    private long Codigo;
    private String Tipologia;
    private int Creditos;
    private Facultad facultad;   
    private List<Grupo> GruposAsignatura;
    public String getNombre() {
        return this.Nombre;
    }

    public void setNombre(String nombre) {
        this.Nombre = nombre;
    }
    public long getCodigo() {
        return this.Codigo;
    }

    public void setCodigo(long codigo) {
        this.Codigo = codigo;
    }
    public String getTipologia() {
        return this.Tipologia;
    }

    public void setTipologia(String tipologia) {
        this.Tipologia = tipologia;
    }
    public int getCreditos() {
        return this.Creditos;
    }

    public void setCreditos(int creditos) {
        this.Creditos = creditos;
    }
    public Facultad getFacultad() {
        return this.facultad;
    }

    public void setFacultad(Facultad facultad) {
        this.facultad = facultad;
    }
    public List<Grupo> getGruposAsignatura() {
        return this.GruposAsignatura;
    }

    public void setGruposAsignatura(List<Grupo> gruposasignatura) {
        this.GruposAsignatura = gruposasignatura;
    }
    public Asignatura(String nombre, long codigo,String tipologia,int creditos,Facultad facultad,List<Grupo> grupoasignatura){
        this.setNombre(nombre);
        this.setCodigo(codigo);
        this.setTipologia(tipologia);
        this.setCreditos(creditos);
        this.setFacultad(facultad);
        this.setGruposAsignatura(grupoasignatura);
    }
    public Asignatura(String nombre, long codigo,String tipologia,int creditos){
        this.setNombre(nombre);
        this.setCodigo(codigo);
        this.setTipologia(tipologia);
        this.setCreditos(creditos);
    }
     public Asignatura(){
        this(null,0,null,0);
    }
     @Override
    public String toString() {
        String codigostr = Long.toString(this.getCodigo());
        String creditostr= Integer.toString(this.getCreditos());
        
        
	return "Nombre: "+this.getNombre()+"\n"+"Código: "+codigostr+"\n"+"Tipologia: "+this.getTipologia()+"\n"+"Creditos: "+creditostr+"\n";
	}
}
