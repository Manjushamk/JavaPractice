import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class GradingProblem {

    static int[] gradingStudents(int[] grades) {
        for(int i =0 ; i< grades.length; i++){
            if(grades[i] > 38){
                int multiple_5 = ((grades[i] / 5) + 1) * 5;
                if(multiple_5 - grades[i] < 3){
                    grades[i] = multiple_5;
                }
            }
        }
        return grades;
    }

    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) throws IOException {

        int[] grades = {73,67,39, 33 };

        int[] result = gradingStudents(grades);

        for (int i: result) {
            System.out.println(i);
        }
    }
}
