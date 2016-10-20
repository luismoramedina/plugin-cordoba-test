package com.atsistemas.plugin.testplugin;

import org.apache.cordova.CallbackContext;
import org.apache.cordova.CordovaPlugin;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class TestPlugin extends CordovaPlugin {
	
	public static String ACTION = "testAction";
	
	public boolean execute (
			String action, JSONArray jsonArgs, 
			CallbackContext callbackContext) throws JSONException {

		try {
			if (ACTION.equals(action)) {
				JSONObject args = jsonArgs.getJSONObject(0);
				
				String string1 = args.getString("string1");
				String string2 = args.getString("string2");
				
				callbackContext.success("on native: " + string1 + ", " + string2);
				
				return true;
			} else {
				return false;
			}
		} catch (Exception e) {
			callbackContext.error(e.getMessage());
			return false;
		}
	}
}