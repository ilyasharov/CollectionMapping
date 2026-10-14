import java.util.function.Function;

public class ArrayMapper {
    
    /**
     * Применяет функцию к каждому элементу массива и возвращает новый массив
     * 
     * @param <T> тип элементов массива
     * @param array исходный массив
     * @param function функция для преобразования элементов
     * @return новый массив с преобразованными элементами
     */
    @SuppressWarnings("unchecked")
    public static <T> T[] arrayMapping(T[] array, Function<T, T> function) {
        if (array == null) {
            throw new IllegalArgumentException("Массив не может быть null");
        }
        if (function == null) {
            throw new IllegalArgumentException("Функция не может быть null");
        }
        
        // Создаем новый массив того же типа, что и исходный
        T[] result = (T[]) java.lang.reflect.Array.newInstance(
            array.getClass().getComponentType(), 
            array.length
        );
        
        // Применяем функцию к каждому элементу
        for (int i = 0; i < array.length; i++) {
            result[i] = function.apply(array[i]);
        }
        
        return result;
    }
}