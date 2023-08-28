package Problem_01;

public class Numeric {
    public static double intPower(double x, int n){
        double ans = 0;
        if(n < 0){
            ans = 1/(Math.pow(x,-n));
        }
        else if(n > 0 && n % 2 == 0){
            ans = Math.pow(x,n/2);
            ans = ans * ans;
        }
        else if (n > 0 && n%2 != 0){
            ans = Math.pow(x,n-1)*x;
        }
        return ans;

    }

}
