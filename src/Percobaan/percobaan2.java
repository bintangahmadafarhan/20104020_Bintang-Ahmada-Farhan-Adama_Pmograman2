package Percobaan;

public class percobaan2 {
    public static void main(String[] args) {
        int bil = 10;
        try{
            System.out.println(bil/0);
        }catch (Throwable e){
//            System.out
            System.out.println(e);
        }
    }
}
