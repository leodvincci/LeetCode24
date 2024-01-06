class Solution {
    public boolean isPalindrome(String s) {
        StringBuilder newString = new StringBuilder();
        for(Character c : s.toLowerCase().toCharArray()){
            if(Character.isLetterOrDigit(c)){
                newString.append(c);
            }
        }
        System.out.println(newString);
        if(newString.length() <= 1){
            return true;
        }


        int p2 = newString.length()-1;
        for(int p1 = 0; p1 < p2;p1++){
            if(newString.charAt(p1) != newString.charAt(p2)){
                return false;
            }
            p2--;
        }

        return true;
        
    }
}