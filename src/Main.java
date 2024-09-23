public class Main {
    public static void main(String[] args) {
        double sumCost = 50.99;
        double fallCost = 30.74;
        double wintCost = 200.43;
        double springCost = 20.21;
        double yearCost = 0;
        yearCost = sumCost+fallCost+wintCost+springCost;

        System.out.println("The total cost for summer was "+sumCost+", the toal cost for fall was "+fallCost+
                ", the total cost for winter was "+wintCost+", and the total cost for spring was "+springCost);
        System.out.println("This makes the total cost for maintenance during the year "+yearCost);
    }
}