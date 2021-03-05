public class Test {
    public static void main(String[] args) {
//        Doublilinkidlist<String> a=new Doublilinkidlist<>();
//        a.addfrist("abdu");
//        a.addlast("ali");
//        a.addfrist("ahmed");
       // System.out.println(a.Siz2());
       // System.out.println(a.equals1("ali"));
        Circulaalinklist<String> b=new Circulaalinklist<>();
        b.addfrest("ahmed");
        b.addfrest("fatema");
        b.addlast("osama");
        b.addlast("abdu");
        Circulaalinklist<String> b2=new Circulaalinklist<>();
        b2.addfrest("ahmed");
        b2.addfrest("fatema");
        b2.addlast("osama");
        b2.addlast("abdu");
        System.out.println(b.equals1(b2));
    }

}
