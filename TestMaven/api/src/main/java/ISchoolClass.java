import java.util.List;

/**
 * Created by therioyo on 06.12.14.
 */
public interface ISchoolClass {
    String getName();
    List<IStudent>getAllStudents();
    void addStudent(IStudent student);
    void deleteStudent(IStudent student);
}
