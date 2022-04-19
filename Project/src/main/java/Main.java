public class Main {

    public static void main(String[] args)
    {
        Des cipher = new Des();
        String text = "123456ABCD132536";
        //String text = "FFFFFFFFFFFFFFFF";
        String key = "AABB09182736CCDD";


        System.out.println("--[Encryption]--\n");
        text = cipher.encrypt(text, key);
        System.out.println("\nCipher Text: " + text.toUpperCase() + "\n");


        System.out.println("--[Decryption]--\n");
        text = cipher.decrypt(text, key);
        System.out.println("\nPlain Text: " + text.toUpperCase());
    }
}
