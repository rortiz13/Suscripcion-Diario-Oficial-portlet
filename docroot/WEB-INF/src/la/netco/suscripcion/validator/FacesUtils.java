package la.netco.suscripcion.validator;

import java.text.MessageFormat;
import java.util.MissingResourceException;
import java.util.ResourceBundle;

import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.faces.context.Flash;


public class FacesUtils {

	private static ResourceBundle bundle;
	
	protected static ClassLoader getCurrentClassLoader(Object defaultObject) {

		ClassLoader loader = Thread.currentThread().getContextClassLoader();

		if (loader == null) {
			loader = defaultObject.getClass().getClassLoader();
		}

		return loader;
	}

	private static ResourceBundle getBundle( FacesContext context) {
		if (bundle == null) {
			bundle = context.getApplication().getResourceBundle(context, "msg");
		}
		return bundle;
	}

	private static String getValue(String key, FacesContext context) {

		String result = null;
		try {
			result = getBundle(context).getString(key);
		} catch (MissingResourceException e) {
			result = "???" + key + "??? not found";
		}
		return result;
	}
	
	public static String getMessage(String bundleName, FacesContext context) {

		String text = FacesUtils.getValue(bundleName, context);
		return text;
	}
	
	public static void addFacesMessageFromBundle(String msgName, FacesMessage.Severity severity) {

		String msg = FacesUtils.getMessage(msgName, FacesContext.getCurrentInstance());

		FacesMessage fm = new FacesMessage(msg);
		fm.setSeverity(severity);
		
		FacesContext.getCurrentInstance().addMessage(msg, fm);

	}
	
	public static void addFacesMessageFromBundle(String msgName, FacesMessage.Severity severity, String... params) {

		String msg = FacesUtils.getMessage(msgName, FacesContext.getCurrentInstance());
		
		String detail = msg;
		
		if (params != null && params.length > 0) {
			MessageFormat messageFormat = new MessageFormat(detail);
			detail = messageFormat.format(params);
		}

		FacesMessage fm = new FacesMessage(msg);
		fm.setSeverity(severity);
		
		FacesContext.getCurrentInstance().addMessage(msg, fm);

	}
	
	
	public static void addFacesMessage(String msg, FacesMessage.Severity severity) {
		FacesMessage fm = new FacesMessage(msg);
		fm.setSeverity(severity);		
		FacesContext.getCurrentInstance().addMessage(msg, fm);
	}
	
		
	public static Flash flashScope (FacesContext context){
		return (context.getExternalContext().getFlash());
	}

}
