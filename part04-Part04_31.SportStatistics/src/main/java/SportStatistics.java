
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class SportStatistics {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("File:");
        String file = scan.nextLine();

        System.out.println("Team:");
        String team = scan.nextLine();

        ArrayList<Game> games = getGamesFromFile(file);

        int gamesPlayed = 0;
        int wins = 0;

        for (Game game : games) {
            if (game.getHomeTeam().equals(team)) {
                gamesPlayed++;
                if (game.won(team)) {
                    wins++;
                }
            }
            if (game.getVisitingTeam().equals(team)) {
                gamesPlayed++;
                if (game.won(team)) {
                    wins++;
                }
            }
        }
        System.out.println("Games: " + gamesPlayed);
        System.out.println("Wins: " + wins);
        System.out.println("Losses: " + (gamesPlayed - wins));
    }

    public static ArrayList<Game> getGamesFromFile(String file) {
        ArrayList<Game> games = new ArrayList<>();
        try (Scanner fileReader = new Scanner(Paths.get(file))) {
            while (fileReader.hasNextLine()) {
                String line = fileReader.nextLine();
                if (line.isEmpty()) {
                    continue;
                }
                String[] parts = line.split(",");
                String homeTeam = parts[0];
                String visitingTeam = parts[1];
                int homePts = Integer.valueOf(parts[2]);
                int visitingPts = Integer.valueOf(parts[3]);

                games.add(new Game(homeTeam, visitingTeam, homePts, visitingPts));
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        return games;
    }
}
