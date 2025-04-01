package a0331.sort.hak1;

public class Compare1 {
    public static void main(String[] args) {
        String str1 = "apple";
        String str2 = "banana";
        String str3 = "apple";
        System.out.println(str1.compareTo(str2));
        // 'a' 아스키코드(97) b(98) // 음수 (-1)
        System.out.println(str1.compareTo(str3));
        // 두 문자열이 같으면 0
        System.out.println(str1.compareTo(str1));
        // 양수 b(98) a(97)
    }
}
