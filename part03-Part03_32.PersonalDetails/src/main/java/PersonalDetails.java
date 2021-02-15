
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalDetails {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<String> nameList = new ArrayList<>();
        ArrayList<String> yearList = new ArrayList<>();

        int sum = 0;

        while (true) {
            String input = scanner.nextLine();

            if (input.equals("")) {
                break;
            }

            String[] personal = input.split(",");
            nameList.add(personal[0]);
            yearList.add(personal[1]);
        }

        String longestName = nameList.get(0);
        for (String name : nameList) {
            if (longestName.length() < name.length()) {
                longestName = name;
            }
        }

        for (String year : yearList) {
            sum += Integer.parseInt(year);
        }

        System.out.println("Longest name: " + longestName);
        System.out.println("Average of the birth years: " + (double) sum / yearList.size());

    }
}
