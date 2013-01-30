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
 * Pvcaixaimp generated by hbm2java
 */
@Entity
@Table(name = "PVCAIXAIMP")
public class Pvcaixaimp implements java.io.Serializable {

	private PvcaixaimpId id;
	private Pvcaixa pvcaixa;
	private Sgimpressora sgimpressora;
	private Character imppad;
	private Date dtins;
	private Date hins;
	private String idusuins;
	private Date dtalt;
	private Date halt;
	private String idusualt;

	public Pvcaixaimp() {
	}

	public Pvcaixaimp(PvcaixaimpId id, Pvcaixa pvcaixa,
			Sgimpressora sgimpressora, Date dtins, Date hins, String idusuins) {
		this.id = id;
		this.pvcaixa = pvcaixa;
		this.sgimpressora = sgimpressora;
		this.dtins = dtins;
		this.hins = hins;
		this.idusuins = idusuins;
	}

	public Pvcaixaimp(PvcaixaimpId id, Pvcaixa pvcaixa,
			Sgimpressora sgimpressora, Character imppad, Date dtins, Date hins,
			String idusuins, Date dtalt, Date halt, String idusualt) {
		this.id = id;
		this.pvcaixa = pvcaixa;
		this.sgimpressora = sgimpressora;
		this.imppad = imppad;
		this.dtins = dtins;
		this.hins = hins;
		this.idusuins = idusuins;
		this.dtalt = dtalt;
		this.halt = halt;
		this.idusualt = idusualt;
	}

	@EmbeddedId
	@AttributeOverrides({
			@AttributeOverride(name = "codimp", column = @Column(name = "CODIMP", nullable = false)),
			@AttributeOverride(name = "codcaixa", column = @Column(name = "CODCAIXA", nullable = false)),
			@AttributeOverride(name = "codfilial", column = @Column(name = "CODFILIAL", nullable = false)),
			@AttributeOverride(name = "codemp", column = @Column(name = "CODEMP", nullable = false)) })
	public PvcaixaimpId getId() {
		return this.id;
	}

	public void setId(PvcaixaimpId id) {
		this.id = id;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({
			@JoinColumn(name = "CODCAIXA", referencedColumnName = "CODCAIXA", nullable = false, insertable = false, updatable = false),
			@JoinColumn(name = "CODFILIAL", referencedColumnName = "CODFILIAL", nullable = false, insertable = false, updatable = false),
			@JoinColumn(name = "CODEMP", referencedColumnName = "CODEMP", nullable = false, insertable = false, updatable = false) })
	public Pvcaixa getPvcaixa() {
		return this.pvcaixa;
	}

	public void setPvcaixa(Pvcaixa pvcaixa) {
		this.pvcaixa = pvcaixa;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({
			@JoinColumn(name = "CODIMP", referencedColumnName = "CODIMP", nullable = false, insertable = false, updatable = false),
			@JoinColumn(name = "CODFILIAL", referencedColumnName = "CODFILIAL", nullable = false, insertable = false, updatable = false),
			@JoinColumn(name = "CODEMP", referencedColumnName = "CODEMP", nullable = false, insertable = false, updatable = false) })
	public Sgimpressora getSgimpressora() {
		return this.sgimpressora;
	}

	public void setSgimpressora(Sgimpressora sgimpressora) {
		this.sgimpressora = sgimpressora;
	}

	@Column(name = "IMPPAD", length = 1)
	public Character getImppad() {
		return this.imppad;
	}

	public void setImppad(Character imppad) {
		this.imppad = imppad;
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
