package Data;
import java.util.Arrays;
import java.util.List;
public final class Facultad {
    private String Nombre;
    private long Codigo;
    private String Sede;
    private String []Departamento;
    private List <Carrera> CarrerasFacultad;
    private List <Profesor> ProfesoresFacultad;
    private List <Asignatura> AsignaturasFacultad; 
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
    public String getSede() {
        return this.Sede;
    }

    public void setSede(String sede) {
        this.Sede = sede;
    }
    public String[] getDepartamento() {
        return this.Departamento;
    }

    public void setDepartamento(String[] departamento) {
        this.Departamento = departamento;
    }
    public List<Carrera> getCarrerasFacultad() {
        return this.CarrerasFacultad;
    }

    public void setCarrerasFacultad(List<Carrera> carrerasfacultad) {
        this.CarrerasFacultad = carrerasfacultad;
    }
    public List<Profesor> getProfesoresFacultad() {
        return this.ProfesoresFacultad;
    }

    public void setProfesoresFacultad(List<Profesor> profesoresfacultad) {
        this.ProfesoresFacultad = profesoresfacultad;
    }
    public List<Asignatura> getAsignaturasFacultad() {
        return this.AsignaturasFacultad;
    }

    public void setAsignaturasFacultad(List<Asignatura> asignaturasfacultad) {
        this.AsignaturasFacultad = asignaturasfacultad;
    }
    public Facultad(String nombre, long codigo,String sede,String[] departamento, List<Carrera> carrerasfacultad,List<Profesor> profesorfacultad,List<Asignatura> asignaturafacultad){
        this.setNombre(nombre);
        this.setSede(sede);
        this.setCodigo(codigo);
        this.setDepartamento(departamento);
        this.setCarrerasFacultad(carrerasfacultad);
        this.setProfesoresFacultad(profesorfacultad);
        this.setAsignaturasFacultad(asignaturafacultad);
    }
    public Facultad(String nombre, long codigo,String sede,String[] departamento){
        this.setNombre(nombre);
        this.setSede(sede);
        this.setCodigo(codigo);
        this.setDepartamento(departamento);
    }
     public Facultad(){
        this(null,0,null,null);
    }
    @Override
    public String toString() {
        String codigostr = Long.toString(this.getCodigo());
        String Departamentos= Arrays.toString(Departamento);
        String carreras="";
        
        /*for(int i=0;i < this.getCarrerasFacultad().size();i++){
            carreras += this.getCarrerasFacultad().get(i).getNombre()+"\n";
        }*/
        
        
	return "Nombre: "+this.getNombre()+"\n"+"Sede: "+this.getSede()+"\n"+"Código: "+codigostr+"\n"+"Departamemtos adjuntos: "+Departamentos+"\n"+"Carreras: "+carreras+"\n";
	}
}









