package recursion;

public class RecursionExample {
    int factorial(int k) {
        int sum=0;
        if(k!=1){
            sum += k * factorial(k-1);
        }
        else if (k == 1) {
            return 1;
        }
        return sum;
    }

    public static void main(String[] args) {
        RecursionExample re = new RecursionExample();
        System.out.println(re.factorial(4));
    }
}
