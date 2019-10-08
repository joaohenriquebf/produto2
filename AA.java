import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;


public class AA {


public static void main(String[] args) throws IOException {
int i, n;

FileWriter arq = new FileWriter("h:\\TrabProdut.txt");
PrintWriter gravarArq = new PrintWriter(arq);

for (i=1; i<=10; i++) {
gravarArq.printf(i+":"+i*i+":"+i*i*i);
gravarArq.printf("\n");
}

arq.close();

System.out.printf("\nGravado com sucesso em \"h:\\TrabProd.txt\".\n");
}

}
