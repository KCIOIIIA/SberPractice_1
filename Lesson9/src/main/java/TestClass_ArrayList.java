public class TestClass_ArrayList {
    public static void main(String[] args) {
        ArrayList a = new ArrayList();
        System.out.println("Размер ArrayList = " + a.size());
        a.add(17);
        a.add(-10);
        a.add(27);
        a.add(51);
        System.out.println("Элемент с индексом два = " + a.get(2));
        System.out.println("Удалим элемент с индексом один = " + a.remove(1));
        System.out.println("Элемент с индексом один = " + a.get(1));
        System.out.println("Размер ArrayList = " + a.size());
        a.clear();
    }
}
