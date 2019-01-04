package Extends;

public class StudentExample {
    public static void main(String[] args){

        Student student = new Student("유보람","123456-789101",10); //자식클래스 객체를 생성한다.

        System.out.println("name:"+student.name); //부모클래스에있는 필드값이지만 자식클래스 객체로 접근할 수 있다.
        System.out.println("ssn:"+student.ssn); //부모클래스에있는 필드값이지만 자식클래스 객체로 접근할 수 있다.
        System.out.println("studentNo:"+student.studentNo);

    }
}
