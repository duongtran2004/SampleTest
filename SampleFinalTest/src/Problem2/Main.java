package Problem2;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        //create Teams Objects
        Team a = new Team("DuongA",0,0,0,0);
        Team b = new Team("DuongB",0,0,0,0);
        Team c = new Team("DuongC",0,0,0,0);
        Team d = new Team("DuongD",0,0,0,0);
//set statistic to 0, so all teams start equals
        //initialized match result
        a.win(b);

        a.win(c);

        a.lose(d);

        b.win(c);

        b.win(d);

        c.win(d);


        // Create a LeaderBoard object and add team into leaderboard
        LeaderBoard leader = new LeaderBoard();
        leader.add(a);

        leader.add(b);

        leader.add(c);

        leader.add(d);
        // call rank methods
//calling the rank() method of the LeaderBoard class and storing the returned result in the rankedTeams array.
        Team[] rankedTeams = leader.rank();

// Display each element of the returned team array
        for (Team team : rankedTeams) {
            System.out.println("Team Name: " + team.getName());
            System.out.println("Points: " + team.getPoints());
            // Display other statistics as needed
        }
        // Call the realRank() method to get the real-ranked teams
        //calling the realRank() method of the LeaderBoard class and storing the returned result in the realRankedTeams array.
        Team[] realRankedTeams = leader.realRank();

// Display each element of the returned team array
        for (Team team : realRankedTeams) {
            System.out.println("Team Name: " + team.getName());
            System.out.println("Points: " + team.getPoints());
            // Display other statistics as needed
        }


    }
}
