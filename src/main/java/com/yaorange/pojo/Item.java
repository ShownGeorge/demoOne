package com.yaorange.pojo;

import java.math.BigDecimal;
import java.util.Date;

public class Item {
	private Integer id;
	private String name;
	private Float price;
	private Date createtime;
	private String detail;
	private BigDecimal little;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Float getPrice() {
		return price;
	}
	public void setPrice(Float price) {
		this.price = price;
	}
	public Date getCreatetime() {
		return createtime;
	}
	public void setCreatetime(Date createtime) {
		this.createtime = createtime;
	}
	public String getDetail() {
		return detail;
	}
	public void setDetail(String detail) {
		this.detail = detail;
	}
	public BigDecimal getLittle() {
		return little;
	}
	public void setLittle(BigDecimal little) {
		this.little = little;
	}
	
	
}
