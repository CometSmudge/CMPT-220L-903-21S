package base;

public class Main {

    public static void main(String[] args) {

        System.out.println(fibb(1,1));


    }
    public static int fibb(int f, int i){
        if (f == 1 & i == 1) {
            System.out.println(f);
        }
        int a = f;
        int b = i;
        System.out.println(f);
        int c = f + i;
        if (f < 50) {
            fibb(c,f);
        }





    return 89;
    }
}
