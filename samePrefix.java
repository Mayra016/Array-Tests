class SamePrefix {
    public String longestCommonPrefix(String[] strs) {
        StringBuilder prefix = new StringBuilder();
        int minLength = strs[0].length();
        boolean different = false;

        for (String word : strs) {
            minLength = Math.min(word.length(), minLength);
        }

        if (strs.length == 1) {
            return strs[0];
        }

        for (int i = 0; i < minLength; i++) {
            int x = 0;
            if (different == false) {
                for (String word : strs) {
                    if (word.charAt(i) == strs[0].charAt(i)) {
                        x++;
                    } else {
                        different = true;
                    }
                    if (x >= strs.length) {
                        System.out.println(strs[0].charAt(i));
                        prefix.append(strs[0].charAt(i));
                    }         
                }
            } else {
                break;
            }

        }

        return prefix.toString();
    }
}
