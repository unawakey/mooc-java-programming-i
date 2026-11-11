
public class Game {

    private String homeTeam;
    private String visitingTeam;
    private int homePts;
    private int visitingPts;

    public Game(String homeTeam, String visitingTeam, int homePts, int visitingPts) {
        this.homeTeam = homeTeam;
        this.visitingTeam = visitingTeam;
        this.homePts = homePts;
        this.visitingPts = visitingPts;
    }

    public String getHomeTeam() {
        return this.homeTeam;
    }

    public String getVisitingTeam() {
        return this.visitingTeam;
    }

    public boolean won(String team) {
        if (team.equals(homeTeam) && homePts > visitingPts) {
            return true;
        }

        if (team.equals(visitingTeam) && homePts < visitingPts) {
            return true;
        }
        
        return false;
    }
}
