public class Strings {
    public static void main(String[] args) {
        String s1 = "Meenu";
        String s2 = "Meenu";
        String s3 = new String("Meenu");
        System.out.println(s1==s2);
        System.out.println(s1==s3);
        System.out.println(s1.equals(s2));
        System.out.println(s1.equals(s3));

    }
    
}
