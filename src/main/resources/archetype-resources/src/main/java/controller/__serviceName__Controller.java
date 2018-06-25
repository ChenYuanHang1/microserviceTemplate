#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import ${package}.service.I${serviceName}Service;

@RestController
public class ${serviceName}Controller {

	@Autowired
	private I${serviceName}Service ${artifactId}Service;
	
	/**
	 * To check if service is up
	 * 
	 * @return
	 */
	@RequestMapping(method = RequestMethod.GET, value = "/serviceCheck", headers = "Accept=application/json")
	public @ResponseBody String serviceCheck() {
		return "${serviceName} SERVICE IS RUNNING";
	}
	
		
}
