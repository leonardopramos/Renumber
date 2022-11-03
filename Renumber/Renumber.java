//Leonardo Preczevski Ramos
import java.io.IOException;
import java.io.Writer;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;
import java.io.FileWriter;
import java.io.BufferedWriter;

public class Renumber {
    public void loadProgram(String narq) {

        String currDir = Paths.get("").toAbsolutePath().toString();
        String nameComplete = currDir+"\\"+narq; 
        Path path2 = Paths.get(nameComplete); 

        try (Scanner sc = new Scanner(Files.newBufferedReader(path2, Charset.defaultCharset()))){

            int a = 10;

            while(sc.hasNextLine()) { 
                String linha = sc.nextLine(); 
                linha = Integer.toString(a) + " " + linha.substring(3,linha.length());
                String auxiliar = narq.substring(0,5);
                String novoNomePath = currDir+"\\.bas alterados\\"+auxiliar+"-rn.bas"; 
                Writer writer = new BufferedWriter(new FileWriter(novoNomePath, true));;
                writer.append(linha + "\n");    
                writer.close();
                a += 10;
            }    
            System.out.println("Renumber: " + narq);
        }catch (IOException x){
            System.err.format("Erro de E/S: %s%n", x);
        }
    }
}
