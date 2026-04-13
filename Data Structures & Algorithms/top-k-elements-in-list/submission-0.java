class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> numberFrequency = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            numberFrequency.put(num, numberFrequency.getOrDefault(num, 0) + 1);
        }

        int[] topNumbers = new int[k];
        int[] topFrequencies = new int[k];
        Iterator<Map.Entry<Integer, Integer>> entryIterator = numberFrequency.entrySet().iterator();
        while (entryIterator.hasNext()) {
            Map.Entry<Integer, Integer> entry = entryIterator.next();
            for (int i = 0; i < k; i++) {
                if (entry.getValue() > topFrequencies[i]) {
                    int tempFrequency = topFrequencies[i];
                    int tempNumber = topNumbers[i];
                    
                    topFrequencies[i] = entry.getValue();
                    topNumbers[i] = entry.getKey();
                    while (i+1 < k) {
                        int tempFrequencyOne = topFrequencies[i+1];
                        topFrequencies[i+1] = tempFrequency;
                        tempFrequency = tempFrequencyOne;

                        int tempNumbersOne = topNumbers[i+1];
                        topNumbers[i+1] = tempNumber;
                        tempNumber = tempNumbersOne;
                        
                        i = i + 1;
                    }
                }
            }
        }
        
        return topNumbers;   
    }
}
