public class Doublilinkidlist<E> {
   private Node<E> header;
   private Node<E> trailer;
   private int siz=0;

    public Doublilinkidlist() {
        header = new Node<>(null,null,null);
        trailer =new Node<>(null,header,null);
        header.setNext(trailer);
    }

    public Doublilinkidlist(Node<E> header, Node<E> trailer, int siz) {
        header = new Node<>(null,null,null);
        trailer =new Node<>(null,header,null);
        header.setNext(trailer);
    }
    public boolean isEmpty(){
        return siz==0;
    }
    public int getSiz() {
        return siz;
    }
    public E frist(){
        if (isEmpty())return null;
        return header.getNext().getElement();
    }
    public E last(){
        if (isEmpty())return null;
        return trailer.getPret().getElement();
    }
    public void addbetwen(E elment,Node<E>p,Node<E>s){
        Node<E> newest=new Node<>(elment,p,s);
        p.setNext(newest);
        s.setPret(newest);
        siz++;
    }

    public void addfrist(E elemnt){
        addbetwen(elemnt,trailer.getPret(),trailer);
    }
    public void addlast(E elemnt){
        addbetwen(elemnt,header,header.getNext());
    }
    public E remove(Node<E> x){
        Node<E>p=x.getPret();
        Node<E>s=x.getNext();
        p.setNext(s);
        s.setPret(p);
        siz--;
        return x.getElement();
    }
    public E removFrist(){
        if (isEmpty())return null;
        return remove(header.getNext());
    }
    public E removlist(){
        if (isEmpty())return null;
        return remove(trailer.getPret());
    }


    public int Siz2(){  //\\//\\//\\
    int a=0;         //\\   R-3.11  //\\
    Node<E> x=header;
    while (x.next.getElement()!=null){
        a++;
        x=x.getNext();
    }
    return a;
    }
    public boolean equals1(E elment){
        Node<E> i=header.next;
        boolean retern=false;
        while (i.getElement()!=null){
            if (i.getElement()==elment){
                retern=true;
            }
            i=i.getNext();
        }
    return retern;
    }
    static private class Node<E>{
        private E element;
        private Node<E> pret;
        private Node<E> next;

        public Node(E element, Node<E> pret, Node<E> next) {
            this.element = element;
            this.pret = pret;
            this.next = next;
        }

        public E getElement() {
            return element;
        }

        public void setElement(E element) {
            this.element = element;
        }

        public Node<E> getPret() {
            return pret;
        }

        public void setPret(Node<E> pret) {
            this.pret = pret;
        }

        public Node<E> getNext() {
            return next;
        }

        public void setNext(Node<E> next) {
            this.next = next;
        }
    }
}
