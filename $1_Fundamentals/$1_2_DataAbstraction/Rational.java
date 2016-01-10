package $1_Fundamentals.$1_2_DataAbstraction;

import edu.princeton.cs.algs4.StdOut;

/**
 * Created by hailstone01 on 1/10/16.
 */
public class Rational {
    private long numerator;
    private long denominator;

    public long getNumerator() {
        return numerator;
    }

    public long getDenominator() {
        return denominator;
    }

    public Rational(long numerator, long denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
    }

    public Rational plus(Rational b) {
        long an = this.getNumerator();
        long ad = this.getDenominator();
        long bn = b.getNumerator();
        long bd = b.getDenominator();

        Rational result = new Rational(an * bd + ad * bn, ad * bd);
        long n = getMaxDivisor(result.getNumerator(), result.getDenominator());

        return new Rational(result.getNumerator() / n, result.getDenominator() / n);
    }

    public Rational minus(Rational b) {
        long an = this.getNumerator();
        long ad = this.getDenominator();
        long bn = b.getNumerator();
        long bd = b.getDenominator();

        Rational result = new Rational(an * bd - ad * bn, ad * bd);
        long n = getMaxDivisor(result.getNumerator(), result.getDenominator());

        return new Rational(result.getNumerator() / n, result.getDenominator() / n);
    }

    public Rational times(Rational b) {
        return new Rational(this.getNumerator() * b.getNumerator(),
                this.getDenominator() * b.getDenominator());
    }

    public Rational divides(Rational b) {
        return new Rational(this.getNumerator() * b.getDenominator(),
                this.getDenominator() * b.getNumerator());
    }

    public boolean equals(Rational that) {
        return (double) (this.getNumerator()) / this.getDenominator() ==
                (double) (that.getNumerator()) / that.getDenominator();
    }

    public String toString() {
        if (this.numerator == 0) {
            return "0";
        }

        if (this.numerator == this.denominator) {
            return "1";
        }

        if (this.denominator < 0) {
            return -numerator + "/" + -denominator;
        }

        return numerator + "/" + denominator;
    }

    private long getMaxDivisor(long a, long b) {
        a = Math.abs(a);
        b = Math.abs(b);

        if (a == 0) {
            return 1;
        }

        for (long i = Math.min(a, b); i > 0; i--) {
            if (a % i == 0 && b % i == 0) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Rational x, y, z;

        // 1/2 + 1/3 = 5/6
        x = new Rational(1, 2);
        y = new Rational(1, 3);
        z = x.plus(y);
        StdOut.println(z);

        // 8/9 + 1/9 = 1
        x = new Rational(8, 9);
        y = new Rational(1, 9);
        z = x.plus(y);
        StdOut.println(z);

        // 1/200000000 + 1/300000000 = 1/120000000
        x = new Rational(1, 200000000);
        y = new Rational(1, 300000000);
        z = x.plus(y);
        StdOut.println(z);

        // 1073741789/20 + 1073741789/30 = 1073741789/12
        x = new Rational(1073741789, 20);
        y = new Rational(1073741789, 30);
        z = x.plus(y);
        StdOut.println(z);

        //  4/17 * 17/4 = 1
        x = new Rational(4, 17);
        y = new Rational(17, 4);
        z = x.times(y);
        StdOut.println(z);

        // 3037141/3247033 * 3037547/3246599 = 841/961
        x = new Rational(3037141, 3247033);
        y = new Rational(3037547, 3246599);
        z = x.times(y);
        StdOut.println(z);

        x = new Rational(1, 30000);
        y = new Rational(1, 30000);
        z = x.times(y);
        StdOut.println(z);

        // 1/6 - -4/-8 = -1/3
        x = new Rational(1, 6);
        y = new Rational(-4, -8);
        z = x.minus(y);
        StdOut.println(z);
    }
}
