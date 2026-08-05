class Relational_operator{
  public static void main (String[]args){
    int a =5; 
    int b=10;
    int c =5;
    
    System.out.println(a>b);
    System.out.println(a<b);
    System.out.println(a<=b);
    System.out.println(a>=b);
    System.out.println(a==c);
    System.out.println(a!=c);

    boolean result = a<b;
    boolean result1 = a>b;
    boolean result2 = a==c;
    
    System.out.println(result);
    System.out.println(result1);
    System.out.println(result2);
  }
}