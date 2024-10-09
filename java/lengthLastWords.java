public class lengthLastWords {
    
    public int lengthOfLastWord(String s) {
        String[] r = s.split(" ");
        return r[r.length-1].length();
    }

    public static void main(String[] args) {
        lengthLastWords l = new lengthLastWords();
        System.out.println(l.lengthOfLastWord("luffy is still joyboy"));
    }
}
