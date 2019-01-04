package Extends;

public class People { //부모클래스
    public String name;
    public String ssn;

    public People(String name, String ssn){ //기본생성자가 아닌 매개변수가 들었기때문에 자식클래스에서 무조건 이 생성자를 호출해야한다.
        this.name=name;
        this.ssn=ssn;
    }
}
