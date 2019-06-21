package pojo;

/**
 * ecommerce_info（用户电商信息）
 * @author Administrator
 *
 */
public class ecommerce_info {
	
	boolean is_cover; // 电商数据是否覆盖
	String ecommerce_update_time; //	电商数据最新更新时间 2019-04-02 00:06:26
	ecommerce_base_info ecommerce_base_info; //电商基本属性
	ecommerce_consume_rpt ecommerce_consume_rpt; //消费属性
	ecommerce_trade_rpt ecommerce_trade_rpt; //交易属性
	ecommerce_loan_rpt ecommerce_loan_rpt; //借贷历史
	ecommerce_risk_rpt ecommerce_risk_rpt; //风险属性
	public boolean isIs_cover() {
		return is_cover;
	}
	public void setIs_cover(boolean is_cover) {
		this.is_cover = is_cover;
	}
	public String getEcommerce_update_time() {
		return ecommerce_update_time;
	}
	public void setEcommerce_update_time(String ecommerce_update_time) {
		this.ecommerce_update_time = ecommerce_update_time;
	}
	public ecommerce_base_info getEcommerce_base_info() {
		return ecommerce_base_info;
	}
	public void setEcommerce_base_info(ecommerce_base_info ecommerce_base_info) {
		this.ecommerce_base_info = ecommerce_base_info;
	}
	public ecommerce_consume_rpt getEcommerce_consume_rpt() {
		return ecommerce_consume_rpt;
	}
	public void setEcommerce_consume_rpt(ecommerce_consume_rpt ecommerce_consume_rpt) {
		this.ecommerce_consume_rpt = ecommerce_consume_rpt;
	}
	public ecommerce_trade_rpt getEcommerce_trade_rpt() {
		return ecommerce_trade_rpt;
	}
	public void setEcommerce_trade_rpt(ecommerce_trade_rpt ecommerce_trade_rpt) {
		this.ecommerce_trade_rpt = ecommerce_trade_rpt;
	}
	public ecommerce_loan_rpt getEcommerce_loan_rpt() {
		return ecommerce_loan_rpt;
	}
	public void setEcommerce_loan_rpt(ecommerce_loan_rpt ecommerce_loan_rpt) {
		this.ecommerce_loan_rpt = ecommerce_loan_rpt;
	}
	public ecommerce_risk_rpt getEcommerce_risk_rpt() {
		return ecommerce_risk_rpt;
	}
	public void setEcommerce_risk_rpt(ecommerce_risk_rpt ecommerce_risk_rpt) {
		this.ecommerce_risk_rpt = ecommerce_risk_rpt;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((ecommerce_base_info == null) ? 0 : ecommerce_base_info.hashCode());
		result = prime * result + ((ecommerce_consume_rpt == null) ? 0 : ecommerce_consume_rpt.hashCode());
		result = prime * result + ((ecommerce_loan_rpt == null) ? 0 : ecommerce_loan_rpt.hashCode());
		result = prime * result + ((ecommerce_risk_rpt == null) ? 0 : ecommerce_risk_rpt.hashCode());
		result = prime * result + ((ecommerce_trade_rpt == null) ? 0 : ecommerce_trade_rpt.hashCode());
		result = prime * result + ((ecommerce_update_time == null) ? 0 : ecommerce_update_time.hashCode());
		result = prime * result + (is_cover ? 1231 : 1237);
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
		ecommerce_info other = (ecommerce_info) obj;
		if (ecommerce_base_info == null) {
			if (other.ecommerce_base_info != null)
				return false;
		} else if (!ecommerce_base_info.equals(other.ecommerce_base_info))
			return false;
		if (ecommerce_consume_rpt == null) {
			if (other.ecommerce_consume_rpt != null)
				return false;
		} else if (!ecommerce_consume_rpt.equals(other.ecommerce_consume_rpt))
			return false;
		if (ecommerce_loan_rpt == null) {
			if (other.ecommerce_loan_rpt != null)
				return false;
		} else if (!ecommerce_loan_rpt.equals(other.ecommerce_loan_rpt))
			return false;
		if (ecommerce_risk_rpt == null) {
			if (other.ecommerce_risk_rpt != null)
				return false;
		} else if (!ecommerce_risk_rpt.equals(other.ecommerce_risk_rpt))
			return false;
		if (ecommerce_trade_rpt == null) {
			if (other.ecommerce_trade_rpt != null)
				return false;
		} else if (!ecommerce_trade_rpt.equals(other.ecommerce_trade_rpt))
			return false;
		if (ecommerce_update_time == null) {
			if (other.ecommerce_update_time != null)
				return false;
		} else if (!ecommerce_update_time.equals(other.ecommerce_update_time))
			return false;
		if (is_cover != other.is_cover)
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "ecommerce_info [is_cover=" + is_cover + ", ecommerce_update_time=" + ecommerce_update_time
				+ ", ecommerce_base_info=" + ecommerce_base_info + ", ecommerce_consume_rpt=" + ecommerce_consume_rpt
				+ ", ecommerce_trade_rpt=" + ecommerce_trade_rpt + ", ecommerce_loan_rpt=" + ecommerce_loan_rpt
				+ ", ecommerce_risk_rpt=" + ecommerce_risk_rpt + "]";
	}
	
	
}
