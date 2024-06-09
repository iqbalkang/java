package Generics;

interface Player {
    String name();
}

record BaseballPlayer(String name, String position) implements Player {}
record FootballPlayer(String name, String position) implements Player {}

public class Main {

    public static void main(String[] args) {

        BaseballTeam phillies1 = new BaseballTeam("philadelphia phillies");
        BaseballTeam astros1 = new BaseballTeam("houston astros");
        scoreResult(phillies1, 9, astros1, 5);

        SportsTeam phillies2 = new SportsTeam("philadelphia phillies");
        SportsTeam astros2 = new SportsTeam("houston astros");
        scoreResult(phillies2, 9, astros2, 5);

        SportsTeam afc = new SportsTeam("adelaide crows");
        FootballPlayer tex = new FootballPlayer("tex walker", "center half forward");
        afc.addTeamMember(tex);
        afc.listTeamMembers();

        Team<BaseballPlayer> phillies = new Team<>("philadelphia phillies");
        Team<BaseballPlayer> astros = new Team<>("houston astros");
        scoreResult(phillies, 9, astros, 5);

        BaseballPlayer marsh = new BaseballPlayer("b marsh", "right fielder");
        BaseballPlayer harper = new BaseballPlayer("b harsh", "right fielder");
        phillies.addTeamMember(marsh);
        phillies.addTeamMember(harper);
        phillies.listTeamMembers();

//        Team<String> tt = new Team<>("bala team");
//        tt.addTeamMember("bala");
//        tt.listTeamMembers();

    }

    public static void scoreResult(BaseballTeam team1, int team1_score, BaseballTeam team2, int team2_score) {
        String message = team1.setScore(team1_score, team2_score);
        team2.setScore(team2_score, team2_score);
        System.out.printf("%s %s %s %n", team1, message, team2);
    }

    public static void scoreResult(SportsTeam team1, int team1_score, SportsTeam team2, int team2_score) {
        String message = team1.setScore(team1_score, team2_score);
        team2.setScore(team2_score, team2_score);
        System.out.printf("%s %s %s %n", team1, message, team2);
    }

    public static void scoreResult(Team team1, int team1_score, Team team2, int team2_score) {
        String message = team1.setScore(team1_score, team2_score);
        team2.setScore(team2_score, team2_score);
        System.out.printf("%s %s %s %n", team1, message, team2);
    }
}
