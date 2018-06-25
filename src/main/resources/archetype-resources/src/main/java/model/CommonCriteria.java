#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.model;

import java.util.Date;

public class CommonCriteria {
	
	protected String hrgenieSchema;
	
	protected Date clientCurrentDate;
	
	protected Pagination page;

	public String getHrgenieSchema() {
		return hrgenieSchema;
	}

	public void setHrgenieSchema(String hrgenieSchema) {
		this.hrgenieSchema = hrgenieSchema;
	}

	public Date getClientCurrentDate() {
		return clientCurrentDate;
	}

	public void setClientCurrentDate(Date clientCurrentDate) {
		this.clientCurrentDate = clientCurrentDate;
	}
	
	public Pagination getPage() {
		return page;
	}

	public void setPage(Pagination page) {
		this.page = page;
	}
	
}
