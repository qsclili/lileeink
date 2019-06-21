package pojo;

public class risk_analysis {
	
	multi_risk_rpt multi_risk_rpt; //多头申贷
	anti_fraud_rpt anti_fraud_rpt; //反欺诈
	credit_risk_rpt credit_risk_rpt; //信用风险
	public multi_risk_rpt getMulti_risk_rpt() {
		return multi_risk_rpt;
	}
	public void setMulti_risk_rpt(multi_risk_rpt multi_risk_rpt) {
		this.multi_risk_rpt = multi_risk_rpt;
	}
	public anti_fraud_rpt getAnti_fraud_rpt() {
		return anti_fraud_rpt;
	}
	public void setAnti_fraud_rpt(anti_fraud_rpt anti_fraud_rpt) {
		this.anti_fraud_rpt = anti_fraud_rpt;
	}
	public credit_risk_rpt getCredit_risk_rpt() {
		return credit_risk_rpt;
	}
	public void setCredit_risk_rpt(credit_risk_rpt credit_risk_rpt) {
		this.credit_risk_rpt = credit_risk_rpt;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((anti_fraud_rpt == null) ? 0 : anti_fraud_rpt.hashCode());
		result = prime * result + ((credit_risk_rpt == null) ? 0 : credit_risk_rpt.hashCode());
		result = prime * result + ((multi_risk_rpt == null) ? 0 : multi_risk_rpt.hashCode());
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
		risk_analysis other = (risk_analysis) obj;
		if (anti_fraud_rpt == null) {
			if (other.anti_fraud_rpt != null)
				return false;
		} else if (!anti_fraud_rpt.equals(other.anti_fraud_rpt))
			return false;
		if (credit_risk_rpt == null) {
			if (other.credit_risk_rpt != null)
				return false;
		} else if (!credit_risk_rpt.equals(other.credit_risk_rpt))
			return false;
		if (multi_risk_rpt == null) {
			if (other.multi_risk_rpt != null)
				return false;
		} else if (!multi_risk_rpt.equals(other.multi_risk_rpt))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "risk_analysis [multi_risk_rpt=" + multi_risk_rpt + ", anti_fraud_rpt=" + anti_fraud_rpt
				+ ", credit_risk_rpt=" + credit_risk_rpt + "]";
	}
	
	
}
