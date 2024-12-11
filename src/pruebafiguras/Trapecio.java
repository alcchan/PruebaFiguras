package pruebafiguras;


public class Trapecio {
    int baseMayor;
    int baseMenor;
    int altura;
    int lado1;
    int lado2;

    public Trapecio(int baseMayor, int baseMenor, int altura, int lado1, int lado2) {
        this.baseMayor = baseMayor;
        this.baseMenor = baseMenor;
        this.altura = altura;
        this.lado1 = lado1;
        this.lado2 = lado2;
    }

    double calcularArea() {
        return ((baseMayor + baseMenor) * altura) / 2;
    }

    double calcularPerimetro() {
        return baseMayor + baseMenor + lado1 + lado2;
    }

    void determinarPropiedades() {
        if (baseMayor == baseMenor) {
            System.out.println("Es un trapecio isósceles.");
        } else {
            System.out.println("Es un trapecio escaleno.");
        }
    }
    
}
