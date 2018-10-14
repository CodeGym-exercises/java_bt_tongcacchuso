public class Main {

    public static void main(String[] args) {
        System.out.print(sumDigits(1000));
    }
    public static int sumDigits(int number){
        int sum = 0, temp=10;

        while(number!=0){
            sum+=number%10;
            number/=10;
        }
        return sum;
    }
}
