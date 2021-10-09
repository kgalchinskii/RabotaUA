public class Calc {

    public int sum (int a, int b){
        return a + b;
    }

    public int sum (String a, double b){
        return Integer.parseInt(a) + (int) b;
    }

}
