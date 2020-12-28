package com.company;

public abstract class Animal {
    private String name;
    private int maxRun;
    private int maxSwim;

    public Animal(String name, int maxRun, int maxSwim) {
        this.name = name;
        this.maxRun = maxRun;
        this.maxSwim = maxSwim;
    }

    public void run(int distance){
        if(distance>maxRun){
            System.out.printf("%s cannot run distance%s%n", name, distance);
            return;

        }
        System.out.printf("%s run distance%s%n", name, distance);

    }
    public void swim(int distance) {
        if (distance > maxSwim) {
            System.out.printf("%s cannot swim distance%s%n", name, distance);
            return;
        }
            System.out.printf("%s swim distance%s%n", name, distance);

        }
    }

