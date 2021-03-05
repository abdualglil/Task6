public class Circulaalinklist<E> {
    private Node<E> til=null;
    private int siz=0;
    public boolean isEmpty(){
        return siz==0;
    }
    public int getSiz() {
        return siz;
    }
    public E frist(){
        if (isEmpty())return null;
        return til.getNext().getElement();
    }
    public E last(){
        if (isEmpty())return null;
        return til.getElement();
    }
    public void addfrest(E elemen){
        if (siz==0){
            til=new Node<>(elemen,null);
            til.setNext(til);
        }
        else {
            Node<E> newest=new Node<>(elemen,til.getNext());
            til.setNext(newest);

        }
        siz++;
    }
    public void addlast(E elemnt){
        addfrest(elemnt);
        til=til.getNext();
    }
    public E removfrist(){
        Node<E> x=til.getNext();
        if (x==til)til=null;
        else til.setNext(x.getNext());
        siz--;
        return x.getElement();
    }
    public void rotet(){
        if (til!=null)til=til.getNext();
    }
    public int Siz2(){    //\\//\\//\\
        int a=1;        //\\ R-3.10//\\
        if (isEmpty())return 0;
        Node<E> i=til;
        while (i.getNext()!=til){
            a++;
            i=i.getNext();
        }

        return a;
    }
    public boolean  equals1(Circulaalinklist<E> a){//\\//\/\\//\\
        boolean ret=false;                         ///R-3.15\\\\
        if (a.getSiz()==siz){
            Node<E>i=til;
            Node<E>i2=a.til;
            while (i.getNext()!=til && i2.getNext()!=a.til){
                if(i.element==i2.element){
                    ret=true;
                }
                else return false;

                i=i.getNext();
                i2=i2.getNext();
            }
        }
        else {
            return false;
        }
        return ret;
    }

    static private class Node<E>{
        private E element;
        private Node<E> next;

        public Node(E element, Node<E> next) {
            this.element = element;
            this.next = next;
        }

        public E getElement() {
            return element;
        }

        public void setElement(E element) {
            this.element = element;
        }

        public Node<E> getNext() {
            return next;
        }

        public void setNext(Node<E> next) {
            this.next = next;
        }
    }

}
