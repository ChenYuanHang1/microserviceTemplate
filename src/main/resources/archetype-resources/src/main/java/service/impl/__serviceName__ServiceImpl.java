#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.service.impl;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Service;

import ${package}.service.I${serviceName}Service;

@Service
public class ${serviceName}ServiceImpl implements I${serviceName}Service {
	
	private final Log logger = LogFactory.getLog(getClass());

	
	
}
