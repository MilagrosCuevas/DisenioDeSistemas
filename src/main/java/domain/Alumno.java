package domain;

import java.util.Collections;
import java.util.List;

    public class Alumno {

        private List<Materia> materiasAprobadas;

        public boolean cumpleCorrelatividades(Materia materia) {
            return materia.getCorrelativas().stream().allMatch(correlativa->this.aprobo(correlativa));
        }

        public void addMateriasAprobadas(Materia ... materiaAprobada) {
            Collections.addAll(this.materiasAprobadas,materiaAprobada );
        }

        public boolean aprobo(Materia materia) {
            return this.materiasAprobadas.contains(materia);
        }


    }


