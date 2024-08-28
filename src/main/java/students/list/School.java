package students.list;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class School {
    private Map<Integer,Student> students;

    public School() {
        this.students = new HashMap<>();

    }
    public void addStudent(Student student) {
        students.put(student.getId(), student);

    }

    public void printStudents() {
        for (Student student : students.values()) {
            System.out.println(student);
        }
    }
    public void findStudentById(int id) {
        for (Student student : students.values()){
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



