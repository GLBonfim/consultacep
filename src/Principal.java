import java.io.IOException;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Principal {
    public static void main(String[] args) throws InterruptedException {
        Scanner leitura = new Scanner(System.in);
        String busca = "";
        ConsultaCep consultaCep = new ConsultaCep();

        while (!busca.equalsIgnoreCase("sair")) {
            System.out.println("Digite o CEP para consulta (ou 'sair' para encerrar):");
            busca = leitura.nextLine();

            if (busca.equalsIgnoreCase("sair")) {
                System.out.println("Finalizando aplicação");
                break;
            }

            System.out.print("Consultando");
            for (int i = 0; i < 3; i++) {
                System.out.print(".");
                Thread.sleep(500); // pausa meio segundo entre pontos
            }
            System.out.print("\r"); // volta ao início da linha
            System.out.println("✅ Consulta finalizada!");


            try {
                Endereco novoEndereco = consultaCep.buscaEndereco(busca);
                System.out.println(novoEndereco);
                GeradorArquivo gerar = new GeradorArquivo();
                gerar.salvaJson(novoEndereco);
            } catch (RuntimeException | IOException e) {
                System.out.println(e.getMessage());
                System.out.println("Finalizando aplicação");

            }
        }


    }
}