class Solution {

    public int strStr(String haystack, String needle) {
        // return haystack.indexOf(needle); hehehe
        int hsLength = haystack.length();
        int needleLength = needle.length();

        for(int hs = 0; hs < hsLength; hs++) {
            if(hsLength - hs < needleLength) { return -1; }
            if(haystack.charAt(hs) == needle.charAt(0)){
                int search = 0;
                while(hs + search < hsLength && search < needleLength) {
                    if(haystack.charAt(hs + search) != needle.charAt(search)) { break; }
                    else { search++; }
                }
                if(search == needleLength) { return hs; };
            }
        }
        return -1;
    }
}
