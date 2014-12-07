import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by therioyo on 06.12.14.
 */
@WebServlet("/s")
public class WebService extends HttpServlet implements IApi {
    private List<ISchoolClass>classes;

    public void addNewStudent(IStudent student, ISchoolClass schoolClass) {
        schoolClass.addStudent(student);
    }


    public void deleteStudentFromClass(IStudent student, ISchoolClass schoolClass) {
        schoolClass.deleteStudent(student);
    }


    public List<IStudent> getAllStudents() {
        List<IStudent>students = new ArrayList<IStudent>();
        for(ISchoolClass clazz:classes){
            students.addAll(clazz.getAllStudents());
        }
        return students;
    }


    public List<IStudent> getStudentsFromClass(ISchoolClass schoolClass) {
        return schoolClass.getAllStudents();
    }


    public void schedulePerfomance(IPerfomance perfomance) {

    }

    public List<ISchoolClass> getClasses() {
        return classes;
    }

    public void setClasses(List<ISchoolClass> classes) {
        this.classes = classes;
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setAttribute("name","Student1");
        req.getRequestDispatcher("index.jsp").include(req,resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doPost(req, resp);
    }
}
