package streamDemo;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class StreamMethods {
    public static void main(String[] args) {
        List<String> letters = Arrays.asList("a", "s", "f", "a", "f", "l", "j");
        //distinct
        List<String> distinctletters = letters.stream().distinct().collect(Collectors.toList());
        System.out.println(distinctletters);
        //forEach()
        letters.stream().distinct().forEach(val -> System.out.println(val));
        //count()
        long count = letters.stream().distinct().count();
        System.out.println(count);
        //limit()
        List<String> limitedletters = letters.stream().limit(3).collect(Collectors.toList());
        System.out.println(limitedletters);
        //min()
        Optional<String> min = letters.stream().min((v1, v2) -> {
            return v1.compareTo(v2);
        });
        System.out.println(min.get());
        //max()
        Optional<String> max = letters.stream().max((v1, v2) -> {
            return v1.compareTo(v2);
        });
        System.out.println(max.get());
        //reduce
        List<Integer> intl = Arrays.asList(1, 2, 3);
        Optional reduced = intl.stream().reduce((value, combinedvalue) ->
        {
            return combinedvalue + value;
        });
        System.out.println(reduced.get());
        List<String> strnlst = Arrays.asList("a", "b", "c");
        Optional reduced2 = strnlst.stream().reduce((value, combinedvalue) ->
        {
            return combinedvalue + value;
        });
        System.out.println(reduced2.get());
        //toArray()
        Object arr[] = letters.stream().toArray();
        System.out.println(arr.length);
        //sorted
        List<Integer> l1 = Arrays.asList(2, 4, 8, 1, 9, 5);
        List<Integer> l2 = l1.stream().sorted().collect(Collectors.toList());
        System.out.println(l2);
        List<Integer> l3 = l1.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        System.out.println(l3);
        //anyMatch()
        Set<String> letrs = new HashSet<>();
        letrs.add("Aa");
        letrs.add("Ba");
        letrs.add("Cb");
        letrs.add("Dv");
        letrs.add("Ek");
        boolean res = letrs.stream().anyMatch(val -> {
            return val.startsWith("A");
        });
        System.out.println(res);
        //allMatch()
        boolean res1 = letrs.stream().allMatch(val -> {
            return val.startsWith("A");
        });
        System.out.println(res1);
        //noneMatch()
        boolean res2 = letrs.stream().noneMatch(val -> {
            return val.startsWith("A");
        });
        System.out.println(res2);

        //findAny()
        Optional<String> ele = letrs.stream().findAny();
        System.out.println(ele.get());

        //findFirst()
        Optional<String> elem = letrs.stream().findFirst();
        System.out.println(elem.get());

        //concat
        Stream<String> s1 = letters.stream();
        Stream<String> s2 = letrs.stream();
        List<String> fl = Stream.concat(s1, s2).collect(Collectors.toList());
        System.out.println(fl);


    }
    }

