package Extends;

public class Student extends People { //부모클래스를 상속한 자식 클래스
    public int studentNo;

    public Student(String name, String ssn, int studentNo){//name과 ssn은 부모클래스에서 상속받았기때문에 추가 선언없이 사용가능
        super(name,ssn); //기본생성자시 만들지 않아도 되지만 기본생성자가 아니므로 명시적으로 호출한다.
        this.studentNo=studentNo;
    }
}
