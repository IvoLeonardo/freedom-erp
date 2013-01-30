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
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Tkatividade generated by hbm2java
 */
@Entity
@Table(name = "TKATIVIDADE")
public class Tkatividade implements java.io.Serializable {

	private TkatividadeId id;
	private String descativ;
	private Date dtins;
	private Date hins;
	private String idusuins;
	private Date dtalt;
	private Date halt;
	private String idusualt;
	private Set<Sgprefere3> sgprefere3sForSgprefere3fktkatce = new HashSet<Sgprefere3>(
			0);
	private Set<Sgprefere3> sgprefere3sForSgprefere3fktkatte = new HashSet<Sgprefere3>(
			0);
	private Set<Tkctoativ> tkctoativs = new HashSet<Tkctoativ>(0);

	public Tkatividade() {
	}

	public Tkatividade(TkatividadeId id, String descativ, Date dtins,
			Date hins, String idusuins) {
		this.id = id;
		this.descativ = descativ;
		this.dtins = dtins;
		this.hins = hins;
		this.idusuins = idusuins;
	}

	public Tkatividade(TkatividadeId id, String descativ, Date dtins,
			Date hins, String idusuins, Date dtalt, Date halt, String idusualt,
			Set<Sgprefere3> sgprefere3sForSgprefere3fktkatce,
			Set<Sgprefere3> sgprefere3sForSgprefere3fktkatte,
			Set<Tkctoativ> tkctoativs) {
		this.id = id;
		this.descativ = descativ;
		this.dtins = dtins;
		this.hins = hins;
		this.idusuins = idusuins;
		this.dtalt = dtalt;
		this.halt = halt;
		this.idusualt = idusualt;
		this.sgprefere3sForSgprefere3fktkatce = sgprefere3sForSgprefere3fktkatce;
		this.sgprefere3sForSgprefere3fktkatte = sgprefere3sForSgprefere3fktkatte;
		this.tkctoativs = tkctoativs;
	}

	@EmbeddedId
	@AttributeOverrides({
			@AttributeOverride(name = "codativ", column = @Column(name = "CODATIV", nullable = false)),
			@AttributeOverride(name = "codfilial", column = @Column(name = "CODFILIAL", nullable = false)),
			@AttributeOverride(name = "codemp", column = @Column(name = "CODEMP", nullable = false)) })
	public TkatividadeId getId() {
		return this.id;
	}

	public void setId(TkatividadeId id) {
		this.id = id;
	}

	@Column(name = "DESCATIV", nullable = false, length = 50)
	public String getDescativ() {
		return this.descativ;
	}

	public void setDescativ(String descativ) {
		this.descativ = descativ;
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

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "tkatividadeBySgprefere3fktkatce")
	public Set<Sgprefere3> getSgprefere3sForSgprefere3fktkatce() {
		return this.sgprefere3sForSgprefere3fktkatce;
	}

	public void setSgprefere3sForSgprefere3fktkatce(
			Set<Sgprefere3> sgprefere3sForSgprefere3fktkatce) {
		this.sgprefere3sForSgprefere3fktkatce = sgprefere3sForSgprefere3fktkatce;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "tkatividadeBySgprefere3fktkatte")
	public Set<Sgprefere3> getSgprefere3sForSgprefere3fktkatte() {
		return this.sgprefere3sForSgprefere3fktkatte;
	}

	public void setSgprefere3sForSgprefere3fktkatte(
			Set<Sgprefere3> sgprefere3sForSgprefere3fktkatte) {
		this.sgprefere3sForSgprefere3fktkatte = sgprefere3sForSgprefere3fktkatte;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "tkatividade")
	public Set<Tkctoativ> getTkctoativs() {
		return this.tkctoativs;
	}

	public void setTkctoativs(Set<Tkctoativ> tkctoativs) {
		this.tkctoativs = tkctoativs;
	}

}
