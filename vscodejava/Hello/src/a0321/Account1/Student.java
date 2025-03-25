package a0321.Account1;

public class Student {
    private String name;
    private int studentId;
    private int kor, math, eng;
    

    public void setName(String name) {
        this.name = name;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public void setKor(int kor) {
        this.kor = kor;
    }

    public void setMath(int math) {
        this.math = math;
    }

    public void setEng(int eng) {
        this.eng = eng;
    }

    public String getName() {
        return name;
    }

    public int getStudentId() {
        return studentId;
    }

    public int getKor() {
        return kor;
    }

    public int getMath() {
        return math;
    }

    public int getEng() {
        return eng;
    }

    public Student(String name, int studentId, int kor, int math, int eng) {
        this.name = name;
        this.studentId = studentId;
        this.kor = kor;
        this.math = math;
        this.eng = eng;
    }

    public double getAverage() {
        double result = (kor + math + eng) / 3.0;
        return result;
    }
    public Student(){
        //기본생성자
    }



}