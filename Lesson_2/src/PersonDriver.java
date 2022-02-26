public class PersonDriver {
    public static void main(String[] args){
        Phone fly = new Phone(("1(213) 510-25-06"), ("ix35"), (0.876));
        Phone oppo = new Phone(("2(243) 243-23-45"),("007X2"));
        Phone nok = new Phone(("4(565) 021-05-12"), ("CNKL_0_N"), (0.397));
        Phone phone = new Phone();

        System.out.println(fly.getNumber());
        fly.reciveCall(("Zoe"),("5(234) 567-89-10"));
        System.out.println("Модель oppo" + oppo.model);
        oppo.number = "6(125) 550-36-36";

        phone.sendMessage(new String[]{"+79007777777", "+79999999999"});
        System.out.println(nok);
    }
}
