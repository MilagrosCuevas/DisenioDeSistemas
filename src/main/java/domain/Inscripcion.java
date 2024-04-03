package domain;

import java.util.Collections;
import java.util.List;

public class Inscripcion {
    private Alumno alumno;
    private List<Materia> materias;

    public boolean aprobada(){
        return this.materias.stream().allMatch(materia->alumno.cumpleCorrelatividades(materia));
    }

    public Alumno getAlumno() {
        return alumno;
    }

    public void setAlumno(Alumno alumno) {
        this.alumno = alumno;
    }

    public List<Materia> getMaterias() {
        return materias;
    }

    public void agregarMaterias( Materia ... materias) {
        Collections.addAll(this.materias,materias );
    }
}
