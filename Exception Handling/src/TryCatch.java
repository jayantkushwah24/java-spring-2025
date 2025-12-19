public class TryCatch {
    public static void main(String[] args) {
        int ans = divide(10,0);
        System.out.println(ans);
        System.out.println("good job you are the best software engineer");
    }

    public static int divide(int i, int j) {
        try{
            return i / j;
        }catch(ArithmeticException e){
            return -1;
        }finally {
            System.out.println("finallyy..");
        }
    }
}
