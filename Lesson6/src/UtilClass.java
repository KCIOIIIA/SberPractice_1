package com.js.generics.homework.task;

import java.util.*;

/**
 * Сделайте методы типизированными (Используйте generics)
 */
public class UtilClass {
    /**
     * Возвращает true, если список равен null или если список пуст
     *
     * @param list список.
     * @return true, если список равен null или если список пуст
     */
    public static <E> boolean isBlank(List<E> list) {
        return list == null || list.isEmpty();
    }

    /**
     * Получает последний элемент в коллекции
     * Если список равен null, то выбрасывается исключение IllegalArgumentException
     *
     * @param list список
     * @return последний элемент в коллекции
     */
    public static <E> Object getLastElem(List <E> list) throws IllegalArgumentException {
        if (list != null) {
            return list.get(list.size() - 1);}
        return null;
    }

    /**
     * Получает элемент из списка.
     * Если в аргументах список или элемент равен null, то выбрасывается исключение IllegalArgumentException
     * Если элемент не найден, то возвращаем null
     *
     * @param list список, в котором ищем элемент
     * @param elem элемент, который ищется в списке.
     * @return элемент из списка.
     */
    public static <E> Object findElem(List <E> list, Object elem) throws IllegalArgumentException{
        if ((list != null)&(elem != null)){
            if (list.contains(elem)){
                return list.get(list.indexOf(elem));
            }
        }
        return null;
    }

    /**
     * Объединяет два списка.
     * Если хотя-бы один из аргументов равен null, то выбрасываем исключение IllegalArgumentException
     * Аргументы метода не меняются
     *
     * @param list1 первый список
     * @param list2 второй список
     * @return возвращает объединенный список.
     */
    public static List union(List list1, List list2) throws IllegalArgumentException{
        List list3 = new ArrayList();
        list3.addAll(list1);
        list3.addAll(list2);
        if ((list1 != null)&(list2 != null)){
            return list3;
        }
        return null;
    }

    /**
     * Удаляет все элементы из списка list1, которые встречаются в списке list2
     * Если хотя-бы один из аргументов равен null, то выбрасываем исключение IllegalArgumentException
     * Аргументы метода не меняются
     *
     * @param list1 первый список
     * @param list2 второй список
     * @return возвращает список, который содержит элементы из списка list1, в котором удалены все элементы из
     * списка list2.
     */
    public static List removeAll(List list1, List list2) throws IllegalArgumentException{
        List list3 = new ArrayList();
        if ((list1 != null)&(list2 != null)){
            list3.addAll(list1);
            int k;
            k = list2.size()-1;
            while (k >= 0) {
                if (list3.contains(list2.get(k))) {
                    list3.remove(k);
                }
                k = k - 1;
            }
            return list3;
        }
        return null;
    }

    /**
     * Складывает числа из обоих списков и возвращает сумму.
     * Если хотя-бы один из аргументов равен null, то выбрасываем исключение IllegalArgumentException
     * Аргументы метода не меняются
     * Подсказка:
     * 1) Помните, что все объекты чисел (Integer, Double, Float и т.д) наследуются от общего предка Number.
     * 2) Используйте ограничения для типизации, чтобы списки могли содержать любые числа (Integer, Double, Float и т.д)
     * 3) Для приведения Number к double воспользуйтесь num.doubleValue();
     *
     * @param list1 первый список
     * @param list2 второй список
     * @return сумма чисел.
     */
    public static double sum(List<Double extends Number> list1, List<Double extends Number> list2) throws IllegalArgumentException{
        if ((list1 != null)&(list2 != null)){
            double s;
            int i1, i2;
            i1 = list1.size();
            i2 = list2.size();
            s = 0;
            while ((i1 >= 0)&(i2 >= 0)) {
                s = list1.get(i1) + list2.get(i2);
                i1 = i1 - 1;
                i2 = i2 - 1;
            }
            return s;
        }
        return 0;
    }
}
