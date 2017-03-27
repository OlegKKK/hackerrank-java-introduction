package DataStructures;

import java.util.*;

class Student{
    private int id;
    private String fname;
    private double cgpa;
    public Student(int id, String fname, double cgpa) {
        super();
        this.id = id;
        this.fname = fname;
        this.cgpa = cgpa;
    }
    public int getId() {
        return id;
    }
    public String getFname() {
        return fname;
    }
    public double getCgpa() {
        return cgpa;
    }
}

class Check implements Comparator<Student>{

    public int compare(Student o1, Student o2) {
        if(o1.getCgpa() == o2.getCgpa()){
            return (o1.getFname()).compareTo(o2.getFname());
        }
        else if(o1.getCgpa() > o2.getCgpa()){
            return -1;
        }else{
            return 1;
        }
    }
}

public class SolutionL
{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int testCases = Integer.parseInt(in.nextLine());

        List<Student> studentList = new ArrayList<Student>();
        while(testCases>0){
            int id = in.nextInt();
            String fname = in.next();
            double cgpa = in.nextDouble();

            Student st = new Student(id, fname, cgpa);
            studentList.add(st);

            testCases--;
        }

        Check Check=new Check();

        Collections.sort(studentList,Check);


        for(Student st: studentList){
            System.out.println(st.getFname());
        }
    }
}