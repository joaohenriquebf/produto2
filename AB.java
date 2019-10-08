import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;


public class AB {
public static void main(String[] args) {
try {
FileReader arq = new FileReader("h:\\TrabProd.txt");
BufferedReader lerArq = new BufferedReader(arq);
int soma = 0;
String numero = "";
String linha = lerArq.readLine();
// lê a primeira linha
while (linha != null) {
// System.out.printf("%s\n", linha);
// System.out.println(linha.substring(linha.lastIndexOf(":") + 1));
numero = linha.substring(linha.lastIndexOf(":") + 1);
soma = soma + Integer.valueOf(numero);


linha = lerArq.readLine(); // lê da segunda até a última linha
}
System.out.println(soma);
arq.close();
} catch (IOException e) {
System.err.printf("Erro na abertura do arquivo: %s.\n",
e.getMessage());
}

System.out.println();
}
}
