package dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import entidades.Funcionario;
import util.JPAUtil;

public class FuncionarioDao {
	public static void salvar(Funcionario f) {
		EntityManager em = JPAUtil.criarEntityManager();
		em.getTransaction().begin();
		em.persist(f);
		em.getTransaction().commit();
		em.close();
	}
	
	public static void editar(Funcionario f) {
		EntityManager em = JPAUtil.criarEntityManager();
		em.getTransaction().begin();
		em.merge(f);
		em.getTransaction().commit();
		em.close();
	}
	

	public static void excluir(Funcionario f) {
		EntityManager em = JPAUtil.criarEntityManager();
		em.getTransaction().begin();
		f = em.find(Funcionario.class, f.getId());
		em.remove(f);
		em.getTransaction().commit();
		em.close();
	}
	
	public static List<Funcionario> listarTodos(){
		EntityManager em = JPAUtil.criarEntityManager();
		Query q = em.createQuery("select f from Funcionario f");
		List<Funcionario> lista = q.getResultList();
		em.close();
		return lista;
	}
	
	public static Funcionario getPorId(Integer id) {
		EntityManager em = JPAUtil.criarEntityManager();
		Funcionario f = em.find(Funcionario.class, id);
		em.close();
		return f;
	}
	
}
