package ec.edu.epn.laboratorioBJ.entities;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the hidratacion database table.
 * 
 */
@Entity
@Table(name = "`hidratacion`", catalog = "bddcorpepn", schema = "`Laboratorios`")
@NamedQuery(name="Hidratacion.findAll", query="SELECT h FROM Hidratacion h")
public class Hidratacion implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="id_hidratacion")
	private String idHidratacion;

	@Column(name="descr_hi")
	private String descrHi;

	@Column(name="nombre_hi")
	private String nombreHi;

	public Hidratacion() {
	}

	public String getIdHidratacion() {
		return this.idHidratacion;
	}

	public void setIdHidratacion(String idHidratacion) {
		this.idHidratacion = idHidratacion;
	}

	public String getDescrHi() {
		return this.descrHi;
	}

	public void setDescrHi(String descrHi) {
		this.descrHi = descrHi;
	}

	public String getNombreHi() {
		return this.nombreHi;
	}

	public void setNombreHi(String nombreHi) {
		this.nombreHi = nombreHi;
	}

}