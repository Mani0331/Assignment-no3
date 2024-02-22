public class MyClass {
    public static void main(String[] args) {
        char someChar = 'a';
        System.out.println("char is: " + someChar);

        switch (Character.toLowerCase(someChar)) {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                System.out.println(someChar + " is a vowel.");
                break;
            case 'y':
                System.out.println(someChar + " is sometimes a vowel and sometimes a consonant.");
                break;
            default:
                if (Character.isLetter(someChar)) {
                    System.out.println(someChar + " is a consonant.");
                } else {
                    System.out.println(someChar + " is not a letter.");
                }
        }
    }
}