// Runtime          = 29 ms
// Memory           = 44.55 MB
// Time Complexity  = O(n)
// Space Complexity = O(n)

class Solution {
    public boolean isAnagram(String s, String t) 
    {
        if ( s.length() != t.length() )
        {
            return false;
        }
        else
        {
            HashMap < Character, Integer > map1 = new HashMap<>();
            HashMap < Character, Integer > map2 = new HashMap<>();
            for ( int i = 0; i < s.length(); i++ )
            {   
                char one = s.charAt( i );
                char two = t.charAt( i );
                if ( map1.containsKey( one ) )
                {
                    int val1 = map1.get( one );
                    map1.put( one, val1 + 1 );
                }
                else
                {
                    map1.put( one, 1 );
                }
                
                if ( map2.containsKey( two ) )
                {
                    int val2 = map2.get( two );
                    map2.put( two, val2 + 1 );
                }
                else
                {
                    map2.put( two, 1 );
                }
            } 

            for ( Map.Entry < ?, ? > entry: map1.entrySet() )
            {
                Object key = entry.getKey();
                Object value = entry.getValue();

                if ( ! map2.containsKey( key ) || !map2.get( key ).equals( value ) )
                {
                    return false;
                }
            }

            return true;
        }
    }
}