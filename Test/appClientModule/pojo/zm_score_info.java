package pojo;

/**
 * zm_score_info（用户芝麻分信息）
 * @author Administrator
 *
 */
public class zm_score_info {
	
	
	boolean is_cover; //芝麻分数据是否覆盖
	String zm_score_update_time; //芝麻分最新更新时间 2019-04-02 00:06:26
	/**
	 * 芝麻分 区间值,缺失=0,(ninf , 350]=1,(350, 550]=2,(550 , 600]=3,(600 , 650]=4,(650 , 700]=5,(700 , 950]=6,(950 , inf]=7
	 */
	Integer zm_score; //
	public boolean isIs_cover() {
		return is_cover;
	}
	public void setIs_cover(boolean is_cover) {
		this.is_cover = is_cover;
	}
	public String getZm_score_update_time() {
		return zm_score_update_time;
	}
	public void setZm_score_update_time(String zm_score_update_time) {
		this.zm_score_update_time = zm_score_update_time;
	}
	public Integer getZm_score() {
		return zm_score;
	}
	public void setZm_score(Integer zm_score) {
		this.zm_score = zm_score;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (is_cover ? 1231 : 1237);
		result = prime * result + ((zm_score == null) ? 0 : zm_score.hashCode());
		result = prime * result + ((zm_score_update_time == null) ? 0 : zm_score_update_time.hashCode());
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
		zm_score_info other = (zm_score_info) obj;
		if (is_cover != other.is_cover)
			return false;
		if (zm_score == null) {
			if (other.zm_score != null)
				return false;
		} else if (!zm_score.equals(other.zm_score))
			return false;
		if (zm_score_update_time == null) {
			if (other.zm_score_update_time != null)
				return false;
		} else if (!zm_score_update_time.equals(other.zm_score_update_time))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "zm_score_info [is_cover=" + is_cover + ", zm_score_update_time=" + zm_score_update_time + ", zm_score="
				+ zm_score + "]";
	}
	
	
	
	
}
