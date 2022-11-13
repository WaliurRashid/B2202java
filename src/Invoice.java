public class Invoice {
    String partNum;
    String partDes;
    int quantity;
    double pricePerItem;

    public Invoice(String partNum, String pd, int q, double p){
        this.partNum = partNum;
        partDes = pd;
        quantity = q;
        pricePerItem = p;
    }

    public void getInvoiceAmount(){
        double total = quantity * pricePerItem;
        System.out.println(total);
    }

    public static void main(String[] args) {
        Invoice a = new Invoice("123", "Screw", 20, 1.5);
        a.getInvoiceAmount();
//        System.out.println(a.getInvoiceAmount());
    }

}
