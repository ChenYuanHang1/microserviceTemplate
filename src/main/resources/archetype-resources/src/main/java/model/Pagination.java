#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.model;

public class Pagination {

	 public static final String STARTINDEX="startIndex";
	    public static final String PAGESIZE="pageSize";
	    public static final String PAGINATIONFLG="paginationFlg"; // 0:pagination 1:non-pagination
		
		private int currentPage;
		private int pageSize; 
		private int totalCount;
		
	    /**
	     * calculate startIndex by currentPage and pageSize
	     * @param void
	     * @return startIndex
	     */
		public int getStartIndex()
		{
			int totalPageNum = getTotalPageNum();
			
			if(currentPage > totalPageNum && totalPageNum != 0) {
				currentPage = totalPageNum;
			}

			return (currentPage - 1) * pageSize;

		}
		
	    /**
	     * calculate totalPage by totalCount and pageSize
	     * @param void
	     * @return totalPage
	     */
		public int getTotalPageNum()
		{
			int totalPageNum = 0;
			if (totalCount % pageSize == 0) {
				totalPageNum = totalCount / pageSize;
			} else {
				totalPageNum = totalCount / pageSize + 1;
			}
			return totalPageNum;
		}

		public int getCurrentPage() {
			return currentPage;
		}
		public void setCurrentPage(int currentPage) {
			this.currentPage = currentPage;
		}
		public int getPageSize() {
			return pageSize;
		}
		public void setPageSize(int pageSize) {
			this.pageSize = pageSize;
		}
		public int getTotalCount() {
			return totalCount;
		}
		public void setTotalCount(int totalCount) {
			this.totalCount = totalCount;
		}
		
	    /**
	     * check whether currentPage and pageSize is Valid
	     * @param void
	     * @return totalPage
	     */
		public boolean isValidPage() {
			
			if (currentPage < 1 || pageSize < 1) {
				
				return false;
			} else {
				
				return true;
			}
			
		}
}
