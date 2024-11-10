/* This method finds the Least Common Multiple of two numbers */

public class LCM {
    public static void main(String[] args){

        int num1 = 8;
        int num2 = 36;

        int lcm = lcm(num1, num2);
        System.out.println("The Least Common Multiple is: " + lcm);
    }

    public static int lcm(int a, int b){

        int small, big;
        if(a < b){
            small = a;
            big = b;
        }else{
            small = b;
            big = a;
        }

        int i = big;

        while(i % small != 0 || i % big != 0){
            i++;
        }
        return i;
    }
}
