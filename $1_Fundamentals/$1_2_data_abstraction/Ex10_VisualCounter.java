package $1_fundamentals.$1_2_data_abstraction;

/**
 * Created by hailstone01 on 1/10/16.
 */
public class Ex10_VisualCounter {
    private int tally;
    private int n;
    private int N;
    private int max;

    public Ex10_VisualCounter(int N, int max) {
        this.N = N;
        this.max = max;
    }

    public void increment() {
        if (n >= N) {
            System.out.println("too many operations");
            return;
        }
        n++;
        if (tally >= max) {
            System.out.println("value too big");
            return;
        }
        tally++;
        System.out.println("the tally now is: " + tally);
    }

    public void decrement() {
        if (n >= N) {
            System.out.println("too many operations");
            return;
        }
        n++;
        if (-tally >= max) {
            System.out.println("value too small");
            return;
        }
        tally--;
        System.out.println("the tally now is: " + tally);

    }

    public int getTally() {
        return this.tally;
    }

    public static void main(String[] args) {
        Ex10_VisualCounter c = new Ex10_VisualCounter(5, 3);
        c.increment();
        c.increment();
        c.increment();
        c.increment();
    }
}
