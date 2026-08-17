class Solution {
    public int maxConsecutiveAnswers(String answerKey, int k) {
        int maxf = 0;
        int maxt = 0;
        int n = answerKey.length();
        char a[] = answerKey.toCharArray();

        HashMap<Character, Integer> mapt = new HashMap<>();
        int lt = 0;

        for (int i = 0; i < n; i++) {
            if (a[i] == 'T') {
                mapt.put(a[i], mapt.getOrDefault(a[i], 0) + 1);
            } else {
                mapt.put(a[i], mapt.getOrDefault(a[i], 0) + 1);
            }

            while (mapt.getOrDefault('F', 0) > k) {
                if (a[lt] == 'F') {
                    mapt.put('F', mapt.get('F') - 1);
                }
                lt++;
            }

            maxt = Math.max(maxt, i - lt + 1);
        }

        HashMap<Character, Integer> mapf = new HashMap<>();
        int lf = 0;

        for (int i = 0; i < n; i++) {
            if (a[i] == 'F') {
                mapf.put(a[i], mapf.getOrDefault(a[i], 0) + 1);
            } else {
                mapf.put(a[i], mapf.getOrDefault(a[i], 0) + 1);
            }

            while (mapf.getOrDefault('T', 0) > k) {
                if (a[lf] == 'T') {
                    mapf.put('T', mapf.get('T') - 1);
                }
                lf++;
            }

            maxf = Math.max(maxf, i - lf + 1);
        }

        return maxt > maxf ? maxt : maxf;
    }
}