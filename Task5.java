import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.IntStream;

public class Task5 {
    public static void main(String[] args) {
        // Пусть дан произвольный список из 100 целых чисел.
        List<Integer> integerList = new ArrayList<>();
        IntStream.rangeClosed(0, 100).forEach(e -> integerList.add(e, new Random().nextInt(1000)));
        //integerList.forEach(System.out::println);
        System.out.println(integerList);

        // 1) Нужно удалить из него чётные числа
        integerList.removeIf(e -> e % 2 == 0);
        System.out.println(integerList);
        // 2) Найти минимальное значение
        int min = integerList.stream().mapToInt(Integer::intValue).max().orElse(0);
        System.out.println(min);
        // 3) Найти максимальное значение
        int max = integerList.stream().mapToInt(Integer::intValue).min().orElse(0);
        System.out.println(max);
        // 4) Найти среднее значение
        double avg = integerList.stream().mapToInt(Integer::intValue).average().orElse(0);
        System.out.println(avg);
    }
}
