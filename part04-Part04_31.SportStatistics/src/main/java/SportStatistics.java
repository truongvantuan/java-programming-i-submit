
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class SportStatistics {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int games = 0;
        int wins = 0;
        int losses = 0;

        System.out.println("File: ");
        String file = scan.nextLine();

        ArrayList<Match> matchList = readRecordFromFile(file);

        System.out.println("Team: ");
        String searchedTeam = scan.nextLine();

        for (Match match : matchList) {
            if (searchedTeam.equals(match.getHomeTeam()) || searchedTeam.equals(match.getVisitingTeam())) {
                games++;
                if (isWin(searchedTeam, match)) {
                    wins++;
                }
            }
        }

        System.out.println("Games: " + games);
        System.out.println("Wins: " + wins);
        System.out.println("Losses: " + (games - wins));

    }

    public static ArrayList<Match> readRecordFromFile(String file) {

        Scanner scanner = new Scanner(System.in);

        ArrayList<Match> matchList = new ArrayList<>();

        try (Scanner fileInput = new Scanner(Paths.get(file))) {
            while (fileInput.hasNextLine()) {
                String line = fileInput.nextLine();
                String[] part = line.split(",");

                int homeTeamPoints = Integer.parseInt(part[2]);
                int visitingTeamPoints = Integer.parseInt(part[3]);

                matchList.add(new Match(part[0], part[1], homeTeamPoints, visitingTeamPoints));
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

        return matchList;
    }

    public static boolean isWin(String searchedTeam, Match match) {
        boolean win;
        if (searchedTeam.equals(match.getHomeTeam())) {
            win = match.getHomeTeamPoints() > match.getVisitingTeamPoints();
        } else {
            win = match.getVisitingTeamPoints() > match.getHomeTeamPoints();
        }
        return win;
    }
}
