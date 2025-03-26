package a0326.string;

public class StringEx2 {
    public static void main(String[] args) {
        String str = new String("abcd");
        System.out.println("원본문자열 : " + str);

        System.out.println(str.compareTo("bcdf"));
        System.out.println(str.compareTo("abcd"));

        System.out.println(str.compareTo("Abcd"));
        System.out.println(str.compareToIgnoreCase("Abcd"));
        System.out.println("compareTo() 메소드 호출 후 원본 문자열 : " + str);
    }
}
