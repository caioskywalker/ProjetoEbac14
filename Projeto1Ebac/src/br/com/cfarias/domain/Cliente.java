package br.com.cfarias.domain;



import java.util.Objects;

public class Cliente {
    

	private String nome;
    private String end;
    private String cidade;
    private String estado;
    private Integer idade;
    private Integer num;
    private Long tel;
    private Long cpf;


    public Cliente (String nome, String end, String cidade, String estado, String idade, String cpf, String numero, String tel){

        this.nome = nome;
        this.end = end;
        this.cidade = cidade;
        this.estado = estado;
        this.idade = (Integer.valueOf(idade.replaceAll("\\s+", "")));
        this.cpf = (Long.valueOf(cpf.replaceAll("[\\s.-]+", "")));;
        this.num = (Integer.valueOf(numero.replaceAll("\\s+", "")));;
        this.tel = (Long.valueOf(tel.replaceAll("[\\s.-]+", "")));;

        System.out.println(this.getCidade());
        System.out.println(this.getNome());
        System.out.println(this.getNum());
        System.out.println(this.getCpf());
        System.out.println(this.getEstado());
        System.out.println(this.getEnd());
        System.out.println(this.getTel());
        System.out.println(this.getIdade());


    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEnd() {
        return end;
    }

    public void setEnd(String end) {
        this.end = end;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    public Integer getNum() {
        return num;
    }

    public void setNum(Integer num) {
        this.num = num;
    }

    public Long getTel() {
        return tel;
    }

    public void setTel(Long tel) {
        this.tel = tel;
    }

    public Long getCpf() {
        return cpf;
    }

    public void setCpf(Long cpf) {
        this.cpf = cpf;
    }

    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cliente cliente = (Cliente) o;
        return Objects.equals(cpf, cliente.cpf);
    }

    public int hashCode() {
        return Objects.hash(cpf);
    }
    
    public String toString() {
		return "Cliente [nome=" + nome + ", cpf=" + cpf + "]";
	}
    
}
