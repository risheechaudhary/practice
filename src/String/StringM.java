package String;

public class StringM {
    public static void main(String[] args) {
        String a=new String("Rishee");
        String e = new String("Rishee");
        String internString = e.intern();
        String newStr = e.intern();
        System.out.println("e == interString "+ (e== internString));
        System.out.println("Intern comparision "+(internString == newStr));
        String a1 = new String("dom");
        String a2 = new String("dom").intern();
        System.out.println(a1==a2);


        String newStr1 = a1.intern();

        System.out.println(a==e);
        String b = "rishee";
        String c = "rishee";
        System.out.println(b==c);

        String f = b.concat(c);
        System.out.println(f);
    }
}