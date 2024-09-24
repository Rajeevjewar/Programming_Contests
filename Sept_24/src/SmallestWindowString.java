// Problem:Smallest window in a string containing all the characters of another string
// Date: 24/09/2024

public class SmallestWindowString {
    public static void main(String[] args) {
        String str1 = "timetopractice";
        String str2 = "toc";
        System.out.println(smallestWindow(str1,str2));
    }
    static String smallestWindow(String s, String p)
    {
        int n = s.length(); int m = p.length();
        int[] cnt1 = new int[26];
        int[] cnt2 = new int[26];

        for(int i = 0; i<m; i++){
            cnt2[p.charAt(i)-'a']++;
        }
        int start = -1; int end = -1;
        int i = 0;
        for(int j = 0; j<n; j++){
            cnt1[s.charAt(j)-'a']++;

            while(isSame(cnt1, cnt2)){
                if(start == -1){
                    start = i; end = j;
                }
                else if(end - start + 1 > j-i+1){
                    start = i; end = j;
                }
                cnt1[s.charAt(i)-'a']--;
                i++;
            }
        }
        if(start == -1){
            return "-1";
        }else{
            return s.substring(start, end+1);
        }
    }
    static boolean isSame(int[] s, int[] p){
        for(int i = 0; i<26; i++){
            if(p[i] > s[i]){
                return false;
            }
        }
        return true;
    }
}
