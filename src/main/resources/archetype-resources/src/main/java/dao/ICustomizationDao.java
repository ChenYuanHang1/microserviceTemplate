#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.dao;

import java.util.List;

import ${package}.model.CustomAttrCriteria;
import ${package}.model.CustomAttribute;


public interface ICustomizationDao {
	
	List<Integer> getAllGroups(String attrName);
	
	CustomAttribute getAttrVal(CustomAttrCriteria criteria);
	
	List<CustomAttribute> getGrpAttrList(CustomAttrCriteria criteria);

}
