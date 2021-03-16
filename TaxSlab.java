/**
Calculate tax if Salary and Tax Brackets are given as list in the form
[ [10000, 0.3],[20000, 0.2], [30000, 0.1], [null, .1]]
null being rest of the salary
**/

public class Main {
    public static void main(String[] args) {
        System.out.println(taxSlab(220000d));
        
        
    }
    //[ [10000, 0.3],[20000, 0.2], [30000, 0.1], [null, .1]]
    public static double taxSlab(Double income){
        double[] max = {0,10000,20000,30000,9999999999d};
        double[] rate = {0,0.3,0.2,0.1,0.1};
        double left = income;
        double tax = 0.0d;
        for(int i = 1; i < max.length && left > 0; i++) {
            double df = Math.min(max[i]-max[i-1],left);
            tax += rate[i]*df;
            System.out.println(df+ " " + tax);
            left -= df;
        }
        return tax;
    }
}
