package bean;

import java.util.List;

import javax.faces.application.FacesMessage;import javax.faces.application.FacesMessage.Severity;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;

import dao.FuncionarioDao;
import entidades.Funcionario;
import static util.MessageUtil.*;

@ManagedBean
public class FuncionarioBean {
	private Funcionario funcionario = new Funcionario();
	private List<Funcionario> lista;
	
	public String salvar() {
		try {
			FuncionarioDao.salvar(funcionario);
			sucesso("Sucesso", "Funcionário salvo com sucesso");
			funcionario = new Funcionario();
		} catch (Exception e) {
			erro("Erro", "Erro ao salvar o funcionário");
		}
		return null;
	}
	
	public Funcionario getFuncionario() {
		return funcionario;
	}
	public void setFuncionario(Funcionario funcionario) {
		this.funcionario = funcionario;
	}
	public List<Funcionario> getLista() {
		if (lista == null) {
			lista = FuncionarioDao.listarTodos();
		}
		return lista;
	}
	public void setLista(List<Funcionario> lista) {
		this.lista = lista;
	}

}
