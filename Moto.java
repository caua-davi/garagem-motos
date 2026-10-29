class Moto {
  String modelo;
  int cilindrada;
  int ano;

void MostrarDetalhes() {
  System.out.println(modelo + " - " + cilindrada + "cc - " + ano);
}

  static void main(String[] args) {
    Moto moto1 = new Moto();
    moto1.modelo = "S1000RR";
    moto1.cilindrada = 1000;
    moto1.ano = 2025;

    moto1.MostrarDetalhes();
  }
}
//primeiro projeto
