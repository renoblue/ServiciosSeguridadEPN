package ec.edu.epn.laboratorioBJ.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the unidadmedida database table.
 * 
 */
@Entity
@NamedQuery(name="Unidadmedida.findAll", query="SELECT u FROM Unidadmedida u")
public class Unidadmedida implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="id_umedida")
	private String idUmedida;

	@Column(name="descr_um")
	private String descrUm;

	@Column(name="medida_um")
	private String medidaUm;

	@Column(name="sigla_um")
	private String siglaUm;

	//bi-directional many-to-one association to Existencia
	@OneToMany(mappedBy="unidadmedida")
	private List<Existencia> existencias;

	public Unidadmedida() {
	}

	public String getIdUmedida() {
		return this.idUmedida;
	}

	public void setIdUmedida(String idUmedida) {
		this.idUmedida = idUmedida;
	}

	public String getDescrUm() {
		return this.descrUm;
	}

	public void setDescrUm(String descrUm) {
		this.descrUm = descrUm;
	}

	public String getMedidaUm() {
		return this.medidaUm;
	}

	public void setMedidaUm(String medidaUm) {
		this.medidaUm = medidaUm;
	}

	public String getSiglaUm() {
		return this.siglaUm;
	}

	public void setSiglaUm(String siglaUm) {
		this.siglaUm = siglaUm;
	}

	public List<Existencia> getExistencias() {
		return this.existencias;
	}

	public void setExistencias(List<Existencia> existencias) {
		this.existencias = existencias;
	}

	public Existencia addExistencia(Existencia existencia) {
		getExistencias().add(existencia);
		existencia.setUnidadmedida(this);

		return existencia;
	}

	public Existencia removeExistencia(Existencia existencia) {
		getExistencias().remove(existencia);
		existencia.setUnidadmedida(null);

		return existencia;
	}

}