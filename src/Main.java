

public class Main {
    public static void main(String[] args) {


        EasyArrayList<String> list = new EasyArrayList<>();
        System.out.println("Заполняем список");
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");
        System.out.println(list);
        System.out.println("Удаляем 2 индекс С");
        list.remove(2);
        System.out.println(list);
        System.out.println("Добавляем по индексу 2 С");
        list.add(2, "C");
        System.out.println(list);
        System.out.println("Добавляем в конец F");
        list.add("F");
        System.out.println(list);
        System.out.println("Удаляем по объекту F");
        list.remove("F");
        System.out.println(list);
        System.out.println("Добавляем в конец F");
        list.add("F");
        System.out.println(list);
        System.out.println("Изменяем F на Е");
        list.set(4, "E");
        System.out.println(list);
        System.out.println("Добавляем в конец F");
        list.add("F");
        System.out.println(list);
        System.out.println("Изменяем F на G");
        list.set(5, "G");
        System.out.println(list);
        System.out.println("Удаляем по объекту G");
        list.remove("G");
        System.out.println("Добавляем в конец F");
        list.add("F");
        System.out.println(list);
        System.out.println("Добавляем по индексу 0 число 1");
        list.add(0, "1");
        System.out.println(list);
        System.out.println("Добавляем по индексу 2 число 2");
        list.add(2, "2");
        System.out.println(list);
        System.out.println("Добавляем в конец G");
        list.add("G");
        System.out.println(list);



        System.out.println("-----------------");
        System.out.println();

        System.out.println("Получение по индексу: " + list.get(0));
        System.out.println("Получение по индексу которого нет: " + list.get(15));
        System.out.println("Получение индекса по объекту: " + list.getIndex("F"));
        System.out.println("Получение индекса по объекту которого нет в списке: " + list.getIndex("M"));
        System.out.println("Поиск элемента: " + list.contains("F"));
        System.out.println("Получение размера листа без нулов только объекты: " + list.size());
        System.out.println("Проверяем список пустой он или нет: " + list.isEmpty());

        System.out.println("Добавляем весь лист в новый лист");
        EasyArrayList<String> list2 = new EasyArrayList<>();
        list2.add("2");
        System.out.println(list2);
        list2.addAll(list);
        System.out.println(list2);
        list2.add("H");
        System.out.println(list2);

        EasyArrayList<Integer> s = new EasyArrayList<>();
        s.add(1);
        s.add(2);
        s.add(3);
        s.add(1);
        System.out.println(s);
        System.out.println("Получаем индекс последнего вхождения нашего элемента: " + s.lastIndexOf(1));
        System.out.println("Очищаем лист");
        list.clear();
        System.out.println(list);


        System.out.println("-----------------------");

        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");
        list.add("F");
        System.out.println();
        EasyArrayList<String> a = new EasyArrayList<>();
        a.add("1");
        a.add("2");
        a.add("3");
        a.add("4");
        System.out.println(a);
        System.out.println(list);

        System.out.println("Добавляем список по индексу");
        list.addAll(0, a);
        System.out.println(list);
        list.add("G");
        System.out.println(list);

        System.out.println("Получение отрезка из нашего списка");
        System.out.println(list.subList(0, 6));
        list.clear();


        System.out.println("method add");
        list.add("BMW");
        list.add("Lada");
        list.add("KIA");
        System.out.println(list);
        System.out.println();

        System.out.println("method get");
        System.out.println("Найденный элемент " + list.get(1));
        System.out.println("не найденный элемент " + list.get(3));
        System.out.println();

        System.out.println("method set");
        list.set(1, "Ferrari");
        list.set(5, "Lexus");
        System.out.println("Изменили лада на феррари");
        System.out.println(list);
        System.out.println();

        System.out.println("method getIndex");
        System.out.println("Правильный индекс " + list.getIndex("Ferrari"));
        System.out.println("Не правильный индекс " + list.getIndex("LADA"));
        System.out.println();

        System.out.println("method contains");
        System.out.println("Не найденный элемент " + list.contains("Lada"));
        System.out.println("Найденный элемент " + list.contains("BMW"));
        list.add(null);
        System.out.println(list);
        System.out.println();

        System.out.println("method addAll");
        EasyArrayList<String> list4 = new EasyArrayList<>();
        list4.add("ss");
        list4.addAll(list);
        System.out.println(list4);
        System.out.println();

        System.out.println("Проверка не сбился ли указатель");
        list4.add("LADA");
        System.out.println(list4);
        System.out.println();

        System.out.println("method add(index) добавили Volvo на 2 индекс");
        list.add(2, "Volvo");
        System.out.println(list);
        System.out.println(list.size());
        System.out.println();

        System.out.println("method remove(index) удалили Ferrari из 1 индекса");
        list.remove(1);
        System.out.println(list);
        System.out.println();

        System.out.println("Проверка не сбился ли указатель добавили LADA в конец списка");
        list.add("LADA");
        System.out.println(list);
        System.out.println();

        System.out.println("method(Object) удалили BMW");
        list.remove("BMW");
        System.out.println(list);
        System.out.println();

        System.out.println("Проверка не сбился ли указатель добавили Ferrari на 2 индекс");
        list.add(2,"Ferrari");
        System.out.println(list);
        System.out.println();
        System.out.println();

        System.out.println("Добавили BMW в конец списка");
        list.add("BMW");
        System.out.println(list);
        System.out.println();

        System.out.println("Добавили Lexus в начало списка");
        list.add(0, "Lexus");
        System.out.println(list);
        System.out.println();
        System.out.println("-------------------------------");
        System.out.println();
        System.out.println("Проверка на расширение листа выходим за границы изначального листа");
        EasyArrayList<String> list3 = new EasyArrayList<>();
        list3.add("A");
        list3.add("B");
        list3.add("C");
        list3.add("D");
        list3.add("E");
        list3.add("F");
        list3.add("G");
        list3.add("H");
        list3.add("K");
        list3.add("L");
        list3.add("M");
        list3.add("N");
        System.out.println(list3);
        System.out.println("Еще раз увеличиваем размер листа");
        list3.add("Y");
        list3.add("X");
        list3.add("Q");
        list3.add("Z");
        System.out.println(list3);
        System.out.println();

        System.out.println("Проверка на урезание листа");
        list3.remove(0);
        list3.remove(0);
        list3.remove(0);
        list3.remove(0);
        list3.remove(0);
        list3.remove(0);
        list3.remove(0);
        list3.remove(0);
        System.out.println(list3);
        list3.remove(0);
        list3.remove(0);
        list3.remove(0);
        list3.remove(0);
        list3.remove(0);
        System.out.println(list3);
        System.out.println();

        System.out.println("Проверка не сбился ли счетчик");
        System.out.println("Добавили А в начало списка и W в конец списка");
        list3.add(0, "A");
        list3.add(4, "W");
        System.out.println(list3);

        System.out.println();
        list3.add(7, "P");
        System.out.println(list3);

    }
}
