package ExtendsOverride;

public class Calculator { //부모클래스
    double areaCircle(double r){
        System.out.println("Calculator 객체의 areaCircle()실행");
        return 3.14159*r*r; //파이의 값을 지정.
    }
}
