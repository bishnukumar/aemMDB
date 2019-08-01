package com.bishunaem.core.models;

import javax.inject.Inject;
import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.Optional;


@Model(adaptables = Resource.class)
public class CardComponent {

	@Inject @Optional 
	private String backgroundmage;

	@Inject	@Optional
	private String cardSubTitle;
	
	@Inject	@Optional
	private String cardTitle;

	@Inject	@Optional
	private String bGImagecontent;
	

	public String getBackgroundmage() {
		return backgroundmage;
	}
	
	public String getCardTitle() {
		return cardTitle;
	}
	

	public String getCardSubTitle() {
		return cardSubTitle;
	}

	public String getbGImagecontent() {
		return bGImagecontent;
	}



}
