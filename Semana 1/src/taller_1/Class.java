package taller_1;

public class Class {
    public String name;
    public String teacher;
    protected Float grade;
    private boolean approved;

    public Class(String name, String teacher, Float grade, boolean approved) {
        this.name = name;
        this.teacher = teacher;
        this.grade = grade;
        this.approved = approved;
    }

    public String getName() {
        return name;
    }

    public String getTeacher() {
        return teacher;
    }

    public Float getGrade() {
        return grade;
    }

    public boolean isApproved() {
        return approved;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setTeacher(String teacher) {
        this.teacher = teacher;
    }

    public void setGrade(Float grade) {
        this.grade = grade;
    }

    public void setApproved(boolean approved) {
        this.approved = approved;
    }
}
