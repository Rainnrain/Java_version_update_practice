package com.cydeo;

public class Main {
    public static void main(String[] args) {


        FootballPlayer joe = new FootballPlayer("Joe");
        BaseballPlayer pat = new BaseballPlayer("Pat");
        SoccerPlayer beckham= new SoccerPlayer("Beckham");

        Team liverpool = new Team<>("Liverpool");
        liverpool.addPlayer(beckham);
    }
}
