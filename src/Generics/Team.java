package Generics;

import java.util.ArrayList;
import java.util.List;

public class Team<T extends Player> {

    private String teamName;
    private List<T> teamMembers = new ArrayList<>();
    private int totalWins = 0;
    private int totalTies = 0;
    private int totalLoses = 0;

    public Team(String teamName) {
        this.teamName = teamName;
    }

    public void addTeamMember(T t) {
        if(!teamMembers.contains(t)) {
            teamMembers.add(t);
        }
    }

    public void listTeamMembers() {
        System.out.println(teamName + " Roster:");
        for(T t : teamMembers) {
            System.out.println(t.name());
        }
    }

    public int ranking() {
        return (totalLoses * 2) + (totalTies + 1);
    }

    public String setScore(int ourScore, int theirScore) {
        String message = "lost to";

        if(ourScore > theirScore) {
            totalWins++;
            message = "beat";
        } else if (ourScore == theirScore) {
            totalTies++;
            message = "tied";
        } else {
            totalLoses++;
        }
        return message;
    }

    @Override
    public String toString() {
        return teamName + " (Ranked " + ranking() + ")";
    }

}
