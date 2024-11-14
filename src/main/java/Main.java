public class Main {
  public static void main(String[] args) {
    System.out.println("Hello world!");
    
    StudentManager manager;
    manager = new StudentManager();
    manager.addStudent(new Student(1, "Alice", 20, 85.5));
    manager.addStudent(new Student(2, "Bob", 22, 90.0));
    manager.addStudent(new Student(3, "Charlie", 21, 78.0));
    manager.addStudent(new Student(4, "David", 19, 92.5));
    
    System.out.println(manager.getStudent(4));
    System.out.println(manager.getAverageGrade());

    // Crea un menu para agregar estudiantes   

    
  }
}