class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List> map = new HashMap<>();
        for(String s : strs)
        {
        int [] arr = new int[26];
        for(char c : s.toCharArray())
        {
            arr[c - 'a']++;
        }
        
        StringBuilder sb = new StringBuilder();
        for(int i : arr)
        {
            sb.append('#');
            sb.append(i);
        }
        String ans = sb.toString();
        if(!map.containsKey(ans)){
            map.put(ans, new ArrayList<String>());
        }
        map.get(ans).add(s);
        }
        return new ArrayList(map.values());
    }
}