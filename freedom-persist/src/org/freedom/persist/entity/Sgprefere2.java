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
 * Sgprefere2 generated by hbm2java
 */
@Entity
@Table(name = "SGPREFERE2")
public class Sgprefere2 implements java.io.Serializable {

	private Sgprefere2Id id;
	private Atatendente atatendente;
	private Vdtipocli vdtipocli;
	private Sgittabela sgittabelaBySgprefere2fksgitta;
	private Attipoatendo attipoatendoBySgprefere2fkattipo;
	private Attipoatendo attipoatendoBySgprefere2fk2attip;
	private Vdvendedor vdvendedor;
	private Vdclascli vdclascli;
	private Sgittabela sgittabelaBySgprefere2fksgitt2;
	private Attipoatendo attipoatendoBySgprefere2fk3attip;
	private Integer codsetat;
	private Integer codfilialsa;
	private Integer codempsa;
	private Integer codsetat2;
	private Integer codfilials2;
	private Integer codemps2;
	private String classmedida;
	private String cabtermr01;
	private String cabtermr02;
	private String rodtermr;
	private Date dtins;
	private Date hins;
	private String idusuins;
	private Date dtalt;
	private Date halt;
	private String idusualt;

	public Sgprefere2() {
	}

	public Sgprefere2(Sgprefere2Id id, Vdvendedor vdvendedor, Date dtins,
			Date hins, String idusuins) {
		this.id = id;
		this.vdvendedor = vdvendedor;
		this.dtins = dtins;
		this.hins = hins;
		this.idusuins = idusuins;
	}

	public Sgprefere2(Sgprefere2Id id, Atatendente atatendente,
			Vdtipocli vdtipocli, Sgittabela sgittabelaBySgprefere2fksgitta,
			Attipoatendo attipoatendoBySgprefere2fkattipo,
			Attipoatendo attipoatendoBySgprefere2fk2attip,
			Vdvendedor vdvendedor, Vdclascli vdclascli,
			Sgittabela sgittabelaBySgprefere2fksgitt2,
			Attipoatendo attipoatendoBySgprefere2fk3attip, Integer codsetat,
			Integer codfilialsa, Integer codempsa, Integer codsetat2,
			Integer codfilials2, Integer codemps2, String classmedida,
			String cabtermr01, String cabtermr02, String rodtermr, Date dtins,
			Date hins, String idusuins, Date dtalt, Date halt, String idusualt) {
		this.id = id;
		this.atatendente = atatendente;
		this.vdtipocli = vdtipocli;
		this.sgittabelaBySgprefere2fksgitta = sgittabelaBySgprefere2fksgitta;
		this.attipoatendoBySgprefere2fkattipo = attipoatendoBySgprefere2fkattipo;
		this.attipoatendoBySgprefere2fk2attip = attipoatendoBySgprefere2fk2attip;
		this.vdvendedor = vdvendedor;
		this.vdclascli = vdclascli;
		this.sgittabelaBySgprefere2fksgitt2 = sgittabelaBySgprefere2fksgitt2;
		this.attipoatendoBySgprefere2fk3attip = attipoatendoBySgprefere2fk3attip;
		this.codsetat = codsetat;
		this.codfilialsa = codfilialsa;
		this.codempsa = codempsa;
		this.codsetat2 = codsetat2;
		this.codfilials2 = codfilials2;
		this.codemps2 = codemps2;
		this.classmedida = classmedida;
		this.cabtermr01 = cabtermr01;
		this.cabtermr02 = cabtermr02;
		this.rodtermr = rodtermr;
		this.dtins = dtins;
		this.hins = hins;
		this.idusuins = idusuins;
		this.dtalt = dtalt;
		this.halt = halt;
		this.idusualt = idusualt;
	}

	@EmbeddedId
	@AttributeOverrides({
			@AttributeOverride(name = "codfilial", column = @Column(name = "CODFILIAL", nullable = false)),
			@AttributeOverride(name = "codemp", column = @Column(name = "CODEMP", nullable = false)) })
	public Sgprefere2Id getId() {
		return this.id;
	}

	public void setId(Sgprefere2Id id) {
		this.id = id;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({
			@JoinColumn(name = "CODATEND", referencedColumnName = "CODATEND"),
			@JoinColumn(name = "CODFILIALAE", referencedColumnName = "CODFILIAL"),
			@JoinColumn(name = "CODEMPAE", referencedColumnName = "CODEMP") })
	public Atatendente getAtatendente() {
		return this.atatendente;
	}

	public void setAtatendente(Atatendente atatendente) {
		this.atatendente = atatendente;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({
			@JoinColumn(name = "CODTIPOCLI", referencedColumnName = "CODTIPOCLI"),
			@JoinColumn(name = "CODFILIALTI", referencedColumnName = "CODFILIAL"),
			@JoinColumn(name = "CODEMPTI", referencedColumnName = "CODEMP") })
	public Vdtipocli getVdtipocli() {
		return this.vdtipocli;
	}

	public void setVdtipocli(Vdtipocli vdtipocli) {
		this.vdtipocli = vdtipocli;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({
			@JoinColumn(name = "CODITTBA", referencedColumnName = "CODITTB"),
			@JoinColumn(name = "CODTBA", referencedColumnName = "CODTB"),
			@JoinColumn(name = "CODFILIALTA", referencedColumnName = "CODFILIAL"),
			@JoinColumn(name = "CODEMPTA", referencedColumnName = "CODEMP") })
	public Sgittabela getSgittabelaBySgprefere2fksgitta() {
		return this.sgittabelaBySgprefere2fksgitta;
	}

	public void setSgittabelaBySgprefere2fksgitta(
			Sgittabela sgittabelaBySgprefere2fksgitta) {
		this.sgittabelaBySgprefere2fksgitta = sgittabelaBySgprefere2fksgitta;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({
			@JoinColumn(name = "CODTPATENDO", referencedColumnName = "CODTPATENDO"),
			@JoinColumn(name = "CODFILIALTO", referencedColumnName = "CODFILIAL"),
			@JoinColumn(name = "CODEMPTO", referencedColumnName = "CODEMP") })
	public Attipoatendo getAttipoatendoBySgprefere2fkattipo() {
		return this.attipoatendoBySgprefere2fkattipo;
	}

	public void setAttipoatendoBySgprefere2fkattipo(
			Attipoatendo attipoatendoBySgprefere2fkattipo) {
		this.attipoatendoBySgprefere2fkattipo = attipoatendoBySgprefere2fkattipo;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({
			@JoinColumn(name = "CODTPATENDO2", referencedColumnName = "CODTPATENDO"),
			@JoinColumn(name = "CODFILIALT2", referencedColumnName = "CODFILIAL"),
			@JoinColumn(name = "CODEMPT2", referencedColumnName = "CODEMP") })
	public Attipoatendo getAttipoatendoBySgprefere2fk2attip() {
		return this.attipoatendoBySgprefere2fk2attip;
	}

	public void setAttipoatendoBySgprefere2fk2attip(
			Attipoatendo attipoatendoBySgprefere2fk2attip) {
		this.attipoatendoBySgprefere2fk2attip = attipoatendoBySgprefere2fk2attip;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({
			@JoinColumn(name = "CODVEND", referencedColumnName = "CODVEND", nullable = false),
			@JoinColumn(name = "CODFILIALVD", referencedColumnName = "CODFILIAL", nullable = false),
			@JoinColumn(name = "CODEMPVD", referencedColumnName = "CODEMP", nullable = false) })
	public Vdvendedor getVdvendedor() {
		return this.vdvendedor;
	}

	public void setVdvendedor(Vdvendedor vdvendedor) {
		this.vdvendedor = vdvendedor;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({
			@JoinColumn(name = "CODCLASCLI", referencedColumnName = "CODCLASCLI"),
			@JoinColumn(name = "CODFILIALCI", referencedColumnName = "CODFILIAL"),
			@JoinColumn(name = "CODEMPCI", referencedColumnName = "CODEMP") })
	public Vdclascli getVdclascli() {
		return this.vdclascli;
	}

	public void setVdclascli(Vdclascli vdclascli) {
		this.vdclascli = vdclascli;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({
			@JoinColumn(name = "CODITTBV", referencedColumnName = "CODITTB"),
			@JoinColumn(name = "CODTBV", referencedColumnName = "CODTB"),
			@JoinColumn(name = "CODFILIALTV", referencedColumnName = "CODFILIAL"),
			@JoinColumn(name = "CODEMPTV", referencedColumnName = "CODEMP") })
	public Sgittabela getSgittabelaBySgprefere2fksgitt2() {
		return this.sgittabelaBySgprefere2fksgitt2;
	}

	public void setSgittabelaBySgprefere2fksgitt2(
			Sgittabela sgittabelaBySgprefere2fksgitt2) {
		this.sgittabelaBySgprefere2fksgitt2 = sgittabelaBySgprefere2fksgitt2;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({
			@JoinColumn(name = "CODTPATENDO3", referencedColumnName = "CODTPATENDO"),
			@JoinColumn(name = "CODFILIALT3", referencedColumnName = "CODFILIAL"),
			@JoinColumn(name = "CODEMPT3", referencedColumnName = "CODEMP") })
	public Attipoatendo getAttipoatendoBySgprefere2fk3attip() {
		return this.attipoatendoBySgprefere2fk3attip;
	}

	public void setAttipoatendoBySgprefere2fk3attip(
			Attipoatendo attipoatendoBySgprefere2fk3attip) {
		this.attipoatendoBySgprefere2fk3attip = attipoatendoBySgprefere2fk3attip;
	}

	@Column(name = "CODSETAT")
	public Integer getCodsetat() {
		return this.codsetat;
	}

	public void setCodsetat(Integer codsetat) {
		this.codsetat = codsetat;
	}

	@Column(name = "CODFILIALSA")
	public Integer getCodfilialsa() {
		return this.codfilialsa;
	}

	public void setCodfilialsa(Integer codfilialsa) {
		this.codfilialsa = codfilialsa;
	}

	@Column(name = "CODEMPSA")
	public Integer getCodempsa() {
		return this.codempsa;
	}

	public void setCodempsa(Integer codempsa) {
		this.codempsa = codempsa;
	}

	@Column(name = "CODSETAT2")
	public Integer getCodsetat2() {
		return this.codsetat2;
	}

	public void setCodsetat2(Integer codsetat2) {
		this.codsetat2 = codsetat2;
	}

	@Column(name = "CODFILIALS2")
	public Integer getCodfilials2() {
		return this.codfilials2;
	}

	public void setCodfilials2(Integer codfilials2) {
		this.codfilials2 = codfilials2;
	}

	@Column(name = "CODEMPS2")
	public Integer getCodemps2() {
		return this.codemps2;
	}

	public void setCodemps2(Integer codemps2) {
		this.codemps2 = codemps2;
	}

	@Column(name = "CLASSMEDIDA", length = 20)
	public String getClassmedida() {
		return this.classmedida;
	}

	public void setClassmedida(String classmedida) {
		this.classmedida = classmedida;
	}

	@Column(name = "CABTERMR01", length = 1024)
	public String getCabtermr01() {
		return this.cabtermr01;
	}

	public void setCabtermr01(String cabtermr01) {
		this.cabtermr01 = cabtermr01;
	}

	@Column(name = "CABTERMR02", length = 1024)
	public String getCabtermr02() {
		return this.cabtermr02;
	}

	public void setCabtermr02(String cabtermr02) {
		this.cabtermr02 = cabtermr02;
	}

	@Column(name = "RODTERMR", length = 1024)
	public String getRodtermr() {
		return this.rodtermr;
	}

	public void setRodtermr(String rodtermr) {
		this.rodtermr = rodtermr;
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
