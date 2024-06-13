class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();

        for ( int num : nums )
        {
            if ( map.containsKey( num ) )
            {
                int count = map.get( num );
                map.put( num, count + 1 );
            }
            else
            {
                map.put( num , 1 );
            }

        }
        
        List<Map.Entry<Integer, Integer>> list = new ArrayList<>(map.entrySet());
        System.out.println(list);
        // Sort the list using a custom comparator
        list.sort((entry1, entry2) -> entry2.getValue().compareTo(entry1.getValue()));
        
        // Extract the keys of the first k entries
        List<Integer> result = new ArrayList<>();
        int[] arr = new int[k];

        for (int i = 0; i < k && i < list.size(); i++) {
            //result.add(list.get(i).getKey());
            arr[ i ] = list.get(i).getKey();
        }

        return arr;
    }
}