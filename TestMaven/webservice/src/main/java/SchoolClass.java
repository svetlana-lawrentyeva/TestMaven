import java.util.List;

/**
 * Created by therioyo on 06.12.14.
 */
public class SchoolClass implements ISchoolClass {
    private String name;
    private List<IStudent>students;
    @Override
    public String getName() {
        return name;
    }

    @Override
    public List<IStudent> getAllStudents() {
        return students;
    }

    @Override
    public void addStudent(IStudent student) {
        students.add(student);
    }

    @Override
    public void deleteStudent(IStudent student) {
        students.remove(student);
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<IStudent> getStudents() {
        return students;
    }

    public void setStudents(List<IStudent> students) {
        this.students = students;
    }
}
