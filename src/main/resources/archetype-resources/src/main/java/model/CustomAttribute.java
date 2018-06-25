#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.model;

public class CustomAttribute {

	private Integer id;
	private String attr_cde;
	private String attr_desc;
	private String attr_type;
	private String attr_val;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getAttr_cde() {
		return attr_cde;
	}
	public void setAttr_cde(String attr_cde) {
		this.attr_cde = attr_cde;
	}
	public String getAttr_desc() {
		return attr_desc;
	}
	public void setAttr_desc(String attr_desc) {
		this.attr_desc = attr_desc;
	}
	public String getAttr_type() {
		return attr_type;
	}
	public void setAttr_type(String attr_type) {
		this.attr_type = attr_type;
	}
	public String getAttr_val() {
		return attr_val;
	}
	public void setAttr_val(String attr_val) {
		this.attr_val = attr_val;
	}
	
	public Object getActualValue(){
		
		if("int".equalsIgnoreCase(this.attr_type)){
			return Integer.parseInt(this.attr_val);
		}else if("long".equalsIgnoreCase(this.attr_type)){
			return Long.parseLong(this.attr_val);
		}else if("boolean".equalsIgnoreCase(this.attr_type)){
			return Boolean.parseBoolean(this.attr_type);
		}else if("float".equalsIgnoreCase(this.attr_type)){
			return Float.parseFloat(this.attr_type);
		}else if("double".equalsIgnoreCase(this.attr_type)){
			return Double.parseDouble(this.attr_type);
		}
		
		return this.attr_val;
	}
}
