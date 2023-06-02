import javax.swing.JOptionPane;

public class Dados {
    private int id;
    private String nome;
    private int numero;
    private int cep;
    private String bairro;
    private String cidade;
    private String uf;
    private int telefone;
    private int cpfcnpj;
    private String situacao;
    private String cargo;
    private String nomefantasia;
    private String website;
    private int nassociado;
    private String perfil;
    
        
    
    public Dados() {
        this.perfil = JOptionPane.showInputDialog("Perfil: ");
        this.id = Integer.parseInt(JOptionPane.showInputDialog("ID: "));
        this.nome = JOptionPane.showInputDialog("Nome: ");
        this.setNumero (Integer.parseInt(JOptionPane.showInputDialog("Número: ")));
        this.setCep (Integer.parseInt(JOptionPane.showInputDialog("CEP: ")));
        this.setTelefone (Integer.parseInt(JOptionPane.showInputDialog("Telefone: ")));
        this.setCpfcnpj (Integer.parseInt(JOptionPane.showInputDialog("CPF: ")));
        this.setId (Integer.parseInt(JOptionPane.showInputDialog("ID: ")));
        this.bairro = JOptionPane.showInputDialog("Bairro: ");
        this.cidade = JOptionPane.showInputDialog("Cidade: ");
        this.uf = JOptionPane.showInputDialog("UF: ");
    }
    
    public int getId() {
        return id;
    }
    
    public void setId(int id) {
        this.id = id;
    }
    
    public String getNome() {
        return nome;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public int getNumero() {
        return numero;
    }
    
    public void setNumero(int numero) {
        this.numero = numero;
    }
    
    public int getCep() {
        return cep;
    }
    
    public void setCep(int cep) {
        this.cep = cep;
    }
    
    public String getBairro() {
        return bairro;
    }
    
    public void setBairro(String bairro) {
        this.bairro = bairro;
    }
    
    public String getCidade() {
        return cidade;
    }
    
    public void setCidade(String cidade) {
        this.cidade = cidade;
    }
    
    public String getUf() {
        return uf;
    }
    
    public void setUf(String uf) {
        this.uf = uf;
    }
    
    public int getTelefone() {
        return telefone;
    }
    
    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }
    
    public int getCpfcnpj() {
        return cpfcnpj;
    }
    
    public void setCpfcnpj(int cpfcnpj) {
        this.cpfcnpj = cpfcnpj;
    }
    
    public String getSituacao() {
        return situacao;
    }
    
    public void setSituacao(String situacao) {
        this.situacao = situacao;
    }
    public String getCargo() {
        return cargo;
    }
    
    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
    public String getNomefantasia() {
        return nomefantasia;
    }
    
    public void setNomefantasia(String nomefantasia) {
        this.nomefantasia = nomefantasia;
    }
    public String getWebsite() {
        return website;
    }
    
    public void setWebsite(String website) {
        this.website = website;
    }
    public int getnassociado() {
        return nassociado;
    }
    
    public void setNassociado(int nassociado) {
        this.nassociado = nassociado;
    }
    public String getPerfil() {
        return perfil;
    }

    public void setPerfil(String perfil) {
        this.perfil = perfil;
    }
}