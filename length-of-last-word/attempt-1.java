class Solution {
    public int lengthOfLastWord(String s) {
        int sLength = s.length()-1;
        int returnedLength = 0;
        int wordEnds = sLength; 
        while((s.charAt(wordEnds) == ' ')) {
            wordEnds--;
        }
        System.out.println(wordEnds);

        System.out.println(returnedLength);

        while((wordEnds - returnedLength >= 0) && s.charAt(wordEnds - returnedLength) != ' ') {
            returnedLength++;
        }

        return returnedLength;
    }
}
