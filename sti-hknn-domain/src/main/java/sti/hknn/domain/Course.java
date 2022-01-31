package sti.hknn.domain;
//Kurserna har YH-poäng, lärare, kurskoder och antal timmar
public class Course {
    private int credits;
    private Teacher teacher;
    private String courseId;
    private int courseHours;

    public Course(int credits, Teacher teacher, String courseId, int courseHours) {
        this.credits = credits;
        this.teacher = teacher;
        this.courseId = courseId;
        this.courseHours = courseHours;
    }

    public int getCredits() {
        return credits;
    }

    public void setCredits(int credits) {
        this.credits = credits;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public String getCourseId() {
        return courseId;
    }

    public void setCourseId(String courseId) {
        this.courseId = courseId;
    }

    public int getCourseHours() {
        return courseHours;
    }

    public void setCourseHours(int courseHours) {
        this.courseHours = courseHours;
    }

    @Override
    public String toString() {
        return "Course{" +
                "credits=" + credits +
                ", teacher=" + teacher +
                ", courseId='" + courseId + '\'' +
                ", courseHours=" + courseHours +
                '}';
    }
}
