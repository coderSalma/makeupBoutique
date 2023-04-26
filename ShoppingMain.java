// ShoppingMain provides method main for a simple shopping program.

public class ShoppingMain {
    public static void main(String[] args) {
        Catalog list = new Catalog("Makeup Boutique");
        list.add(new Item("Cerave Tinted Moisturizer", 13.99, 2, 19.99));
        list.add(new Item("Morphe Brushes", 30.00, 3, 60));
        list.add(new Item("Too Faced concealer", 34.00));
        list.add(new Item("Fenty Diamond Bomb", 42.00));
        list.add(new Item("Sephora Favorites Kit", 49.99));
        list.add(new Item("Ulta Beauty Sample Kit", 49.99));
        list.add(new Item("NYX Lip Liner", 3.40));
        list.add(new Item("Glow Recipe Serums", 35.00));
        list.add(new Item("Supergoop Sunscreen", 19.99));
        list.add(new Item("Plush Headband", 0.99, 10, 5.0));
        list.add(new Item("Pink Claw Clip", 0.99, 20, 8.95));

        ShoppingFrame f = new ShoppingFrame(list);
        f.setVisible(true);
    }
}
