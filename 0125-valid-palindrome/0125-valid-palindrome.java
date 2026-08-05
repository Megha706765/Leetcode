// class Solution {
//     public boolean isPalindrome(String s) {
//         //
//         //first step
//         //
//         String rev = " ";
//         for(int i=s.length()-1; i>=0; i=i-1){
//             rev= rev + s.charAt(i);
//         }
//         if(rev.equals(s)){
//             return true;
//         }else{
//             return false;
//         }
//         //second step

//         int left = 0;
//         int right = s.length() - 1;
        
//         while (left < right) {
//             if (s.charAt(left) != s.charAt(right)) {
//                 return false;
//             }
//             left++;
//             right--;
//         }
        
//         return true;
//     }
// }





class Solution {
    public boolean isPalindrome(String s) {

        int left = 0;
        int right = s.length() - 1;

        while (left < right) {

            // Left side ke special characters skip karo
            while (left < right && !Character.isLetterOrDigit(s.charAt(left))) {
                left++;
            }

            // Right side ke special characters skip karo
            while (left < right && !Character.isLetterOrDigit(s.charAt(right))) {
                right--;
            }

            // Characters ko lowercase me compare karo
            if (Character.toLowerCase(s.charAt(left)) != Character.toLowerCase(s.charAt(right))) {
                return false;
            }

            left++;
            right--;
        }

        return true;
    }
}