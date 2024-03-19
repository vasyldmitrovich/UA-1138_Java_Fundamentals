package com.softserve.edu16.pt;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.function.Function;
import java.util.regex.Pattern;
import java.util.stream.Stream;

public class Pt2 {
    public static void main(String[] args) throws IOException {
        var file = Path.of("D:/pt/pg64317.txt");
        Function<String, Stream<String>> wordSplitter = Pattern.compile("[^a-zA-Z'-]+")
                ::splitAsStream;
        String vowels = "aeiouy";
        long wordCount = Files.lines(file)
                .flatMap(wordSplitter)
                .filter(w -> !w.isEmpty())
                .count();

        long vowelStartedWords = Files.lines(file)
                .flatMap(wordSplitter)
                .filter(w -> !w.isEmpty())
                .filter(w -> vowels.contains(w.substring(0,1).toLowerCase()))
                .count();
        System.out.println("There are " + wordCount + " words");
        System.out.println(vowelStartedWords + " of them started with vowel");

        var wordIterator = Files.lines(file)
                .flatMap(wordSplitter)
                .filter(w -> !w.isEmpty())
                .iterator();
        String prev = wordIterator.next();
        while (wordIterator.hasNext()) {
            String nextWord = wordIterator.next();
            if (nextWord.charAt(0) == prev.charAt(prev.length() - 1)) {
                System.out.println(prev + " " + nextWord);
            }
            prev = nextWord;
        }
    }
}
