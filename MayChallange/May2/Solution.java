class Solution {
    public int numJewelsInStones(String J, String S) {
        if(J.length() == 0 || S.length() == 0) return 0;
      
        Set<Character> hashSet = new HashSet<Character>();
        int count = 0 ;
        
        for(int i = 0 ; i < J.length() ; i++){
            hashSet.add(J.charAt(i));
        }
        
        for(int i = 0 ; i < S.length() ; i++){
            if(hashSet.contains(S.charAt(i))) ++count;
        }
        
        return count;
    }
}
