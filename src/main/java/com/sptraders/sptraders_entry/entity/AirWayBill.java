package com.sptraders.sptraders_entry.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "airway_bill")
public class AirWayBill {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "aid")
	private Long aId;

	@Column(name = "awb_no")
	private String awbNo;

	@Override
	public String toString() {
		return "AirWayBill [aid=" + aId + ", awbNo=" + awbNo + "]";
	}

	public AirWayBill() {
		super();
	}

	public AirWayBill(String awbNo) {
		super();
		this.awbNo = awbNo;
	}

	public Long getaId() {
		return aId;
	}

	public void setaId(Long aId) {
		this.aId = aId;
	}

	public String getAwbNo() {
		return awbNo;
	}

	public void setAwbNo(String awbNo) {
		this.awbNo = awbNo;
	}

}
