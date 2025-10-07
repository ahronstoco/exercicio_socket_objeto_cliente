
import java.io.Serializable;
import javax.swing.JOptionPane;

public class Cliente implements Serializable {

    private int codigo;
    private String nome;
    private String endereco;
    private double salario;
    private int idade;

    public Cliente() {
        setCodigo(0);
        setNome("");
        setEndereco("");
        setSalario(0.0);
        setIdade(0);
    }

    public Cliente(int _codigo, String _nome, String _endereco, double _salario, int _idade) {
        setCodigo(_codigo);
        setNome(_nome);
        setEndereco(_endereco);
        setSalario(_salario);
        setIdade(_idade);
    }

    public void setCodigo(int _codigo) {
        codigo = _codigo;
    }

    public void setNome(String _nome) {
        nome = _nome;
    }

    public void setEndereco(String _endereco) {
        endereco = _endereco;
    }

    public void setSalario(double _salario) {
        salario = _salario;
    }

    public void setIdade(int _idade) {
        idade = _idade;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getNome() {
        return nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public double getSalario() {
        return salario;
    }

    public int getIdade() {
        return idade;
    }

    public void leitura() {
        setCodigo(Integer.parseInt(JOptionPane.showInputDialog("Insira o código.")));
        setNome(JOptionPane.showInputDialog("Insira o nome."));
        setEndereco(JOptionPane.showInputDialog("Insira o endereço."));
        setSalario(Double.parseDouble(JOptionPane.showInputDialog("Insira o salário.")));
        setIdade(Integer.parseInt(JOptionPane.showInputDialog("Insira a idade.")));

    }

    public void imprimir() {
        JOptionPane.showMessageDialog(null, "Código: " + getCodigo() + "\nNome: " + getNome() + "\nEndereço: " + getEndereco() + "\nSalário: " + getSalario() + "\nIdade: " + getIdade());
    }

    @Override
    public String toString() {
        return ("Código: " + getCodigo() + "\nNome: " + getNome() + "\nEndereço: " + getEndereco() + "\nSalário: " + getSalario() + "\nIdade: " + getIdade());
    }
}
