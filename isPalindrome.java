import java.util.Arrays;

class IsPalindrome {
    public boolean isPalindrome1(int x) {
        // More time and memory efficiency
        char[] asc = String.valueOf(x).toCharArray();
        char[] desc = new char[asc.length];
        int y = 0;

        for (int i = asc.length - 1; i >= 0; i--) {
            desc[i] = asc[y];
            y++;
        }

        return Arrays.equals(asc, desc);
    }


    public boolean isPalindrome2(int x) {
        int y = 0;

        for (int i = String.valueOf(x).length() - 1; i >= 0; i--) {
            if (String.valueOf(x).charAt(i) != String.valueOf(x).charAt(y)) {
                return false;
            }
            y++;
        }

        return true;
    }
}


