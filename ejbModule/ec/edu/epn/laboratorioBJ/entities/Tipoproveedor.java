package ec.edu.epn.laboratorioBJ.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the tipoproveedor database table.
 * 
 */
@Entity
@NamedQuery(name="Tipoproveedor.findAll", query="SELECT t FROM Tipoproveedor t")
public class Tipoproveedor implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="id_tipoproveedor")
	private String idTipoproveedor;

	@Column(name="descr_tpv")
	private String descrTpv;

	@Column(name="nombre_tpv")
	private String nombreTpv;

	//bi-directional many-to-one association to Proveedor
	@OneToMany(mappedBy="tipoproveedor")
	private List<Proveedor> proveedors;

	public Tipoproveedor() {
	}

	public String getIdTipoproveedor() {
		return this.idTipoproveedor;
	}

	public void setIdTipoproveedor(String idTipoproveedor) {
		this.idTipoproveedor = idTipoproveedor;
	}

	public String getDescrTpv() {
		return this.descrTpv;
	}

	public void setDescrTpv(String descrTpv) {
		this.descrTpv = descrTpv;
	}

	public String getNombreTpv() {
		return this.nombreTpv;
	}

	public void setNombreTpv(String nombreTpv) {
		this.nombreTpv = nombreTpv;
	}

	public List<Proveedor> getProveedors() {
		return this.proveedors;
	}

	public void setProveedors(List<Proveedor> proveedors) {
		this.proveedors = proveedors;
	}

	public Proveedor addProveedor(Proveedor proveedor) {
		getProveedors().add(proveedor);
		proveedor.setTipoproveedor(this);

		return proveedor;
	}

	public Proveedor removeProveedor(Proveedor proveedor) {
		getProveedors().remove(proveedor);
		proveedor.setTipoproveedor(null);

		return proveedor;
	}

}