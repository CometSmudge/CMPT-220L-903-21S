package base;

import java.util.ArrayList;
import java.util.Collections;

public class TreeList {
    ArrayList<Node> list = new ArrayList<>();
    Node root;

    public TreeList() {
        this.root = null;
    }

    public void add(int value) {
        if (this.root == null) {
            this.root = new Node(value);

        } else {
            Node tempNode = this.root;
            if (value <= tempNode) {
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
    }




    Node tempNode = this.root;
            while (tempNode.nextNode != null) {
        tempNode = tempNode.nextNode;
    }
    tempNode.nextNode = new Node(value);
            System.out.println("The value " + value + " has been added successfully.");