package com.lhfeiyu.vo;

import java.util.HashMap;
import java.util.Map;

public class JsonResult {

	private boolean success;
	@SuppressWarnings("rawtypes")
	private Map map = new HashMap();

	public boolean isSuccess() {
		return success;
	}

	public void setSuccess(boolean success) {
		this.success = success;
	}

	@SuppressWarnings("rawtypes")
	public Map getMap() {
		return map;
	}

	@SuppressWarnings("rawtypes")
	public void setMap(Map map) {
		this.map = map;
	}
}
