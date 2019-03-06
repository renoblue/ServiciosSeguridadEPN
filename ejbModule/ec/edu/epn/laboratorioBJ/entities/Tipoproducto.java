package ec.edu.epn.laboratorioBJ.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the tipoproducto database table.
 * 
 */
@Entity
@NamedQuery(name="Tipoproducto.findAll", query="SELECT t FROM Tipoproducto t")
public class Tipoproducto implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="TIPOPRODUCTO_IDTIPOPROD_GENERATOR", sequenceName="SECUENCIA_TIPOPRODUCTO")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="TIPOPRODUCTO_IDTIPOPROD_GENERATOR")
	@Column(name="id_tipoprod")
	private String idTipoprod;

	@Column(name="descr_tprod")
	private String descrTprod;

	@Column(name="nombre_tprod")
	private String nombreTprod;

	//bi-directional many-to-one association to Existencia
	@OneToMany(mappedBy="tipoproducto")
	private List<Existencia> existencias;

	//bi-directional many-to-one association to Producto
	@OneToMany(mappedBy="tipoproducto")
	private List<Producto> productos;

	public Tipoproducto() {
	}

	public String getIdTipoprod() {
		return this.idTipoprod;
	}

	public void setIdTipoprod(String idTipoprod) {
		this.idTipoprod = idTipoprod;
	}

	public String getDescrTprod() {
		return this.descrTprod;
	}

	public void setDescrTprod(String descrTprod) {
		this.descrTprod = descrTprod;
	}

	public String getNombreTprod() {
		return this.nombreTprod;
	}

	public void setNombreTprod(String nombreTprod) {
		this.nombreTprod = nombreTprod;
	}

	public List<Existencia> getExistencias() {
		return this.existencias;
	}

	public void setExistencias(List<Existencia> existencias) {
		this.existencias = existencias;
	}

	public Existencia addExistencia(Existencia existencia) {
		getExistencias().add(existencia);
		existencia.setTipoproducto(this);

		return existencia;
	}

	public Existencia removeExistencia(Existencia existencia) {
		getExistencias().remove(existencia);
		existencia.setTipoproducto(null);

		return existencia;
	}

	public List<Producto> getProductos() {
		return this.productos;
	}

	public void setProductos(List<Producto> productos) {
		this.productos = productos;
	}

	public Producto addProducto(Producto producto) {
		getProductos().add(producto);
		producto.setTipoproducto(this);

		return producto;
	}

	public Producto removeProducto(Producto producto) {
		getProductos().remove(producto);
		producto.setTipoproducto(null);

		return producto;
	}

}