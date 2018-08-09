package com.yummy.model;

public class Course {

    private String id;
    private  String courseName;
    private Score score;

    public Score getScore() {
        return score;
    }

    public Course setScore(Score score) {
        this.score = score;
        return this;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }


}
