package ginarodriguez;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Main {

    static ArrayList<String> employeeName;
    static ArrayList<String> schedule;

    public static void main(String[] args) {

        
        getNameScheduleEmployee(readFile());
        showResults();

      
    }

    static void getNameScheduleEmployee(ArrayList<String> listEmployees) {
        employeeName = new ArrayList();
        schedule = new ArrayList();

        for (int i = 0; i < listEmployees.size(); i++) {
            String information[] = listEmployees.get(i).split("=");
            employeeName.add(information[0]);
            schedule.add(information[1]);
        }

    }

    private static void showResults() {
        int coincidences = 0;
        for (int i = 0; i < employeeName.size(); i++) {
            for (int j = i + 1; j < employeeName.size(); j++) {
                String schedules[] = schedule.get(i).split(",");
                for (int k = 0; k < schedules.length; k++) {
                    if (schedule.get(j).contains(schedules[k])) {
                        coincidences++;
                       
                    }
                }
                System.out.println(employeeName.get(i) + "-" + employeeName.get(j) + ": " + coincidences);
                coincidences = 0;
            }
        }
    }

    static ArrayList<String> readFile() {
        ArrayList<String> listEmployees = new ArrayList();
        try {

            File file = new File("log/example1.txt");
            FileReader fr = new FileReader(file);

            BufferedReader br = new BufferedReader(fr);

            String line;
            while ((line = br.readLine()) != null) {

                listEmployees.add(line);
            }
        } catch (FileNotFoundException ex) {
        } catch (IOException ex) {
        }
        return listEmployees;
    }

}
