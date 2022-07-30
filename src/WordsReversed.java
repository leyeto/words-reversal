
public class WordsReversed {

    public static void main(String[] args){
      reverseWords("The cat is meowing");
    }

    public static StringBuilder reverseWords(String words){
        String currentInput[] =words.split(" ");
        String reverseArray[] = new String[currentInput.length];
    for(int i = 0; i < currentInput.length; i++){
               reverseArray[i]=currentInput[currentInput.length-(i+1)];
    }
    StringBuilder reverseStings = new StringBuilder();

    for(int i =0; i < reverseArray.length; i++){
        reverseStings.append(reverseArray[i] + " ");
    }

    return reverseStings;
    }
}
