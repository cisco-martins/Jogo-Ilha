public class Ferramentas extends Recurso {

    private int protecao;

    public Ferramentas(String nome, int protecao) {
        super(nome);
        this.protecao = protecao;
    }
    @Override
    public void usar(Sobrevivente sobrevivente) {
        IO.println("Você usou " + nome + " para se proteger e ganhou " + protecao + " de resistência");
        Sobrevivente.modificarSaude(protecao);

    }

}
