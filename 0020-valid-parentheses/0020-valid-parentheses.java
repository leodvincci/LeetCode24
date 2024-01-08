class Solution {
    public boolean isValid(String s) {
        
        HashMap<Character, Character> myHash = new HashMap<>();
        myHash.put('(', ')' );
        myHash.put( '{', '}');
        myHash.put('[' , ']' );

        Stack myStack = new Stack();

        for(Character c : s.toCharArray()){
            if(myHash.containsKey(c)){
                myStack.push(c);
            }else{
                if(myStack.isEmpty()){
                    return false;
                }
                if(myHash.get(myStack.peek()) == c ){
                    myStack.pop();
                }else{
                    return false;
                }
            }
        }

        return myStack.isEmpty();

    }
}