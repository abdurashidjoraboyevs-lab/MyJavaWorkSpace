package sumToHundred;

public class SumHundred {
    public void sumPrint(){
        int i = 1;
        int sum = 0;

        while (i <= 100) {
            sum += i;
            i++;
        }
        System.out.println("sum 1 dan 100 = " + sum);
    }
}
