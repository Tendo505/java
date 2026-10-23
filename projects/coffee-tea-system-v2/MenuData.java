public class MenuData {
    private MenuItem[] coffeeMenu;
    private MenuItem[] teaMenu;

    public MenuData() {
        // Initialize Coffee Menu
        coffeeMenu = new MenuItem[6];
        coffeeMenu[0] = new MenuItem("Espresso", 3.50);
        coffeeMenu[1] = new MenuItem("Americano", 3.00);
        coffeeMenu[2] = new MenuItem("Cappuccino", 4.50);
        coffeeMenu[3] = new MenuItem("Latte", 4.50);
        coffeeMenu[4] = new MenuItem("Macchiato", 4.00);
        coffeeMenu[5] = new MenuItem("Mocha", 5.00);

        // Initialize Tea Menu
        teaMenu = new MenuItem[6];
        teaMenu[0] = new MenuItem("Green Tea", 2.50);
        teaMenu[1] = new MenuItem("Black Tea", 2.50);
        teaMenu[2] = new MenuItem("Oolong Tea", 3.00);
        teaMenu[3] = new MenuItem("Chamomile Tea", 3.00);
        teaMenu[4] = new MenuItem("Matcha Latte", 4.50);
        teaMenu[5] = new MenuItem("Chai Latte", 3.50);
    }

    public MenuItem[] getCoffeeMenu() {
        return coffeeMenu;
    }

    public MenuItem[] getTeaMenu() {
        return teaMenu;
    }
}
