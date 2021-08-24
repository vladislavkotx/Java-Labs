package classwork.java8.words_counter;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;

public class WordsCounter {
    public static long wordsCounter(String path) throws IOException {
        String[] str = Files.readAllLines(Paths.get(path)).toArray(new String[0]);
        return Arrays.stream(str).flatMap(line -> Arrays.stream(line.split("\\W+"))).count();
    }
    
    public static void main(String[] args) throws IOException {
        long cnt = wordsCounter("data\\song.txt");
        System.out.println(cnt);
    }
}
