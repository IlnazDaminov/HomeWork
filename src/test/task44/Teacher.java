package test.task44;

public class Teacher {
    private int mood = 3; //настроение.

    public void exam(int a, int b, int c, String d,int e){
        if(mood + a + b + c > 12){
            System.out.println("a " + e + "-year student " + d + " passed the exam!");
        }
        else{
            System.out.println("Not passed the exam!");
        }
    }
    public void addSession(int a, int b, int c, String d,int e, int f){
        if(mood + a + b + c > 12){
            System.exit(1);
        }
        if(mood + a + b + c + f  > 12){
            System.out.println("a " + e + "-year student " + d + " passed the exam!");
        }
        else{
            System.out.println("Not passed the exam!");
        }
    }


    public int getMood() {
        return mood;
    }

    public void setMood(int mood) {
        this.mood = mood;
    }
}
