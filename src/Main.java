
//Faça um programa com uma classe pokémon que receba informações de "nome e tipo"
//diretamente na construção do objeto e associe aos campos correlatos.
//O nível do pokémon deve iniciar em um valor aleatório. Adicione um metodo para
//imprimir todos os campos
public class Main {
    public static void main(String[] args) {

        Pokemon pokemon = new Pokemon("Pikachu", "Elétrico");
        pokemon.imprimeDetalhes();

    }
}