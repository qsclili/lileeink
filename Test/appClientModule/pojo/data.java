package pojo;

public class data {
	
	user_info user_info;
	risk_analysis risk_analysis;
	zm_score_info zm_score_info;
	ecommerce_info ecommerce_info;
	public user_info getUser_info() {
		return user_info;
	}
	public void setUser_info(user_info user_info) {
		this.user_info = user_info;
	}
	public risk_analysis getRisk_analysis() {
		return risk_analysis;
	}
	public void setRisk_analysis(risk_analysis risk_analysis) {
		this.risk_analysis = risk_analysis;
	}
	public zm_score_info getZm_score_info() {
		return zm_score_info;
	}
	public void setZm_score_info(zm_score_info zm_score_info) {
		this.zm_score_info = zm_score_info;
	}
	public ecommerce_info getEcommerce_info() {
		return ecommerce_info;
	}
	public void setEcommerce_info(ecommerce_info ecommerce_info) {
		this.ecommerce_info = ecommerce_info;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((ecommerce_info == null) ? 0 : ecommerce_info.hashCode());
		result = prime * result + ((risk_analysis == null) ? 0 : risk_analysis.hashCode());
		result = prime * result + ((user_info == null) ? 0 : user_info.hashCode());
		result = prime * result + ((zm_score_info == null) ? 0 : zm_score_info.hashCode());
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
		data other = (data) obj;
		if (ecommerce_info == null) {
			if (other.ecommerce_info != null)
				return false;
		} else if (!ecommerce_info.equals(other.ecommerce_info))
			return false;
		if (risk_analysis == null) {
			if (other.risk_analysis != null)
				return false;
		} else if (!risk_analysis.equals(other.risk_analysis))
			return false;
		if (user_info == null) {
			if (other.user_info != null)
				return false;
		} else if (!user_info.equals(other.user_info))
			return false;
		if (zm_score_info == null) {
			if (other.zm_score_info != null)
				return false;
		} else if (!zm_score_info.equals(other.zm_score_info))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "data [user_info=" + user_info + ", risk_analysis=" + risk_analysis + ", zm_score_info=" + zm_score_info
				+ ", ecommerce_info=" + ecommerce_info + "]";
	}
	
	
}
