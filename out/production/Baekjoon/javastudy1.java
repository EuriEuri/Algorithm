class person{
    String name;
    String job;
    int age;
    person(String name, String job, int age) {
        this.name = name;
        this.job = job;
        this.age = age;
    }
}

class student extends person {
    int score;
    student(String name, String job, int age, int score) {
        super(name,job,age);
        this.score = score;
    }
    void print() {
        System.out.println("이름:"+name+"\n"+"직업"+job+"\n"+"나이:"+age+"\n"+"연봉:"+score+"\n");
    }
}

public class javastudy1 {
    public static void main(String[] args) {
        student s = new student("홍길동","인보과",25,9800);
        s.print();
    }
}