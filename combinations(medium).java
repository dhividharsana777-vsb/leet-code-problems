class Solution {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> res = new ArrayList<>();
        backtrack(1, n, k, new ArrayList<>(), res);
        return res;
    }

    private void backtrack(int start, int n, int k, List<Integer> curr, List<List<Integer>> res) {
        // base case
        if (curr.size() == k) {
            res.add(new ArrayList<>(curr));
            return;
        }

        for (int i = start; i <= n; i++) {
            curr.add(i);                 // choose
            backtrack(i + 1, n, k, curr, res); // explore
            curr.remove(curr.size() - 1); // un-choose (backtrack)
        }
    }
}
