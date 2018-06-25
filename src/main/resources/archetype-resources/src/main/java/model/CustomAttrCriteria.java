#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.model;

import java.util.List;

public class CustomAttrCriteria {
	
	private String module; 
	private String function; 
	private String attrName; 
	private String hrgenieSchema;
	private Integer userGrpId;
	private List<String> attrNameList;
	
	
	public String getModule() {
		return module;
	}
	public void setModule(String module) {
		this.module = module;
	}
	public String getFunction() {
		return function;
	}
	public void setFunction(String function) {
		this.function = function;
	}

	public String getAttrName() {
		return attrName;
	}
	public void setAttrName(String attrName) {
		this.attrName = attrName;
	}
	public Integer getUserGrpId() {
		return userGrpId;
	}
	public void setUserGrpId(Integer userGrpId) {
		this.userGrpId = userGrpId;
	}
	public List<String> getAttrNameList() {
		return attrNameList;
	}
	public void setAttrNameList(List<String> attrNameList) {
		this.attrNameList = attrNameList;
	}
	public String getHrgenieSchema() {
		return hrgenieSchema;
	}
	public void setHrgenieSchema(String hrgenieSchema) {
		this.hrgenieSchema = hrgenieSchema;
	}

}
