import java.util.Arrays;

public class EasyArrayList<E> {

    private static final int DEF_SIZE = 10;
    private Object[] array;
    private int size = 0;

    public EasyArrayList() {
        array = new Object[DEF_SIZE];
    }

    public EasyArrayList(int size) {
        array = new Object[size];
    }

    /**
     * Добавляем указанный элемент в конец списка.
     * Списки, поддерживающие эту операцию могут накладывать ограничения на то, какие элементы будут добавлены.
     * Элементы типа NULL добавлены не будут
     *
     * @param e Элемент, который будет добавлен к этому списку
     */
    public void add(E e) {
        if (e == null) return;
        if (size == array.length) {
            array = Arrays.copyOf(array, array.length + array.length / 2);
        }
        array[size] = e;
        size++;
    }

    /**
     * Добавляем указанный элемент в наш список в определенное место
     *
     * @param index Значение, которое определяет место куда необходимо вставить элемент
     * @param e     Элемент, который будет добавлен в список
     */
    public void add(int index, E e) {
        if (size == array.length) {
            array = Arrays.copyOf(array, array.length + array.length / 2);
        }
        if (index > size) {
            System.out.println("Указан не правильный индекс");
        } else if (index == size) {
            add(e);
        } else {
            for (int i = size; i > index; i--) {
                array[i] = array[i - 1];
            }
            array[index] = e;
            size++;
        }
    }

    /**
     * Добавляем в конец нашего списка другой список(при условии, что у них один и тот же тип данных)
     *
     * @param list Список который мы хоти добавить
     */
    public void addAll(EasyArrayList<E> list) {
        for (Object o : list.array) {
            add((E) o);
        }
    }

    /**
     * Добавляем в список другой список по индексу
     *
     * @param index Место куда мы хотим сделать вставку
     * @param list  Список, который мы хотим вставить
     */
    public void addAll(int index, EasyArrayList<E> list) {

        if (index == 0) {
            for (int i = 0; i < size; i++) {
                list.add((E) array[i]);

            }
            array = Arrays.copyOf(list.array, list.array.length);
            size = list.size;
        } else if (index == size) {
            addAll(list);
        } else {
            int end = list.size + index;
            int arraySize = size;
            int indexSet = index;
            int listSize = list.size;
            while (end < arraySize + listSize) {
                array[end] = array[index];
                end++;
                index++;
            }
            size = end;
            for (int i = 0; i < list.size; i++) {
                array[indexSet] = list.get(i);
                indexSet++;
            }
        }

    }

    /**
     * Получаем отрезок нашего листа
     *
     * @param start Откуда начинается отрезок(включая стартовый индекс)
     * @param end   Где заканчивается отрезок(не включая конечный индекс)
     * @return Новый список полученный из отрезка который мы указали
     */
    public EasyArrayList<E> subList(int start, int end) {
        EasyArrayList<E> sub = new EasyArrayList<>();
        while (start < end) {
            sub.add((E) array[start]);
            start++;
        }
        return sub;
    }

    /**
     * Получаем индекс последнего вхождения искомого элемента в нашем списке
     *
     * @param e Искомы элемент
     * @return Индекс последнего расположения нашего элемента в списке
     */
    public int lastIndexOf(E e) {
        int index = -1;
        for (int i = 0; i < size; i++) {
            if (array[i].equals(e)) {
                index = i;
            }
        }
        return index;
    }

    /**
     * Удаляем элемент по индексу
     *
     * @param index Позиция элемента в списке
     */
    public void remove(int index) {
        if (array.length > size * 2) {
            array = Arrays.copyOf(array, array.length - size + 2);
        }
        if (index > size + 1) {
            System.out.println("Указан не правильный индекс");
        }
        for (int i = index; i < size; i++) {
            array[i] = array[i + 1];
        }
        array[size] = null;
        size--;
    }

    /**
     * Удаляем элемент, проходимся по списку если находим нужный элемент то его удаляем
     *
     * @param e Искомы элемент в списке
     */
    public void remove(E e) {
        if (array.length > size * 2) {
            array = Arrays.copyOf(array, array.length - size + 2);
        }
        if (getIndex(e) < 0) {
            System.out.println("Такого элемента в списке нет!");
        } else {
            for (int i = getIndex(e); i < size; i++) {
                array[i] = array[i + 1];
            }
            array[size] = null;
            size--;
        }
    }

    /**
     * Очищаем данный список
     */
    public void clear() {
        for (int i = 0; i < size; i++) {
            array[i] = null;
        }
        size = 0;
    }

    /**
     * Получаем размер нашего списка
     *
     * @return Количество элементов в данном списке
     */
    public int size() {
        return size;
    }

    /**
     * Проверяем пустой список или нет
     *
     * @return tru/false в зависимости от пустой ли список или нет
     */
    public boolean isEmpty() {
        return size == 0;
    }

    /**
     * Получаем элемент под заданным индексом в данном списке
     *
     * @param index Индекс искомого элемента
     * @return Найденный элемент или NULL в случае если элемент не найден
     */
    public Object get(int index) {
        if (index > size) {
            return null;
        } else {
            return array[index];
        }
    }

    /**
     * Получаем индекс искомого элемента
     *
     * @param e Элемент который мы ищем в данном списке
     * @return Числовое значение(Позиция на которой находится искомый элемент), в случае если элемента нет возвращается -1
     */
    public int getIndex(E e) {
        for (int i = 0; i < size; i++) {
            if (array[i].equals(e)) {
                return i;
            }
        }
        return -1;
    }

    /**
     * Заменяем элемент по указанной позиции этого списка, на заданный элемент,
     * если элемент не найден выводится соответствующее сообщение
     *
     * @param index Индекс заменяемого элемента
     * @param e     Элемент который должен быть сохранен по заданной позиции
     */
    public void set(int index, E e) {
        if (index > size) {
            System.out.println("Индекс объекта не найден");
        } else {
            array[index] = e;
        }
    }

    /**
     * Проверяем на нахождение элемента в данном списке
     *
     * @param e Искомый элемент
     * @return true/false в зависимости от того нашли мы элемент в этом списке или нет
     */
    public boolean contains(E e) {
        for (Object o : array) {
            if (o == null) continue;
            if (o.equals(e)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public String toString() {
        int iMax = size - 1; // array.length для проверки и отображения NULL в списке
        if (iMax == -1) {
            return "[]";
        }
        StringBuilder builder = new StringBuilder();
        builder.append("[");
        for (int i = 0; i < size; i++) { // array.length
            builder.append(array[i]);
            if (i == iMax) {
                builder.append("]");
            } else {
                builder.append(", ");
            }
        }

        return builder.toString();
    }
}

