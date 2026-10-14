public class Main {
    public static void main(String[] args) {
        // Пример 1: Умножение чисел на 2
        Integer[] numbers = {1, 2, 3, 4, 5};
        Integer[] doubled = ArrayMapper.arrayMapping(numbers, x -> x * 2);
        System.out.println(java.util.Arrays.toString(doubled)); // [2, 4, 6, 8, 10]
        
        // Пример 2: Преобразование строк в верхний регистр
        String[] words = {"hello", "world", "java"};
        String[] upperWords = ArrayMapper.arrayMapping(words, String::toUpperCase);
        System.out.println(java.util.Arrays.toString(upperWords));
        
        // Пример 3: Добавление восклицательного знака к строкам
        String[] greetings = {"Hi", "Hello", "Hey"};
        String[] excited = ArrayMapper.arrayMapping(greetings, s -> s + "!");
        System.out.println(java.util.Arrays.toString(excited));
        
        // Пример 4: Использование с анонимным классом
        Double[] decimals = {1.5, 2.7, 3.14};
        Double[] rounded = ArrayMapper.arrayMapping(decimals, new Function<Double, Double>() {
            @Override
            public Double apply(Double d) {
                return Math.round(d * 100.0) / 100.0;
            }
        });
        System.out.println(java.util.Arrays.toString(rounded)); // [1.5, 2.7, 3.14]
    }
}
