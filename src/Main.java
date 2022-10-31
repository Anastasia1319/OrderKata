public class Main {
    public static void main(String[] args) {
        System.out.println(Order.orderOne("is2 Thi1s T4est 3a")); //"Thi1s is2 3a T4est"
        System.out.println(Order.orderOne("4of Fo1r pe6ople g3ood th5e the2")); //"Fo1r the2 g3ood 4of th5e pe6ople"
        System.out.println(Order.orderOne("d4o dru7nken sh2all w5ith s8ailor wha1t 3we a6")); //"wha1t sh2all 3we d4o w5ith a6 dru7nken s8ailor"
        System.out.println(Order.orderOne("3 6 4 2 8 7 5 1 9")); //"1 2 3 4 5 6 7 8 9"
        System.out.println(Order.orderOne("Empty input should return empty string")); //This string is null!

    }
}