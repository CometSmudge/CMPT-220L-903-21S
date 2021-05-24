package base;

import java.util.ArrayList;

public class TreeList {
    // The arraylist for the nodes
    ArrayList<Integer> list = new ArrayList<Integer>();
    Node root;
    // A list of the values as integers to make some of the functions easier.
    ArrayList<Integer> intlist = new ArrayList<>();



    public TreeList() {
        this.root = null;
    }
    // adds a value to the tree
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

    // searches the tree for a value and prints if it is in the tree or not.
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
    // finds the smallest value in the tree
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
    // finds the largest value in the tree
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
    // finds the nth largest value in the tree
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


    // deletes a value from the tree. It removes everything from the tree and just
    // the deleted value from the list, then it adds everything in the list back to the tree.
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
    // prints the values of the tree in order
    public void inOrder2(Node firstNode) {
             if (firstNode == null) {
                 return;
             }
             inOrder2(firstNode.leftNode);
             System.out.print(firstNode.value + " ");
             inOrder2(firstNode.rightNode);


    }
    // This is so this.root doesn't have to be typed every time the function is done.
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
    // This prints the list in pre order
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
    // leftHeight finds the left height and rightHeight finds the right height. Height compares them and usess the
    // bigger one as the height
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
    // Same as height, but it returns the height for breadthFirst.
    public int heightreturn() {
        leftHeight(this.root);
        rightHeight(this.root);
        if (leftHeight > rightHeight) {

            return leftHeight;
        } else {

            return rightHeight;
        }


    }
    // Does a depth first search
    public void depthFirst2(Node firstNode) {
        if (firstNode == null) {
            return;
        }

        System.out.print(firstNode.value + " ");
        preOrder2(firstNode.leftNode);
        preOrder2(firstNode.rightNode);
    }
    public void depthFirst() {
        depthFirst2(this.root);
    }
    // does a breadth first search
    public void breadthFirst() {
        int h = heightreturn();
        System.out.print(this.root.value + " ");
        Node tempNode = this.root;
        Node tempNode2 = this.root;

        for (int i = 0; i <= h; i++) {
            if (tempNode.leftNode != null) {
                System.out.print(tempNode.leftNode.value + " ");
                tempNode = tempNode.leftNode;
            }
            if (tempNode2.rightNode != null) {
                System.out.print(tempNode2.rightNode.value + " ");
                tempNode2 = tempNode2.rightNode;
            }
        }
    }





}


