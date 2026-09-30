import java.util.ArrayList;
import java.util.List;
import java.util.function.BinaryOperator;

public class Sobrevivente {

   private String nome;
   private int Saude;
   private List<Coletavel> inventario = new ArrayList<>();

    public Sobrevivente(String nome) {
        this.nome = nome;
        this.Saude = 100;
        
    }

    public void modificarSaude(int qtd) {
        this.Saude += qtd;
        if (this.Saude > 100) this.Saude = 100;
        if (this.Saude < 0) this.Saude = 0;
    }

    public void adicionarItem(int index) {
        if (index >= 0 && index < inventario.size()) {
            Coletavel item = inventario.remove(index);
            item.usar(this);
        } else {
            IO.println("Opção de item inválida!");
        }
    }

    public void usarItem(int index) {
        if (index >= 0 && index < inventario.size()) {
            Coletavel item = inventario.remove(index);
            item.usar(this);
        } else {
            IO.println("Opção de item inválida");
        }
    }

    public void listarInventario() {
        if (inventario.isEmpty()) {
            IO.println("Inventário vazio");
            return;
        }
        IO.println("--- SEU INVENTÁRIO ---");
        for (int i = 0; i <inventario.size(); i++) {
            IO.println((i + 1) + ". " + inventario.get(i).getNome());
        }
    }

    public boolean estaVivo() { return Saude > 0; }
    public String getNome() { return nome; }
    public int getSaude() { return Saude; }
    public boolean temItens() { return !inventario.isEmpty(); }



}

