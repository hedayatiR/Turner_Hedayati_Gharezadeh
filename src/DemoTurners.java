public class DemoTurners {
    public static void main(String[] args) {
        Turner page = new Page();
        Turner leaf = new Leaf();
        Turner pancake = new Pancake();
        Turner wheel = new Wheel();
        Turner crank = new Crank();

       Turner[] turners = {page, leaf, pancake, wheel, crank};

        for (int i = 0; i < turners.length; i++) {
            turners[i].turn();
        }
    }
}
