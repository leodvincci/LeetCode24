class Solution {
    public boolean isValid(String s) {
        Map myMap = new HashMap<Character, Character>();
        Stack myStack = new Stack<Character>();
        myMap.put('(', ')');
        myMap.put('{', '}');
        myMap.put('[', ']');
    
        for(Character c : s.toCharArray()){
            if(c == '(' || c == '{' || c == '['){
                myStack.push(c);
            }else {
                    Object popChar = myStack.pop();
                    boolean compare = myMap.get(popChar).equals(c);
                    if(compare == false){
                        return false;
                    }
                }
            }
        return myStack.isEmpty();
    }
}