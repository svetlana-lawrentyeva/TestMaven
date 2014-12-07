import java.util.List;

/**
 * Created by therioyo on 06.12.14.
 */
public interface IApi {
    void addNewStudent(IStudent student, ISchoolClass schoolClass);
    void deleteStudentFromClass(IStudent student, ISchoolClass schoolClass);
    List<IStudent> getAllStudents();
    List<IStudent>getStudentsFromClass(ISchoolClass schoolClass);
    void schedulePerfomance(IPerfomance perfomance);
}
