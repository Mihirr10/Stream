package com.streampractical;

import com.streampractical.player.Player;

import java.time.LocalDate;
import java.time.Period;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main{
  public static void main(String[] args) {

    ArrayList<Player> player = new ArrayList<>();
    player.add(new Player("Lionel Messi", 30, "PSG", "Left Winger", 800));
    player.add(new Player("Cristiano Ronaldo", 7, "Real Madrid", "Forward", 820));
    player.add(new Player("Neymar jr", 10, "psg", "right winger", 500));
    player.add(new Player("Sergio Ramos", 4, "Real Madrid", "Defender", 250));
    player.add(new Player("Luis Suarez", 9, "Barcelona", "Striker", 550));
    player.add(new Player("Erling Haaland", 9, "Manchester City", "Striker", 200));
    player.add(new Player("Luka Modric", 10, "Real Madrid", "Mid-fielder", 300));
    player.add(new Player("Iker Casillas", 1, "Real Madrid", "Goal-keeper", 20));
    player.add(new Player("Diego Maradona", 10, "Barcelona", "Left Winger", 450));
    player.add(new Player("Andres Iniesta", 8, "Barcelona", "Mid-fielder", 380));

    System.out.println(player.stream().filter(x -> x.goals > 500).collect(Collectors.toList()));
    System.out.println(player.stream().filter(t -> t.getTeamName() == "Real Madrid").sorted(Collections.reverseOrder()).skip(2).findFirst());
    System.out.println(player.stream().map(Player::getPosition).distinct().collect(Collectors.toList()));
    System.out.println(player.stream().filter(s->s.playerName.startsWith("L")).skip(2).collect(Collectors.toList()));
    System.out.println(player.stream().map(Player::getGoals).sorted(Collections.reverseOrder()).collect(Collectors.toList()));
    System.out.println(player.stream().filter(s -> s.getTeamName() == "Real Madrid").max(Comparator.comparing(Player::getGoals)));
    System.out.println(player.stream().map(s->{String sq=s.getPlayerName();s.setPlayerName(s.playerName+"jr") ;return s;}).collect(Collectors.toList()));
    System.out.println(player.stream().map(Player::getJerseyNumber).sorted(Collections.reverseOrder()).collect(Collectors.toList()));
    System.out.println(player.stream().map(s->s.goals+100).collect(Collectors.toList()));
//    player.stream().map(s->s.jerseyNumber).distinct().collect(Collectors.toList()).forEach(System.out::println);

    System.out.println( player.stream().map(s->s.playerName).count());
    player.stream().filter(s->s.position.contains("Left")).forEach(System.out::println);
     player.stream().filter(s -> s.goals > 500).collect(Collectors.toList()).forEach(System.out::println);

    LocalDate dob = LocalDate.of(2001,04,2);
    LocalDate tody = LocalDate.now();
    Period pd = Period.between(dob,tody);
    System.out.println( tody.getYear()- dob.getYear());
    System.out.println(pd.getYears());

    List<String> player1= player.stream().map(p -> p.getPlayerName()+" "+p.getTeamName()+" "+p.getPosition()).collect(Collectors.toList());
    System.out.println(player1);

    List<String> collect = player1.stream().map(p -> Arrays.stream(p.replace(" ", "").toLowerCase().split("")).distinct().collect(Collectors.joining())).sorted(Comparator.comparing(s -> -s.length())).collect(Collectors.toList());
    System.out.println(collect);



    System.out.println(player.stream().map(s->s.playerName).collect(Collectors.groupingBy(s->s.length())));
    System.out.println(player.stream().map(s->s.playerName).collect(Collectors.groupingBy(i->i.charAt(0),Collectors.mapping(i->i.split(" ")[0],Collectors.joining()))));




  }


}
