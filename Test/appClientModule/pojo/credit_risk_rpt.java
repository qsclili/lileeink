
package pojo;

/**
 * risk_analysis.credit_risk_rpt（信用风险）
 * @author Administrator
 *
 */
public class credit_risk_rpt {
	
	boolean receive_phone_is_same; //申请人手机号是否与常用收货地址收件人手机号一致

	public boolean isReceive_phone_is_same() {
		return receive_phone_is_same;
	}

	public void setReceive_phone_is_same(boolean receive_phone_is_same) {
		this.receive_phone_is_same = receive_phone_is_same;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (receive_phone_is_same ? 1231 : 1237);
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
		credit_risk_rpt other = (credit_risk_rpt) obj;
		if (receive_phone_is_same != other.receive_phone_is_same)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "credit_risk_rpt [receive_phone_is_same=" + receive_phone_is_same + "]";
	}
	
	
	
}
