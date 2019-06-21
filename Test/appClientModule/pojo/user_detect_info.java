package pojo;

import java.util.Arrays;

/**
 * 用户信息核验
 * @author Administrator
 *
 */
public class user_detect_info {
	
	
	String[] idcard_related_other_names; //传入身份证组合过的姓名,没有命中为空数组
	String[] idcard_related_other_phones; //传入身份证组合过的手机号,没有命中为空数组
	String[] phone_related_other_names; //传入手机号组合过的姓名,没有命中为空数组
	String[] phone_related_other_idcards; //传入手机号组合过的身份证,没有命中为空数组
	boolean name_phone_matched_alipay; //传入姓名+手机号是否与支付宝登记姓名+手机号一致
	boolean name_idcard_matched_alipay; //传入姓名+身份证号是否与支付宝登记姓名+身份证号一致
	boolean is_verified; //用户支付宝是否实名认证
	
	public String[] getIdcard_related_other_names() {
		return idcard_related_other_names;
	}
	public void setIdcard_related_other_names(String[] idcard_related_other_names) {
		this.idcard_related_other_names = idcard_related_other_names;
	}
	public String[] getIdcard_related_other_phones() {
		return idcard_related_other_phones;
	}
	public void setIdcard_related_other_phones(String[] idcard_related_other_phones) {
		this.idcard_related_other_phones = idcard_related_other_phones;
	}
	public String[] getPhone_related_other_names() {
		return phone_related_other_names;
	}
	public void setPhone_related_other_names(String[] phone_related_other_names) {
		this.phone_related_other_names = phone_related_other_names;
	}
	public String[] getPhone_related_other_idcards() {
		return phone_related_other_idcards;
	}
	public void setPhone_related_other_idcards(String[] phone_related_other_idcards) {
		this.phone_related_other_idcards = phone_related_other_idcards;
	}
	public boolean isName_phone_matched_alipay() {
		return name_phone_matched_alipay;
	}
	public void setName_phone_matched_alipay(boolean name_phone_matched_alipay) {
		this.name_phone_matched_alipay = name_phone_matched_alipay;
	}
	public boolean isName_idcard_matched_alipay() {
		return name_idcard_matched_alipay;
	}
	public void setName_idcard_matched_alipay(boolean name_idcard_matched_alipay) {
		this.name_idcard_matched_alipay = name_idcard_matched_alipay;
	}
	public boolean isIs_verified() {
		return is_verified;
	}
	public void setIs_verified(boolean is_verified) {
		this.is_verified = is_verified;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + Arrays.hashCode(idcard_related_other_names);
		result = prime * result + Arrays.hashCode(idcard_related_other_phones);
		result = prime * result + (is_verified ? 1231 : 1237);
		result = prime * result + (name_idcard_matched_alipay ? 1231 : 1237);
		result = prime * result + (name_phone_matched_alipay ? 1231 : 1237);
		result = prime * result + Arrays.hashCode(phone_related_other_idcards);
		result = prime * result + Arrays.hashCode(phone_related_other_names);
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
		user_detect_info other = (user_detect_info) obj;
		if (!Arrays.equals(idcard_related_other_names, other.idcard_related_other_names))
			return false;
		if (!Arrays.equals(idcard_related_other_phones, other.idcard_related_other_phones))
			return false;
		if (is_verified != other.is_verified)
			return false;
		if (name_idcard_matched_alipay != other.name_idcard_matched_alipay)
			return false;
		if (name_phone_matched_alipay != other.name_phone_matched_alipay)
			return false;
		if (!Arrays.equals(phone_related_other_idcards, other.phone_related_other_idcards))
			return false;
		if (!Arrays.equals(phone_related_other_names, other.phone_related_other_names))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "user_detect_info [idcard_related_other_names=" + Arrays.toString(idcard_related_other_names)
				+ ", idcard_related_other_phones=" + Arrays.toString(idcard_related_other_phones)
				+ ", phone_related_other_names=" + Arrays.toString(phone_related_other_names)
				+ ", phone_related_other_idcards=" + Arrays.toString(phone_related_other_idcards)
				+ ", name_phone_matched_alipay=" + name_phone_matched_alipay + ", name_idcard_matched_alipay="
				+ name_idcard_matched_alipay + ", is_verified=" + is_verified + "]";
	}
	
	
	
}
