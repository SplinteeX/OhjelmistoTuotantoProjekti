public class Laskin {

    private double tulos; // Muuttuja tulokselle

    public void nollaa() { // Nollaa tulosmuuttuja
        tulos = 0.0;
    }

    public double annaTulos() {
        return tulos;
    }

    public void lisaa(double n) {
        tulos += n;
    }

    public void vahenna(double n) {
        tulos -= n;
    }

    public void kerro(double n) {
        tulos *= n;
    }

    public void jaa(double n) {
        if (n == 0) throw new ArithmeticException("Nollalla ei voi jakaa");
        tulos /= n;
    }

    public void nelio(double n) {
        tulos = n * n;
    }

    public void neliojuuri(double n) {
        if (n < 0) throw new ArithmeticException("Negatiiviselle luvulle ei voi laskea neliöjuurta");
        tulos = Math.sqrt(n);
    }

    public void virtaON() {
        System.out.println("Virta päälle");
        tulos = 0.0;
    }

    public void virtaOFF() {
        System.out.println("Virta pois");

    }
}
