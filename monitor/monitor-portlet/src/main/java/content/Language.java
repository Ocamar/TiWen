package content;

import java.io.IOException;

import com.surwing.struts2.liferay.util.PropertyEncodingResourceBundle;

public class Language extends PropertyEncodingResourceBundle {

	public Language() throws IOException {
		super("utf-8", Language.class);
	}

}
