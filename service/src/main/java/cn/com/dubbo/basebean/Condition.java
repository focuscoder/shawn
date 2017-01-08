package cn.com.dubbo.basebean;

public class Condition {

	private String page ;
	
	private String rows ;
	
	private String index ;
	
	
	@Override
	public String toString() {
		return "Condition [page=" + page + ", rows=" + rows + ", index="
				+ index + "]";
	}

	public String getPage() {
		return page;
	}

	public void setPage(String page) {
		this.page = page;
	}

	public String getRows() {
		return rows;
	}

	public void setRows(String rows) {
		this.rows = rows;
	}

	public String getIndex() {
		return index;
	}

	public void setIndex(String index) {
		this.index = index;
	}
	
	
	
}
