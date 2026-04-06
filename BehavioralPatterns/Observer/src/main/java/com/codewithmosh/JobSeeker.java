package com.codewithmosh;

public class JobSeeker implements Observer{

    private String name;

    public JobSeeker (String name) {
        this.name = name;
    }

    @Override
    public void onJobPosted(JobPost job) {
        System.out.println("Hola " + name + " Se posteo un nuevo trabajo: " + job.getTitle());
    }
}
