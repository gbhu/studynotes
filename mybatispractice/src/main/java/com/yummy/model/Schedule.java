package com.yummy.model;

public class Schedule {

    private  String id;
    private Course course;
    private String courseId;
    private String studentId;
    private Student student;
    private  String studentName;
    private  String courseName;

    public Course getCourse() {
        return course;
    }

    public Schedule setCourse(Course course) {
        this.course = course;
        return this;
    }

    public Student getStudent() {
        return student;
    }

    public Schedule setStudent(Student student) {
        this.student = student;
        return this;
    }


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }



    public String getCourseId() {
        return courseId;
    }

    public void setCourseId(String courseId) {
        this.courseId = courseId;
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

}
