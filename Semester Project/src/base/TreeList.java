package base;

import java.util.ArrayList;
import java.util.Collections;

public class TreeList {
    ArrayList<Node> list = new ArrayList<>();
    Node root;
    ArrayList<Integer> intlist = new ArrayList<>();

    int height = 0;
    int tempHeight = 0;

    public TreeList() {
        this.root = null;
    }

    public void add(int value) {

        intlist.add(value);
        if (this.root == null) {
            this.root = new Node(value);


        } else {
            Node tempNode = this.root;

            if (value <= tempNode.value) {
                while (tempNode.leftNode != null) {
                    tempNode = tempNode.leftNode;

                }
                tempNode.leftNode = new Node(value);
                tempHeight++;
                if (tempHeight > height) {
                    height = tempHeight;
                }
            } else {
                while (tempNode.rightNode != null) {
                    tempNode = tempNode.rightNode;

                }
                tempNode.rightNode = new Node(value);
                tempHeight++;
                if (tempHeight > height) {
                    height = tempHeight;
                }
            }
        }


    }


    public void search(int find) {
        boolean inTree = false;
        for (int x : intlist) {
            if (x == find) {
                inTree = true;
            }
        }
        if (inTree == true){
            System.out.println("The value is in the tree");


        } else {
            System.out.println("The value is not in the tree");
        }


    }
    public void Height() {
        System.out.println("The height is " + height);
    }
    public void Smallest() {
        int a = 0;
        int b = 0;

        for (int z = 0; z < (intlist.size() - 1); z++) {
            for (int x = 0; x < (intlist.size() - 1); x++) {
                if (intlist.get(x) > intlist.get(x + 1)) {
                    a = intlist.get(x);
                    b = intlist.get(x + 1);
                    intlist.set(x, b);
                    intlist.set(x + 1, a);
                }
            }
        }

        System.out.println(intlist.get(0));
    }
    public void Largest() {
        int a = 0;
        int b = 0;

        for (int z = 0; z < (intlist.size() - 1); z++) {
            for (int x = 0; x < (intlist.size() - 1); x++) {
                if (intlist.get(x) > intlist.get(x + 1)) {
                    a = intlist.get(x);
                    b = intlist.get(x + 1);
                    intlist.set(x, b);
                    intlist.set(x + 1, a);
                }
            }
        }

        System.out.println(intlist.get(intlist.size() - 1));
    }
    public void nthLargest(int nth) {
        int a = 0;
        int b = 0;

        for (int z = 0; z < (intlist.size() - 1); z++) {
            for (int x = 0; x < (intlist.size() - 1); x++) {
                if (intlist.get(x) > intlist.get(x + 1)) {
                    a = intlist.get(x);
                    b = intlist.get(x + 1);
                    intlist.set(x, b);
                    intlist.set(x + 1, a);
                }
            }
        }

        System.out.println(intlist.get(intlist.size() - nth));
    }
}


