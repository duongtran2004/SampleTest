package Problem2;

public class Team {
    //property
    //you usually forgot the access modifier!
    private String name;
    private int points;

    private int matchesWon;
    private int matchesLost;
    private int matchesDrawn;

    //constructor

    public Team(String name, int points, int matchesWon, int matchesLost, int matchesDrawn) {
        this.name = name;
        this.points = 0;
        this.matchesWon = 0;
        this.matchesLost = 0;
        this.matchesDrawn = 0;
        //why set everything to 0?
        //=> so all teams has a clean start, and we can initialized match results (call win/lose/draw method) in the Main class later on.
    }


    //getter and setter


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }

    public int getMatchesWon() {
        return matchesWon;
    }

    public void setMatchesWon(int matchesWon) {
        this.matchesWon = matchesWon;
    }

    public int getMatchesLost() {
        return matchesLost;
    }

    public void setMatchesLost(int matchesLost) {
        this.matchesLost = matchesLost;
    }

    public int getMatchesDrawn() {
        return matchesDrawn;
    }

    public void setMatchesDrawn(int matchesDrawn) {
        this.matchesDrawn = matchesDrawn;
    }
//toString method
    @Override
    public String toString() {
        return "Team{" +
                "name='" + name + '\'' +
                ", points=" + points +
                ", matchesWon=" + matchesWon +
                ", matchesLost=" + matchesLost +
                ", matchesDrawn=" + matchesDrawn +
                '}';
    }

    //other methods (win/lose/draw)
    public void win(Team t){
        points += 3;
        matchesWon ++;
    }
    public void lose(Team t){
        points += 0;
        matchesLost ++;
    }
    public void draw(Team t){
        points += 1;
        matchesDrawn ++;
    }
}
