package Exercício_01;

public class Main {
    public static void main(String[] args) {

        Veiculos veiculo= new Veiculos();
        veiculo.setMarca("Tesla");
        veiculo.setModelo("Plaid");
        veiculo.setCor("Branco");
        veiculo.setKm("1300km");
        veiculo.setLigado(false);
        veiculo.setVelocidade(0);
        veiculo.setPreço(30000);

        System.out.println("Marca: "+veiculo.getMarca());
        System.out.println("Modelo: "+veiculo.getModelo());
        System.out.println("Cor: "+veiculo.getCor());
        System.out.println("Km: "+ veiculo.getKm());
        System.out.println("Estado atual "+veiculo.isLigado());
        System.out.println("Velocidade atual: "+ veiculo.getVelocidade());
        System.out.println("Preço do carro: "+ veiculo.getPreço());

        veiculo.acelerar();
        veiculo.abastecer(40);
        veiculo.abastecer(30);
        veiculo.frear();
        veiculo.frear();
        veiculo.pintar("Laranja");
        System.out.println("Cor: "+veiculo.getCor());
        veiculo.ligar();
        veiculo.ligar();
        veiculo.desligar();
        veiculo.desligar();



    }
}

