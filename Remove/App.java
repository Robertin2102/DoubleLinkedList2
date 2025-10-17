public class App {
    public static void main(String[] args) throws Exception {
        Doublelinkedlist DoubleList= new Doublelinkedlist();
        DoubleList.add(1);
        DoubleList.add(2);
        DoubleList.add(3);
        DoubleList.add(5);

        System.out.println("Antes de eliminar");
        DoubleList.print();
        System.out.println("Despues de eliminar");
        DoubleList.remove(1);
        DoubleList.print();
        DoubleList.printReverse();

    }
}