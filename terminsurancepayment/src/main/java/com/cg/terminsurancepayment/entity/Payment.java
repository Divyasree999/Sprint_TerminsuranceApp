package com.cg.terminsurancepayment.entity;
/*
 * creates the payment table in database
 * @author - Divya
 */
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "payment")
public class Payment {
	@Id	
	private int paymentId;
	private String type;
	private String status;
	private String cardName;
	private String cardNumber;
	private String cardExpiry;
	private int cvv;
	
	public Payment() {
		super();
	}

	public Payment(int paymentId, String type, String status, String cardName, String cardNumber,
			String cardExpiry, int cvv) {
		super();
		this.paymentId = paymentId;
		this.type = type;
		this.status = status;
		this.cardName = cardName;
		this.cardNumber = cardNumber;
		this.cardExpiry = cardExpiry;
		this.cvv = cvv;
	}
    // getters and setters
	public int getPaymentId() {
		return paymentId;
	}

	public void setPaymentId(int paymentId) {
		this.paymentId = paymentId;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getCardName() {
		return cardName;
	}

	public void setCardName(String cardName) {
		this.cardName = cardName;
	}

	public String getCardNumber() {
		return cardNumber;
	}

	public void setCardNumber(String cardNumber) {
		this.cardNumber = cardNumber;
	}

	public String getCardExpiry() {
		return cardExpiry;
	}

	public void setCardExpiry(String cardExpiry) {
		this.cardExpiry = cardExpiry;
	}

	public int getCvv() {
		return cvv;
	}

	public void setCvv(int cvv) {
		this.cvv = cvv;
	}

	@Override
	public String toString() {
		return "Payment [paymentId=" + paymentId + ", type=" + type + ", status=" + status + ", cardName=" + cardName
				+ ", cardNumber=" + cardNumber + ", cardExpiry=" + cardExpiry + ", cvv=" + cvv + "]";
	}	
}
