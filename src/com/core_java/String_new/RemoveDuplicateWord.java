package com.core_java.String_new;

class DuplicateWord {

    private String[] words;

    public DuplicateWord(String[] words) {
        this.words = words;
    }

    public void removeDuplicate() {

        for (int i = 0; i < words.length; i++) {

            boolean duplicate = false;

            for (int j = 0; j < i; j++) {

                if (words[i].equals(words[j])) {
                    duplicate = true;
                    break;
                }
            }

            if (!duplicate) {
                System.out.println(words[i]);
            }
        }
    }
}

public class RemoveDuplicateWord {

    public static void main(String[] args) {

        String[] str = { "mango", "papaya", "banana", "papaya", "mango" };

        DuplicateWord obj = new DuplicateWord(str);

        obj.removeDuplicate();
    }
}
