package com.sprint.mission.javathreadbasicdemo.practice03;


import com.sprint.mission.javathreadbasicdemo.practice01.SyncAsyncComparisonDemo;
import com.sprint.mission.javathreadbasicdemo.practice02.ThreadCreationDemo;

public class ThreadBasicDemoApplication3 {
  public static void main(String[] args) {

    System.out.println("Java Thread 기초와 동기화 실습 시작");

    SyncAsyncComparisonDemo.run();

    ThreadCreationDemo.run();

    ThreadLifecycleDemo.run();

    System.out.println("실습 종료");
  }
}
