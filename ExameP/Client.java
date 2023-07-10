package ExameP;

import java.util.Objects;

public class Client {
    private int TaxId;
    private String nome;
    private ClientType tipo;

    public Client(int TaxId, String nome, ClientType tipo) {
        this.TaxId = TaxId;
        this.nome = nome;
        this.tipo = tipo;
    }

    public int getTaxId() {
        return this.TaxId;
    }

    public void setTaxId(int TaxId) {
        this.TaxId = TaxId;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public ClientType getTipo() {
        return this.tipo;
    }

    public void setTipo(ClientType tipo) {
        this.tipo = tipo;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Client)) {
            return false;
        }
        Client client = (Client) o;
        return TaxId == client.TaxId && Objects.equals(nome, client.nome) && Objects.equals(tipo, client.tipo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(TaxId, nome, tipo);
    }

    @Override
    public String toString() {
        return getNome() + ", " + getTaxId() + ", " + getTipo();
    }

}
