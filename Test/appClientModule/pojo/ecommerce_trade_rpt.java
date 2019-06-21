package pojo;

import java.math.BigDecimal;

/**
 * ecommerce_info.ecommerce_trade_rpt（交易属性）
 * @author Administrator
 *
 */
public class ecommerce_trade_rpt {
	
	BigDecimal trade_amt_month_stab_6m;//	BigDecimal	否	近6个月每月交易金额的稳定性
	BigDecimal trade_cnt_month_stab_6m;//	BigDecimal	否	近6个月每月交易次数的稳定性
	BigDecimal trade_amt_month_skew_6m;//	BigDecimal	否	近6个月每月交易金额的偏度
	BigDecimal trade_cnt_month_skew_6m;//	BigDecimal	否	近6个月每月交易次数的偏度
	BigDecimal trade_cnt_week_freq_6m;//	BigDecimal	否	近6个月周交易频次
	BigDecimal trade_cnt_week_freq_3m;//	BigDecimal	否	近3个月周交易频次
	BigDecimal trade_cnt_day_freq_6m;//	BigDecimal	否	近6个月日交易频次
	BigDecimal trade_cnt_day_freq_3m;//	BigDecimal	否	近3个月日交易频次
	BigDecimal trade_cnt_week_freq_month_stab_6m;//	BigDecimal	否	近6个月每月周交易频次的稳定性
	BigDecimal trade_cnt_day_freq_month_stab_6m;//	BigDecimal	否	近6个月每月日交易频次的稳定性
	BigDecimal trade_amt_month_rise_rate_max_6m;//	BigDecimal	否	近6个月每月交易金额的最大增长率
	BigDecimal trade_amt_month_rise_rate_min_6m;//	BigDecimal	否	近6个月每月交易金额的最小增长率
	BigDecimal trade_amt_month_rise_rate_mean_6m;//	BigDecimal	否	近6个月每月交易金额的平均增长率
	BigDecimal trade_cnt_month_rise_rate_max_6m;//	BigDecimal	否	近6个月每月交易次数的最大增长率
	BigDecimal trade_cnt_month_rise_rate_min_6m;//	BigDecimal	否	近6个月每月交易次数的最小增长率
	BigDecimal trade_cnt_month_rise_rate_mean_6m;//	BigDecimal	否	近6个月每月交易次数的平均增长率
	Integer trade_recent_time_span;//	Integer	否	最近一次交易时间距今天数
	Integer trade_scene_num_6m;//	Integer	否	近6个月交易活跃场景个数
	Integer trade_scene_num_3m;//	Integer	否	近3个月交易活跃场景个数
	Integer trade_scene_num_1m;//	Integer	否	近1个月交易活跃场景个数
	BigDecimal trade_income_amt_max_6m;//	BigDecimal	否	近6个月收入的最大一笔金额
	BigDecimal trade_income_amt_mean_6m;//	BigDecimal	否	近6个月收入的平均每单金额
	BigDecimal trade_income_amt_max_3m;//	BigDecimal	否	近3个月收入的最大一笔金额
	BigDecimal trade_income_amt_mean_3m;//	BigDecimal	否	近3个月收入的平均每单金额
	BigDecimal trade_income_amt_max_1m;//	BigDecimal	否	近1个月收入的最大一笔金额
	BigDecimal trade_income_amt_mean_1m;//	BigDecimal	否	近1个月收入的平均每单金额
	BigDecimal trade_pay_amt_max_6m;//	BigDecimal	否	近6个月支出的最大一笔金额
	BigDecimal trade_pay_amt_mean_6m;//	BigDecimal	否	近6个月支出的平均每单金额
	BigDecimal trade_pay_amt_max_3m;//	BigDecimal	否	近3个月支出的最大一笔金额
	BigDecimal trade_pay_amt_mean_3m;//	BigDecimal	否	近3个月支出的平均每单金额
	BigDecimal trade_pay_amt_max_1m;//	BigDecimal	否	近1个月支出的最大一笔金额
	BigDecimal trade_pay_amt_mean_1m;//	BigDecimal	否	近1个月支出的平均每单金额
	BigDecimal trade_pay_amt_day_max_6m;//	BigDecimal	否	近6个月单日最大支出金额
	BigDecimal trade_pay_amt_day_max_3m;//	BigDecimal	否	近3个月单日最大支出金额
	BigDecimal trade_income_amt_day_max_6m;//	BigDecimal	否	近6个月单日最大收入金额
	BigDecimal trade_income_amt_day_max_3m;//	BigDecimal	否	近3个月单日最大收入金额
	Integer trade_income_cnt_sum_6m;//	Integer	否	近6个月总收入笔数
	BigDecimal trade_income_amt_sum_6m;//	BigDecimal	否	近6个月总收入金额
	Integer trade_income_cnt_sum_3m;//	Integer	否	近3个月总收入笔数
	BigDecimal trade_income_amt_sum_3m;//	BigDecimal	否	近3个月总收入金额
	Integer trade_income_cnt_sum_1m;//	Integer	否	近1个月总收入笔数
	BigDecimal trade_income_amt_sum_1m;//	BigDecimal	否	近1个月总收入金额
	Integer trade_pay_cnt_sum_6m;//	Integer	否	近6个月总支出笔数
	BigDecimal trade_pay_amt_sum_6m;//	BigDecimal	否	近6个月总支出金额
	Integer trade_pay_cnt_sum_3m;//	Integer	否	近3个月总支出笔数
	BigDecimal trade_pay_amt_sum_3m;//	BigDecimal	否	近3个月总支出金额
	Integer trade_pay_cnt_sum_1m;//	Integer	否	近1个月总支出笔数
	BigDecimal trade_pay_amt_sum_1m;//	BigDecimal	否	近1个月总支出金额
	BigDecimal trade_income_amt_month_mean_6m;//	BigDecimal	否	近6个月平均每月收入金额
	BigDecimal trade_income_amt_month_mean_3m;//	BigDecimal	否	近3个月平均每月收入金额
	BigDecimal trade_income_amt_month_max_6m;//	BigDecimal	否	近6个月单月最大收入金额
	BigDecimal trade_income_amt_month_max_3m;//	BigDecimal	否	近3个月单月最大收入金额
	BigDecimal trade_pay_amt_month_mean_6m;//	BigDecimal	否	近6个月平均每月支出金额
	BigDecimal trade_pay_amt_month_mean_3m;//	BigDecimal	否	近3个月平均每月支出金额
	BigDecimal trade_pay_amt_month_max_6m;//	BigDecimal	否	近6个月单月最大支出金额
	BigDecimal trade_pay_amt_month_max_3m;//	BigDecimal	否	近3个月单月最大支出金额
	BigDecimal trade_income_amt_month_stab_6m;//	BigDecimal	否	近6个月每月收入金额的稳定性
	BigDecimal trade_income_cnt_month_stab_6m;//	BigDecimal	否	近6个月每月收入笔数的稳定性
	BigDecimal trade_pay_amt_month_stab_6m;//	BigDecimal	否	近6个月每月支出金额的稳定性
	BigDecimal trade_pay_cnt_month_stab_6m;//	BigDecimal	否	近6个月每月支出笔数的稳定性
	public BigDecimal getTrade_amt_month_stab_6m() {
		return trade_amt_month_stab_6m;
	}
	public void setTrade_amt_month_stab_6m(BigDecimal trade_amt_month_stab_6m) {
		this.trade_amt_month_stab_6m = trade_amt_month_stab_6m;
	}
	public BigDecimal getTrade_cnt_month_stab_6m() {
		return trade_cnt_month_stab_6m;
	}
	public void setTrade_cnt_month_stab_6m(BigDecimal trade_cnt_month_stab_6m) {
		this.trade_cnt_month_stab_6m = trade_cnt_month_stab_6m;
	}
	public BigDecimal getTrade_amt_month_skew_6m() {
		return trade_amt_month_skew_6m;
	}
	public void setTrade_amt_month_skew_6m(BigDecimal trade_amt_month_skew_6m) {
		this.trade_amt_month_skew_6m = trade_amt_month_skew_6m;
	}
	public BigDecimal getTrade_cnt_month_skew_6m() {
		return trade_cnt_month_skew_6m;
	}
	public void setTrade_cnt_month_skew_6m(BigDecimal trade_cnt_month_skew_6m) {
		this.trade_cnt_month_skew_6m = trade_cnt_month_skew_6m;
	}
	public BigDecimal getTrade_cnt_week_freq_6m() {
		return trade_cnt_week_freq_6m;
	}
	public void setTrade_cnt_week_freq_6m(BigDecimal trade_cnt_week_freq_6m) {
		this.trade_cnt_week_freq_6m = trade_cnt_week_freq_6m;
	}
	public BigDecimal getTrade_cnt_week_freq_3m() {
		return trade_cnt_week_freq_3m;
	}
	public void setTrade_cnt_week_freq_3m(BigDecimal trade_cnt_week_freq_3m) {
		this.trade_cnt_week_freq_3m = trade_cnt_week_freq_3m;
	}
	public BigDecimal getTrade_cnt_day_freq_6m() {
		return trade_cnt_day_freq_6m;
	}
	public void setTrade_cnt_day_freq_6m(BigDecimal trade_cnt_day_freq_6m) {
		this.trade_cnt_day_freq_6m = trade_cnt_day_freq_6m;
	}
	public BigDecimal getTrade_cnt_day_freq_3m() {
		return trade_cnt_day_freq_3m;
	}
	public void setTrade_cnt_day_freq_3m(BigDecimal trade_cnt_day_freq_3m) {
		this.trade_cnt_day_freq_3m = trade_cnt_day_freq_3m;
	}
	public BigDecimal getTrade_cnt_week_freq_month_stab_6m() {
		return trade_cnt_week_freq_month_stab_6m;
	}
	public void setTrade_cnt_week_freq_month_stab_6m(BigDecimal trade_cnt_week_freq_month_stab_6m) {
		this.trade_cnt_week_freq_month_stab_6m = trade_cnt_week_freq_month_stab_6m;
	}
	public BigDecimal getTrade_cnt_day_freq_month_stab_6m() {
		return trade_cnt_day_freq_month_stab_6m;
	}
	public void setTrade_cnt_day_freq_month_stab_6m(BigDecimal trade_cnt_day_freq_month_stab_6m) {
		this.trade_cnt_day_freq_month_stab_6m = trade_cnt_day_freq_month_stab_6m;
	}
	public BigDecimal getTrade_amt_month_rise_rate_max_6m() {
		return trade_amt_month_rise_rate_max_6m;
	}
	public void setTrade_amt_month_rise_rate_max_6m(BigDecimal trade_amt_month_rise_rate_max_6m) {
		this.trade_amt_month_rise_rate_max_6m = trade_amt_month_rise_rate_max_6m;
	}
	public BigDecimal getTrade_amt_month_rise_rate_min_6m() {
		return trade_amt_month_rise_rate_min_6m;
	}
	public void setTrade_amt_month_rise_rate_min_6m(BigDecimal trade_amt_month_rise_rate_min_6m) {
		this.trade_amt_month_rise_rate_min_6m = trade_amt_month_rise_rate_min_6m;
	}
	public BigDecimal getTrade_amt_month_rise_rate_mean_6m() {
		return trade_amt_month_rise_rate_mean_6m;
	}
	public void setTrade_amt_month_rise_rate_mean_6m(BigDecimal trade_amt_month_rise_rate_mean_6m) {
		this.trade_amt_month_rise_rate_mean_6m = trade_amt_month_rise_rate_mean_6m;
	}
	public BigDecimal getTrade_cnt_month_rise_rate_max_6m() {
		return trade_cnt_month_rise_rate_max_6m;
	}
	public void setTrade_cnt_month_rise_rate_max_6m(BigDecimal trade_cnt_month_rise_rate_max_6m) {
		this.trade_cnt_month_rise_rate_max_6m = trade_cnt_month_rise_rate_max_6m;
	}
	public BigDecimal getTrade_cnt_month_rise_rate_min_6m() {
		return trade_cnt_month_rise_rate_min_6m;
	}
	public void setTrade_cnt_month_rise_rate_min_6m(BigDecimal trade_cnt_month_rise_rate_min_6m) {
		this.trade_cnt_month_rise_rate_min_6m = trade_cnt_month_rise_rate_min_6m;
	}
	public BigDecimal getTrade_cnt_month_rise_rate_mean_6m() {
		return trade_cnt_month_rise_rate_mean_6m;
	}
	public void setTrade_cnt_month_rise_rate_mean_6m(BigDecimal trade_cnt_month_rise_rate_mean_6m) {
		this.trade_cnt_month_rise_rate_mean_6m = trade_cnt_month_rise_rate_mean_6m;
	}
	public Integer getTrade_recent_time_span() {
		return trade_recent_time_span;
	}
	public void setTrade_recent_time_span(Integer trade_recent_time_span) {
		this.trade_recent_time_span = trade_recent_time_span;
	}
	public Integer getTrade_scene_num_6m() {
		return trade_scene_num_6m;
	}
	public void setTrade_scene_num_6m(Integer trade_scene_num_6m) {
		this.trade_scene_num_6m = trade_scene_num_6m;
	}
	public Integer getTrade_scene_num_3m() {
		return trade_scene_num_3m;
	}
	public void setTrade_scene_num_3m(Integer trade_scene_num_3m) {
		this.trade_scene_num_3m = trade_scene_num_3m;
	}
	public Integer getTrade_scene_num_1m() {
		return trade_scene_num_1m;
	}
	public void setTrade_scene_num_1m(Integer trade_scene_num_1m) {
		this.trade_scene_num_1m = trade_scene_num_1m;
	}
	public BigDecimal getTrade_income_amt_max_6m() {
		return trade_income_amt_max_6m;
	}
	public void setTrade_income_amt_max_6m(BigDecimal trade_income_amt_max_6m) {
		this.trade_income_amt_max_6m = trade_income_amt_max_6m;
	}
	public BigDecimal getTrade_income_amt_mean_6m() {
		return trade_income_amt_mean_6m;
	}
	public void setTrade_income_amt_mean_6m(BigDecimal trade_income_amt_mean_6m) {
		this.trade_income_amt_mean_6m = trade_income_amt_mean_6m;
	}
	public BigDecimal getTrade_income_amt_max_3m() {
		return trade_income_amt_max_3m;
	}
	public void setTrade_income_amt_max_3m(BigDecimal trade_income_amt_max_3m) {
		this.trade_income_amt_max_3m = trade_income_amt_max_3m;
	}
	public BigDecimal getTrade_income_amt_mean_3m() {
		return trade_income_amt_mean_3m;
	}
	public void setTrade_income_amt_mean_3m(BigDecimal trade_income_amt_mean_3m) {
		this.trade_income_amt_mean_3m = trade_income_amt_mean_3m;
	}
	public BigDecimal getTrade_income_amt_max_1m() {
		return trade_income_amt_max_1m;
	}
	public void setTrade_income_amt_max_1m(BigDecimal trade_income_amt_max_1m) {
		this.trade_income_amt_max_1m = trade_income_amt_max_1m;
	}
	public BigDecimal getTrade_income_amt_mean_1m() {
		return trade_income_amt_mean_1m;
	}
	public void setTrade_income_amt_mean_1m(BigDecimal trade_income_amt_mean_1m) {
		this.trade_income_amt_mean_1m = trade_income_amt_mean_1m;
	}
	public BigDecimal getTrade_pay_amt_max_6m() {
		return trade_pay_amt_max_6m;
	}
	public void setTrade_pay_amt_max_6m(BigDecimal trade_pay_amt_max_6m) {
		this.trade_pay_amt_max_6m = trade_pay_amt_max_6m;
	}
	public BigDecimal getTrade_pay_amt_mean_6m() {
		return trade_pay_amt_mean_6m;
	}
	public void setTrade_pay_amt_mean_6m(BigDecimal trade_pay_amt_mean_6m) {
		this.trade_pay_amt_mean_6m = trade_pay_amt_mean_6m;
	}
	public BigDecimal getTrade_pay_amt_max_3m() {
		return trade_pay_amt_max_3m;
	}
	public void setTrade_pay_amt_max_3m(BigDecimal trade_pay_amt_max_3m) {
		this.trade_pay_amt_max_3m = trade_pay_amt_max_3m;
	}
	public BigDecimal getTrade_pay_amt_mean_3m() {
		return trade_pay_amt_mean_3m;
	}
	public void setTrade_pay_amt_mean_3m(BigDecimal trade_pay_amt_mean_3m) {
		this.trade_pay_amt_mean_3m = trade_pay_amt_mean_3m;
	}
	public BigDecimal getTrade_pay_amt_max_1m() {
		return trade_pay_amt_max_1m;
	}
	public void setTrade_pay_amt_max_1m(BigDecimal trade_pay_amt_max_1m) {
		this.trade_pay_amt_max_1m = trade_pay_amt_max_1m;
	}
	public BigDecimal getTrade_pay_amt_mean_1m() {
		return trade_pay_amt_mean_1m;
	}
	public void setTrade_pay_amt_mean_1m(BigDecimal trade_pay_amt_mean_1m) {
		this.trade_pay_amt_mean_1m = trade_pay_amt_mean_1m;
	}
	public BigDecimal getTrade_pay_amt_day_max_6m() {
		return trade_pay_amt_day_max_6m;
	}
	public void setTrade_pay_amt_day_max_6m(BigDecimal trade_pay_amt_day_max_6m) {
		this.trade_pay_amt_day_max_6m = trade_pay_amt_day_max_6m;
	}
	public BigDecimal getTrade_pay_amt_day_max_3m() {
		return trade_pay_amt_day_max_3m;
	}
	public void setTrade_pay_amt_day_max_3m(BigDecimal trade_pay_amt_day_max_3m) {
		this.trade_pay_amt_day_max_3m = trade_pay_amt_day_max_3m;
	}
	public BigDecimal getTrade_income_amt_day_max_6m() {
		return trade_income_amt_day_max_6m;
	}
	public void setTrade_income_amt_day_max_6m(BigDecimal trade_income_amt_day_max_6m) {
		this.trade_income_amt_day_max_6m = trade_income_amt_day_max_6m;
	}
	public BigDecimal getTrade_income_amt_day_max_3m() {
		return trade_income_amt_day_max_3m;
	}
	public void setTrade_income_amt_day_max_3m(BigDecimal trade_income_amt_day_max_3m) {
		this.trade_income_amt_day_max_3m = trade_income_amt_day_max_3m;
	}
	public Integer getTrade_income_cnt_sum_6m() {
		return trade_income_cnt_sum_6m;
	}
	public void setTrade_income_cnt_sum_6m(Integer trade_income_cnt_sum_6m) {
		this.trade_income_cnt_sum_6m = trade_income_cnt_sum_6m;
	}
	public BigDecimal getTrade_income_amt_sum_6m() {
		return trade_income_amt_sum_6m;
	}
	public void setTrade_income_amt_sum_6m(BigDecimal trade_income_amt_sum_6m) {
		this.trade_income_amt_sum_6m = trade_income_amt_sum_6m;
	}
	public Integer getTrade_income_cnt_sum_3m() {
		return trade_income_cnt_sum_3m;
	}
	public void setTrade_income_cnt_sum_3m(Integer trade_income_cnt_sum_3m) {
		this.trade_income_cnt_sum_3m = trade_income_cnt_sum_3m;
	}
	public BigDecimal getTrade_income_amt_sum_3m() {
		return trade_income_amt_sum_3m;
	}
	public void setTrade_income_amt_sum_3m(BigDecimal trade_income_amt_sum_3m) {
		this.trade_income_amt_sum_3m = trade_income_amt_sum_3m;
	}
	public Integer getTrade_income_cnt_sum_1m() {
		return trade_income_cnt_sum_1m;
	}
	public void setTrade_income_cnt_sum_1m(Integer trade_income_cnt_sum_1m) {
		this.trade_income_cnt_sum_1m = trade_income_cnt_sum_1m;
	}
	public BigDecimal getTrade_income_amt_sum_1m() {
		return trade_income_amt_sum_1m;
	}
	public void setTrade_income_amt_sum_1m(BigDecimal trade_income_amt_sum_1m) {
		this.trade_income_amt_sum_1m = trade_income_amt_sum_1m;
	}
	public Integer getTrade_pay_cnt_sum_6m() {
		return trade_pay_cnt_sum_6m;
	}
	public void setTrade_pay_cnt_sum_6m(Integer trade_pay_cnt_sum_6m) {
		this.trade_pay_cnt_sum_6m = trade_pay_cnt_sum_6m;
	}
	public BigDecimal getTrade_pay_amt_sum_6m() {
		return trade_pay_amt_sum_6m;
	}
	public void setTrade_pay_amt_sum_6m(BigDecimal trade_pay_amt_sum_6m) {
		this.trade_pay_amt_sum_6m = trade_pay_amt_sum_6m;
	}
	public Integer getTrade_pay_cnt_sum_3m() {
		return trade_pay_cnt_sum_3m;
	}
	public void setTrade_pay_cnt_sum_3m(Integer trade_pay_cnt_sum_3m) {
		this.trade_pay_cnt_sum_3m = trade_pay_cnt_sum_3m;
	}
	public BigDecimal getTrade_pay_amt_sum_3m() {
		return trade_pay_amt_sum_3m;
	}
	public void setTrade_pay_amt_sum_3m(BigDecimal trade_pay_amt_sum_3m) {
		this.trade_pay_amt_sum_3m = trade_pay_amt_sum_3m;
	}
	public Integer getTrade_pay_cnt_sum_1m() {
		return trade_pay_cnt_sum_1m;
	}
	public void setTrade_pay_cnt_sum_1m(Integer trade_pay_cnt_sum_1m) {
		this.trade_pay_cnt_sum_1m = trade_pay_cnt_sum_1m;
	}
	public BigDecimal getTrade_pay_amt_sum_1m() {
		return trade_pay_amt_sum_1m;
	}
	public void setTrade_pay_amt_sum_1m(BigDecimal trade_pay_amt_sum_1m) {
		this.trade_pay_amt_sum_1m = trade_pay_amt_sum_1m;
	}
	public BigDecimal getTrade_income_amt_month_mean_6m() {
		return trade_income_amt_month_mean_6m;
	}
	public void setTrade_income_amt_month_mean_6m(BigDecimal trade_income_amt_month_mean_6m) {
		this.trade_income_amt_month_mean_6m = trade_income_amt_month_mean_6m;
	}
	public BigDecimal getTrade_income_amt_month_mean_3m() {
		return trade_income_amt_month_mean_3m;
	}
	public void setTrade_income_amt_month_mean_3m(BigDecimal trade_income_amt_month_mean_3m) {
		this.trade_income_amt_month_mean_3m = trade_income_amt_month_mean_3m;
	}
	public BigDecimal getTrade_income_amt_month_max_6m() {
		return trade_income_amt_month_max_6m;
	}
	public void setTrade_income_amt_month_max_6m(BigDecimal trade_income_amt_month_max_6m) {
		this.trade_income_amt_month_max_6m = trade_income_amt_month_max_6m;
	}
	public BigDecimal getTrade_income_amt_month_max_3m() {
		return trade_income_amt_month_max_3m;
	}
	public void setTrade_income_amt_month_max_3m(BigDecimal trade_income_amt_month_max_3m) {
		this.trade_income_amt_month_max_3m = trade_income_amt_month_max_3m;
	}
	public BigDecimal getTrade_pay_amt_month_mean_6m() {
		return trade_pay_amt_month_mean_6m;
	}
	public void setTrade_pay_amt_month_mean_6m(BigDecimal trade_pay_amt_month_mean_6m) {
		this.trade_pay_amt_month_mean_6m = trade_pay_amt_month_mean_6m;
	}
	public BigDecimal getTrade_pay_amt_month_mean_3m() {
		return trade_pay_amt_month_mean_3m;
	}
	public void setTrade_pay_amt_month_mean_3m(BigDecimal trade_pay_amt_month_mean_3m) {
		this.trade_pay_amt_month_mean_3m = trade_pay_amt_month_mean_3m;
	}
	public BigDecimal getTrade_pay_amt_month_max_6m() {
		return trade_pay_amt_month_max_6m;
	}
	public void setTrade_pay_amt_month_max_6m(BigDecimal trade_pay_amt_month_max_6m) {
		this.trade_pay_amt_month_max_6m = trade_pay_amt_month_max_6m;
	}
	public BigDecimal getTrade_pay_amt_month_max_3m() {
		return trade_pay_amt_month_max_3m;
	}
	public void setTrade_pay_amt_month_max_3m(BigDecimal trade_pay_amt_month_max_3m) {
		this.trade_pay_amt_month_max_3m = trade_pay_amt_month_max_3m;
	}
	public BigDecimal getTrade_income_amt_month_stab_6m() {
		return trade_income_amt_month_stab_6m;
	}
	public void setTrade_income_amt_month_stab_6m(BigDecimal trade_income_amt_month_stab_6m) {
		this.trade_income_amt_month_stab_6m = trade_income_amt_month_stab_6m;
	}
	public BigDecimal getTrade_income_cnt_month_stab_6m() {
		return trade_income_cnt_month_stab_6m;
	}
	public void setTrade_income_cnt_month_stab_6m(BigDecimal trade_income_cnt_month_stab_6m) {
		this.trade_income_cnt_month_stab_6m = trade_income_cnt_month_stab_6m;
	}
	public BigDecimal getTrade_pay_amt_month_stab_6m() {
		return trade_pay_amt_month_stab_6m;
	}
	public void setTrade_pay_amt_month_stab_6m(BigDecimal trade_pay_amt_month_stab_6m) {
		this.trade_pay_amt_month_stab_6m = trade_pay_amt_month_stab_6m;
	}
	public BigDecimal getTrade_pay_cnt_month_stab_6m() {
		return trade_pay_cnt_month_stab_6m;
	}
	public void setTrade_pay_cnt_month_stab_6m(BigDecimal trade_pay_cnt_month_stab_6m) {
		this.trade_pay_cnt_month_stab_6m = trade_pay_cnt_month_stab_6m;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((trade_amt_month_rise_rate_max_6m == null) ? 0 : trade_amt_month_rise_rate_max_6m.hashCode());
		result = prime * result
				+ ((trade_amt_month_rise_rate_mean_6m == null) ? 0 : trade_amt_month_rise_rate_mean_6m.hashCode());
		result = prime * result
				+ ((trade_amt_month_rise_rate_min_6m == null) ? 0 : trade_amt_month_rise_rate_min_6m.hashCode());
		result = prime * result + ((trade_amt_month_skew_6m == null) ? 0 : trade_amt_month_skew_6m.hashCode());
		result = prime * result + ((trade_amt_month_stab_6m == null) ? 0 : trade_amt_month_stab_6m.hashCode());
		result = prime * result + ((trade_cnt_day_freq_3m == null) ? 0 : trade_cnt_day_freq_3m.hashCode());
		result = prime * result + ((trade_cnt_day_freq_6m == null) ? 0 : trade_cnt_day_freq_6m.hashCode());
		result = prime * result
				+ ((trade_cnt_day_freq_month_stab_6m == null) ? 0 : trade_cnt_day_freq_month_stab_6m.hashCode());
		result = prime * result
				+ ((trade_cnt_month_rise_rate_max_6m == null) ? 0 : trade_cnt_month_rise_rate_max_6m.hashCode());
		result = prime * result
				+ ((trade_cnt_month_rise_rate_mean_6m == null) ? 0 : trade_cnt_month_rise_rate_mean_6m.hashCode());
		result = prime * result
				+ ((trade_cnt_month_rise_rate_min_6m == null) ? 0 : trade_cnt_month_rise_rate_min_6m.hashCode());
		result = prime * result + ((trade_cnt_month_skew_6m == null) ? 0 : trade_cnt_month_skew_6m.hashCode());
		result = prime * result + ((trade_cnt_month_stab_6m == null) ? 0 : trade_cnt_month_stab_6m.hashCode());
		result = prime * result + ((trade_cnt_week_freq_3m == null) ? 0 : trade_cnt_week_freq_3m.hashCode());
		result = prime * result + ((trade_cnt_week_freq_6m == null) ? 0 : trade_cnt_week_freq_6m.hashCode());
		result = prime * result
				+ ((trade_cnt_week_freq_month_stab_6m == null) ? 0 : trade_cnt_week_freq_month_stab_6m.hashCode());
		result = prime * result + ((trade_income_amt_day_max_3m == null) ? 0 : trade_income_amt_day_max_3m.hashCode());
		result = prime * result + ((trade_income_amt_day_max_6m == null) ? 0 : trade_income_amt_day_max_6m.hashCode());
		result = prime * result + ((trade_income_amt_max_1m == null) ? 0 : trade_income_amt_max_1m.hashCode());
		result = prime * result + ((trade_income_amt_max_3m == null) ? 0 : trade_income_amt_max_3m.hashCode());
		result = prime * result + ((trade_income_amt_max_6m == null) ? 0 : trade_income_amt_max_6m.hashCode());
		result = prime * result + ((trade_income_amt_mean_1m == null) ? 0 : trade_income_amt_mean_1m.hashCode());
		result = prime * result + ((trade_income_amt_mean_3m == null) ? 0 : trade_income_amt_mean_3m.hashCode());
		result = prime * result + ((trade_income_amt_mean_6m == null) ? 0 : trade_income_amt_mean_6m.hashCode());
		result = prime * result
				+ ((trade_income_amt_month_max_3m == null) ? 0 : trade_income_amt_month_max_3m.hashCode());
		result = prime * result
				+ ((trade_income_amt_month_max_6m == null) ? 0 : trade_income_amt_month_max_6m.hashCode());
		result = prime * result
				+ ((trade_income_amt_month_mean_3m == null) ? 0 : trade_income_amt_month_mean_3m.hashCode());
		result = prime * result
				+ ((trade_income_amt_month_mean_6m == null) ? 0 : trade_income_amt_month_mean_6m.hashCode());
		result = prime * result
				+ ((trade_income_amt_month_stab_6m == null) ? 0 : trade_income_amt_month_stab_6m.hashCode());
		result = prime * result + ((trade_income_amt_sum_1m == null) ? 0 : trade_income_amt_sum_1m.hashCode());
		result = prime * result + ((trade_income_amt_sum_3m == null) ? 0 : trade_income_amt_sum_3m.hashCode());
		result = prime * result + ((trade_income_amt_sum_6m == null) ? 0 : trade_income_amt_sum_6m.hashCode());
		result = prime * result
				+ ((trade_income_cnt_month_stab_6m == null) ? 0 : trade_income_cnt_month_stab_6m.hashCode());
		result = prime * result + ((trade_income_cnt_sum_1m == null) ? 0 : trade_income_cnt_sum_1m.hashCode());
		result = prime * result + ((trade_income_cnt_sum_3m == null) ? 0 : trade_income_cnt_sum_3m.hashCode());
		result = prime * result + ((trade_income_cnt_sum_6m == null) ? 0 : trade_income_cnt_sum_6m.hashCode());
		result = prime * result + ((trade_pay_amt_day_max_3m == null) ? 0 : trade_pay_amt_day_max_3m.hashCode());
		result = prime * result + ((trade_pay_amt_day_max_6m == null) ? 0 : trade_pay_amt_day_max_6m.hashCode());
		result = prime * result + ((trade_pay_amt_max_1m == null) ? 0 : trade_pay_amt_max_1m.hashCode());
		result = prime * result + ((trade_pay_amt_max_3m == null) ? 0 : trade_pay_amt_max_3m.hashCode());
		result = prime * result + ((trade_pay_amt_max_6m == null) ? 0 : trade_pay_amt_max_6m.hashCode());
		result = prime * result + ((trade_pay_amt_mean_1m == null) ? 0 : trade_pay_amt_mean_1m.hashCode());
		result = prime * result + ((trade_pay_amt_mean_3m == null) ? 0 : trade_pay_amt_mean_3m.hashCode());
		result = prime * result + ((trade_pay_amt_mean_6m == null) ? 0 : trade_pay_amt_mean_6m.hashCode());
		result = prime * result + ((trade_pay_amt_month_max_3m == null) ? 0 : trade_pay_amt_month_max_3m.hashCode());
		result = prime * result + ((trade_pay_amt_month_max_6m == null) ? 0 : trade_pay_amt_month_max_6m.hashCode());
		result = prime * result + ((trade_pay_amt_month_mean_3m == null) ? 0 : trade_pay_amt_month_mean_3m.hashCode());
		result = prime * result + ((trade_pay_amt_month_mean_6m == null) ? 0 : trade_pay_amt_month_mean_6m.hashCode());
		result = prime * result + ((trade_pay_amt_month_stab_6m == null) ? 0 : trade_pay_amt_month_stab_6m.hashCode());
		result = prime * result + ((trade_pay_amt_sum_1m == null) ? 0 : trade_pay_amt_sum_1m.hashCode());
		result = prime * result + ((trade_pay_amt_sum_3m == null) ? 0 : trade_pay_amt_sum_3m.hashCode());
		result = prime * result + ((trade_pay_amt_sum_6m == null) ? 0 : trade_pay_amt_sum_6m.hashCode());
		result = prime * result + ((trade_pay_cnt_month_stab_6m == null) ? 0 : trade_pay_cnt_month_stab_6m.hashCode());
		result = prime * result + ((trade_pay_cnt_sum_1m == null) ? 0 : trade_pay_cnt_sum_1m.hashCode());
		result = prime * result + ((trade_pay_cnt_sum_3m == null) ? 0 : trade_pay_cnt_sum_3m.hashCode());
		result = prime * result + ((trade_pay_cnt_sum_6m == null) ? 0 : trade_pay_cnt_sum_6m.hashCode());
		result = prime * result + ((trade_recent_time_span == null) ? 0 : trade_recent_time_span.hashCode());
		result = prime * result + ((trade_scene_num_1m == null) ? 0 : trade_scene_num_1m.hashCode());
		result = prime * result + ((trade_scene_num_3m == null) ? 0 : trade_scene_num_3m.hashCode());
		result = prime * result + ((trade_scene_num_6m == null) ? 0 : trade_scene_num_6m.hashCode());
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
		ecommerce_trade_rpt other = (ecommerce_trade_rpt) obj;
		if (trade_amt_month_rise_rate_max_6m == null) {
			if (other.trade_amt_month_rise_rate_max_6m != null)
				return false;
		} else if (!trade_amt_month_rise_rate_max_6m.equals(other.trade_amt_month_rise_rate_max_6m))
			return false;
		if (trade_amt_month_rise_rate_mean_6m == null) {
			if (other.trade_amt_month_rise_rate_mean_6m != null)
				return false;
		} else if (!trade_amt_month_rise_rate_mean_6m.equals(other.trade_amt_month_rise_rate_mean_6m))
			return false;
		if (trade_amt_month_rise_rate_min_6m == null) {
			if (other.trade_amt_month_rise_rate_min_6m != null)
				return false;
		} else if (!trade_amt_month_rise_rate_min_6m.equals(other.trade_amt_month_rise_rate_min_6m))
			return false;
		if (trade_amt_month_skew_6m == null) {
			if (other.trade_amt_month_skew_6m != null)
				return false;
		} else if (!trade_amt_month_skew_6m.equals(other.trade_amt_month_skew_6m))
			return false;
		if (trade_amt_month_stab_6m == null) {
			if (other.trade_amt_month_stab_6m != null)
				return false;
		} else if (!trade_amt_month_stab_6m.equals(other.trade_amt_month_stab_6m))
			return false;
		if (trade_cnt_day_freq_3m == null) {
			if (other.trade_cnt_day_freq_3m != null)
				return false;
		} else if (!trade_cnt_day_freq_3m.equals(other.trade_cnt_day_freq_3m))
			return false;
		if (trade_cnt_day_freq_6m == null) {
			if (other.trade_cnt_day_freq_6m != null)
				return false;
		} else if (!trade_cnt_day_freq_6m.equals(other.trade_cnt_day_freq_6m))
			return false;
		if (trade_cnt_day_freq_month_stab_6m == null) {
			if (other.trade_cnt_day_freq_month_stab_6m != null)
				return false;
		} else if (!trade_cnt_day_freq_month_stab_6m.equals(other.trade_cnt_day_freq_month_stab_6m))
			return false;
		if (trade_cnt_month_rise_rate_max_6m == null) {
			if (other.trade_cnt_month_rise_rate_max_6m != null)
				return false;
		} else if (!trade_cnt_month_rise_rate_max_6m.equals(other.trade_cnt_month_rise_rate_max_6m))
			return false;
		if (trade_cnt_month_rise_rate_mean_6m == null) {
			if (other.trade_cnt_month_rise_rate_mean_6m != null)
				return false;
		} else if (!trade_cnt_month_rise_rate_mean_6m.equals(other.trade_cnt_month_rise_rate_mean_6m))
			return false;
		if (trade_cnt_month_rise_rate_min_6m == null) {
			if (other.trade_cnt_month_rise_rate_min_6m != null)
				return false;
		} else if (!trade_cnt_month_rise_rate_min_6m.equals(other.trade_cnt_month_rise_rate_min_6m))
			return false;
		if (trade_cnt_month_skew_6m == null) {
			if (other.trade_cnt_month_skew_6m != null)
				return false;
		} else if (!trade_cnt_month_skew_6m.equals(other.trade_cnt_month_skew_6m))
			return false;
		if (trade_cnt_month_stab_6m == null) {
			if (other.trade_cnt_month_stab_6m != null)
				return false;
		} else if (!trade_cnt_month_stab_6m.equals(other.trade_cnt_month_stab_6m))
			return false;
		if (trade_cnt_week_freq_3m == null) {
			if (other.trade_cnt_week_freq_3m != null)
				return false;
		} else if (!trade_cnt_week_freq_3m.equals(other.trade_cnt_week_freq_3m))
			return false;
		if (trade_cnt_week_freq_6m == null) {
			if (other.trade_cnt_week_freq_6m != null)
				return false;
		} else if (!trade_cnt_week_freq_6m.equals(other.trade_cnt_week_freq_6m))
			return false;
		if (trade_cnt_week_freq_month_stab_6m == null) {
			if (other.trade_cnt_week_freq_month_stab_6m != null)
				return false;
		} else if (!trade_cnt_week_freq_month_stab_6m.equals(other.trade_cnt_week_freq_month_stab_6m))
			return false;
		if (trade_income_amt_day_max_3m == null) {
			if (other.trade_income_amt_day_max_3m != null)
				return false;
		} else if (!trade_income_amt_day_max_3m.equals(other.trade_income_amt_day_max_3m))
			return false;
		if (trade_income_amt_day_max_6m == null) {
			if (other.trade_income_amt_day_max_6m != null)
				return false;
		} else if (!trade_income_amt_day_max_6m.equals(other.trade_income_amt_day_max_6m))
			return false;
		if (trade_income_amt_max_1m == null) {
			if (other.trade_income_amt_max_1m != null)
				return false;
		} else if (!trade_income_amt_max_1m.equals(other.trade_income_amt_max_1m))
			return false;
		if (trade_income_amt_max_3m == null) {
			if (other.trade_income_amt_max_3m != null)
				return false;
		} else if (!trade_income_amt_max_3m.equals(other.trade_income_amt_max_3m))
			return false;
		if (trade_income_amt_max_6m == null) {
			if (other.trade_income_amt_max_6m != null)
				return false;
		} else if (!trade_income_amt_max_6m.equals(other.trade_income_amt_max_6m))
			return false;
		if (trade_income_amt_mean_1m == null) {
			if (other.trade_income_amt_mean_1m != null)
				return false;
		} else if (!trade_income_amt_mean_1m.equals(other.trade_income_amt_mean_1m))
			return false;
		if (trade_income_amt_mean_3m == null) {
			if (other.trade_income_amt_mean_3m != null)
				return false;
		} else if (!trade_income_amt_mean_3m.equals(other.trade_income_amt_mean_3m))
			return false;
		if (trade_income_amt_mean_6m == null) {
			if (other.trade_income_amt_mean_6m != null)
				return false;
		} else if (!trade_income_amt_mean_6m.equals(other.trade_income_amt_mean_6m))
			return false;
		if (trade_income_amt_month_max_3m == null) {
			if (other.trade_income_amt_month_max_3m != null)
				return false;
		} else if (!trade_income_amt_month_max_3m.equals(other.trade_income_amt_month_max_3m))
			return false;
		if (trade_income_amt_month_max_6m == null) {
			if (other.trade_income_amt_month_max_6m != null)
				return false;
		} else if (!trade_income_amt_month_max_6m.equals(other.trade_income_amt_month_max_6m))
			return false;
		if (trade_income_amt_month_mean_3m == null) {
			if (other.trade_income_amt_month_mean_3m != null)
				return false;
		} else if (!trade_income_amt_month_mean_3m.equals(other.trade_income_amt_month_mean_3m))
			return false;
		if (trade_income_amt_month_mean_6m == null) {
			if (other.trade_income_amt_month_mean_6m != null)
				return false;
		} else if (!trade_income_amt_month_mean_6m.equals(other.trade_income_amt_month_mean_6m))
			return false;
		if (trade_income_amt_month_stab_6m == null) {
			if (other.trade_income_amt_month_stab_6m != null)
				return false;
		} else if (!trade_income_amt_month_stab_6m.equals(other.trade_income_amt_month_stab_6m))
			return false;
		if (trade_income_amt_sum_1m == null) {
			if (other.trade_income_amt_sum_1m != null)
				return false;
		} else if (!trade_income_amt_sum_1m.equals(other.trade_income_amt_sum_1m))
			return false;
		if (trade_income_amt_sum_3m == null) {
			if (other.trade_income_amt_sum_3m != null)
				return false;
		} else if (!trade_income_amt_sum_3m.equals(other.trade_income_amt_sum_3m))
			return false;
		if (trade_income_amt_sum_6m == null) {
			if (other.trade_income_amt_sum_6m != null)
				return false;
		} else if (!trade_income_amt_sum_6m.equals(other.trade_income_amt_sum_6m))
			return false;
		if (trade_income_cnt_month_stab_6m == null) {
			if (other.trade_income_cnt_month_stab_6m != null)
				return false;
		} else if (!trade_income_cnt_month_stab_6m.equals(other.trade_income_cnt_month_stab_6m))
			return false;
		if (trade_income_cnt_sum_1m == null) {
			if (other.trade_income_cnt_sum_1m != null)
				return false;
		} else if (!trade_income_cnt_sum_1m.equals(other.trade_income_cnt_sum_1m))
			return false;
		if (trade_income_cnt_sum_3m == null) {
			if (other.trade_income_cnt_sum_3m != null)
				return false;
		} else if (!trade_income_cnt_sum_3m.equals(other.trade_income_cnt_sum_3m))
			return false;
		if (trade_income_cnt_sum_6m == null) {
			if (other.trade_income_cnt_sum_6m != null)
				return false;
		} else if (!trade_income_cnt_sum_6m.equals(other.trade_income_cnt_sum_6m))
			return false;
		if (trade_pay_amt_day_max_3m == null) {
			if (other.trade_pay_amt_day_max_3m != null)
				return false;
		} else if (!trade_pay_amt_day_max_3m.equals(other.trade_pay_amt_day_max_3m))
			return false;
		if (trade_pay_amt_day_max_6m == null) {
			if (other.trade_pay_amt_day_max_6m != null)
				return false;
		} else if (!trade_pay_amt_day_max_6m.equals(other.trade_pay_amt_day_max_6m))
			return false;
		if (trade_pay_amt_max_1m == null) {
			if (other.trade_pay_amt_max_1m != null)
				return false;
		} else if (!trade_pay_amt_max_1m.equals(other.trade_pay_amt_max_1m))
			return false;
		if (trade_pay_amt_max_3m == null) {
			if (other.trade_pay_amt_max_3m != null)
				return false;
		} else if (!trade_pay_amt_max_3m.equals(other.trade_pay_amt_max_3m))
			return false;
		if (trade_pay_amt_max_6m == null) {
			if (other.trade_pay_amt_max_6m != null)
				return false;
		} else if (!trade_pay_amt_max_6m.equals(other.trade_pay_amt_max_6m))
			return false;
		if (trade_pay_amt_mean_1m == null) {
			if (other.trade_pay_amt_mean_1m != null)
				return false;
		} else if (!trade_pay_amt_mean_1m.equals(other.trade_pay_amt_mean_1m))
			return false;
		if (trade_pay_amt_mean_3m == null) {
			if (other.trade_pay_amt_mean_3m != null)
				return false;
		} else if (!trade_pay_amt_mean_3m.equals(other.trade_pay_amt_mean_3m))
			return false;
		if (trade_pay_amt_mean_6m == null) {
			if (other.trade_pay_amt_mean_6m != null)
				return false;
		} else if (!trade_pay_amt_mean_6m.equals(other.trade_pay_amt_mean_6m))
			return false;
		if (trade_pay_amt_month_max_3m == null) {
			if (other.trade_pay_amt_month_max_3m != null)
				return false;
		} else if (!trade_pay_amt_month_max_3m.equals(other.trade_pay_amt_month_max_3m))
			return false;
		if (trade_pay_amt_month_max_6m == null) {
			if (other.trade_pay_amt_month_max_6m != null)
				return false;
		} else if (!trade_pay_amt_month_max_6m.equals(other.trade_pay_amt_month_max_6m))
			return false;
		if (trade_pay_amt_month_mean_3m == null) {
			if (other.trade_pay_amt_month_mean_3m != null)
				return false;
		} else if (!trade_pay_amt_month_mean_3m.equals(other.trade_pay_amt_month_mean_3m))
			return false;
		if (trade_pay_amt_month_mean_6m == null) {
			if (other.trade_pay_amt_month_mean_6m != null)
				return false;
		} else if (!trade_pay_amt_month_mean_6m.equals(other.trade_pay_amt_month_mean_6m))
			return false;
		if (trade_pay_amt_month_stab_6m == null) {
			if (other.trade_pay_amt_month_stab_6m != null)
				return false;
		} else if (!trade_pay_amt_month_stab_6m.equals(other.trade_pay_amt_month_stab_6m))
			return false;
		if (trade_pay_amt_sum_1m == null) {
			if (other.trade_pay_amt_sum_1m != null)
				return false;
		} else if (!trade_pay_amt_sum_1m.equals(other.trade_pay_amt_sum_1m))
			return false;
		if (trade_pay_amt_sum_3m == null) {
			if (other.trade_pay_amt_sum_3m != null)
				return false;
		} else if (!trade_pay_amt_sum_3m.equals(other.trade_pay_amt_sum_3m))
			return false;
		if (trade_pay_amt_sum_6m == null) {
			if (other.trade_pay_amt_sum_6m != null)
				return false;
		} else if (!trade_pay_amt_sum_6m.equals(other.trade_pay_amt_sum_6m))
			return false;
		if (trade_pay_cnt_month_stab_6m == null) {
			if (other.trade_pay_cnt_month_stab_6m != null)
				return false;
		} else if (!trade_pay_cnt_month_stab_6m.equals(other.trade_pay_cnt_month_stab_6m))
			return false;
		if (trade_pay_cnt_sum_1m == null) {
			if (other.trade_pay_cnt_sum_1m != null)
				return false;
		} else if (!trade_pay_cnt_sum_1m.equals(other.trade_pay_cnt_sum_1m))
			return false;
		if (trade_pay_cnt_sum_3m == null) {
			if (other.trade_pay_cnt_sum_3m != null)
				return false;
		} else if (!trade_pay_cnt_sum_3m.equals(other.trade_pay_cnt_sum_3m))
			return false;
		if (trade_pay_cnt_sum_6m == null) {
			if (other.trade_pay_cnt_sum_6m != null)
				return false;
		} else if (!trade_pay_cnt_sum_6m.equals(other.trade_pay_cnt_sum_6m))
			return false;
		if (trade_recent_time_span == null) {
			if (other.trade_recent_time_span != null)
				return false;
		} else if (!trade_recent_time_span.equals(other.trade_recent_time_span))
			return false;
		if (trade_scene_num_1m == null) {
			if (other.trade_scene_num_1m != null)
				return false;
		} else if (!trade_scene_num_1m.equals(other.trade_scene_num_1m))
			return false;
		if (trade_scene_num_3m == null) {
			if (other.trade_scene_num_3m != null)
				return false;
		} else if (!trade_scene_num_3m.equals(other.trade_scene_num_3m))
			return false;
		if (trade_scene_num_6m == null) {
			if (other.trade_scene_num_6m != null)
				return false;
		} else if (!trade_scene_num_6m.equals(other.trade_scene_num_6m))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "ecommerce_trade_rpt [trade_amt_month_stab_6m=" + trade_amt_month_stab_6m + ", trade_cnt_month_stab_6m="
				+ trade_cnt_month_stab_6m + ", trade_amt_month_skew_6m=" + trade_amt_month_skew_6m
				+ ", trade_cnt_month_skew_6m=" + trade_cnt_month_skew_6m + ", trade_cnt_week_freq_6m="
				+ trade_cnt_week_freq_6m + ", trade_cnt_week_freq_3m=" + trade_cnt_week_freq_3m
				+ ", trade_cnt_day_freq_6m=" + trade_cnt_day_freq_6m + ", trade_cnt_day_freq_3m="
				+ trade_cnt_day_freq_3m + ", trade_cnt_week_freq_month_stab_6m=" + trade_cnt_week_freq_month_stab_6m
				+ ", trade_cnt_day_freq_month_stab_6m=" + trade_cnt_day_freq_month_stab_6m
				+ ", trade_amt_month_rise_rate_max_6m=" + trade_amt_month_rise_rate_max_6m
				+ ", trade_amt_month_rise_rate_min_6m=" + trade_amt_month_rise_rate_min_6m
				+ ", trade_amt_month_rise_rate_mean_6m=" + trade_amt_month_rise_rate_mean_6m
				+ ", trade_cnt_month_rise_rate_max_6m=" + trade_cnt_month_rise_rate_max_6m
				+ ", trade_cnt_month_rise_rate_min_6m=" + trade_cnt_month_rise_rate_min_6m
				+ ", trade_cnt_month_rise_rate_mean_6m=" + trade_cnt_month_rise_rate_mean_6m
				+ ", trade_recent_time_span=" + trade_recent_time_span + ", trade_scene_num_6m=" + trade_scene_num_6m
				+ ", trade_scene_num_3m=" + trade_scene_num_3m + ", trade_scene_num_1m=" + trade_scene_num_1m
				+ ", trade_income_amt_max_6m=" + trade_income_amt_max_6m + ", trade_income_amt_mean_6m="
				+ trade_income_amt_mean_6m + ", trade_income_amt_max_3m=" + trade_income_amt_max_3m
				+ ", trade_income_amt_mean_3m=" + trade_income_amt_mean_3m + ", trade_income_amt_max_1m="
				+ trade_income_amt_max_1m + ", trade_income_amt_mean_1m=" + trade_income_amt_mean_1m
				+ ", trade_pay_amt_max_6m=" + trade_pay_amt_max_6m + ", trade_pay_amt_mean_6m=" + trade_pay_amt_mean_6m
				+ ", trade_pay_amt_max_3m=" + trade_pay_amt_max_3m + ", trade_pay_amt_mean_3m=" + trade_pay_amt_mean_3m
				+ ", trade_pay_amt_max_1m=" + trade_pay_amt_max_1m + ", trade_pay_amt_mean_1m=" + trade_pay_amt_mean_1m
				+ ", trade_pay_amt_day_max_6m=" + trade_pay_amt_day_max_6m + ", trade_pay_amt_day_max_3m="
				+ trade_pay_amt_day_max_3m + ", trade_income_amt_day_max_6m=" + trade_income_amt_day_max_6m
				+ ", trade_income_amt_day_max_3m=" + trade_income_amt_day_max_3m + ", trade_income_cnt_sum_6m="
				+ trade_income_cnt_sum_6m + ", trade_income_amt_sum_6m=" + trade_income_amt_sum_6m
				+ ", trade_income_cnt_sum_3m=" + trade_income_cnt_sum_3m + ", trade_income_amt_sum_3m="
				+ trade_income_amt_sum_3m + ", trade_income_cnt_sum_1m=" + trade_income_cnt_sum_1m
				+ ", trade_income_amt_sum_1m=" + trade_income_amt_sum_1m + ", trade_pay_cnt_sum_6m="
				+ trade_pay_cnt_sum_6m + ", trade_pay_amt_sum_6m=" + trade_pay_amt_sum_6m + ", trade_pay_cnt_sum_3m="
				+ trade_pay_cnt_sum_3m + ", trade_pay_amt_sum_3m=" + trade_pay_amt_sum_3m + ", trade_pay_cnt_sum_1m="
				+ trade_pay_cnt_sum_1m + ", trade_pay_amt_sum_1m=" + trade_pay_amt_sum_1m
				+ ", trade_income_amt_month_mean_6m=" + trade_income_amt_month_mean_6m
				+ ", trade_income_amt_month_mean_3m=" + trade_income_amt_month_mean_3m
				+ ", trade_income_amt_month_max_6m=" + trade_income_amt_month_max_6m
				+ ", trade_income_amt_month_max_3m=" + trade_income_amt_month_max_3m + ", trade_pay_amt_month_mean_6m="
				+ trade_pay_amt_month_mean_6m + ", trade_pay_amt_month_mean_3m=" + trade_pay_amt_month_mean_3m
				+ ", trade_pay_amt_month_max_6m=" + trade_pay_amt_month_max_6m + ", trade_pay_amt_month_max_3m="
				+ trade_pay_amt_month_max_3m + ", trade_income_amt_month_stab_6m=" + trade_income_amt_month_stab_6m
				+ ", trade_income_cnt_month_stab_6m=" + trade_income_cnt_month_stab_6m
				+ ", trade_pay_amt_month_stab_6m=" + trade_pay_amt_month_stab_6m + ", trade_pay_cnt_month_stab_6m="
				+ trade_pay_cnt_month_stab_6m + "]";
	}
	
	
	
}
