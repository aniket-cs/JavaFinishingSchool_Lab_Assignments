package Lab6;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class StudentMedal {
    public static void main(String[] args) {
        HashMap<Long, Double> student = new HashMap<>();
        Scanner in = new Scanner(System.in);

        for (int i = 0; i < 3; i++) {
            Long regNumber = in.nextLong();
            Double marks = in.nextDouble();

            student.put(regNumber, marks);
        }

        for (Map.Entry<Long, Double> m : student.entrySet()) {
            System.out.println(m.getKey() + " " + m.getValue());
        }
    }
}


