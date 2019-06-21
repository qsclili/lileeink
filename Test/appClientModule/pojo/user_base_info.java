package pojo;



/**
 * 用户传入基本信息
 * @author Administrator
 *
 */
public class user_base_info {
		
	String name; //传入姓名
	String idcard; //	传入身份证
	String mobile; //传入手机号
	long input_timestamp; //传入的timestamp(ms)
    int gender; //性别，0女 1男
    
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getIdcard() {
		return idcard;
	}
	public void setIdcard(String idcard) {
		this.idcard = idcard;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public long getInput_timestamp() {
		return input_timestamp;
	}
	public void setInput_timestamp(long input_timestamp) {
		this.input_timestamp = input_timestamp;
	}
	public int getGender() {
		return gender;
	}
	public void setGender(int gender) {
		this.gender = gender;
	}
	
	
	
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + gender;
		result = prime * result + ((idcard == null) ? 0 : idcard.hashCode());
		result = prime * result + (int) (input_timestamp ^ (input_timestamp >>> 32));
		result = prime * result + ((mobile == null) ? 0 : mobile.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
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
		user_base_info other = (user_base_info) obj;
		if (gender != other.gender)
			return false;
		if (idcard == null) {
			if (other.idcard != null)
				return false;
		} else if (!idcard.equals(other.idcard))
			return false;
		if (input_timestamp != other.input_timestamp)
			return false;
		if (mobile == null) {
			if (other.mobile != null)
				return false;
		} else if (!mobile.equals(other.mobile))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "zm_score_info [name=" + name + ", idcard=" + idcard + ", mobile=" + mobile + ", input_timestamp="
				+ input_timestamp + ", gender=" + gender + "]";
	}
	
	
	
}
