import java.util.HashMap;

public class ValidAnagram {
    public boolean isAnagram(String s, String t) {
        if (s.equals("") && s.equals(""))
            return true;
        if (s.equals(t))
            return false;
        else if (s.length() == t.length()){
            HashMap<Integer, Character> map = new HashMap<>();
            for (int i = 0; i < s.length(); i++) {
                Character c = s.charAt(i);
                map.put(i,c);
            }

            for (int i = 0; i < t.length(); i++) {
                Character c = t.charAt(i);
                if (!map.containsValue(c)) {
                    return false;
                }
            }
        }

        return true;
    }
}
