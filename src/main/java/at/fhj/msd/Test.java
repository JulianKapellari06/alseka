package at.fhj.msd;

public class Test {

    public static void main(String[] args) {
        DrinksQueue queue = new DrinksQueue(5);
        Liquid liquid = new Liquid("Long Island Icetea", 2, 2);
        System.out.println(queue.offer(new SimpleDrink("sbkjd", liquid)));

        System.out.println(queue.offer(new SimpleDrink("sbkjd2", liquid)));
        System.out.println(queue.remove());
        System.out.println(queue.offer(new SimpleDrink("sbkjd3", liquid)));

        System.out.println(queue.poll());

    }
}
