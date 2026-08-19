class Solution {
    public int maxNumberOfFamilies(int n, int[][] r) {

        HashMap<Integer, HashSet<Integer>> m = new HashMap<>();

        for (int[] x : r)
            m.computeIfAbsent(x[0], k -> new HashSet<>()).add(x[1]);

        int ans = (n - m.size()) * 2;

        for (HashSet<Integer> s : m.values()) {

            boolean a = true, b = true, c = true;

            for (int i = 2; i <= 5; i++)
                if (s.contains(i)) a = false;

            for (int i = 4; i <= 7; i++)
                if (s.contains(i)) b = false;

            for (int i = 6; i <= 9; i++)
                if (s.contains(i)) c = false;

            if (a && c) ans += 2;
            else if (a || b || c) ans++;
        }

        return ans;
    }
}