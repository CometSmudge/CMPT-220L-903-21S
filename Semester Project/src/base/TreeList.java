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
}


