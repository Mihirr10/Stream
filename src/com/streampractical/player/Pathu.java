package com.streampractical.player;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Pathu {
  public static void main(String[] args) {



    List<Integer> list = Arrays.asList(10,15,8,49,25,25,98,32,105);

    System.out.println(list.stream().mapToInt(Integer::intValue).summaryStatistics().getAverage());


    list.stream().map(s -> s + "").filter(s -> s.startsWith("1")).mapToInt(Integer::valueOf).forEach(System.out::println);


    System.out.println(list.stream().mapToInt(Integer::intValue).summaryStatistics().getMax());



//    System.out.println(asDouble);
  }

}
