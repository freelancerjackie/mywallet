package org.mywallet.main.data.beans;

import java.io.Serializable;

public class Expense extends Transaction implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -4028266146872768437L;

	private static final int PAYMENT_TYPE_CASH = 1;
	private static final int PAYMENT_TYPE_CREDIT_CARD = 2;
	private static final int PAYMENT_TYPE_EPS = 3;
	
	private int paymentType;

	public int getPaymentType() {
		return paymentType;
	}

	public void setPaymentType(int paymentType) {
		this.paymentType = paymentType;
	}
}
