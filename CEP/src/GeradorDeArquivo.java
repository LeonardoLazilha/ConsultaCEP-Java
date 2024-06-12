import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class GeradorDeArquivo {
    public void gerarJson (Endereco endereco) throws IOException {
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        FileWriter escreverArquivo = new FileWriter(endereco.cep() + ".json");
        escreverArquivo.write(gson.toJson(endereco));
        escreverArquivo.close();
    }

}
