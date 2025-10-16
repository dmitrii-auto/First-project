package HomeWork_11.Task_9;

public class CountWords {
    public int countWords(String sentence) {
        return sentence.trim().isEmpty() ? 0 : sentence.split("\\s+").length;
    }

}
