/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MVC.dados;

import MVC.classes.Funcionario;
import javax.persistence.EntityManagerFactory;

/**
 *
 * @author Rodrigo
 */
public class FuncionarioDAO extends DAOGenerico<Funcionario> {
    
    public FuncionarioDAO(EntityManagerFactory emf) {
		super(emf);
	}
}
