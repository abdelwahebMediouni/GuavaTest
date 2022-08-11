import com.google.common.collect.MinMaxPriorityQueue;
import model.CustomClass;

import java.nio.charset.Charset;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import static java.util.stream.Collectors.toCollection;

public class GuavaAlgo {

    public static void getElements() throws InterruptedException {
        ArrayList<CustomClass> queue = new ArrayList<>();

        IntStream
                .iterate(50, i -> i - 1)
                .limit(50)
                .forEach(i -> queue.add(new CustomClass(GenerateAlphaNumericString.getRandomString(i),new Date() )));
        Thread.sleep(5000);
        IntStream
                .iterate(0, i -> i + 1)
                .limit(50)
                .forEach(i -> queue.add(new CustomClass(queue.get(i).getId(),new Date() )));
        Thread.sleep(5000);
        IntStream
                .iterate(0, i -> i + 1)
                .limit(50)
                .forEach(i -> queue.add(new CustomClass(queue.get(i).getId(),new Date() )));
        Map<String, TreeSet<CustomClass>> collect = queue.stream()
                .collect(
                        Collectors.groupingBy(CustomClass::getId,  toCollection(TreeSet::new)
        ));
        Map<String, TreeSet<CustomClass>> result =   collect.entrySet().stream()
                .sorted(Map.Entry.comparingByKey())
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue,
                        (oldValue, newValue) -> oldValue, LinkedHashMap::new));
        System.out.println("queue = " + collect);


    }
}
