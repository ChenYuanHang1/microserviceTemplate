#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.util;

public enum CustomAttrEnum {
	
	SCHEMA ("Schema"),
	TABLE ("Table");
	
	private String attrName;
	
	CustomAttrEnum(String attrName){
		this.attrName = attrName;
	}
	
	public String getAttrName() {
		return this.attrName;
	}

}
