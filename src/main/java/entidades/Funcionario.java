package entidades;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Funcionario {
	@Id
	@GeneratedValue
	private Integer id;
	private String nome;
	@Temporal(TemporalType.DATE)
	@Column(name = "data_admissao")
	private Date dataAdmissao;
	@Column(name = "tipo_contrato")
	private String tipoContrato;
	@Column(length = 100)
	private String setor;
	@Column(length = 100)
	private String cargo;
	@Column(name = "nota_avaliacao")
	private Integer notaAvaliacao;
	private String atividades;
	
	public String toString() {
		return id + " - " + nome;
	}
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Date getDataAdmissao() {
		return dataAdmissao;
	}
	public void setDataAdmissao(Date dataAdmissao) {
		this.dataAdmissao = dataAdmissao;
	}
	public String getTipoContrato() {
		return tipoContrato;
	}
	public void setTipoContrato(String tipoContrato) {
		this.tipoContrato = tipoContrato;
	}
	public String getSetor() {
		return setor;
	}
	public void setSetor(String setor) {
		this.setor = setor;
	}
	public String getCargo() {
		return cargo;
	}
	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
	public Integer getNotaAvaliacao() {
		return notaAvaliacao;
	}
	public void setNotaAvaliacao(Integer notaAvaliacao) {
		this.notaAvaliacao = notaAvaliacao;
	}
	public String getAtividades() {
		return atividades;
	}

	public void setAtividades(String atividades) {
		this.atividades = atividades;
	}
	
	
}
