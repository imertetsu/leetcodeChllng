package StringManipulation;

public class MaximumNumberOfWordsInSentences {
    public int mostWordsFound(String[] sentences) {
        int maxNumberFound = 0;
        for (int i = 0; i < sentences.length; i++) {
            if(maxNumberFound < maxNumberWordsInString(sentences[i])){
                maxNumberFound = maxNumberWordsInString(sentences[i]);
            }
        }
        return maxNumberFound;
    }
    private int maxNumberWordsInString(String sentence){
        int maxNumberWords = 1;
        for (int i = 0; i < sentence.length(); i++) {
            if (sentence.charAt(i) == ' '){
                maxNumberWords++;
            }
        }
        return maxNumberWords;
    }

    public static void main(String[] args) {
        String[] sentences = {
                "alice and bob love leetcode",
                "i think so too",
                "this is great thanks very much"
        };
        MaximumNumberOfWordsInSentences max = new MaximumNumberOfWordsInSentences();
        System.out.println(max.mostWordsFound(sentences));
    }
}
