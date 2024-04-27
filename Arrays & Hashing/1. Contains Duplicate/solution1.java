// Runtime  = 11 ms
// Memory   = 58.42 MB
// Time Complexity  = O(n)
// Space Complexity = O(n)

class Solution 
{
    public boolean containsDuplicate(int[] nums) 
    {
        HashSet < Integer > myHash = new HashSet<>();
        for(int num : nums)
        {
            if ( myHash.contains( num ) )
            {
                return true;
            } 
            else
            { 
                myHash.add( num );
            }
        }

        return false;
    }
}