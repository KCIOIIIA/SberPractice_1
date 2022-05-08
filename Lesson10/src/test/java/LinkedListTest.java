import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import java.util.LinkedList;

public class LinkedListTest {
    @Test
    public void TestLinkedListSize(){
        LinkedList list = new LinkedList();
        list.add(7);
        list.add(8);
        int size = list.size();
        Assertions.assertEquals(2, size);
    }

    @Test
    public void TestLinkedListIsEmpty(){
        LinkedList list = new LinkedList();
        int size = list.size();
        Assertions.assertEquals(0, size);
    }

    @Test
    public void TestLinkedListContains(){
        LinkedList list = new LinkedList();
        list.add(17);
        boolean isContains = list.contains(17);
        Assertions.assertTrue(isContains);
    }

    @Test
    public void TestLinkedListListAddObject(){
        LinkedList list = new LinkedList();
        list.add(7);
        int size = list.size();
        Assertions.assertEquals(1, size);
    }

    @Test
    public void TestLinkedListRemoveObject(){
        LinkedList list = new LinkedList();
        list.add("My");
        list.add("name");
        list.remove("name");
        int size = list.size();
        Assertions.assertEquals(1, size);
    }

    @Test
    public void TestLinkedListRemoveIndex(){
        LinkedList list = new LinkedList();
        list.add("My");
        list.add("name");
        list.remove(1);
        int size = list.size();
        Assertions.assertEquals(1, size);
    }

    @Test
    public void TestLinkedListClear(){
        LinkedList list = new LinkedList();
        list.add(1);
        list.add(2);
        list.add(3);
        list.clear();
        int size = list.size();
        Assertions.assertEquals(0, size);
    }

    @Test
    public void TestLinkedListAddOIndex(){
        LinkedList list = new LinkedList();
        list.add("Potato");
        list.add("Oil");
        list.add(2, "Tomato");
        int size = list.size();
        Assertions.assertEquals(3, size);
        Assertions.assertEquals("Tomato", list.get(2));
    }

    @Test
    public void TestLinkedListSet(){
        LinkedList list = new LinkedList();
        list.add(0,"Cat");
        list.set(0, "Bird");
        Assertions.assertEquals("Bird", list.get(0));
    }

    @Test
    public void TestLinkedListGet(){
        LinkedList list = new LinkedList();
        list.add("Fish");
        Assertions.assertEquals("Fish", list.get(0));
    }

    @Test
    public void TestLinkedListGetFirst(){
        LinkedList list = new LinkedList();
        list.add("Fish");
        list.add("Water");
        Assertions.assertEquals("Fish", list.getFirst());
    }

    @Test
    public void TestLinkedListGetLast(){
        LinkedList list = new LinkedList();
        list.add("Fish");
        list.add("Water");
        Assertions.assertEquals("Water", list.getLast());
    }
}
