package Basics;

public class Palindrome {
    public String getReverseStringBuilder(String sb){
        StringBuilder reverse = new StringBuilder(sb);
        for (int i = 0; i < sb.length(); i++) {
            reverse.reverse();
        }
        return reverse.toString();
    }

    public Boolean getIfStringBuilderPalindromeOrNot(String sb) {
        StringBuilder reverse = new StringBuilder();
        Boolean b = false;
        for (int i = 0; i < sb.length(); i++) {
            reverse = reverse.reverse();
            if (reverse.equals(sb)) {
                b = true;
            }
        }
        return b;
    }

    public String getReverseStringBuffer(String sb){
        StringBuffer reverse = new StringBuffer();
        for (int i = 0; i < sb.length(); i++) {
            reverse.append(sb.charAt(i));
        }
        return reverse.toString();
    }

    public Boolean getIfStringBufferPalindromeOrNot(String sb){
        StringBuffer reverse = new StringBuffer();
        Boolean b=false;
        for (int i = 0; i < sb.length(); i++) {
            reverse = reverse.append(i);
            if (reverse.equals(sb)){
                b = true;
            }
        }
        return b;
    }

    public String getReverseString(String sb){
        String reverse = "";
        char ch;
        for (int i = 0; i < sb.length(); i++) {
            ch = sb.charAt(i);
            reverse = ch + reverse;
        }
        return reverse;
    }

    public Boolean getIfPalindromeOrNot(String sb){
        String reverse = "";
        char ch;
        Boolean b=false;
        for (int i = 0; i < sb.length(); i++) {
            ch = sb.charAt(i);
            reverse = ch + reverse;

            if (reverse.equals(sb)){
                b = true;
            }
        }
        return b;
    }

    public int getOccurenceOfCharacter(String sb){
        int count = 0;
        count = sb.length();
        return count;
    }

    public static void main(String[] args) {
        String sb = "Rishee";

        Palindrome p = new Palindrome();
        String s = p.getReverseString(sb);
        Boolean aw = p.getIfPalindromeOrNot(sb);
        int c = p.getOccurenceOfCharacter(sb);
        String as = p.getReverseStringBuffer(sb);
        Boolean aws = p.getIfStringBufferPalindromeOrNot(sb);
        int cw = p.getOccurenceOfCharacter(sb);
        String as1 = p.getReverseStringBuffer(sb);
        Boolean aws1 = p.getIfStringBufferPalindromeOrNot(sb);
        int cw1 = p.getOccurenceOfCharacter(sb);
        System.out.println("Reverse of a String is :"+s);
        System.out.println("Is given String is palindrome: "+aw);
        System.out.println("Count of characters present in a string: "+c);
        System.out.println("Reverse of a String using StringBuffer is :"+s);
        System.out.println("Is given String is palindrome using StringBuffer: "+aw);
        System.out.println("Count of characters present in a string: "+c);
        System.out.println("Reverse of a String using StringBuilder is :"+s);
        System.out.println("Is given String is palindrome using StringBuilder: "+aw);
        System.out.println("Count of characters present in a string: "+c);
    }
}