package br.com.challenges.easy;

import br.com.challenges.easy.lists.GradingStudents;
import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GradingStudentsTest {

    private GradingStudents gradeRound;

    @BeforeEach
    void setUp() {
        this.gradeRound = new GradingStudents();
    }

    @Test
    public void shouldRoundGrade() {
        List<Integer> arr = Arrays.asList(38);
        List<Integer> result = gradeRound.roundGrade(arr);
        assertEquals(Arrays.asList(40), result);
    }

    @Test
    public void shouldNotRound() {
        List<Integer> arr = Arrays.asList(67);
        List<Integer> result = gradeRound.roundGrade(arr);
        assertEquals(Arrays.asList(67), result);
    }

    @Test
    public void shouldRound2() {
        List<Integer> arr = Arrays.asList(73);
        List<Integer> result = gradeRound.roundGrade(arr);
        assertEquals(Arrays.asList(75), result);
    }

    @Test
    public void shouldRoundList() {
        List<Integer> arr = Arrays.asList(73, 67, 38, 33);
        List<Integer> result = gradeRound.roundGrade(arr);
        assertEquals(Arrays.asList(75, 67, 40, 33), result);
    }

}