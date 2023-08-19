package OOPs.Introduction;

public class Main {
    public static void main(String[] args) {
        //5 roll numbers
        int[] numbers = new int[5];

        //5 names
        String[] names = new String[5];

        //data of 5 students: {roll,name,marks}
        int[] roll = new int[5];
        String[] names1 = new String[5];
        int[] marks = new int[5];

        Student[] student = new Student[5];
    }

    class Student{
        int[] roll;
        String[] names1;
        int[] marks ;
    }
}
