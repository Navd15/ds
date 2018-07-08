public class runn {
    public static void main(String[] args) {
        linkedList ls = new linkedList();
        ls.addToLast("tank");
       // ls.addToLast("homie");
       // System.out.println(ls.removeLast());
        System.out.println(ls.size());
        for(Object i:ls) {
            System.out.println(i);
        }

    }


}
