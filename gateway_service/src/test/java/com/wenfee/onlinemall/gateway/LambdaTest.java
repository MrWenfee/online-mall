package com.wenfee.onlinemall.gateway;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * @program: online-mall
 * @author: Mr.Wenfee
 * @create: 2021-03-17 16:37
 **/
public class LambdaTest {


    public static void main(String[] args) {
        List<String> strs = Arrays.asList("a", "b", "c");
        for (String s : strs) {
            System.out.println("for s => " + s);
        }

        System.out.println("\n-----------------------------------");

        Arrays.asList("a", "b", "d").forEach(e -> {
            System.out.print(e);
            System.out.print(e);
        });

        System.out.println("\n-----------------------------------");

        String separator = ",";
        Arrays.asList("a", "b", "c").forEach(
                (String e) -> System.out.print(e + separator));

        System.out.println("\n-----------------------------------");

        Arrays.asList("1", "2", "3").forEach(
                (e) -> System.out.print(e + ",")
        );

        System.out.println("\n-----------------------------------");

        int[] a = {9, 8, 7, 2, 3, 4, 1, 0, 6, 5};
        Arrays.sort(a);
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }

        System.out.println("\n-------------sorted----------------------");

        IntStream intStream = IntStream.of(30, 50, 70, 120, 150, 200, 250, 300);
        intStream.sorted().forEach(System.out::println);

        System.out.println("\n-------------19, 28, 38, 74, 22, 33, 43, 13, 04, 46, 35----------------------");

        List<Integer> collect = Arrays.asList(19, 28, 38, 74, 22, 33, 43, 13, 04, 46, 35).stream().filter(s -> !s.equals("")).sorted((i, j) -> {
            System.out.println("i ==>" + i + "  j ==> " + j + "  i - j ==> " + (i - j));
            return i - j;
        }).collect(Collectors.toList());
        collect.stream().forEach(item -> System.out.println(item));
    }
}