public class MasodfokuHiba {
    public static int masodfokuMegoldasokSzama(double a, double b, double c) {
        if (a == 0) {
            throw new IllegalArgumentException("Nem másodfokú függvény.");
        }

        double discriminant = b * b - 4 * a * c;
        if (discriminant > 0) {
            return 2;
        } else if (discriminant == 0) {
            return 1;
        } else {
            return 0;
        }
    }

    public static void masodfokuGyokok(double a, double b, double c) {
        int megoldasokSzama = masodfokuMegoldasokSzama(a, b, c);

        if (megoldasokSzama == 0) {
            System.out.println("Nincs megoldás.");
        } else {
            double x1 = (-b + Math.sqrt(b * b - 4 * a * c)) / (2 * a);
            double x2 = (-b - Math.sqrt(b * b - 4 * a * c)) / (2 * a);

            if (megoldasokSzama == 1) {
                System.out.println("Egy megoldás van:");
                System.out.println("x = " + x1);
            } else {
                System.out.println("Két megoldás van:");
                System.out.println("x1 = " + x1 + ", x2 = " + x2);
            }
        }
    }

    public static void main(String[] args) {
        double a = 1;
        double b = 3;
        double c = 4;

        System.out.println("Megoldások száma: " + masodfokuMegoldasokSzama(a, b, c));
        masodfokuGyokok(a, b, c);
    }
}
