package com.mineduColegios.minedu.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="tb_colegios")
public class Colegio 
{
	@Id
	@Column(name="cod_mod")
	private String codmodularColegio;
	
	@Column(name="anexo")	
	private int anexoColegio;
	
	@Column(name="codlocal")	
	private String codLocalColegio;
	
	@Column(name="cen_edu")	
	private String nombreColegio;
	
	@Column(name="niv_mod")	
	private String nivelModalidadColegio;
	
	@Column(name="d_niv_mod")	
	private String descrNivelModalidadColegio;
	
	@Column(name="d_forma")	
	private String desFormaColegio;
	
	@Column(name="tipssexo")	
	private int tipSexoColegio;
	
	@Column(name="d_tipssexo")	
	private String desTipSexoColegio;
	
	@Column(name="gestion")	
	private int gestionColegio;
	
	@Column(name="d_gestion")	
	private String desGestionColegio;
	
	@Column(name="ges_dep")	
	private String gestionDepartamentalColegio;
	
	@Column(name="d_ges_dep")	
	private String desGestionDepartamentalColegio;
	
	@Column(name="director")	
	private String directorColegio;
		
	@Column(name="telefono")	
	private String telefonoColegio;

	@Column(name="email")	
	private String emailColegio;
	
	@Column(name="pagweb")	
	private String webColegio;
	
	@Column(name="dir_cen")	
	private String direccionColegio;
	
	@Column(name="referencia")	
	private String referenciaColegio;
	
	@Column(name="localidad")	
	private String localidadColegio;
	
	@Column(name="codcp_inei")	
	private String codcpIneiColegio;
	
	@Column(name="codccpp")	
	private int codccppColegio;
	
	@Column(name="cen_pob")	
	private String cenPobColegio;
	
	@Column(name="area_censo")	
	private int areaCensoColegio;
	
	@Column(name="dareacenso")	
	private String dareaCensoColegio;
	
	@Column(name="codgeo")	
	private String codGeoColegio;
	
	@Column(name="d_dpto")	
	private String departamentoColegio;
	
	@Column(name="d_prov")	
	private String provinciaColegio;
	
	@Column(name="d_dist")	
	private String distritoColegio;
	
	@Column(name="d_region")	
	private String regionColegio;
	
	@Column(name="codooii")	
	private String codooiiColegio;
	
	@Column(name="d_dreugel")	
	private String ugelColegio;
	
	@Column(name="nlat_ie")	
	private double latitudColegio;
	
	@Column(name="nlong_ie")	
	private double longitudColegio;
	
	@Column(name="tipoprog")	
	private String tipprogramColegio;
	
	@Column(name="d_tipoprog")	
	private String desTipprogramColegio;
	
	@Column(name="cod_tur")	
	private int codTurnoColegio;
	
	@Column(name="d_cod_tur")	
	private String desTurnoColegio;
	
	@Column(name="estado")	
	private int estadoColegio;
	
	@Column(name="d_estado")	
	private String desEstadoColegio;
	
	@Column(name="fechareg")	
	private String fecRegColegio;
	
	@Column(name="fecha_act")	
	private String fecActivacionColegio;
	
	@Column(name="dni_represent")	
	private String dniRepresentanteColegio;
	
	@Column(name="correo_represent")	
	private String correoRepresentanteColegio;

	public String getCodmodularColegio() {
		return codmodularColegio;
	}

	public void setCodmodularColegio(String codmodularColegio) {
		this.codmodularColegio = codmodularColegio;
	}

	public int getAnexoColegio() {
		return anexoColegio;
	}

	public void setAnexoColegio(int anexoColegio) {
		this.anexoColegio = anexoColegio;
	}

	public String getCodLocalColegio() {
		return codLocalColegio;
	}

	public void setCodLocalColegio(String codLocalColegio) {
		this.codLocalColegio = codLocalColegio;
	}

	public String getNombreColegio() {
		return nombreColegio;
	}

	public void setNombreColegio(String nombreColegio) {
		this.nombreColegio = nombreColegio;
	}

	public String getNivelModalidadColegio() {
		return nivelModalidadColegio;
	}

	public void setNivelModalidadColegio(String nivelModalidadColegio) {
		this.nivelModalidadColegio = nivelModalidadColegio;
	}

	public String getDescrNivelModalidadColegio() {
		return descrNivelModalidadColegio;
	}

	public void setDescrNivelModalidadColegio(String descrNivelModalidadColegio) {
		this.descrNivelModalidadColegio = descrNivelModalidadColegio;
	}

	public String getDesFormaColegio() {
		return desFormaColegio;
	}

	public void setDesFormaColegio(String desFormaColegio) {
		this.desFormaColegio = desFormaColegio;
	}

	public int getTipSexoColegio() {
		return tipSexoColegio;
	}

	public void setTipSexoColegio(int tipSexoColegio) {
		this.tipSexoColegio = tipSexoColegio;
	}

	public String getDesTipSexoColegio() {
		return desTipSexoColegio;
	}

	public void setDesTipSexoColegio(String desTipSexoColegio) {
		this.desTipSexoColegio = desTipSexoColegio;
	}

	public int getGestionColegio() {
		return gestionColegio;
	}

	public void setGestionColegio(int gestionColegio) {
		this.gestionColegio = gestionColegio;
	}

	public String getDesGestionColegio() {
		return desGestionColegio;
	}

	public void setDesGestionColegio(String desGestionColegio) {
		this.desGestionColegio = desGestionColegio;
	}

	public String getGestionDepartamentalColegio() {
		return gestionDepartamentalColegio;
	}

	public void setGestionDepartamentalColegio(String gestionDepartamentalColegio) {
		this.gestionDepartamentalColegio = gestionDepartamentalColegio;
	}

	public String getDesGestionDepartamentalColegio() {
		return desGestionDepartamentalColegio;
	}

	public void setDesGestionDepartamentalColegio(String desGestionDepartamentalColegio) {
		this.desGestionDepartamentalColegio = desGestionDepartamentalColegio;
	}

	public String getDirectorColegio() {
		return directorColegio;
	}

	public void setDirectorColegio(String directorColegio) {
		this.directorColegio = directorColegio;
	}

	public String getTelefonoColegio() {
		return telefonoColegio;
	}

	public void setTelefonoColegio(String telefonoColegio) {
		this.telefonoColegio = telefonoColegio;
	}

	public String getEmailColegio() {
		return emailColegio;
	}

	public void setEmailColegio(String emailColegio) {
		this.emailColegio = emailColegio;
	}

	public String getWebColegio() {
		return webColegio;
	}

	public void setWebColegio(String webColegio) {
		this.webColegio = webColegio;
	}

	public String getDireccionColegio() {
		return direccionColegio;
	}

	public void setDireccionColegio(String direccionColegio) {
		this.direccionColegio = direccionColegio;
	}

	public String getReferenciaColegio() {
		return referenciaColegio;
	}

	public void setReferenciaColegio(String referenciaColegio) {
		this.referenciaColegio = referenciaColegio;
	}

	public String getLocalidadColegio() {
		return localidadColegio;
	}

	public void setLocalidadColegio(String localidadColegio) {
		this.localidadColegio = localidadColegio;
	}

	public String getCodcpIneiColegio() {
		return codcpIneiColegio;
	}

	public void setCodcpIneiColegio(String codcpIneiColegio) {
		this.codcpIneiColegio = codcpIneiColegio;
	}

	public int getCodccppColegio() {
		return codccppColegio;
	}

	public void setCodccppColegio(int codccppColegio) {
		this.codccppColegio = codccppColegio;
	}

	public String getCenPobColegio() {
		return cenPobColegio;
	}

	public void setCenPobColegio(String cenPobColegio) {
		this.cenPobColegio = cenPobColegio;
	}

	public int getAreaCensoColegio() {
		return areaCensoColegio;
	}

	public void setAreaCensoColegio(int areaCensoColegio) {
		this.areaCensoColegio = areaCensoColegio;
	}

	public String getDareaCensoColegio() {
		return dareaCensoColegio;
	}

	public void setDareaCensoColegio(String dareaCensoColegio) {
		this.dareaCensoColegio = dareaCensoColegio;
	}

	public String getCodGeoColegio() {
		return codGeoColegio;
	}

	public void setCodGeoColegio(String codGeoColegio) {
		this.codGeoColegio = codGeoColegio;
	}

	public String getDepartamentoColegio() {
		return departamentoColegio;
	}

	public void setDepartamentoColegio(String departamentoColegio) {
		this.departamentoColegio = departamentoColegio;
	}

	public String getProvinciaColegio() {
		return provinciaColegio;
	}

	public void setProvinciaColegio(String provinciaColegio) {
		this.provinciaColegio = provinciaColegio;
	}

	public String getDistritoColegio() {
		return distritoColegio;
	}

	public void setDistritoColegio(String distritoColegio) {
		this.distritoColegio = distritoColegio;
	}

	public String getRegionColegio() {
		return regionColegio;
	}

	public void setRegionColegio(String regionColegio) {
		this.regionColegio = regionColegio;
	}

	public String getCodooiiColegio() {
		return codooiiColegio;
	}

	public void setCodooiiColegio(String codooiiColegio) {
		this.codooiiColegio = codooiiColegio;
	}

	public String getUgelColegio() {
		return ugelColegio;
	}

	public void setUgelColegio(String ugelColegio) {
		this.ugelColegio = ugelColegio;
	}

	public double getLatitudColegio() {
		return latitudColegio;
	}

	public void setLatitudColegio(double latitudColegio) {
		this.latitudColegio = latitudColegio;
	}

	public double getLongitudColegio() {
		return longitudColegio;
	}

	public void setLongitudColegio(double longitudColegio) {
		this.longitudColegio = longitudColegio;
	}

	public String getTipprogramColegio() {
		return tipprogramColegio;
	}

	public void setTipprogramColegio(String tipprogramColegio) {
		this.tipprogramColegio = tipprogramColegio;
	}

	public String getDesTipprogramColegio() {
		return desTipprogramColegio;
	}

	public void setDesTipprogramColegio(String desTipprogramColegio) {
		this.desTipprogramColegio = desTipprogramColegio;
	}

	public int getCodTurnoColegio() {
		return codTurnoColegio;
	}

	public void setCodTurnoColegio(int codTurnoColegio) {
		this.codTurnoColegio = codTurnoColegio;
	}

	public String getDesTurnoColegio() {
		return desTurnoColegio;
	}

	public void setDesTurnoColegio(String desTurnoColegio) {
		this.desTurnoColegio = desTurnoColegio;
	}

	public int getEstadoColegio() {
		return estadoColegio;
	}

	public void setEstadoColegio(int estadoColegio) {
		this.estadoColegio = estadoColegio;
	}

	public String getDesEstadoColegio() {
		return desEstadoColegio;
	}

	public void setDesEstadoColegio(String desEstadoColegio) {
		this.desEstadoColegio = desEstadoColegio;
	}

	public String getFecRegColegio() {
		return fecRegColegio;
	}

	public void setFecRegColegio(String fecRegColegio) {
		this.fecRegColegio = fecRegColegio;
	}

	public String getFecActivacionColegio() {
		return fecActivacionColegio;
	}

	public void setFecActivacionColegio(String fecActivacionColegio) {
		this.fecActivacionColegio = fecActivacionColegio;
	}

	public String getDniRepresentanteColegio() {
		return dniRepresentanteColegio;
	}

	public void setDniRepresentanteColegio(String dniRepresentanteColegio) {
		this.dniRepresentanteColegio = dniRepresentanteColegio;
	}

	public String getCorreoRepresentanteColegio() {
		return correoRepresentanteColegio;
	}

	public void setCorreoRepresentanteColegio(String correoRepresentanteColegio) {
		this.correoRepresentanteColegio = correoRepresentanteColegio;
	}
	
	
}
