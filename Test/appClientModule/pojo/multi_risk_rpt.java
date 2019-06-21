package pojo;

import java.util.ArrayList;

public class multi_risk_rpt {

	
	int last_query_date; //最近一次查询距今天数
	ArrayList<String> query_apps; //多头借贷详情
	public int getLast_query_date() {
		return last_query_date;
	}
	public void setLast_query_date(int last_query_date) {
		this.last_query_date = last_query_date;
	}
	public ArrayList<String> getQuery_apps() {
		return query_apps;
	}
	public void setQuery_apps(ArrayList<String> query_apps) {
		this.query_apps = query_apps;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + last_query_date;
		result = prime * result + ((query_apps == null) ? 0 : query_apps.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		multi_risk_rpt other = (multi_risk_rpt) obj;
		if (last_query_date != other.last_query_date)
			return false;
		if (query_apps == null) {
			if (other.query_apps != null)
				return false;
		} else if (!query_apps.equals(other.query_apps))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "multi_risk_rpt [last_query_date=" + last_query_date + ", query_apps=" + query_apps + "]";
	}
	
	
}
