package numberFinder;

public class NumFinder {
    public void printNum(int num) {
        if (num == 0) {
            System.out.println("Bu nol");
        } else if (num < 0) {
            System.out.println("Bu - son");
        } else if (num > 0) {
            System.out.println("Bu plus son");

        }
    }
}
