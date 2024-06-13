// Runtime  = 15 ms
// Memory   = 44.88 MB
// Time Complexity  = O(n)
// Space Complexity = O(n)

import java.util.Collection;
import java.util.Collections;

class Solution {
    public boolean isAnagram(String s, String t) 
    {
        if ( s.length() != t.length() )
        {
            return false;
        }
        else
        {
            HashMap < Character, Integer > map = new HashMap<>();
            
            for ( char one : s.toCharArray() )
            {
                map.put( one, map.getOrDefault( one, 0 ) + 1 );
            }

            for ( char two : t.toCharArray() )
            {
                int count = map.getOrDefault( two, 0 );
                if ( count == 0)
                {
                    return false;
                }
                else
                {
                    map.put( two, count - 1);

                    if ( map.get( two ) == 0 )
                    {
                        map.remove( two );
                    }
                }
            }

            if( !map.isEmpty() )
            {
                return false;
            }
            return true;
        }
    }
}