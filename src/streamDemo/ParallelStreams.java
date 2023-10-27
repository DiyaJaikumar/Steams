package streamDemo;

import java.util.Arrays;
import java.util.List;

class Student{
    String name;
    int score;
    Student(String name, int score){
        this.name=name;
        this.score=score;
    }
    public String getName(){
        return this.name;
    }
    public int getScore(){
        return this.score;
    }

}

public class ParallelStreams {
    public static void main(String[] args) {
        List<Student> stlist= Arrays.asList(
                new Student("D",82),
                new Student("S",88),
                new Student("G",65),
                new Student("J",82),
                new Student("L",50)
        );
        //STREAM
        stlist.stream().filter(s->s.getScore()>=80).limit(3).forEach(student -> System.out.println(student.getName()+"  "+student.getScore()));

        //PARALLEL STREAM
        stlist.parallelStream().filter(s->s.getScore()>=80).limit(3).forEach(student -> System.out.println(student.getName()+"  "+student.getScore()));

    }
}

