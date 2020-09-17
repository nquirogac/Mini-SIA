package Data;

import Data.Grupo;
import Data.Estudiante;
import java.util.List;

public final class Nota {
    private double nota;
    private List<Estudiante> notasEstudiante;
    private List<Grupo> notasGrupo;
    
    public double getNota(){
        return this.nota;
    }
    
    public void setNota(double nota) {
        this.nota = nota;
    }
    
    public List<Estudiante> getNotasEstudiante(){
        return this.notasEstudiante;
    }
    
    public void setNotasEstudiante(List<Estudiante> notasEstudiante){
        this.notasEstudiante = notasEstudiante;
    }
    
    public List<Grupo> getNotasGrupo(){
        return this.notasGrupo;
    }
    
    public void setNotasGrupo(List<Grupo> notasGrupo){
        this.notasGrupo = notasGrupo;
    }
    public Nota (double nota){
        this.setNota(nota);
    }
    public Nota (){
        this(0);
    }    
    @Override
    public String toString() {
        
        return "Notas dentro del sistema: "+this.getNota();
    }
}
