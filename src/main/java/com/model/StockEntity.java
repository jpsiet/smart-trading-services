package com.model;

import java.math.BigDecimal;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "stock")
public class StockEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String name;
	private String sector;
	private String cusip;
	private BigDecimal price;
	private Long marketCap;
	private String description;
	

	public StockEntity() {
		super();
		// TODO Auto-generated constructor stub
	}

	public StockEntity(Long id, String name, String sector, String cusip,
			BigDecimal price, Long marketCap, String description) {
		super();
		this.id = id;
		this.name = name;
		this.sector = sector;
		this.cusip = cusip;
		this.price = price;
		this.marketCap = marketCap;
		this.description = description;
		
	}

	public Number getPrice() {
		return price;
	}

	public void setPrice(BigDecimal price) {
		this.price = price;
	}

	public Long getMarketCap() {
		return marketCap;
	}

	public void setMarketCap(Long marketCap) {
		this.marketCap = marketCap;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSector() {
		return sector;
	}

	public void setSector(String sector) {
		this.sector = sector;
	}

	public String getCusip() {
		return cusip;
	}

	public void setCusip(String cusip) {
		this.cusip = cusip;
	}

}
