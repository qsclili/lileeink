package pojo;

public class user_info {
	
	user_base_info user_base_info;
	user_detect_info user_detect_info;
	
	public user_base_info getUser_base_info() {
		return user_base_info;
	}
	public void setUser_base_info(user_base_info user_base_info) {
		this.user_base_info = user_base_info;
	}
	public user_detect_info getUser_detect_info() {
		return user_detect_info;
	}
	public void setUser_detect_info(user_detect_info user_detect_info) {
		this.user_detect_info = user_detect_info;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((user_base_info == null) ? 0 : user_base_info.hashCode());
		result = prime * result + ((user_detect_info == null) ? 0 : user_detect_info.hashCode());
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
		user_info other = (user_info) obj;
		if (user_base_info == null) {
			if (other.user_base_info != null)
				return false;
		} else if (!user_base_info.equals(other.user_base_info))
			return false;
		if (user_detect_info == null) {
			if (other.user_detect_info != null)
				return false;
		} else if (!user_detect_info.equals(other.user_detect_info))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "user_info [user_base_info=" + user_base_info + ", user_detect_info=" + user_detect_info + "]";
	}
	
	
	
}
