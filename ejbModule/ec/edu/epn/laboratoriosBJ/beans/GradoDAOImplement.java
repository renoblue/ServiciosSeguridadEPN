package ec.edu.epn.laboratoriosBJ.beans;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;

import ec.edu.epn.generic.DAO.DaoGenericoImplement;
import ec.edu.epn.laboratorioBJ.entities.Grado;

/**
 * Session Bean implementation class GradoDAOImplement
 */
@Stateless
@LocalBean
public class GradoDAOImplement extends DaoGenericoImplement<Grado> implements GradoDAO {

    /**
     * Default constructor. 
     */
    public GradoDAOImplement() {
        // TODO Auto-generated constructor stub
    }

}