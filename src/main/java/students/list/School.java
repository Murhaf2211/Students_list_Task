package students.list;

import java.util.ArrayList;
import java.util.List;

public class School {
    private List<Student> students;

    public School() {
        this.students = new ArrayList<>();

    }
    public void addStudent(Student student) {
        students.add(student);

    }
    public void printStudents() {
        for (Student student : students) {
            System.out.println(student);
        }
    }
    public void findStudentById(int id) {
        for (Student student : students){
            if (student.getId() == id){
                System.out.println(student);
                break;
            }
        }
    }
    public void removeStudent(Student student){
            students.remove(student);
        }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("School{");
        sb.append("students=").append(students);
        sb.append('}');
        return sb.toString();
    }
}



