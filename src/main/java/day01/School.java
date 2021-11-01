package day01;

import java.util.ArrayList;
import java.util.List;

public class School {
    public static void main(String[] args) {

        Students student = new Students();

        student.addHeight(153);
        student.addHeight(158);
        student.addHeight(160);
        student.addHeight(161);

        System.out.println(student.getHeights());

        System.out.println(student.isHeightsIncreasing());
    }
}
