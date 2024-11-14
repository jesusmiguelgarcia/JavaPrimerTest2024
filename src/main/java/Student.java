public class Student {
    private int id;
    private String name;
    private int age;
    private double grade;

    public Student(int id, String name, int age, double grade) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.grade = grade;
    }

    public int getId() { return id; }
    public String getName() { return name; }
    public int getAge() { return age; }
    public double getGrade() { return grade; }

    /**
     * Actualiza la calificación del estudiante.
     * @param newGrade La nueva calificación
     */
    public void updateGrade(double newGrade) {
        this.grade = newGrade;
    }

    @Override
    public String toString() {
        return "Student{id=" + id + ", name='" + name + "', age=" + age + ", grade=" + grade + "}";
    }
}