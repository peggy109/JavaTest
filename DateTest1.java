//package com.peggy.javatest;
import java.util.Date;

public class DateTest1 {
public static void main(String[] args) {
    Date date = new Date();
    System.out.println(String.format("%%tc : %tc",date));
    System.out.println(String.format("%%tr : %tr",date));
    System.out.println(String.format("%%tA,%%tB %%td : %tA, %tB %td",date,date,date));
    System.out.println(String.format("%%tA,%%<tB %%<td : %tA, %<tB %<td",date));
}
}
