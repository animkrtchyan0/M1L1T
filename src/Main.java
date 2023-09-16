public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Boolean b = true;
        int xx = 0b1111;
        System.out.println(Integer.toString(xx,  2));
        System.out.println(Integer.toString(xx,  16));
        System.out.println(Integer.toString(xx,  3));

        System.out.println("----------------------------");

        int xb = 0x1A;
        System.out.println(Integer.toString(xb,  2));
        System.out.println(Integer.toString(xb,  16));
        System.out.println(Integer.toString(xb,  3));


        System.out.println("----------------------------");


        int num = 7;
        System.out.println("num =" + num);
        int sh = 3; //2 hatov shexelu depqum bazmapatkum enq 2^2-ov,3i depqum bazmapatkum enq 2^3
        int result = num << sh;
        System.out.println("result =" + result);


        System.out.println("----------------------------");


        int a = 100;
        System.out.println("num =" + a);
        int h = 2; //2 hatov shexelu depqum baajnum  enq 2^2-ov,3i depqum bajanum enq 2^3
        int k = a >> h;
        System.out.println("result =" + k);

    }
}