package $2_Sorting.$2_5_applications;

/**
 * Created by hailstone01 on 1/31/16.
 */
public class Ex10 {
    static class Version implements Comparable<Version> {
        private String s;

        public Version(String s) {
            this.s = s;
        }

        @Override
        public int compareTo(Version that) {
            return this.s.compareTo(that.s);
        }

        public boolean less(Version that) {
            return compareTo(that) < 0;
        }
    }

    public static void main(String[] args) {
        Version v1 = new Version("115.1.1");
        Version v2 = new Version("115.10.1");

        System.out.println(v1.less(v2));
        System.out.println((int) '0');
        System.out.println((int) '.');
    }
}
