package pojo;

/**
 * ecommerce_info.ecommerce_base_info（电商基本属性）
 * @author Administrator
 *
 */
public class ecommerce_base_info {
	
	String name_on_alipay; // 支付宝上的姓名
	String idcard_on_alipay; // 支付宝上的身份证
	String mobile_on_alipay; // 支付宝上的手机号
	int huabei_status; //花呗状态，0：未冻结，-1：冻结（花呗严重逾期，套现，欺诈会被冻结），1:逾期
	Integer register_days; //支付宝注册距今天数 区间值 缺失=0,(0 , 720]=1,(720, 1440]=2,(1440 , 2500]=3,(2500, 3000]=4,(3000 , inf]=5
	Integer tao_score; //淘气值 区间值,缺失=0,(ninf , 450]=1,(450, 600]=2,(600 , 750]=3,(750, 900]=4,(900 , inf]=5
	Integer tmall_score; //天猫积分 区间值,缺失=0,(ninf , 100]=1,(100, 500]=2,(500 , 900]=3,(900, 1500]=4,(1500 , inf]=5
	Integer credit_level_as_buyer; //卖家信用 区间值,缺失=0,(ninf , 25]=1,(25, 75]=2,(75 , 150]=3,(150 , 300]=4,(300 , inf]=5
	Integer huabei_amount; //花呗额度(包含临时信用额度）区间值,缺失=0,(ninf , 500]=1,(500, 1000]=2,(1000 , 2000]=3,(2000 , 4000]=4,(4000 , inf]=5
	Integer huabei_original_amount; //花呗原始额度 区间值,缺失=0,(ninf , 500]=1,(500, 1000]=2,(1000 , 2000]=3,(2000 , 4000]=4,(4000 , inf]=5
	Integer huabei_balance; //花呗余额 区间值,缺失=0,(ninf , 0]=1,(0, 25]=2,(25 , 100]=3,(100 , 500]=4,(500 , inf]=5
	Integer huabei_penalty_amount; //花呗罚息 区间值,缺失=0,(ninf , 0]=1,(0, 10]=2,(10 , 30]=3,(30 , 50]=4,(50 , inf]=5
	Integer yuebao_balance; //余额宝余额 区间值,缺失=0,(ninf , 0]=1,(0, 10]=2,(10 , 50]=3,(50 , 100]=4,(100 , inf]=5
	Integer yuebao_income; //余额宝总收入 区间值,缺失=0,(ninf , 0]=1,(0, 5]=2,(5 , 20]=3,(20 , 50]=4,(50 , inf]=5
	Integer alipay_balance; //支付宝余额 区间值,缺失=0,(ninf , 0]=1,(0, 10]=2,(10 , 50]=3,(50 , 100]=4,(100 , inf]=5
	Integer mybank_credit_quota; //网商贷额度 区间值,缺失=0,(ninf , 3000]=1,(3000, 5000]=2,(5000 , 8000]=3,(8000 , 15000]=4,(15000 , inf]=5
	public String getName_on_alipay() {
		return name_on_alipay;
	}
	public void setName_on_alipay(String name_on_alipay) {
		this.name_on_alipay = name_on_alipay;
	}
	public String getIdcard_on_alipay() {
		return idcard_on_alipay;
	}
	public void setIdcard_on_alipay(String idcard_on_alipay) {
		this.idcard_on_alipay = idcard_on_alipay;
	}
	public String getMobile_on_alipay() {
		return mobile_on_alipay;
	}
	public void setMobile_on_alipay(String mobile_on_alipay) {
		this.mobile_on_alipay = mobile_on_alipay;
	}
	public int getHuabei_status() {
		return huabei_status;
	}
	public void setHuabei_status(int huabei_status) {
		this.huabei_status = huabei_status;
	}
	public Integer getRegister_days() {
		return register_days;
	}
	public void setRegister_days(Integer register_days) {
		this.register_days = register_days;
	}
	public Integer getTao_score() {
		return tao_score;
	}
	public void setTao_score(Integer tao_score) {
		this.tao_score = tao_score;
	}
	public Integer getTmall_score() {
		return tmall_score;
	}
	public void setTmall_score(Integer tmall_score) {
		this.tmall_score = tmall_score;
	}
	public Integer getCredit_level_as_buyer() {
		return credit_level_as_buyer;
	}
	public void setCredit_level_as_buyer(Integer credit_level_as_buyer) {
		this.credit_level_as_buyer = credit_level_as_buyer;
	}
	public Integer getHuabei_amount() {
		return huabei_amount;
	}
	public void setHuabei_amount(Integer huabei_amount) {
		this.huabei_amount = huabei_amount;
	}
	public Integer getHuabei_original_amount() {
		return huabei_original_amount;
	}
	public void setHuabei_original_amount(Integer huabei_original_amount) {
		this.huabei_original_amount = huabei_original_amount;
	}
	public Integer getHuabei_balance() {
		return huabei_balance;
	}
	public void setHuabei_balance(Integer huabei_balance) {
		this.huabei_balance = huabei_balance;
	}
	public Integer getHuabei_penalty_amount() {
		return huabei_penalty_amount;
	}
	public void setHuabei_penalty_amount(Integer huabei_penalty_amount) {
		this.huabei_penalty_amount = huabei_penalty_amount;
	}
	public Integer getYuebao_balance() {
		return yuebao_balance;
	}
	public void setYuebao_balance(Integer yuebao_balance) {
		this.yuebao_balance = yuebao_balance;
	}
	public Integer getYuebao_income() {
		return yuebao_income;
	}
	public void setYuebao_income(Integer yuebao_income) {
		this.yuebao_income = yuebao_income;
	}
	public Integer getAlipay_balance() {
		return alipay_balance;
	}
	public void setAlipay_balance(Integer alipay_balance) {
		this.alipay_balance = alipay_balance;
	}
	public Integer getMybank_credit_quota() {
		return mybank_credit_quota;
	}
	public void setMybank_credit_quota(Integer mybank_credit_quota) {
		this.mybank_credit_quota = mybank_credit_quota;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((alipay_balance == null) ? 0 : alipay_balance.hashCode());
		result = prime * result + ((credit_level_as_buyer == null) ? 0 : credit_level_as_buyer.hashCode());
		result = prime * result + ((huabei_amount == null) ? 0 : huabei_amount.hashCode());
		result = prime * result + ((huabei_balance == null) ? 0 : huabei_balance.hashCode());
		result = prime * result + ((huabei_original_amount == null) ? 0 : huabei_original_amount.hashCode());
		result = prime * result + ((huabei_penalty_amount == null) ? 0 : huabei_penalty_amount.hashCode());
		result = prime * result + huabei_status;
		result = prime * result + ((idcard_on_alipay == null) ? 0 : idcard_on_alipay.hashCode());
		result = prime * result + ((mobile_on_alipay == null) ? 0 : mobile_on_alipay.hashCode());
		result = prime * result + ((mybank_credit_quota == null) ? 0 : mybank_credit_quota.hashCode());
		result = prime * result + ((name_on_alipay == null) ? 0 : name_on_alipay.hashCode());
		result = prime * result + ((register_days == null) ? 0 : register_days.hashCode());
		result = prime * result + ((tao_score == null) ? 0 : tao_score.hashCode());
		result = prime * result + ((tmall_score == null) ? 0 : tmall_score.hashCode());
		result = prime * result + ((yuebao_balance == null) ? 0 : yuebao_balance.hashCode());
		result = prime * result + ((yuebao_income == null) ? 0 : yuebao_income.hashCode());
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
		ecommerce_base_info other = (ecommerce_base_info) obj;
		if (alipay_balance == null) {
			if (other.alipay_balance != null)
				return false;
		} else if (!alipay_balance.equals(other.alipay_balance))
			return false;
		if (credit_level_as_buyer == null) {
			if (other.credit_level_as_buyer != null)
				return false;
		} else if (!credit_level_as_buyer.equals(other.credit_level_as_buyer))
			return false;
		if (huabei_amount == null) {
			if (other.huabei_amount != null)
				return false;
		} else if (!huabei_amount.equals(other.huabei_amount))
			return false;
		if (huabei_balance == null) {
			if (other.huabei_balance != null)
				return false;
		} else if (!huabei_balance.equals(other.huabei_balance))
			return false;
		if (huabei_original_amount == null) {
			if (other.huabei_original_amount != null)
				return false;
		} else if (!huabei_original_amount.equals(other.huabei_original_amount))
			return false;
		if (huabei_penalty_amount == null) {
			if (other.huabei_penalty_amount != null)
				return false;
		} else if (!huabei_penalty_amount.equals(other.huabei_penalty_amount))
			return false;
		if (huabei_status != other.huabei_status)
			return false;
		if (idcard_on_alipay == null) {
			if (other.idcard_on_alipay != null)
				return false;
		} else if (!idcard_on_alipay.equals(other.idcard_on_alipay))
			return false;
		if (mobile_on_alipay == null) {
			if (other.mobile_on_alipay != null)
				return false;
		} else if (!mobile_on_alipay.equals(other.mobile_on_alipay))
			return false;
		if (mybank_credit_quota == null) {
			if (other.mybank_credit_quota != null)
				return false;
		} else if (!mybank_credit_quota.equals(other.mybank_credit_quota))
			return false;
		if (name_on_alipay == null) {
			if (other.name_on_alipay != null)
				return false;
		} else if (!name_on_alipay.equals(other.name_on_alipay))
			return false;
		if (register_days == null) {
			if (other.register_days != null)
				return false;
		} else if (!register_days.equals(other.register_days))
			return false;
		if (tao_score == null) {
			if (other.tao_score != null)
				return false;
		} else if (!tao_score.equals(other.tao_score))
			return false;
		if (tmall_score == null) {
			if (other.tmall_score != null)
				return false;
		} else if (!tmall_score.equals(other.tmall_score))
			return false;
		if (yuebao_balance == null) {
			if (other.yuebao_balance != null)
				return false;
		} else if (!yuebao_balance.equals(other.yuebao_balance))
			return false;
		if (yuebao_income == null) {
			if (other.yuebao_income != null)
				return false;
		} else if (!yuebao_income.equals(other.yuebao_income))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "ecommerce_base_info [name_on_alipay=" + name_on_alipay + ", idcard_on_alipay=" + idcard_on_alipay
				+ ", mobile_on_alipay=" + mobile_on_alipay + ", huabei_status=" + huabei_status + ", register_days="
				+ register_days + ", tao_score=" + tao_score + ", tmall_score=" + tmall_score
				+ ", credit_level_as_buyer=" + credit_level_as_buyer + ", huabei_amount=" + huabei_amount
				+ ", huabei_original_amount=" + huabei_original_amount + ", huabei_balance=" + huabei_balance
				+ ", huabei_penalty_amount=" + huabei_penalty_amount + ", yuebao_balance=" + yuebao_balance
				+ ", yuebao_income=" + yuebao_income + ", alipay_balance=" + alipay_balance + ", mybank_credit_quota="
				+ mybank_credit_quota + "]";
	}

	
}
