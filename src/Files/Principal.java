package Files;

import java.io.IOException;

public class Principal {
    public static void main(String[] args) throws IOException {

        String path = "/temp/file.txt";

        ManipuladorArquivos.escritor(path);
        ManipuladorArquivos.leitor(path);

    }
}
