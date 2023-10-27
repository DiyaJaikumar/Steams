package streamDemo;

import java.util.ArrayList;
import java.util.List;

import java.util.Arrays;
import java.util.stream.Collectors;

public class Mapclass {
    public static void main(String[] args) {
        List<String> letters= Arrays.asList("a","b","C","d");
        List<String> ucletters= new ArrayList<>();
        ucletters= letters.stream().map(l->l.toUpperCase()).collect(Collectors.toList());
        System.out.println(ucletters);
    }
}

