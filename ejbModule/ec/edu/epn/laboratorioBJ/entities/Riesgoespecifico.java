package ec.edu.epn.laboratorioBJ.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the riesgoespecifico database table.
 * 
 */
@Entity
@NamedQuery(name="Riesgoespecifico.findAll", query="SELECT r FROM Riesgoespecifico r")
public class Riesgoespecifico implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="id_riesgoespecifico")
	private String idRiesgoespecifico;

	@Column(name="descr_re")
	private String descrRe;

	@Column(name="nombre_re")
	private String nombreRe;

	//bi-directional many-to-one association to Producto
	@OneToMany(mappedBy="riesgoespecifico")
	private List<ProductoLab> productos;

	public Riesgoespecifico() {
	}

	public String getIdRiesgoespecifico() {
		return this.idRiesgoespecifico;
	}

	public void setIdRiesgoespecifico(String idRiesgoespecifico) {
		this.idRiesgoespecifico = idRiesgoespecifico;
	}

	public String getDescrRe() {
		return this.descrRe;
	}

	public void setDescrRe(String descrRe) {
		this.descrRe = descrRe;
	}

	public String getNombreRe() {
		return this.nombreRe;
	}

	public void setNombreRe(String nombreRe) {
		this.nombreRe = nombreRe;
	}

	public List<ProductoLab> getProductos() {
		return this.productos;
	}

	public void setProductos(List<ProductoLab> productos) {
		this.productos = productos;
	}

	public ProductoLab addProducto(ProductoLab producto) {
		getProductos().add(producto);
		producto.setRiesgoespecifico(this);

		return producto;
	}

	public ProductoLab removeProducto(ProductoLab producto) {
		getProductos().remove(producto);
		producto.setRiesgoespecifico(null);

		return producto;
	}

}