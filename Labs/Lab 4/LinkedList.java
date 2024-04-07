import java.util.Scanner;

class Words {
    private String wordName;
    private String meaning;

    public Words(String wordName, String meaning) {
        this.wordName = wordName;
        this.meaning = meaning;
    }

    public String getWordName() {
        return wordName;
    }

    public void setWordName(String wordName) {
        this.wordName = wordName;
    }

    public String getMeaning() {
        return meaning;
    }

    public void setMeaning(String meaning) {
        this.meaning = meaning;
    }
}

class Dictionary {
    private Node head;

    private class Node {
        Words word;
        Node next;

        Node(Words word) {
            this.word = word;
            this.next = null;
        }
    }

    public void insertRecord(Words newWord) {
        Node newNode = new Node(newWord);
        if (head == null) {
            head = newNode;
        } else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
        }
        System.out.println("Word '" + newWord.getWordName() + "' inserted successfully.");
    }

    public String find(String wordName) {
        Node temp = head;
        while (temp != null) {
            if (temp.word.getWordName().equalsIgnoreCase(wordName)) {
                return temp.word.getMeaning();
            }
            temp = temp.next;
        }
        return "Word not found in dictionary.";
    }
}

public class LinkedList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Dictionary dictionary = new Dictionary();

        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Insert a word");
            System.out.println("2. Find meaning of a word");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine();  

            switch (choice) {
                case 1:
                    System.out.print("Enter word: ");
                    String word = scanner.nextLine();
                    System.out.print("Enter meaning: ");
                    String meaning = scanner.nextLine();
                    Words newWord = new Words(word, meaning);
                    dictionary.insertRecord(newWord);
                    break;
                case 2:
                    System.out.print("Enter word to find meaning: ");
                    String wordToFind = scanner.nextLine();
                    String foundMeaning = dictionary.find(wordToFind);
                    System.out.println("Meaning: " + foundMeaning);
                    break;
                case 3:
                    System.out.println("Exiting program...");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a valid option.");
            }
        }
    }
}
