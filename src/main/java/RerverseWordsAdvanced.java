import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class RerverseWordsAdvanced {

    public static void main(String[] args) {

        String input = "George Kibe Ndung'u ";

        String trimedStr = input.trim().replace("\\s+", " ");
        List<String> words = Arrays.asList(trimedStr.split(" "));
        Collections.reverse(words);
        System.out.println(String.join(" ", words));

    }


}
