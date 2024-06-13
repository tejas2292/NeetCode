class Solution {

    public static String formatString( String s )
    {
        String oneWithLower = s.toLowerCase();
        String oneWithTrimmed = oneWithLower.trim();
        String cleanInput = oneWithTrimmed.replaceAll("[^a-zA-Z0-9]", "");
        return cleanInput;
    }

    public boolean isPalindrome(String s) {
        String formattedString = formatString( s );
        char[] arr = formattedString.toCharArray();
        int midOfArray = arr.length/2;
        int i = 0;
        int j = arr.length -1;
        while( i < midOfArray )
        {
            if ( arr[ i ] != arr[ j ] )
            {
                return false;
            }
            i++;
            j--;
        }

        return true;
    }
}