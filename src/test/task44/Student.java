package test.task44;

public class Student {

    private int cheerfulness; //бодрость.
    private int satietly; //сытость.
    private int subjectLevel;
    private String name;
    private int course;
    private int motivation;

    public void takeExam(){
        Teacher teacher = new Teacher();
        teacher.exam(cheerfulness, satietly, subjectLevel, name, course);
    }
    public void takeAddSession(){
        Teacher teacher = new Teacher();
        teacher.addSession(cheerfulness, satietly, subjectLevel, name, course, motivation);
    }

    public int getCheerfulness() {
        return cheerfulness;
    }

    public void setCheerfulness(int cheerfulness) {
        this.cheerfulness = cheerfulness;
    }

    public int getSatietly() {
        return satietly;
    }

    public void setSatietly(int satietly) {
        this.satietly = satietly;
    }

    public int getSubjectLevel() {
        return subjectLevel;
    }

    public void setSubjectLevel(int subjectLevel) {
        this.subjectLevel = subjectLevel;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public int getMotivation() {
        return motivation;
    }

    public void setMotivation(int motivation) {
        this.motivation = motivation;
    }
}
