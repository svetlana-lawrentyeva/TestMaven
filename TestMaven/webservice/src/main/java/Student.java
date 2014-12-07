/**
 * Created by therioyo on 06.12.14.
 */
public class Student implements IStudent {
    private String name;
    @Override
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
