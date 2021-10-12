class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<>();
        for (int i = 1; i <= numRows; i++) {
            ArrayList<Integer> toAdd = new ArrayList<Integer>();
            for (int j = 0; j < i; j++) {
                if (j == 0 || j == i - 1) {
                    toAdd.add(1);
                } else {
                    toAdd.add(result.get(i - 2).get(j - 1) + result.get(i - 2).get(j));
                }
            }
            result.add(toAdd);
        }
        return result;
    }
}