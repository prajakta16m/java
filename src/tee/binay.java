package tee;



public class binay {

    static class Node {
        public int data;
        public Node l;
        public Node t;

        Node(int x){
            this.data = x;
            this.l = null;
            this.t = null;
        }
    }

    public static void main(String[] args) {
        System.out.println("xx");
        Node h = new Node(2);
        h.l = new Node(2);
        h.t = new Node(3);

        System.out.println(isBST(h, Integer.MIN_VALUE, Integer.MAX_VALUE));

    }

    private static boolean isBST(Node n, int min, int max){

        if (n == null) {
            return true;
        }
        if (n.data >= min && n.data <= max && isBST(n.l, min, n.data) && isBST(n.t, n.data, max) ) {
            return true;
        }
        return false;
    }


}
