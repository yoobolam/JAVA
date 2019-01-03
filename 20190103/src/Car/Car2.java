package Car;

public class Car2 {
    private boolean stop;
    private  String fieldName;

    public boolean isStop(){ // boolean 에서 getter는 is로 사용한다.
        return stop;
    }
    public  void setStop(boolean stop){
        this.stop=stop; //Setter는 유효한 값 데이터로 저장! 저장이니까 받아온 stop을 this.stop에 저장한다.
    }


    public  String getFieldName(){// getter는 필드의 데이터 값을 외부로 보낼때, 즉 외부에서 필드값을 읽는다.
        return fieldName;
    }
    public  void setFieldName(String fieldName){ // 외부에서 필드 값을 변경하고 싶을때 외부에서 불러와서 저장.
        this.fieldName=fieldName;
    }
}
