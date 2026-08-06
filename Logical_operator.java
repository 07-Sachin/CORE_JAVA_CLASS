class Logical_operator{
  public static void main (String[]args){
    int a =20;
    int b= 10;
    int c= 28;
    System.out.println((a>b)&&(c>b));
    boolean d = c<a && a>b;
    System.out.println(d);

    System.out.println((a>b)||(c>b));
    boolean e = c<a || a>b;
    System.out.println(e);

    System.out.println(!(a>b));
    boolean f = !(c<a);
    System.out.println(f);
  }
}