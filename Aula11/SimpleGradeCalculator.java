package Aula11;

import java.util.*;

public class SimpleGradeCalculator implements IGradeCalculator {

    public double calculateavg(List<Double> grades) {
        if (grades.isEmpty()) {
            return 0;

        }
        double total = 0;
        for (double grade : grades) {
            total += grade;
        }
        return (total / 3);

    }
}
