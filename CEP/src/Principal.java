import java.io.IOException;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        ConsultaCep consultaCep = new ConsultaCep();

        Scanner leitura = new Scanner(System.in);
        System.out.println("Digite um cep: ");
        String cep = leitura.nextLine();

        try {
            Endereco novoEndereco = consultaCep.buscarEndereco(cep);
            System.out.println(novoEndereco);
            GeradorDeArquivo geradorDeArquivo = new GeradorDeArquivo();
            geradorDeArquivo.gerarJson(novoEndereco);
        }catch (RuntimeException | IOException e){
            System.out.println(e.getMessage());
            System.out.println("\n Aplicaçao finalizada.");
        }

    }
}
