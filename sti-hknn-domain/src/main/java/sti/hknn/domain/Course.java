package sti.hknn.domain;

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

    public String getCourseId() {
        return courseId;
    }

    @Override
    public String toString() {
        return "Course{" +
                "credits=" + credits +
                ",\n teacher=" + teacher +
                ",\n courseId='" + courseId + '\'' +
                ",\n courseHours=" + courseHours +
                '}';
    }
}
