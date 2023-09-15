package Problem2;

import java.util.*;

public class LeaderBoard {
    //property
    private List<Team> teams; //list of teams

    //constructor
    //note: what is the difference between these 2 constructor?

    public LeaderBoard() {
        teams = new ArrayList<>();
    }
    // no need to populate data beforehand (can have empty leaderboard)
/*
* public LeaderBoard(List<Team> teams) {
    this.teams = teams;
    * //empty parameters => no need to initialized team beforehand
}*/

    public void add(Team t) { //method to add objects t of Team class into the TeamList
        teams.add(t);
    }

    // Method to compare match results. Since all team is in a round-robin, which means they play the same number of matches, we can do this way.
    private int compareMatchResult(Team team1, Team team2) {
        // Compare match results
        int matchesWonByTeam1 = team1.getMatchesWon();
        int matchesWonByTeam2 = team2.getMatchesWon();

        // If team1 won more matches than team2, it should be ranked higher
        if (matchesWonByTeam1 > matchesWonByTeam2) {
            return 1;
        }
        // If team2 won more matches than team1, it should be ranked higher
        else if (matchesWonByTeam1 < matchesWonByTeam2) {
            return -1;
        }
        // If both teams won the same number of matches, consider it a tie
        else {
            return 0;
        }
    }
    public Team[] rank() { //allow tied position
        // Sort the teams by points (highest to lowest)
        teams.sort(Comparator.comparingInt(Team::getPoints).reversed());

        // Convert the list to an array and return
        return teams.toArray(new Team[0]);
    }



    public Team[] realRank() {
        // Sort teams by points and match results using compareMatchResult
        Collections.sort(teams, (team1, team2) -> {
            int comparePoints = Integer.compare(team2.getPoints(), team1.getPoints());
            if (comparePoints != 0) {
                return comparePoints;
            }
            return compareMatchResult(team1, team2);
        });
        return teams.toArray(new Team[0]);
    }
}