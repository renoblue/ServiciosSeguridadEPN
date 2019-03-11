package ec.edu.epn.laboratoriosBJ.beans;

import javax.ejb.Stateless;

//import com.itextpdf.text.List;

import ec.edu.epn.generic.DAO.DaoGenericoImplement;
import ec.edu.epn.laboratorioBJ.entities.Hidratacion;

@Stateless
public class HidratacionDAOImplement extends DaoGenericoImplement<Hidratacion> implements HidratacionDAO{

	public HidratacionDAOImplement() {
		
	}
	
}
