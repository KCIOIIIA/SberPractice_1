public interface List extends Collection {

    default void add(int index, Object item) {
        a[index] = item;
        for(int i = index + 1; i <= size() + 1; i ++){
            a[i] = a[i+1];
        }
    }

    default void set(int index, Object item){
        a[index] = item;
    }

    default Object get(int index) throws IndexOutOfBoundsException{
        if ((isEmpty() == false)&(a[index] != null)){
            return a[index];
        }
        return null;
    }

    default int indexOf(Object item){
        int j = -1;
        boolean isFirst = false;
        for (int i = 0; i <= size(); i++){
            if ((a[i] == item)&(isFirst == false)){
                j = i;
                isFirst = true;
            }
        }
        return j;
    }

    default int lastIndexOf(Object item){
        int j = -1;
        for (int i = 0; i <= size(); i++){
            if (a[i] == item){
                j = i;
            }
        }
        return j;
    }

    default Object remove(int index) throws IndexOutOfBoundsException{
        Object copyA;
        if (a[index] != null){
            copyA = a[index];
            a[index] = null
            return copyA;
        }
        return null;
    }

    default List subList(int from, int to) throws IndexOutOfBoundsException{
        return null;
    };
}
