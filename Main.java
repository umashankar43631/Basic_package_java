// To use Calculator Class we use package
import com.src.Calculator;

public class Main {
    public static void main(String args[]){
        Calculator c1 = new Calculator(10,20);
        int out1 = c1.addition();
        int out2 = c1.subtract();
        System.out.println(out1);
        System.out.println(out2);
    }
}
