class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap<Character,Integer> count1=decideCount(s);
        // HashMap<Character,Integer> count2=decideCount(t);
        if(s.length()!=t.length()){
            return false;
        }
        // for(Character key:count1.keySet()){
        //     if(!count2.containsKey(key)||count2.get(key)!=count1.get(key)){
        //         return false;
        //     }
        // }
        for(int i=0;i<t.length();i++){
            count1.put(t.charAt(i),count1.getOrDefault(t.charAt(i),0)-1);
            if(count1.get(t.charAt(i))<0){
                return false;
            }
        }

        return true;
    }

    public HashMap decideCount(String str){
        HashMap<Character,Integer> count=new HashMap<Character,Integer>();
        for (int i=0;i<str.length();i++){
            count.put(str.charAt(i),count.getOrDefault(str.charAt(i),0)+1);
        }
        return count;
    }
}
//注释掉的部分会超时
