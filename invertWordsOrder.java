class InvertWordsOrder {
    public String reverseWords(String s) {
        String[] words = s.trim().split(" ");
        StringBuilder result = new StringBuilder();

        for ( int i = (words.length - 1); i >= 0; i-- ) {

            if (words[i] != " " && words[i] != " ") {
                result.append(words[i]);
            }
            
            if (i > 0 && words[i].length() >= 1) {
                result.append(" ");
            }
        }

        return result.toString();
    }
}
