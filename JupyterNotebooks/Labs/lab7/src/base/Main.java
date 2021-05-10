
package base;

import org.w3c.dom.Node;

public class Main {

    public static void main(String[] args) {

        listItem one = new listItem(1, null);

        listItem two = new listItem(2, one.link);

        listItem three = new listItem(3,two.link );

        listItem four = new listItem(4, three.link);

        addList(5, four.link);
    }
    public static void addList(String, int value, Node link) {
        listItem name = new listItem(value, link);
    }


}



