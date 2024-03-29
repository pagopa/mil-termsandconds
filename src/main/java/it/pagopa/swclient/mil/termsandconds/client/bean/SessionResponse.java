package it.pagopa.swclient.mil.termsandconds.client.bean;

import jakarta.validation.constraints.NotNull;

public class SessionResponse {
	/*
	 * T&C accepted or not
	 */
	@NotNull
	private String outcome;

	/*
	 * tax code of the user
	 */
	@NotNull
	private String taxCode;
	
	/*
	 *  If true the client should invoke the presave operation of the Wallet microservice
	 */
	@NotNull
	private Boolean saveNewCards;
	
	/**
	 * @return the outcome
	 */
	public String getOutcome() {
		return outcome;
	}

	/**
	 * @param outcome the outcome to set
	 */
	public void setOutcome(String outcome) {
		this.outcome = outcome;
	}

	/**
	 * @return the taxCode
	 */
	public String getTaxCode() {
		return taxCode;
	}

	/**
	 * @param taxCode the taxCode to set
	 */
	public void setTaxCode(String taxCode) {
		this.taxCode = taxCode;
	}

	/**
	 * @return the saveNewCards
	 */
	public Boolean getSaveNewCards() {
		return saveNewCards;
	}

	/**
	 * @param saveNewCards the saveNewCards to set
	 */
	public void setSaveNewCards(Boolean saveNewCards) {
		this.saveNewCards = saveNewCards;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder .append("TermsAndConds session response [outcome=").append(outcome)
				.append(" saveNewCards=").append(saveNewCards)
				.append("]");
		return builder.toString();
	}
}
