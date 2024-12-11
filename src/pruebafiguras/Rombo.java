package pruebafiguras;

public class Rombo {
    int diagonalMayor;
    int diagonalMenor;
    int lado;

    public Rombo(int diagonalMayor, int diagonalMenor, int lado) {
        this.diagonalMayor = diagonalMayor;
        this.diagonalMenor = diagonalMenor;
        this.lado = lado;
    }
    
    double calcularArea() {
        return (diagonalMayor * diagonalMenor) / 2;
    }

    double calcularPerimetro() {
        return 4 * lado;
    }

    void determinarPropiedades() {
        if (diagonalMayor == diagonalMenor) {
            System.out.println("Es un rombo con diagonales iguales (un cuadrado).");
        } else {
            System.out.println("Es un rombo con diagonales diferentes.");
        }
    }
    
}
