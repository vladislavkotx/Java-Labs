package classwork.java8.words_counter;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        String[] str = Files.readAllLines(Paths.get("C:\\Users\\vladi\\Desktop\\Proj\\Java_labs\\data\\song.txt")).toArray(new String[0]);
        long cnt = Arrays.stream(str).flatMap(line -> Arrays.stream(line.split("\\W+"))).count();
        System.out.println(cnt);
    }
}
