package ec.edu.epn.laboratorioBJ.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the tiposervicio database table.
 * 
 */
@Entity
@NamedQuery(name="Tiposervicio.findAll", query="SELECT t FROM Tiposervicio t")
public class Tiposervicio implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="id_tiposerv")
	private String idTiposerv;

	@Column(name="descr_ts")
	private String descrTs;

	@Column(name="nombre_ts")
	private String nombreTs;

	//bi-directional many-to-one association to Servicio
	@OneToMany(mappedBy="tiposervicio")
	private List<Servicio> servicios;

	public Tiposervicio() {
	}

	public String getIdTiposerv() {
		return this.idTiposerv;
	}

	public void setIdTiposerv(String idTiposerv) {
		this.idTiposerv = idTiposerv;
	}

	public String getDescrTs() {
		return this.descrTs;
	}

	public void setDescrTs(String descrTs) {
		this.descrTs = descrTs;
	}

	public String getNombreTs() {
		return this.nombreTs;
	}

	public void setNombreTs(String nombreTs) {
		this.nombreTs = nombreTs;
	}

	public List<Servicio> getServicios() {
		return this.servicios;
	}

	public void setServicios(List<Servicio> servicios) {
		this.servicios = servicios;
	}

	public Servicio addServicio(Servicio servicio) {
		getServicios().add(servicio);
		servicio.setTiposervicio(this);

		return servicio;
	}

	public Servicio removeServicio(Servicio servicio) {
		getServicios().remove(servicio);
		servicio.setTiposervicio(null);

		return servicio;
	}

}