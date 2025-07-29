import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class GeradorArquivo {
    public void salvaJson(Endereco endereco) throws IOException {
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        // Cria a pasta se não existir
        File pasta = new File("enderecos");
        if (!pasta.exists()) {
            pasta.mkdir();
        }

        // Caminho completo do arquivo dentro da pasta "enderecos"
        FileWriter escrita = new FileWriter("enderecos/" + endereco.cep() + ".json");

        escrita.write(gson.toJson(endereco));
        escrita.close();
    }
}
