package day05;

import java.util.ArrayList;
import java.util.List;

public class Journal {
    private List<String> naplo = new ArrayList<>();

    public List<String> getNaplo() {
        return naplo;
    }

    public boolean addStudent(String studentName) {
        if (studentName.indexOf(" ") > 0) {
            getNaplo().add(studentName);
            return true;
        } else return false;
    }
}
