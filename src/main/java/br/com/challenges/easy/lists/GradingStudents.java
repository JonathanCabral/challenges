package br.com.challenges.easy.lists;

import java.util.ArrayList;
import java.util.List;

/**
 * @author jonathan @Date 4th, January 2022
 * @Description:
 * HackerLand University has the following grading policy:
 *     Every student receives a grade in the inclusive range from 0 to 100
 * Any less than 40 is a failing grade.
 * Sam is a professor at the university and likes to round each student's grades according to these rules:
 *     If the difference between the grade and the next multiple of 5 is less than 3, round grade up to the next multiple of 5
 * If the value of grade is less than 38, no rounding occurs as the result will still be a failing grade.
 *
 * eg1: grade 84 round to 85 (85 - 84 is less than 3)
 * eg2: grade 29 do not round (result is less than 40)
 * eg3: grade 57 do not round (60 - 57 is 3 or higher)
 *
 * Input format:
 * he first line contains a single integer, n, the number of students.
 * Each line i of the n subsequent lines contains a single integer, grades[i].
 *
 * Constraints:
 *  - 1 <= n <= 60
 *  - 0 <= grades[i] <= 100
 */
public class GradingStudents {

    private Integer gradeRounded;

    public List<Integer> roundGrade(List<Integer> grades) {
        for (int i = 0; i < grades.size(); i++) {
            if(grades.get(i) >= 38) {
                Integer grade = grades.get(i);
                if( grade % 5 == 3 ) {
                    grades.set(i, grade+2);
                } else if(grades.get(i) % 5 == 4) {
                    grades.set(i, grade+1);
                }
            }
        }
        return grades;
    }

    public List<Integer> roundGrade2(List<Integer> grades) {
        List<Integer> roundedGrades = new ArrayList<>();
        grades.forEach(grade -> {
            if(grade < 38) {
                roundedGrades.add(grade);
            } else if (shouldRound(grade)) {
                roundedGrades.add(this.gradeRounded);
            } else {
                roundedGrades.add(grade);
            }
                });
        return roundedGrades;
    }

    private boolean shouldRound(Integer grade) {
        Integer aux = 1;
        while (aux < 3 ) {
            int g = grade + aux;
            if(g % 5 == 0) {
                this.gradeRounded = g;
                return true;
            }
            aux++;
        }
        return false;
    }
}
