import java.util.*;

class Main2 {
  @SuppressWarnings("unchecked")
  static void wordsList() {
    ArrayList wordList = new ArrayList<>();

// This causes an unchecked warning
    wordList.add("programiz"); 

    System.out.println("Word list => " + wordList);
  }

  public static void main(String args[]) {
    wordsList();
  }
}