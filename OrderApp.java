public class OrderApp{
    
    public static boolean canOrder(int stock, String status, boolean isBanned,
                                    int age, String role){
            
            //在庫が0
            if(stock <= 0){return false;}
            //ユーザ有効じゃない
            if(!status.equals("ACTIVE")){return false;}
            //Banされている
            if(isBanned){return false;}
            //18歳以上以外はダメ、ADMIN以外もダメ
            if(age < 18 && !role.equals("ADMIN")){return false;}
            
            return true;
            
    }
    
    public static String getOrderMessage(int stock, String status, boolean isBanned,
                                    int age, String role){
            
            if(canOrder(stock, status, isBanned, age, role)){
                return "注文できます";
            } else {
                return "注文できません";
            }
            
    }
    
}
