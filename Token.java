/*

Grupo

Nome: Ana Beatriz Kapps dos Reis
Matrícula: 201835006

Nome: Marluce Aparecida Vitor
Matrícula: 201935500

*/

public class Token {
    private int linha, coluna; // Marcadores de linhas e colunas
    private TokenType tipo; // Tipo do token
    private String lexema; // Lexema
    private Object valor; // Valor Atribuido

    public Token (TokenType tipo, String lexema, int linha, int coluna){
        this.tipo = tipo;
        this.lexema = lexema;
        this.valor = null;
        this.linha = linha;
        this.coluna = coluna;
    }

    // Caso seja do tipo Int, Float, Char, Caracter: Recebe o valor da informação
    public Token (TokenType tipo, Object obj, int linha, int coluna ){
        this.tipo = tipo;
        this.lexema = null;
        this.valor = obj;
        this.linha = linha;
        this.coluna = coluna;
    }

    @Override public String toString(){
        //Saída
        if(lexema == null){
            return tipo.name() + (valor == null ? "" : ": " + valor.toString());
        }else{
            return lexema + (valor == null ? "" : ": " + valor.toString());
        }
    }
}