import java.util.*;

public class GroupAnagram {
    public static List<List<String>> groupAnagrams(String[] strs) {
        if (strs == null || strs.length == 0)
            return new ArrayList<>();
        Map<String, List<String>> map = new HashMap<>();
        for (String s : strs) {
            char[] ca = new char[26];
            //统计字符串中每个字符串出现的次数
            for (char c : s.toCharArray())
                ca[c - 'a']++;
            //统计每个字符出现次数的数组转化为字符串
            String keyStr = String.valueOf(ca);
            if (!map.containsKey(keyStr))
                map.put(keyStr, new ArrayList<>());
            map.get(keyStr).add(s);
        }
        return new ArrayList<>(map.values());
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
        String[] strings = {"eat", "tea", "tan", "ate", "nat", "bat"};
        System.out.println(groupAnagrams(strings));
    }
}
