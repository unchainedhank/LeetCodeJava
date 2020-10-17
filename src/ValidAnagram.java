import java.util.HashMap;
import java.util.Map;

public class ValidAnagram {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        int[] table = new int[26];
        for (int i = 0; i < s.length(); i++) {
            table[s.charAt(i) - 'a']++;
        }
        for (int i = 0; i < t.length(); i++) {
            table[t.charAt(i) - 'a']--;
            if (table[t.charAt(i) - 'a'] < 0) {
                return false;
            }
        }
        return true;
    }

    public static boolean isAnagram2(String s, String t) {
        if (s.equals(t))
            return true;

        if (s.length() != t.length()) {
            return false;
        }

        var map = new HashMap<Character,Integer>();

        //统计s的词频
        for (int i = 0; i < s.length(); i++) {
            Character cs = s.charAt(i);

            if (!map.containsKey(cs)) {
                map.put(cs,1);
            }
            else {
                map.put(cs, map.get(cs) + 1);
            }
        }

        for (int i = 0; i < t.length(); i++) {
            Character ct = t.charAt(i);
            if (!map.containsKey(ct))
                return false;
            else
                map.put(ct,map.get(ct) - 1);
                if (map.get(ct) < 0)
                    return false;
        }
        return true;
    }

    public static void main(String[] args) {
        String s = "abba";
        String t = "aaab";

        System.out.println(isAnagram2(s, t));
    }


}
