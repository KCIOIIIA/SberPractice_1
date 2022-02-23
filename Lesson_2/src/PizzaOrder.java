public class PizzaOrder {
    public String title;
    public SizeType size;
    public Boolean sauce;
    public String address;
    public Boolean orderAccepted;

    public PizzaOrder(String title, SizeType size, Boolean sause, String address) {
        this.title = title;
        this.size = size;
        this.sauce = sause;
        this.address = address;
    }
    public Boolean order() {
        String Need = "без соуса";
        if (sauce){
            Need = "с соусом";
        }
        if (orderAccepted = Boolean.TRUE){
            System.out.println("Заказ уже принят.");
        } else {
            orderAccepted = Boolean.TRUE;
            System.out.println("Заказ принят. " + title + ", " + Need + ", " + address);
        }
        return orderAccepted;
    }
    public String cancel() {
        String cancelOfOrder = "Отменять нечего";
        if (orderAccepted){
            cancelOfOrder = "Заказ отменён";
        }
        return cancelOfOrder;
    }
    public String toString() {
        String need = "без соуса";
        String accepted = "Заказ принят. ";
        if (sauce){
            need = "с соусом";
        }
        if (order()){
            accepted = "Поступил заказ. ";
        }
        return accepted + title + ", " + need + " на адрес " + address;
    }
}
