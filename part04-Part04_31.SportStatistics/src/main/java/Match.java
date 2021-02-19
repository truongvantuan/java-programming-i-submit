/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author truongtuan
 */
public class Match {

    private String homeTeam;
    private String visitingTeam;
    private int homeTeamPoints;
    private int visitingTeamPoints;

    public Match(String homeTeam, String visitingTeam, int homeTeamPoints, int visitingTeamPoints) {

        this.homeTeam = homeTeam;
        this.visitingTeam = visitingTeam;
        this.homeTeamPoints = homeTeamPoints;
        this.visitingTeamPoints = visitingTeamPoints;
    }

    public String getHomeTeam() {
        return this.homeTeam;
    }

    public String getVisitingTeam() {
        return this.visitingTeam;
    }

    public int getHomeTeamPoints() {
        return this.homeTeamPoints;
    }

    public int getVisitingTeamPoints() {
        return this.visitingTeamPoints;
    }
}
