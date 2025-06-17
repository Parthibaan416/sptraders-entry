package com.sptraders.sptraders_entry.entity;

import java.math.BigDecimal;
import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "sptraders_data")
public class CustomerEntry {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "eid")
	private Long eId;

	@Column(name = "current_date")
	private Date date;

	@Column(name = "awb")
	private String awbNo;

	@Column(name = "customer")
	private String customer;

	@Column(name = "source")
	private static String source = "KPM";

	@Column(name = "destination")
	private String destination;

	@Column(name = "weight")
	private BigDecimal weight;

	@Column(name = "total")
	private BigDecimal total;

	public Long geteId() {
		return eId;
	}

	public void seteId(Long eId) {
		this.eId = eId;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getAwbNo() {
		return awbNo;
	}

	public void setAwbNo(String awbNo) {
		this.awbNo = awbNo;
	}

	public String getCustomer() {
		return customer;
	}

	public void setCustomer(String customer) {
		this.customer = customer;
	}

	public static String getSource() {
		return source;
	}

	public static void setSource(String source) {
		CustomerEntry.source = source;
	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	public BigDecimal getWeight() {
		return weight;
	}

	public void setWeight(BigDecimal weight) {
		this.weight = weight;
	}

	public BigDecimal getTotal() {
		return total;
	}

	public void setTotal(BigDecimal total) {
		this.total = total;
	}

	public CustomerEntry(Long eId, Date date, String awbNo, String customer, String destination, BigDecimal weight,
			BigDecimal total) {
		super();
		this.eId = eId;
		this.date = date;
		this.awbNo = awbNo;
		this.customer = customer;
		this.destination = destination;
		this.weight = weight;
		this.total = total;
	}

	public CustomerEntry() {
		super();
	}

	@Override
	public String toString() {
		return "CustomerEntry [eId=" + eId + ", date=" + date + ", awbNo=" + awbNo + ", customer=" + customer
				+ ", destination=" + destination + ", weight=" + weight + ", total=" + total + "]";
	}
	
	
}
