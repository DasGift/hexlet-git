import java.util.Arrays;
import java.util.function.Function;
import java.util.stream.Collectors;

// Класс, где вызываем методы другого класса
public class Example {
    public static void main(String[] args) {
        // Создаем объект класса
        Greetings greetings = new Greetings();
        // Вызываем метод
        Greetings.countUniqChars("fhfkkkf");
    }
}

class Greetings {

    public static void countUniqChars(String str) {
        var strArr = Arrays.stream(str.split("")).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println(strArr);
    }
}