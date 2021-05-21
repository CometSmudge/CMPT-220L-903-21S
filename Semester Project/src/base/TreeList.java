package base;

import java.util.ArrayList;

public class TreeList {
    ArrayList<Integer> list = new ArrayList<Integer>();
    Node root;
    ArrayList<Integer> intlist = new ArrayList<>();



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

            } else {
                while (tempNode.rightNode != null) {
                    tempNode = tempNode.rightNode;

                }
                tempNode.rightNode = new Node(value);

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



    public void delete(int value) {
        list.clear();
        for (int j = 0; j < intlist.size(); j++) {
            if (intlist.get(j) == value) {
                intlist.remove(j);
                break;
            }
        }
        int tempInt = 0;
        for (int i = 0; i < intlist.size(); i++) {
            tempInt = intlist.get(i);
            list.add(tempInt);
        }

    }

    public void inOrder2(Node firstNode) {
             if (firstNode == null) {
                 return;
             }
             inOrder2(firstNode.leftNode);
             System.out.print(firstNode.value + " ");
             inOrder2(firstNode.rightNode);


    }

    public void inOrder(){
        inOrder2(this.root);
    }

    public void preOrder2(Node firstNode) {
        if (firstNode == null) {
            return;
        }

        System.out.print(firstNode.value + " ");
        preOrder2(firstNode.leftNode);
        preOrder2(firstNode.rightNode);
    }
    public void preOrder() {
        preOrder2(this.root);
    }

    public void postOrder2(Node firstNode) {
        if (firstNode == null) {
            return;
        }

        postOrder2(firstNode.leftNode);
        postOrder2(firstNode.rightNode);
        System.out.print(firstNode.value + " ");
    }
    public void postOrder(){
        postOrder2(this.root);
    }

    int leftHeight = 0;
    int rightHeight = 0;
    int height = 0;

    public void leftHeight(Node firstNode) {
        if (firstNode == null) {
            return;
        }
        leftHeight(firstNode.leftNode);


        leftHeight++;

    }
    public void rightHeight(Node firstNode) {
        if (firstNode == null) {
            return;
        }
        rightHeight(firstNode.rightNode);


        rightHeight++;

    }
    public void height() {
        leftHeight(this.root);
        rightHeight(this.root);
        if (leftHeight > rightHeight) {
            System.out.println("The height is " + leftHeight);
        } else {
            System.out.println("The height is " + rightHeight);
        }
    }






}


