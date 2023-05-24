package Model;

public class Salad {
    protected static int size = 3;
    public Ingredients[] salad = new Ingredients[size];

    public Salad(int choise) {
        switch (choise) {
            case 1:
                salad[0] = new Carrots();
                salad[1] = new Cabbage();
                salad[2] = new Champignon();
                print_salade(salad);
                break;
            case 2:
                salad[0] = new Tomato();
                salad[1] = new Garlic();
                salad[2] = new Greenery();
                print_salade(salad);
                break;
            case 3:
                salad[0] = new Tomato();
                salad[1] = new Cucumber();
                salad[2] = new Cabbage();
                print_salade(salad);
                break;
        }
    }
    public Salad(){};

    private void print_salade(Ingredients[] salad) {
        System.out.print("Your choise - ");
        for (int i = 0; i <= salad.length - 1; i++) {
            salad[i].print_salad();
        }
    }
}
