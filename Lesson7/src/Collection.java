public interface Collection{

    default int size(){
        int count = 0;
        for (int i = 0; i <= count; i++) {
            if (a[i] != null) {
                count = count + 1;
            }
        }
        return count;
    }

    default boolean isEmpty(){
        boolean isNotNull = false;
        for (int i = 0; i <= size(); i++) {
            if (a[i] != null) {
                isNotNull = true;
            }
        }
        return isNotNull;
    }

    default boolean constains(Object item){
        boolean isMatch = false;
        for (int i = 0; i <= size(); i++) {
            if (a[i] == item) {
                isMatch = true;
            }
        }
        return isMatch;
    }

    default boolean add(Object item){
        a[size() + 1] = item;
        return true;
    }

    default boolean remove(Object item) {
        boolean isDelete = false;
        for (int i = 0; i <= size(); i++) {
            if (a[i] == item) {
                a[i] = null;
                isDelete = true;
            }
        }
        return isDelete;
    }

    default void clear(){
        for (int i = 0; i <= size(); i++) {
            a[i] = null;
        }
    }
}
