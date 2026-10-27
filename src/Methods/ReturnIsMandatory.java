package Methods;

public class ReturnIsMandatory {
    public static void main(String[] args) {
        System.out.println(ananya(9));
    }
    public static int ananya(int a){
        if(a<5){
            return a;
        }
        else return -4;
    }
}
