package com.sptraders.sptraders_entry.entity;

import java.math.BigDecimal;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "customer_pricing")
public class CustomerPricing {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "cid")
	private Long cId;
	
	@Column(name = "customer_name")
	private String customerName;
	
	@Column(name = "document")
	private BigDecimal document;
	
	@Column(name = "tn_load")
	private BigDecimal tnLoad;
	
	@Column(name = "south_load")
	private BigDecimal southLoad;
	
	@Column(name = "north_load")
	private BigDecimal northLoad;
	
	@Column(name = "east_load")
	private BigDecimal eastLoad;
	
	@Column(name = "west_load")
	private BigDecimal westLoad;

	public Long getcId() {
		return cId;
	}

	public void setcId(Long cId) {
		this.cId = cId;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public BigDecimal getDocument() {
		return document;
	}

	public void setDocument(BigDecimal document) {
		this.document = document;
	}

	public BigDecimal getTnLoad() {
		return tnLoad;
	}

	public void setTnLoad(BigDecimal tnLoad) {
		this.tnLoad = tnLoad;
	}

	public BigDecimal getSouthLoad() {
		return southLoad;
	}

	public void setSouthLoad(BigDecimal southLoad) {
		this.southLoad = southLoad;
	}

	public BigDecimal getNorthLoad() {
		return northLoad;
	}

	public void setNorthLoad(BigDecimal northLoad) {
		this.northLoad = northLoad;
	}

	public BigDecimal getEastLoad() {
		return eastLoad;
	}

	public void setEastLoad(BigDecimal eastLoad) {
		this.eastLoad = eastLoad;
	}

	public BigDecimal getWestLoad() {
		return westLoad;
	}

	public void setWestLoad(BigDecimal westLoad) {
		this.westLoad = westLoad;
	}

	@Override
	public String toString() {
		return "CustomerPricing [cId=" + cId + ", customerName=" + customerName + ", document=" + document + ", tnLoad="
				+ tnLoad + ", southLoad=" + southLoad + ", northLoad=" + northLoad + ", eastLoad=" + eastLoad
				+ ", westLoad=" + westLoad + "]";
	}
	
	

}
