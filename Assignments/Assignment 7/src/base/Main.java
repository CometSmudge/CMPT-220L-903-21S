package base;

public class Main {

    public static void main(String[] args) {
        int[] bubblelist = {7, 3, 9, 5};
        int a = 0;
        int b = 0;

        for (int z = 0; z < (bubblelist.length - 1); z++) {
            for (int x = 0; x < (bubblelist.length - 1); x++) {
                if (bubblelist[x] > bubblelist[x + 1]) {
                    a = bubblelist[x];
                    b = bubblelist[x + 1];
                    bubblelist[x] = b;
                    bubblelist[x + 1] = a;
                }
            }
        }
        for (int y = 0; y < (bubblelist.length - 1); y++) {
            System.out.println(bubblelist[y]);
        }
        System.out.println(bubblelist[bubblelist.length -1 ]);


    }
}