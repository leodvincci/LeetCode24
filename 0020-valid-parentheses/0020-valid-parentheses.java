class Solution {
    public boolean isValid(String s) {
        
        HashMap<Character,Character> myHash = new HashMap<>();
        Stack<Character> myStack = new Stack<>();
        myHash.put('(', ')');
        myHash.put('{', '}');
        myHash.put('[' , ']');

        for(Character c : s.toCharArray()){
            if( myHash.containsKey(c) ){
                myStack.push(c);
            }else{
                if (myStack.isEmpty()){
                    return false;
                }else{
                    Character comp = myStack.pop();
                    if(c != myHash.get(comp) ){
                        return false;
                    }
                }
            }
        }
        if(myStack.isEmpty()){
            return true;
        }

        return false;


    }
}