package org.freedom.persist.entity;

// Generated 30/01/2013 08:30:43 by Hibernate Tools 3.4.0.CR1

import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Eqserie generated by hbm2java
 */
@Entity
@Table(name = "EQSERIE")
public class Eqserie implements java.io.Serializable {

	private EqserieId id;
	private Sgfilial sgfilial;
	private Eqproduto eqproduto;
	private Date dtfabricserie;
	private Date dtvalidserie;
	private String obsserie;
	private Date dtins;
	private Date hins;
	private String idusuins;
	private Date dtalt;
	private Date halt;
	private String idusualt;
	private Set<Cpitcompraserie> cpitcompraseries = new HashSet<Cpitcompraserie>(
			0);
	private Set<Eqmovserie> eqmovseries = new HashSet<Eqmovserie>(0);
	private Set<Eqitrecmercitos> eqitrecmercitoses = new HashSet<Eqitrecmercitos>(
			0);
	private Set<Eqitrecmerc> eqitrecmercs = new HashSet<Eqitrecmerc>(0);
	private Set<Vditvenda> vditvendas = new HashSet<Vditvenda>(0);
	private Set<Cpitcompra> cpitcompras = new HashSet<Cpitcompra>(0);
	private Set<Vditvendaserie> vditvendaseries = new HashSet<Vditvendaserie>(0);
	private Set<Eqitrecmercserie> eqitrecmercseries = new HashSet<Eqitrecmercserie>(
			0);

	public Eqserie() {
	}

	public Eqserie(EqserieId id, Sgfilial sgfilial, Eqproduto eqproduto,
			Date dtins, Date hins, String idusuins) {
		this.id = id;
		this.sgfilial = sgfilial;
		this.eqproduto = eqproduto;
		this.dtins = dtins;
		this.hins = hins;
		this.idusuins = idusuins;
	}

	public Eqserie(EqserieId id, Sgfilial sgfilial, Eqproduto eqproduto,
			Date dtfabricserie, Date dtvalidserie, String obsserie, Date dtins,
			Date hins, String idusuins, Date dtalt, Date halt, String idusualt,
			Set<Cpitcompraserie> cpitcompraseries, Set<Eqmovserie> eqmovseries,
			Set<Eqitrecmercitos> eqitrecmercitoses,
			Set<Eqitrecmerc> eqitrecmercs, Set<Vditvenda> vditvendas,
			Set<Cpitcompra> cpitcompras, Set<Vditvendaserie> vditvendaseries,
			Set<Eqitrecmercserie> eqitrecmercseries) {
		this.id = id;
		this.sgfilial = sgfilial;
		this.eqproduto = eqproduto;
		this.dtfabricserie = dtfabricserie;
		this.dtvalidserie = dtvalidserie;
		this.obsserie = obsserie;
		this.dtins = dtins;
		this.hins = hins;
		this.idusuins = idusuins;
		this.dtalt = dtalt;
		this.halt = halt;
		this.idusualt = idusualt;
		this.cpitcompraseries = cpitcompraseries;
		this.eqmovseries = eqmovseries;
		this.eqitrecmercitoses = eqitrecmercitoses;
		this.eqitrecmercs = eqitrecmercs;
		this.vditvendas = vditvendas;
		this.cpitcompras = cpitcompras;
		this.vditvendaseries = vditvendaseries;
		this.eqitrecmercseries = eqitrecmercseries;
	}

	@EmbeddedId
	@AttributeOverrides({
			@AttributeOverride(name = "numserie", column = @Column(name = "NUMSERIE", nullable = false, length = 30)),
			@AttributeOverride(name = "codprod", column = @Column(name = "CODPROD", nullable = false)),
			@AttributeOverride(name = "codfilial", column = @Column(name = "CODFILIAL", nullable = false)),
			@AttributeOverride(name = "codemp", column = @Column(name = "CODEMP", nullable = false)) })
	public EqserieId getId() {
		return this.id;
	}

	public void setId(EqserieId id) {
		this.id = id;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({
			@JoinColumn(name = "CODFILIAL", referencedColumnName = "CODFILIAL", nullable = false, insertable = false, updatable = false),
			@JoinColumn(name = "CODEMP", referencedColumnName = "CODEMP", nullable = false, insertable = false, updatable = false) })
	public Sgfilial getSgfilial() {
		return this.sgfilial;
	}

	public void setSgfilial(Sgfilial sgfilial) {
		this.sgfilial = sgfilial;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({
			@JoinColumn(name = "CODPROD", referencedColumnName = "CODPROD", nullable = false, insertable = false, updatable = false),
			@JoinColumn(name = "CODFILIAL", referencedColumnName = "CODFILIAL", nullable = false, insertable = false, updatable = false),
			@JoinColumn(name = "CODEMP", referencedColumnName = "CODEMP", nullable = false, insertable = false, updatable = false) })
	public Eqproduto getEqproduto() {
		return this.eqproduto;
	}

	public void setEqproduto(Eqproduto eqproduto) {
		this.eqproduto = eqproduto;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "DTFABRICSERIE", length = 10)
	public Date getDtfabricserie() {
		return this.dtfabricserie;
	}

	public void setDtfabricserie(Date dtfabricserie) {
		this.dtfabricserie = dtfabricserie;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "DTVALIDSERIE", length = 10)
	public Date getDtvalidserie() {
		return this.dtvalidserie;
	}

	public void setDtvalidserie(Date dtvalidserie) {
		this.dtvalidserie = dtvalidserie;
	}

	@Column(name = "OBSSERIE", length = 500)
	public String getObsserie() {
		return this.obsserie;
	}

	public void setObsserie(String obsserie) {
		this.obsserie = obsserie;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "DTINS", nullable = false, length = 10)
	public Date getDtins() {
		return this.dtins;
	}

	public void setDtins(Date dtins) {
		this.dtins = dtins;
	}

	@Temporal(TemporalType.TIME)
	@Column(name = "HINS", nullable = false, length = 8)
	public Date getHins() {
		return this.hins;
	}

	public void setHins(Date hins) {
		this.hins = hins;
	}

	@Column(name = "IDUSUINS", nullable = false, length = 8)
	public String getIdusuins() {
		return this.idusuins;
	}

	public void setIdusuins(String idusuins) {
		this.idusuins = idusuins;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "DTALT", length = 10)
	public Date getDtalt() {
		return this.dtalt;
	}

	public void setDtalt(Date dtalt) {
		this.dtalt = dtalt;
	}

	@Temporal(TemporalType.TIME)
	@Column(name = "HALT", length = 8)
	public Date getHalt() {
		return this.halt;
	}

	public void setHalt(Date halt) {
		this.halt = halt;
	}

	@Column(name = "IDUSUALT", length = 8)
	public String getIdusualt() {
		return this.idusualt;
	}

	public void setIdusualt(String idusualt) {
		this.idusualt = idusualt;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "eqserie")
	public Set<Cpitcompraserie> getCpitcompraseries() {
		return this.cpitcompraseries;
	}

	public void setCpitcompraseries(Set<Cpitcompraserie> cpitcompraseries) {
		this.cpitcompraseries = cpitcompraseries;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "eqserie")
	public Set<Eqmovserie> getEqmovseries() {
		return this.eqmovseries;
	}

	public void setEqmovseries(Set<Eqmovserie> eqmovseries) {
		this.eqmovseries = eqmovseries;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "eqserie")
	public Set<Eqitrecmercitos> getEqitrecmercitoses() {
		return this.eqitrecmercitoses;
	}

	public void setEqitrecmercitoses(Set<Eqitrecmercitos> eqitrecmercitoses) {
		this.eqitrecmercitoses = eqitrecmercitoses;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "eqserie")
	public Set<Eqitrecmerc> getEqitrecmercs() {
		return this.eqitrecmercs;
	}

	public void setEqitrecmercs(Set<Eqitrecmerc> eqitrecmercs) {
		this.eqitrecmercs = eqitrecmercs;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "eqserie")
	public Set<Vditvenda> getVditvendas() {
		return this.vditvendas;
	}

	public void setVditvendas(Set<Vditvenda> vditvendas) {
		this.vditvendas = vditvendas;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "eqserie")
	public Set<Cpitcompra> getCpitcompras() {
		return this.cpitcompras;
	}

	public void setCpitcompras(Set<Cpitcompra> cpitcompras) {
		this.cpitcompras = cpitcompras;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "eqserie")
	public Set<Vditvendaserie> getVditvendaseries() {
		return this.vditvendaseries;
	}

	public void setVditvendaseries(Set<Vditvendaserie> vditvendaseries) {
		this.vditvendaseries = vditvendaseries;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "eqserie")
	public Set<Eqitrecmercserie> getEqitrecmercseries() {
		return this.eqitrecmercseries;
	}

	public void setEqitrecmercseries(Set<Eqitrecmercserie> eqitrecmercseries) {
		this.eqitrecmercseries = eqitrecmercseries;
	}

}
