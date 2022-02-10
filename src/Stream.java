
import java.util.Arrays;
import java.util.List;
public class Stream {
    public static void main (String[] args){
       List<String> listStr= (List<String>) Arrays.asList("a","b","c","d","e");
       listStr.stream().forEach(System.out::println);
       System.out.println("_____Parallel stream_____");
        listStr.parallelStream().forEach(System.out::println);
    }
}
