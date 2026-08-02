class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>> map = new HashMap<>();
    for(String s : strs)
    {
        char [] c = s.toCharArray();
        Arrays.sort(c);
    
    String ans = new String(c);
    map.putIfAbsent(ans, new ArrayList<>());
    map.get(ans).add(s);
    }
    return new ArrayList<>(map.values());
    }
}