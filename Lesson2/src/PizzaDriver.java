public class PizzaDriver {
    public static void main(String[] args){
       PizzaOrder P1 = new PizzaOrder(("Четыре сыра"),(Boolean.FALSE),("Орлова 6"));
       PizzaOrder P2 = new PizzaOrder(("Маргарита"),(Boolean.TRUE),("Ленинградская 36"));
       //System.out.println(P1);
       P2.order();
       P1.order();
       P1.order();

    }
}
