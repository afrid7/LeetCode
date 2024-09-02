// class Solution {
//     public int lengthOfLastWord(String s) {
//         // int count=0;
//         // for(int i=s.lenght()-1;i>=0;i--){
//         //     if(s.charAt(i) != ' '){
//         //         count++;
//         //     }
//         //     else{
//         //         break;
//         //     }
//         // }
//         // return count;
        
//     }
// }
public class Solution {
    public int lengthOfLastWord(String s) {
        String trimmedString = s.trim();
        String[] words = trimmedString.split("\\s+");
        
        String lastWord = words[words.length - 1];
        return lastWord.length();
    }
}
