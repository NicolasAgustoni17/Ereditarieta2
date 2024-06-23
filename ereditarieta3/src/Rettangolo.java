public class Rettangolo extends Forma {
    @Override
    public void calcolaArea() {
        double base = 10;
        double altezza = 5;
        double area = base * altezza;
        System.out.println("L'area del rettangolo è: " + area);
    }
}