/*

Grupo

Nome: Ana Beatriz Kapps dos Reis
Matrícula: 201835006

Nome: Marluce Aparecida Vitor
Matrícula: 201935500

*/

import java.io.FileReader;
import java.io.IOException;

public class Main{

    public static void main (String args[]) {
        try {

            Lexical lx = new Lexical(new FileReader( args[0] )); // Abre o arquivo
            Token token = lx.nextToken(); // Busca pelo primeiro token

            while (token != null) { // Enquanto existir tokens
                System.out.println( token.toString() );  // Chama analisador léxico
                token = lx.nextToken(); // Busca próximo token
            }
        
        } catch (IOException e) {
            System.out.println("Error: " + e);
        }
    }
}