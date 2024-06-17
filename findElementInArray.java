import java.util.Arrays;

class WordSearch {
  static String[] findWord(String x, String[] y) {
    return Arrays.stream(y)
                 .filter(word -> word.contains(x))
                 .toArray(String[]::new);
  }
}
