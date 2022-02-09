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

    public void ShowClass(){
        System.out.println(this.name+" ,"+this.teacher+" ,"+this.grade+" ,"+this.approved);
    }
}
