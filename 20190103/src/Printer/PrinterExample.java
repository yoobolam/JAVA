package Printer;

import Printer.Printer;

public class PrinterExample {
    public static void main(String[] args) {

       //객체 생성하여 메소드 호출
       Printer printer = new Printer();
       printer.println("김승현");
       printer.println(5.4);
       printer.println(false);
       printer.println(4);


      //static 사용해서 객체 생성 없이 메소드 호출
       Printer.println2(5.4);
       Printer.println2(false);
       Printer.println2(4);
       Printer.println2("유보람");


    }
}
