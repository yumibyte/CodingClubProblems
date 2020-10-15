import java.util.ArrayList;
import java.util.Scanner;

public class TeacherAverage {

    public static void main(String args[]) {
        ArrayList<Double> grades = new ArrayList<Double>();
        double average = 0.0;
        double sum = 0.0;
        int belowAverage = 0;
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

//
//        int x = 0;
//        while (scanner.hasNext()) {
//            System.out.println("Num: ");
//            grades.add(scanner.nextDouble());
//            sum = sum + grades.get(x);
//            //sum = sum + currentInput;
//            x += 1;
//        }
        System.out.println(sum);


//        average = sum / grades.length;
//
//        for (i = 0; i < grades.size(); i++){
//            if (grades.get(i) < average){
//                belowAverage++;
//            }
//        }
//
//        System.out.println(belowAverage);

    }

}
