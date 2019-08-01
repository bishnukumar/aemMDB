package com.bishunaem.core.models;

import javax.inject.Inject;
import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.Default;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.Optional;

import com.bishunaem.core.constants.ContentLayoutConstant;
import com.bishunaem.core.pojo.ContentLayoutPOJO;


@Model(adaptables = Resource.class)
public class ContentLayoutModel {

	@Inject @Optional @Default(values ="100")
	private String layout;

	@Inject	@Optional @Default(values ="default")
	private String wrapperField;

	@Inject	@Optional
	private String columnSeparator;

	private String setDivider = "" ;


	public String getLayout() {
		return layout;
	}

	public ContentLayoutPOJO getGridSystem() {
		ContentLayoutPOJO column = new ContentLayoutPOJO();
		column.setIsColumn3(false);
		if(layout.equalsIgnoreCase(ContentLayoutConstant.hundred)) {
			column.setColumn1(ContentLayoutConstant.hundredColumn);
			column.setSingleColumn(true);
		}else if(layout.equalsIgnoreCase(ContentLayoutConstant.fifty_50)) {
			column.setColumn1(ContentLayoutConstant.fiftyColumn1);
			column.setColumn2(ContentLayoutConstant.fiftyColumn2);
		}else if(layout.equalsIgnoreCase(ContentLayoutConstant.fourty_60)) {
			column.setColumn1(ContentLayoutConstant.fourtyColumn1);
			column.setColumn2(ContentLayoutConstant.fourtyColumn2);
			//padding = ContentLayoutConstant.blank;
		}else if(layout.equalsIgnoreCase(ContentLayoutConstant.sixty_40)) {
			column.setColumn1(ContentLayoutConstant.sixtyColumn1);
			column.setColumn2(ContentLayoutConstant.sixtyColumn2);
			//padding = ContentLayoutConstant.blank;
		}else if(layout.equalsIgnoreCase(ContentLayoutConstant.seventy_30)) {
			column.setColumn1(ContentLayoutConstant.seventyColumn1);
			column.setColumn2(ContentLayoutConstant.seventyColumn2);
			//padding = ContentLayoutConstant.blank;
		}else if(layout.equalsIgnoreCase(ContentLayoutConstant.thirty_70)) {
			column.setColumn1(ContentLayoutConstant.thirtyColumn1);
			column.setColumn2(ContentLayoutConstant.thirtyColumn2);
			//padding = ContentLayoutConstant.blank;
		}else if(layout.equalsIgnoreCase(ContentLayoutConstant.thirty_30)) {
			column.setIsColumn3(true);
			column.setColumn1(ContentLayoutConstant.thirty_Column1);
			column.setColumn2(ContentLayoutConstant.thirty_Column2);
			column.setColumn3(ContentLayoutConstant.thirty_Column2);
		}
		return column;
	}

	public String getColumnSeparator() {
		if(columnSeparator!=null) {
			if(columnSeparator.equalsIgnoreCase("true")) {
				columnSeparator = ContentLayoutConstant.separator;
			}else {
				columnSeparator = "";
			}
		}
		return columnSeparator;
	}



	public String getDivider() {
		return setDivider;
	}




}
