import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;

public class ArrayListTest{
    @Test
    public void TestArrayListSize(){
        ArrayList a = new ArrayList();
        a.add(7);
        a.add(8);
        int size = a.size();
        Assertions.assertEquals(2, size);
    }

    @Test
    public void TestArrayListIsEmpty(){
        ArrayList a = new ArrayList();
        int size = a.size();
        Assertions.assertEquals(0, size);
    }

    @Test
    public void TestArrayListContains(){
        ArrayList a = new ArrayList();
        a.add(17);
        boolean isContains = a.contains(17);
        Assertions.assertTrue(isContains);
    }

    @Test
    public void TestArrayListListAddObject(){
        ArrayList a = new ArrayList();
        a.add(7);
        int size = a.size();
        Assertions.assertEquals(1, size);
    }

    @Test
    public void TestArrayListRemoveObject(){
        ArrayList a = new ArrayList();
        a.add("My");
        a.add("name");
        a.remove("name");
        int size = a.size();
        Assertions.assertEquals(1, size);
    }

    @Test
    public void TestArrayListRemoveIndex(){
        ArrayList a = new ArrayList();
        a.add("My");
        a.add("name");
        a.remove(1);
        int size = a.size();
        Assertions.assertEquals(1, size);
    }

    @Test
    public void TestArrayListClear(){
        ArrayList a = new ArrayList();
        a.add(1);
        a.add(2);
        a.add(3);
        a.clear();
        int size = a.size();
        Assertions.assertEquals(0, size);
    }

    @Test
    public void TestArrayListAddOIndex(){
        ArrayList a = new ArrayList();
        a.add("Potato");
        a.add("Oil");
        a.add(2, "Tomato");
        int size = a.size();
        Assertions.assertEquals(3, size);
        Assertions.assertEquals("Tomato", a.get(2));
    }

    @Test
    public void TestArrayListSet(){
        ArrayList a = new ArrayList();
        a.add(0,"Cat");
        a.set(0, "Bird");
        Assertions.assertEquals("Bird", a.get(0));
    }

    @Test
    public void TestArrayListGet(){
        ArrayList a = new ArrayList();
        a.add("Fish");
        Assertions.assertEquals("Fish", a.get(0));
    }
}
