package Chapter7.Exercise.Q2;

public class CharArray {
    public static void main(String[] args) {
        char[] alphabets = new char[26];
        char ch = 'A';
        for(int i=0; i<alphabets.length; i++, ch++) {
            alphabets[i] = ch;
        }
        for(char index: alphabets) {
            int alp = (int)index + 32;
            System.out.println((char)alp);
        }
    }
}
