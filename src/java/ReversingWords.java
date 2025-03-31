
/*
 * Reversed words in given string
 * */


public class ReversingWords {

    public static void main(String[] args) {

        String input = "George  Kibe ";

        String[] words = input.split(" ");

        StringBuilder output = new StringBuilder();

        for (int i = words.length - 1; i >= 0; i--) {
            output.append(words[i]).append(" ");
        }
        System.out.println(output.getClass().getSimpleName());
        System.out.println(output.toString().trim());


    }

}


