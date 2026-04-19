import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        
        OrderApp oa = new OrderApp();
        
                   // int stock, String status, boolean isBanned,
                   // int age, String role

            //↓↓↓入れてる引数は仮になります
        System.out.println(oa.getOrderMessage(1, "ACTIVE", true, 20, "USER"));
        
    }
}
