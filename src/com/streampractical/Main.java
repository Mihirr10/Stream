package com.streampractical;

import com.streampractical.player.Player;

import java.util.ArrayList;
import java.util.stream.Collectors;

public class Main {
  public static void main(String[] args) {

    ArrayList<Player> player = new ArrayList<>();
    player.add(new Player("Lionel Messi", 30, "PSG", "Left Winger", 800));
    player.add(new Player("Cristiano Ronaldo", 7, "Real Madrid", "Forward", 820));
    player.add(new Player("Neymar jr", 10, "psg", "right winger", 500));
    player.add(new Player("Sergio Ramos", 4, "Real Madrid", "Defender", 250));
    player.add(new Player("Luis Suarez", 9, "Barcelona", "Striker", 550));
    player.add(new Player("Erling Haaland", 9, "Manchester City", "Striker", 200));
    player.add(new Player("Luka Modric", 10, "Real madrid", "Mid-fielder", 300));
    player.add(new Player("Iker Casillas", 1, "Real madrid", "Goal-keeper", 20));
    player.add(new Player("Diego Maradona", 10, "Barcelona", "Left Winger", 450));
    player.add(new Player("Andres Iniesta", 8, "Barcelona", "Mid-fielder", 380));

    System.out.println(player.stream().filter(x -> x.goals > 500).collect(Collectors.toList()));
    System.out.println(player.stream().filter(t -> t.getTeamName() == "Real Madrid").collect(Collectors.toList()));
    System.out.println(player.stream().map(Player::getPosition).distinct().collect(Collectors.toList()));

  }
}
