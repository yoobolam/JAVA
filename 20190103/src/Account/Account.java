package Account;

public class Account {
    private int balance;
    private int MIN_BALANCE=0;
    private int MAX_BALANCE=1000000;

    public int getBalance(){ //현재잔고 확인
        return balance;
    }
    public  void setBalance(int balance){ //외부에서 받은 값을 유요한지 검사후 값 반환
        if(balance<MIN_BALANCE){
            this.balance=getBalance();
        }
        else if(balance>MAX_BALANCE){
            this.balance=getBalance();
        }else{
            this.balance=balance;
        }
    }
}
