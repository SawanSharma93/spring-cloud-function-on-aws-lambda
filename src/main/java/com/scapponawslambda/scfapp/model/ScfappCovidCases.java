package com.scapponawslambda.scfapp.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ScfappCovidCases {
	@JsonProperty("totalConfirmed")
	private long totalConfirmed;
	@JsonProperty("totalDeaths")
	private long totalDeaths;
	@JsonProperty("totalRecovered")
	private long totalRecovered;

	public long getTotalConfirmed() {
		return totalConfirmed;
	}

	public void setTotalConfirmed(long totalConfirmed) {
		this.totalConfirmed = totalConfirmed;
	}

	public long getTotalDeaths() {
		return totalDeaths;
	}

	public void setTotalDeaths(long totalDeaths) {
		this.totalDeaths = totalDeaths;
	}

	public long getTotalRecovered() {
		return totalRecovered;
	}

	public void setTotalRecovered(long totalRecovered) {
		this.totalRecovered = totalRecovered;
	}

}
