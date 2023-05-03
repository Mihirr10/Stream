package com.streampractical.player;

public class Player {

  public String playerName;
  public int jerseyNumber;
  public String teamName;
  public String position;
  public int goals;

  public Player(String playerName, int jerseyNumber, String teamName, String position, int goals) {
    this.playerName = playerName;
    this.jerseyNumber = jerseyNumber;
    this.teamName = teamName;
    this.position = position;
    this.goals = goals;
  }

  public String getPlayerName() {
    return playerName;
  }

  public void setPlayerName(String playerName) {
    this.playerName = playerName;
  }

  public int getJerseyNumber() {
    return jerseyNumber;
  }

  public void setJerseyNumber(int jerseyNumber) {
    this.jerseyNumber = jerseyNumber;
  }

  public String getTeamName() {
    return teamName;
  }

  public void setTeamName(String teamName) {
    this.teamName = teamName;
  }

  public String getPosition() {
    return position;
  }

  public void setPosition(String position) {
    this.position = position;
  }

  public int getGoals() {
    return goals;
  }

  public void setGoals(int goals) {
    this.goals = goals;
  }

  @Override
  public String toString() {
    return "Player{" + "playerName='" + playerName + '\'' + ", jerseyNumber=" + jerseyNumber + ", teamName='" + teamName + '\'' + ", position='" + position + '\'' + ", goals=" + goals + '}';
  }


}
