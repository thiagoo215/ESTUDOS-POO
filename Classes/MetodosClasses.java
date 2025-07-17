// Classe Carro
 class Carro {
    String marca;
    String modelo;
    int ano;
    double velocidade;

    public Carro(String marca, String modelo, int ano) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.velocidade = 0.0;
    }

    public void acelerar(double incremento) {
        velocidade += incremento;
    }

    public void frear(double decremento) {
        velocidade -= decremento;
        if (velocidade < 0) velocidade = 0;
    }

    public void exibirInfo() {
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Ano: " + ano);
        System.out.println("Velocidade atual: " + velocidade + " km/h");
        System.out.println("-----------------------------");
    }
}


public class MetodosClasses {
    public static void main(String[] args) {
        Carro carro1 = new Carro("Toyota", "Corolla", 2020);
        Carro carro2 = new Carro("Ford", "Mustang", 2022);

        carro1.acelerar(50);
        carro2.acelerar(70);
        carro2.frear(30);

        carro1.exibirInfo();
        carro2.exibirInfo();
    }
}
