import java.util.ArrayList;
import java.util.List;

/**
 * Clase que gestiona una lista de estudiantes.
 */
public class StudentManager {
    private List<Student> students;

    public StudentManager() {
        this.students = new ArrayList<>();
    }

    /**
     * Agrega un estudiante a la lista.
     * @param student El estudiante a agregar
     */
    public void addStudent(Student student) {
        students.add(student);
    }

    /**
     * Elimina un estudiante de la lista por ID.
     * @param id ID del estudiante a eliminar
     */
    public void removeStudent(int id) {
        students.removeIf(student -> student.getId() == id);
    }

    /**
     * Obtiene un estudiante por ID.
     * @param id ID del estudiante a buscar
     * @return El estudiante encontrado o null si no existe
     */
    public Student getStudent(int id) {
        return students.stream()
                .filter(student -> student.getId() == id)
                .findFirst()
                .orElse(null);
    }

    /**
     * Calcula el promedio de calificaciones de todos los estudiantes.
     * @return El promedio de calificaciones
     */
    public double getAverageGrade() {
        return students.stream()
                .mapToDouble(Student::getGrade)
                .average()
                .orElse(0.0);
    }
}
