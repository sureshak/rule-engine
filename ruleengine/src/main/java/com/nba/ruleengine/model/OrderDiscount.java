package com.nba.ruleengine.model;

import lombok.Getter;
import lombok.Setter;
 
@Getter
@Setter
public class OrderDiscount {
 
    private Integer discount = 0;

	/**
	 * @return the discount
	 */
	public Integer getDiscount() {
		return discount;
	}

	/**
	 * @param discount the discount to set
	 */
	public void setDiscount(Integer discount) {
		this.discount = discount;
	}
}