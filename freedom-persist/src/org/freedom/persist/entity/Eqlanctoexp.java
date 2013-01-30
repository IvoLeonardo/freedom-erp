package org.freedom.persist.entity;

// Generated 30/01/2013 08:30:43 by Hibernate Tools 3.4.0.CR1

import java.util.Date;
import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Eqlanctoexp generated by hbm2java
 */
@Entity
@Table(name = "EQLANCTOEXP")
public class Eqlanctoexp implements java.io.Serializable {

	private EqlanctoexpId id;
	private Eqtipoexp eqtipoexp;
	private Sgfilial sgfilial;
	private Vdcliente vdcliente;
	private Date dtlexp;
	private int qtdlexp;
	private Date dtretlexp;
	private Date dtins;
	private Date hins;
	private String idusuins;
	private Date dtalt;
	private Date halt;
	private String idusualt;

	public Eqlanctoexp() {
	}

	public Eqlanctoexp(EqlanctoexpId id, Eqtipoexp eqtipoexp,
			Sgfilial sgfilial, Vdcliente vdcliente, Date dtlexp, int qtdlexp,
			Date dtins, Date hins, String idusuins) {
		this.id = id;
		this.eqtipoexp = eqtipoexp;
		this.sgfilial = sgfilial;
		this.vdcliente = vdcliente;
		this.dtlexp = dtlexp;
		this.qtdlexp = qtdlexp;
		this.dtins = dtins;
		this.hins = hins;
		this.idusuins = idusuins;
	}

	public Eqlanctoexp(EqlanctoexpId id, Eqtipoexp eqtipoexp,
			Sgfilial sgfilial, Vdcliente vdcliente, Date dtlexp, int qtdlexp,
			Date dtretlexp, Date dtins, Date hins, String idusuins, Date dtalt,
			Date halt, String idusualt) {
		this.id = id;
		this.eqtipoexp = eqtipoexp;
		this.sgfilial = sgfilial;
		this.vdcliente = vdcliente;
		this.dtlexp = dtlexp;
		this.qtdlexp = qtdlexp;
		this.dtretlexp = dtretlexp;
		this.dtins = dtins;
		this.hins = hins;
		this.idusuins = idusuins;
		this.dtalt = dtalt;
		this.halt = halt;
		this.idusualt = idusualt;
	}

	@EmbeddedId
	@AttributeOverrides({
			@AttributeOverride(name = "codlexp", column = @Column(name = "CODLEXP", nullable = false)),
			@AttributeOverride(name = "codfilial", column = @Column(name = "CODFILIAL", nullable = false)),
			@AttributeOverride(name = "codemp", column = @Column(name = "CODEMP", nullable = false)) })
	public EqlanctoexpId getId() {
		return this.id;
	}

	public void setId(EqlanctoexpId id) {
		this.id = id;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({
			@JoinColumn(name = "CODTIPOEXP", referencedColumnName = "CODTIPOEXP", nullable = false),
			@JoinColumn(name = "CODFILIALTE", referencedColumnName = "CODFILIAL", nullable = false),
			@JoinColumn(name = "CODEMPTE", referencedColumnName = "CODEMP", nullable = false) })
	public Eqtipoexp getEqtipoexp() {
		return this.eqtipoexp;
	}

	public void setEqtipoexp(Eqtipoexp eqtipoexp) {
		this.eqtipoexp = eqtipoexp;
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
			@JoinColumn(name = "CODCLI", referencedColumnName = "CODCLI", nullable = false),
			@JoinColumn(name = "CODFILIALCL", referencedColumnName = "CODFILIAL", nullable = false),
			@JoinColumn(name = "CODEMPCL", referencedColumnName = "CODEMP", nullable = false) })
	public Vdcliente getVdcliente() {
		return this.vdcliente;
	}

	public void setVdcliente(Vdcliente vdcliente) {
		this.vdcliente = vdcliente;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "DTLEXP", nullable = false, length = 10)
	public Date getDtlexp() {
		return this.dtlexp;
	}

	public void setDtlexp(Date dtlexp) {
		this.dtlexp = dtlexp;
	}

	@Column(name = "QTDLEXP", nullable = false)
	public int getQtdlexp() {
		return this.qtdlexp;
	}

	public void setQtdlexp(int qtdlexp) {
		this.qtdlexp = qtdlexp;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "DTRETLEXP", length = 10)
	public Date getDtretlexp() {
		return this.dtretlexp;
	}

	public void setDtretlexp(Date dtretlexp) {
		this.dtretlexp = dtretlexp;
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

}
