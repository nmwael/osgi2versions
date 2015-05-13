package com.netdesign.osgi.examples.rest.endpoint.domain;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class FancyClass {

	private String name;
	private Integer number;

	public Integer getNumber() {
		return number;
	}

	public void setNumber(Integer number) {
		this.number = number;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
