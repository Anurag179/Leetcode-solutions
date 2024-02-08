class Solution {
    public int lengthOfLastWord(String s) {
        s = s.trim();
        char[] ch = s.toCharArray();
        return length(ch,ch.length-1,0);
    }
    public static int length(char[] s,int i, int count){
        if(s[i] == ' '){
            return count;
        } 
        if(i<=0){
            count++;
            return count;
        }
        return length(s,i-1,count+1);
    }
}
