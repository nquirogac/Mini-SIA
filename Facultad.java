package miniSIA;
import java.util.List;
public class Facultad {
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

    public void setNombre(long codigo) {
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

    public void setNombre(String[] departamento) {
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
}




