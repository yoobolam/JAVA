package Singleton;

public class ShopService {
    private static ShopService singleton = new ShopService();

    private  ShopService(){}

    static ShopService getInstance(){
        return singleton;
    }
}
//singleton 만들어 보기