package pojo;

/**
 * risk_analysis.anti_fraud_rpt（反欺诈）
 * @author Administrator
 *
 */
public class anti_fraud_rpt {
	
	boolean name_phone_blacklist; //申请人姓名+手机号是否命中黑名单
	boolean name_idcard_blacklist; //	申请人姓名+身份证是否命中黑名单
	boolean name_idcard_court_shixin; //申请人姓名+身份证是否命中法院失信人
	boolean name_idcard_caac_shixin; //申请人姓名+身份证是否命中民航失信人
	boolean name_idcard_tax_nature_shixin; //申请人姓名+身份证是否命中自然人税务失信人
	boolean name_idcard_train_shixin; //申请人姓名+身份证是否命中火车失信人
	int lock_realaccount_total_cnt; //申请人绑定支付宝实名账号总个数
	int lock_realaccount_cnt; // 申请人绑定支付宝实名账号个数
	public boolean isName_phone_blacklist() {
		return name_phone_blacklist;
	}
	public void setName_phone_blacklist(boolean name_phone_blacklist) {
		this.name_phone_blacklist = name_phone_blacklist;
	}
	public boolean isName_idcard_blacklist() {
		return name_idcard_blacklist;
	}
	public void setName_idcard_blacklist(boolean name_idcard_blacklist) {
		this.name_idcard_blacklist = name_idcard_blacklist;
	}
	public boolean isName_idcard_court_shixin() {
		return name_idcard_court_shixin;
	}
	public void setName_idcard_court_shixin(boolean name_idcard_court_shixin) {
		this.name_idcard_court_shixin = name_idcard_court_shixin;
	}
	public boolean isName_idcard_caac_shixin() {
		return name_idcard_caac_shixin;
	}
	public void setName_idcard_caac_shixin(boolean name_idcard_caac_shixin) {
		this.name_idcard_caac_shixin = name_idcard_caac_shixin;
	}
	public boolean isName_idcard_tax_nature_shixin() {
		return name_idcard_tax_nature_shixin;
	}
	public void setName_idcard_tax_nature_shixin(boolean name_idcard_tax_nature_shixin) {
		this.name_idcard_tax_nature_shixin = name_idcard_tax_nature_shixin;
	}
	public boolean isName_idcard_train_shixin() {
		return name_idcard_train_shixin;
	}
	public void setName_idcard_train_shixin(boolean name_idcard_train_shixin) {
		this.name_idcard_train_shixin = name_idcard_train_shixin;
	}
	public int getLock_realaccount_total_cnt() {
		return lock_realaccount_total_cnt;
	}
	public void setLock_realaccount_total_cnt(int lock_realaccount_total_cnt) {
		this.lock_realaccount_total_cnt = lock_realaccount_total_cnt;
	}
	public int getLock_realaccount_cnt() {
		return lock_realaccount_cnt;
	}
	public void setLock_realaccount_cnt(int lock_realaccount_cnt) {
		this.lock_realaccount_cnt = lock_realaccount_cnt;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + lock_realaccount_cnt;
		result = prime * result + lock_realaccount_total_cnt;
		result = prime * result + (name_idcard_blacklist ? 1231 : 1237);
		result = prime * result + (name_idcard_caac_shixin ? 1231 : 1237);
		result = prime * result + (name_idcard_court_shixin ? 1231 : 1237);
		result = prime * result + (name_idcard_tax_nature_shixin ? 1231 : 1237);
		result = prime * result + (name_idcard_train_shixin ? 1231 : 1237);
		result = prime * result + (name_phone_blacklist ? 1231 : 1237);
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
		anti_fraud_rpt other = (anti_fraud_rpt) obj;
		if (lock_realaccount_cnt != other.lock_realaccount_cnt)
			return false;
		if (lock_realaccount_total_cnt != other.lock_realaccount_total_cnt)
			return false;
		if (name_idcard_blacklist != other.name_idcard_blacklist)
			return false;
		if (name_idcard_caac_shixin != other.name_idcard_caac_shixin)
			return false;
		if (name_idcard_court_shixin != other.name_idcard_court_shixin)
			return false;
		if (name_idcard_tax_nature_shixin != other.name_idcard_tax_nature_shixin)
			return false;
		if (name_idcard_train_shixin != other.name_idcard_train_shixin)
			return false;
		if (name_phone_blacklist != other.name_phone_blacklist)
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "anti_fraud_rpt [name_phone_blacklist=" + name_phone_blacklist + ", name_idcard_blacklist="
				+ name_idcard_blacklist + ", name_idcard_court_shixin=" + name_idcard_court_shixin
				+ ", name_idcard_caac_shixin=" + name_idcard_caac_shixin + ", name_idcard_tax_nature_shixin="
				+ name_idcard_tax_nature_shixin + ", name_idcard_train_shixin=" + name_idcard_train_shixin
				+ ", lock_realaccount_total_cnt=" + lock_realaccount_total_cnt + ", lock_realaccount_cnt="
				+ lock_realaccount_cnt + "]";
	}
	
	
}
