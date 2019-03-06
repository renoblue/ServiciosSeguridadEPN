package ec.edu.epn.laboratorioBJ.entities;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the norma database table.
 * 
 */
@Entity
@NamedQuery(name="Norma.findAll", query="SELECT n FROM Norma n")
public class Norma implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="id_norma")
	private String idNorma;

	@Column(name="descripcion_n")
	private String descripcionN;

	@Column(name="nombre_n")
	private String nombreN;

	public Norma() {
	}

	public String getIdNorma() {
		return this.idNorma;
	}

	public void setIdNorma(String idNorma) {
		this.idNorma = idNorma;
	}

	public String getDescripcionN() {
		return this.descripcionN;
	}

	public void setDescripcionN(String descripcionN) {
		this.descripcionN = descripcionN;
	}

	public String getNombreN() {
		return this.nombreN;
	}

	public void setNombreN(String nombreN) {
		this.nombreN = nombreN;
	}

}