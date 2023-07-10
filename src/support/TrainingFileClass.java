package support;

import java.io.*;

public class TrainingFileClass {
    public static void main(String[] args) {

        File arquivo = new File("home/ecoelho/testandoFiles.txt");

        try {
            if(!arquivo.exists()){
                arquivo.createNewFile(); // Cria um arquivo vazio.
            }
            File[]  arquivos = arquivo.listFiles();


            FileWriter fw = new FileWriter(arquivo, true); // Escreve no arquivo.
            BufferedWriter bw = new BufferedWriter(fw);

            bw.write("Testando a classe File");

            bw.newLine();

            fw.close();
            bw.close();


            FileReader fr = new FileReader(arquivo);
            BufferedReader br = new BufferedReader(fr);

            while (br.ready()){  // Enquanto houver mais linhas
                String linha = br.readLine(); // Le a proxima linha
                System.out.println(linha);
            }

            fr.close();
            br.close();

        } catch (IOException e){
            e.printStackTrace();
        }
    }
}
