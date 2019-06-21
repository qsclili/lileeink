package pojo;

import java.math.BigDecimal;

/**
 * ecommerce_info.ecommerce_risk_rpt（风险属性）
 * @author Administrator
 *
 */
public class   ecommerce_risk_rpt {
	
	Integer phone_receive_order_num_1y;//	Integer	否	近1年本人手机号对应的收货记录数
	Integer phone_receive_order_num_6m;//	Integer	否	近6个月本人手机号对应的收货记录数
	Integer phone_receive_order_num_3m;//	Integer	否	近3个月本人手机号对应的收货记录数
	Integer phone_receive_addr_num_1y;//	Integer	否	近1年本人手机号对应的收货地址数
	Integer phone_receive_addr_num_6m;//	Integer	否	近6个月本人手机号对应的收货地址数
	Integer phone_receive_addr_num_3m;//	Integer	否	近3个月本人手机号对应的收货地址数
	Integer phone_stab_days_1y;//	Integer	否	近1年手机号的稳定天数
	Integer phone_use_num_1y;//	Integer	否	近1年用户使用手机号个数
	Integer oneself_receive_addr_num;//	Integer	否	本人对应的收货地址个数
	Integer oneself_receive_phone_num;//	Integer	否	本人对应的收货手机号个数
	Integer receive_addr_num;//	Integer	否	收货地址的非重复个数
	Integer receive_user_num;//	Integer	否	收货人的非重复个数
	Integer receive_phone_num;//	Integer	否	收货手机号的非重复个数
	Integer default_addr_city_level;//	Integer	否	默认收货地址对应的城市等级
	Integer receive_addr_first_tier_city_num_1y;//	Integer	否	近1年收货地址对应的一线城市个数
	Integer receive_addr_second_tier_city_num_1y;//	Integer	否	近1年收货地址对应的二线城市个数
	Integer receive_addr_third_tier_city_num_1y;//	Integer	否	近1年收货地址对应的三线城市个数
	Integer receive_addr_fourth_tier_city_num_1y;//	Integer	否	近1年收货地址对应的四线城市个数
	Integer receive_addr_first_tier_city_num_6m;//	Integer	否	近6个月收货地址对应的一线城市个数
	Integer receive_addr_second_tier_city_num_6m;//	Integer	否	近6个月收货地址对应的二线城市个数
	Integer receive_addr_third_tier_city_num_6m;//	Integer	否	近6个月收货地址对应的三线城市个数
	Integer receive_addr_fourth_tier_city_num_6m;//	Integer	否	近6个月收货地址对应的四线城市个数
	Integer receive_addr_first_tier_city_num_3m;//	Integer	否	近3个月收货地址对应的一线城市个数
	Integer receive_addr_second_tier_city_num_3m;//	Integer	否	近3个月收货地址对应的二线城市个数
	Integer receive_addr_third_tier_city_num_3m;//	Integer	否	近3个月收货地址对应的三线城市个数
	Integer receive_addr_fourth_tier_city_num_3m;//	Integer	否	近3个月收货地址对应的四线城市个数
	Integer diff_receive_addr_num_1y;//	Integer	否	近1年不同收货地址个数
	Integer diff_receive_addr_num_6m;//	Integer	否	近6个月不同收货地址个数
	Integer diff_receive_addr_num_3m;//	Integer	否	近3个月不同收货地址个数
	Integer diff_receive_user_num_1y;//	Integer	否	近1年不同收货人个数
	Integer diff_receive_user_num_6m;//	Integer	否	近6个月不同收货人个数
	Integer diff_receive_user_num_3m;//	Integer	否	近3个月不同收货人个数
	Integer diff_receive_phone_num_1y;//	Integer	否	近1年不同收货手机号个数
	Integer diff_receive_phone_num_6m;//	Integer	否	近6个月不同收货手机号个数
	Integer diff_receive_phone_num_3m;//	Integer	否	近3个月不同收货手机号个数
	Integer onself_order_num_1y;//	Integer	否	近1年收货人是本人的订单数
	BigDecimal onself_order_num_prop_1y;//	BigDecimal	否	近1年收货人是本人的订单数占比
	Integer onself_order_num_6m;//	Integer	否	近6个月收货人是本人的订单数
	BigDecimal onself_order_num_prop_6m;//	BigDecimal	否	近6个月收货人是本人的订单数占比
	Integer onself_order_num_3m	;//Integer	否	近3个月收货人是本人的订单数
	BigDecimal onself_order_num_prop_3m;//	BigDecimal	否	近3个月收货人是本人的订单数占比
	Integer onself_receive_addr_num_1y;//	Integer	否	近1年收货人是本人的收货地址个数
	Integer onself_receive_addr_num_6m;//	Integer	否	近6个月收货人是本人的收货地址个数
	Integer onself_receive_addr_num_3m;//	Integer	否	近3个月收货人是本人的收货地址个数
	Integer bank_card_num;//	Integer	否	银行卡绑定数量
	Integer bank_num;//	Integer	否	绑定的银行数量
	Integer debit_card_num;//	Integer	否	绑定借记卡的数量
	BigDecimal debit_card_prop;//BigDecimal	否	绑定借记卡的数量占比
	Integer credit_card_num;//	Integer	否	绑定信用卡的数量
	BigDecimal credit_card_prop;//	BigDecimal	否	绑定信用卡的数量占比
	BigDecimal tb_dawn_order_amt_max_1y;//	BigDecimal	否	近1年凌晨时段最大的订单金额
	BigDecimal tb_daytime_order_amt_max_1y;//	BigDecimal	否	近1年白天时段最大的订单金额
	BigDecimal tb_night_order_amt_max_1y;//	BigDecimal	否	近1年晚上时段最大的订单金额
	BigDecimal tb_dawn_order_amt_prop_1y;//	BigDecimal	否	近1年凌晨时段下单金额占总金额比
	BigDecimal tb_daytime_order_amt_prop_1y;//	BigDecimal	否	近1年白天时段下单金额占总金额比
	BigDecimal tb_night_order_amt_prop_1y;//	BigDecimal	否	近1年晚上时段下单金额占总金额比
	BigDecimal tb_dawn_order_cnt_prop_1y;//	BigDecimal	否	近1年凌晨时段下单次数占总次数比
	BigDecimal tb_daytime_order_cnt_prop_1y;//	否	近1年白天时段下单次数占总次数比
	BigDecimal tb_night_order_cnt_prop_1y;//	BigDecimal	否	近1年晚上时段下单次数占总次数比
	BigDecimal tb_dawn_order_amt_month_stab_1y;//	BigDecimal	否	近1年每个月凌晨时段下单金额的稳定性
	BigDecimal tb_daytime_order_amt_month_stab_1y;//	BigDecimal	否	近1年每个月白天时段下单金额的稳定性
	BigDecimal tb_night_order_amt_month_stab_1y;//	BigDecimal	否	近1年每个月晚上时段下单金额的稳定性
	BigDecimal tb_dawn_order_cnt_month_stab_1y;//	BigDecimal	否	近1年每个月凌晨时段下单次数的稳定性
	BigDecimal tb_daytime_order_cnt_month_stab_1y;//	BigDecimal	否	近1年每个月白天时段下单次数的稳定性
	BigDecimal tb_night_order_cnt_month_stab_1y;//	BigDecimal	否	近1年每个月晚上时段下单次数的稳定性
	BigDecimal tb_dawn_order_amt_max_6m;//	BigDecimal	否	近6个月凌晨时段最大的订单金额
	BigDecimal tb_daytime_order_amt_max_6m;//	BigDecimal	否	近6个月白天时段最大的订单金额
	BigDecimal tb_night_order_amt_max_6m;//	BigDecimal	否	近6个月晚上时段最大的订单金额
	BigDecimal tb_dawn_order_amt_prop_6m;//	BigDecimal	否	近6个月凌晨时段下单金额占总金额比
	BigDecimal tb_daytime_order_amt_prop_6m;//	BigDecimal	否	近6个月白天时段下单金额占总金额比
	BigDecimal tb_night_order_amt_prop_6m;//	BigDecimal	否	近6个月晚上时段下单金额占总金额比
	BigDecimal tb_dawn_order_cnt_prop_6m;//	BigDecimal	否	近6个月凌晨时段下单次数占总次数比
	BigDecimal tb_daytime_order_cnt_prop_6m;//	BigDecimal	否	近6个月白天时段下单次数占总次数比
	BigDecimal tb_night_order_cnt_prop_6m;//	BigDecimal	否	近6个月晚上时段下单次数占总次数比
	BigDecimal tb_dawn_order_amt_max_3m;//	BigDecimal	否	近3个月凌晨时段最大的订单金额
	BigDecimal tb_daytime_order_amt_max_3m;//	BigDecimal	否	近3个月白天时段最大的订单金额
	BigDecimal tb_night_order_amt_max_3m;//	BigDecimal	否	近3个月晚上时段最大的订单金额
	BigDecimal tb_dawn_order_amt_prop_3m;//	BigDecimal	否	近3个月凌晨时段下单金额占总金额比
	BigDecimal tb_daytime_order_amt_prop_3m;//	BigDecimal	否	近3个月白天时段下单金额占总金额比
	BigDecimal tb_night_order_amt_prop_3m;//	BigDecimal	否	近3个月晚上时段下单金额占总金额比
	BigDecimal tb_dawn_order_cnt_prop_3m;//	BigDecimal	否	近3个月凌晨时段下单次数占总次数比
	BigDecimal tb_daytime_order_cnt_prop_3m;//	BigDecimal	否	近3个月白天时段下单次数占总次数比
	BigDecimal tb_night_order_cnt_prop_3m;//	BigDecimal	否	近3个月晚上时段下单次数占总次数比
	BigDecimal tb_dawn_order_amt_max_1m;//	BigDecimal	否	近1个月凌晨时段最大的订单金额
	BigDecimal tb_daytime_order_amt_max_1m;//	BigDecimal	否	近1个月白天时段最大的订单金额
	BigDecimal tb_night_order_amt_max_1m;//	BigDecimal	否	近1个月晚上时段最大的订单金额
	BigDecimal tb_dawn_order_amt_prop_1m;//	BigDecimal	否	近1个月凌晨时段下单金额占总金额比
	BigDecimal tb_daytime_order_amt_prop_1m;//	BigDecimal	否	近1个月白天时段下单金额占总金额比
	BigDecimal tb_night_order_amt_prop_1m;//	BigDecimal	否	近1个月晚上时段下单金额占总金额比
	BigDecimal tb_dawn_order_cnt_prop_1m;//	BigDecimal	否	近1个月凌晨时段下单次数占总次数比
	BigDecimal tb_daytime_order_cnt_prop_1m;//	BigDecimal	否	近1个月白天时段下单次数占总次数比
	BigDecimal tb_night_order_cnt_prop_1m;//	BigDecimal	否	近1个月晚上时段下单次数占总次数比
	BigDecimal trade_dawn_amt_max_6m;//	BigDecimal	否	近6个月凌晨时段最大的交易金额
	BigDecimal trade_daytime_amt_max_6m;//	BigDecimal	否	近6个月白天时段最大的交易金额
	BigDecimal trade_night_amt_max_6m;//	否	近6个月晚上时段最大的交易金额
	BigDecimal trade_dawn_amt_prop_6m;//	BigDecimal	否	近6个月凌晨时段交易金额占总金额比
	BigDecimal trade_daytime_amt_prop_6m;//	BigDecimal	否	近6个月白天时段交易金额占总金额比
	BigDecimal trade_night_amt_prop_6m;//	BigDecimal	否	近6个月晚上时段交易金额占总金额比
	BigDecimal trade_dawn_cnt_prop_6m;//	BigDecimal	否	近6个月凌晨时段交易次数占总次数比
	BigDecimal trade_daytime_cnt_prop_6m;//	BigDecimal	否	近6个月白天时段交易次数占总次数比
	BigDecimal trade_night_cnt_prop_6m;//	BigDecimal	否	近6个月晚上时段交易次数占总次数比
	BigDecimal trade_dawn_amt_month_stab_6m;//	BigDecimal	否	近6个月每个月凌晨时段交易金额的稳定性
	BigDecimal trade_daytime_amt_month_stab_6m;//	BigDecimal	否	近6个月每个月白天时段交易金额的稳定性
	BigDecimal trade_night_amt_month_stab_6m;//	BigDecimal	否	近6个月每个月晚上时段交易金额的稳定性
	BigDecimal trade_dawn_cnt_month_stab_6m;//	BigDecimal	否	近6个月每个月凌晨时段交易次数的稳定性
	BigDecimal trade_daytime_cnt_month_stab_6m;//	BigDecimal	否	近6个月每个月白天时段交易次数的稳定性
	BigDecimal trade_night_cnt_month_stab_6m;//	BigDecimal	否	近6个月每个月晚上时段交易次数的稳定性
	BigDecimal trade_amt_month_max_6m;//	BigDecimal	否	近6个月单月最大交易金额
	BigDecimal trade_amt_month_max_3m;//	BigDecimal	否	近3个月单月最大交易金额
	Integer trade_cnt_month_max_6m;//	Integer	否	近6个月单月最大交易次数
	Integer trade_cnt_month_max_3m;//	Integer	否	近3个月单月最大交易次数
	BigDecimal trade_amt_month_mean_6m;//	BigDecimal	否	近6个月平均每月交易金额
	BigDecimal trade_amt_month_mean_3m;//	BigDecimal	否	近3个月平均每月交易金额
	BigDecimal trade_cnt_month_mean_6m;//	BigDecimal	否	近6个月平均每月交易次数
	BigDecimal trade_cnt_month_mean_3m;//	BigDecimal	否	近3个月平均每月交易次数
	BigDecimal trade_time_span_stab_6m;//	BigDecimal	否	近6个月两笔交易记录间隔时间的稳定性
	BigDecimal trade_amt_day_max_6m;//	BigDecimal	否	近6个月单日最大交易金额
	BigDecimal trade_amt_day_max_3m;//	BigDecimal	否	近3个月单日最大交易金额
	BigDecimal trade_amt_day_max_1m;//	BigDecimal	否	近1个月单日最大交易金额
	Integer trade_cnt_day_max_6m;//	Integer	否	近6个月单日最大交易次数
	Integer trade_cnt_day_max_3m;//	Integer	否	近3个月单日最大交易次数
	Integer trade_cnt_day_max_1m;//	Integer	否	近1个月单日最大交易次数
	BigDecimal trade_amt_max_6m;//	BigDecimal	否	近6个月最大一笔交易金额
	BigDecimal trade_amt_min_6m;//	BigDecimal	否	近6个月最小一笔交易金额
	BigDecimal trade_amt_mean_6m;//	BigDecimal	否	近6个月平均每笔交易金额
	BigDecimal trade_amt_max_3m;//	BigDecimal	否	近3个月最大一笔交易金额
	BigDecimal trade_amt_min_3m;//	BigDecimal	否	近3个月最小一笔交易金额
	BigDecimal trade_amt_mean_3m;//	BigDecimal	否	近3个月平均每笔交易金额
	BigDecimal trade_amt_max_1m;//	BigDecimal	否	近1个月最大一笔交易金额
	BigDecimal trade_amt_min_1m;//	BigDecimal	否	近1个月最小一笔交易金额
	BigDecimal trade_amt_mean_1m;//	BigDecimal	否	近1个月平均每笔交易金额
	BigDecimal trade_amt_sum_6m;//	BigDecimal	否	近6个月交易总金额
	BigDecimal trade_amt_sum_3m;//	BigDecimal	否	近3个月交易总金额
	BigDecimal trade_amt_sum_1m;//	BigDecimal	否	近1个月交易总金额
	BigDecimal trade_cnt_sum_6m;//	BigDecimal	否	近6个月交易总笔数
	BigDecimal trade_cnt_sum_3m;//	BigDecimal	否	近3个月交易总笔数
	BigDecimal trade_cnt_sum_1m;//	BigDecimal	否	近1个月交易总笔数
	BigDecimal trade_time_span_max_6m;//	BigDecimal	否	近6个月两笔交易记录间隔时间的最大值(天）
	BigDecimal trade_time_span_min_6m;//	BigDecimal	否	近6个月两笔交易记录间隔时间的最小值(天）
	BigDecimal trade_time_span_mean_6m;//	BigDecimal	否	近6个月两笔交易记录间隔时间的平均值(天）
	BigDecimal trade_lottery_order_amt_sum_1m;//	BigDecimal	否	近1个月彩票交易总金额
	BigDecimal trade_lottery_order_amt_mean_1m;//	BigDecimal	否	近1个月彩票平均每单交易金额
	BigDecimal trade_lottery_order_amt_max_1m;//	BigDecimal	否	近1个月彩票最大一笔交易金额
	BigDecimal trade_lottery_order_amt_sum_prop_1m;//	BigDecimal	否	近1个月彩票总金额占总消费支出金额比
	Integer trade_lottery_order_cnt_sum_1m;//	Integer	否	近1个月彩票总交易次数
	BigDecimal trade_lottery_order_cnt_sum_prop_1m;//	BigDecimal	否	近1个月彩票交易次数占总消费支出次数比
	BigDecimal trade_lottery_order_amt_sum_3m;//	BigDecimal	否	近3个月彩票交易总金额
	BigDecimal trade_lottery_order_amt_mean_3m;//	BigDecimal	否	近3个月彩票平均每单交易金额
	BigDecimal trade_lottery_order_amt_max_3m;//	BigDecimal	否	近3个月彩票最大一笔交易金额
	BigDecimal trade_lottery_order_amt_sum_prop_3m;//	BigDecimal	否	近3个月彩票总金额占总消费支出金额比
	Integer trade_lottery_order_cnt_sum_3m;//	Integer	否	近3个月彩票总交易次数
	BigDecimal trade_lottery_order_cnt_sum_prop_3m;//	BigDecimal	否	近3个月彩票交易次数占总消费支出次数比
	BigDecimal trade_lottery_order_amt_sum_6m;//	BigDecimal	否	近6个月彩票交易总金额
	BigDecimal trade_lottery_order_amt_mean_6m;//	BigDecimal	否	近6个月彩票平均每单交易金额
	BigDecimal trade_lottery_order_amt_max_6m;//	BigDecimal	否	近6个月彩票最大一笔交易金额
	BigDecimal trade_lottery_order_amt_sum_prop_6m;//	BigDecimal	否	近6个月彩票总金额占总消费支出金额比
	Integer trade_lottery_order_cnt_sum_6m;//	Integer	否	近6个月彩票总交易次数
	BigDecimal trade_lottery_order_cnt_sum_prop_6m;//	BigDecimal	否	近6个月彩票交易次数占总消费支出次数比
	Integer trade_cheat_order_cnt_sum_1m;//	Integer	否	近1个月疑似欺诈行为交易次数
	Integer trade_cheat_order_cnt_sum_2m;//	Integer	否	近3个月疑似欺诈行为交易次数
	Integer trade_cheat_order_cnt_sum_3m;//	Integer	否	近6个月疑似欺诈行为交易次数
	Integer trade_gambling_order_cnt_sum_1m;//	Integer	否	近1个月疑似赌博行为交易次数
	Integer trade_gambling_order_cnt_sum_3m;//	Integer	否	近3个月疑似赌博行为交易次数
	Integer trade_gambling_order_cnt_sum_6m;//	Integer	否	近6个月疑似赌博行为交易次数
	Integer trade_drug_order_cnt_sum_1m;//	Integer	否	近1个月疑似吸毒行为交易次数
	Integer trade_drug_order_cnt_sum_2m;//Integer	否	近3个月疑似吸毒行为交易次数
	Integer trade_drug_order_cnt_sum_6m;//	Integer	否	近6个月疑似吸毒行为交易次数
	Integer trade_cashout_order_cnt_sum_1m;//	Integer	否	近1个月疑似套现行为交易次数
	Integer trade_cashout_order_cnt_sum_3m;//	Integer	否	近3个月疑似套现行为交易次数
	Integer trade_cashout_order_cnt_sum_6m;//	Integer	否	近6个月疑似套现行为交易次数
	public Integer getPhone_receive_order_num_1y() {
		return phone_receive_order_num_1y;
	}
	public void setPhone_receive_order_num_1y(Integer phone_receive_order_num_1y) {
		this.phone_receive_order_num_1y = phone_receive_order_num_1y;
	}
	public Integer getPhone_receive_order_num_6m() {
		return phone_receive_order_num_6m;
	}
	public void setPhone_receive_order_num_6m(Integer phone_receive_order_num_6m) {
		this.phone_receive_order_num_6m = phone_receive_order_num_6m;
	}
	public Integer getPhone_receive_order_num_3m() {
		return phone_receive_order_num_3m;
	}
	public void setPhone_receive_order_num_3m(Integer phone_receive_order_num_3m) {
		this.phone_receive_order_num_3m = phone_receive_order_num_3m;
	}
	public Integer getPhone_receive_addr_num_1y() {
		return phone_receive_addr_num_1y;
	}
	public void setPhone_receive_addr_num_1y(Integer phone_receive_addr_num_1y) {
		this.phone_receive_addr_num_1y = phone_receive_addr_num_1y;
	}
	public Integer getPhone_receive_addr_num_6m() {
		return phone_receive_addr_num_6m;
	}
	public void setPhone_receive_addr_num_6m(Integer phone_receive_addr_num_6m) {
		this.phone_receive_addr_num_6m = phone_receive_addr_num_6m;
	}
	public Integer getPhone_receive_addr_num_3m() {
		return phone_receive_addr_num_3m;
	}
	public void setPhone_receive_addr_num_3m(Integer phone_receive_addr_num_3m) {
		this.phone_receive_addr_num_3m = phone_receive_addr_num_3m;
	}
	public Integer getPhone_stab_days_1y() {
		return phone_stab_days_1y;
	}
	public void setPhone_stab_days_1y(Integer phone_stab_days_1y) {
		this.phone_stab_days_1y = phone_stab_days_1y;
	}
	public Integer getPhone_use_num_1y() {
		return phone_use_num_1y;
	}
	public void setPhone_use_num_1y(Integer phone_use_num_1y) {
		this.phone_use_num_1y = phone_use_num_1y;
	}
	public Integer getOneself_receive_addr_num() {
		return oneself_receive_addr_num;
	}
	public void setOneself_receive_addr_num(Integer oneself_receive_addr_num) {
		this.oneself_receive_addr_num = oneself_receive_addr_num;
	}
	public Integer getOneself_receive_phone_num() {
		return oneself_receive_phone_num;
	}
	public void setOneself_receive_phone_num(Integer oneself_receive_phone_num) {
		this.oneself_receive_phone_num = oneself_receive_phone_num;
	}
	public Integer getReceive_addr_num() {
		return receive_addr_num;
	}
	public void setReceive_addr_num(Integer receive_addr_num) {
		this.receive_addr_num = receive_addr_num;
	}
	public Integer getReceive_user_num() {
		return receive_user_num;
	}
	public void setReceive_user_num(Integer receive_user_num) {
		this.receive_user_num = receive_user_num;
	}
	public Integer getReceive_phone_num() {
		return receive_phone_num;
	}
	public void setReceive_phone_num(Integer receive_phone_num) {
		this.receive_phone_num = receive_phone_num;
	}
	public Integer getDefault_addr_city_level() {
		return default_addr_city_level;
	}
	public void setDefault_addr_city_level(Integer default_addr_city_level) {
		this.default_addr_city_level = default_addr_city_level;
	}
	public Integer getReceive_addr_first_tier_city_num_1y() {
		return receive_addr_first_tier_city_num_1y;
	}
	public void setReceive_addr_first_tier_city_num_1y(Integer receive_addr_first_tier_city_num_1y) {
		this.receive_addr_first_tier_city_num_1y = receive_addr_first_tier_city_num_1y;
	}
	public Integer getReceive_addr_second_tier_city_num_1y() {
		return receive_addr_second_tier_city_num_1y;
	}
	public void setReceive_addr_second_tier_city_num_1y(Integer receive_addr_second_tier_city_num_1y) {
		this.receive_addr_second_tier_city_num_1y = receive_addr_second_tier_city_num_1y;
	}
	public Integer getReceive_addr_third_tier_city_num_1y() {
		return receive_addr_third_tier_city_num_1y;
	}
	public void setReceive_addr_third_tier_city_num_1y(Integer receive_addr_third_tier_city_num_1y) {
		this.receive_addr_third_tier_city_num_1y = receive_addr_third_tier_city_num_1y;
	}
	public Integer getReceive_addr_fourth_tier_city_num_1y() {
		return receive_addr_fourth_tier_city_num_1y;
	}
	public void setReceive_addr_fourth_tier_city_num_1y(Integer receive_addr_fourth_tier_city_num_1y) {
		this.receive_addr_fourth_tier_city_num_1y = receive_addr_fourth_tier_city_num_1y;
	}
	public Integer getReceive_addr_first_tier_city_num_6m() {
		return receive_addr_first_tier_city_num_6m;
	}
	public void setReceive_addr_first_tier_city_num_6m(Integer receive_addr_first_tier_city_num_6m) {
		this.receive_addr_first_tier_city_num_6m = receive_addr_first_tier_city_num_6m;
	}
	public Integer getReceive_addr_second_tier_city_num_6m() {
		return receive_addr_second_tier_city_num_6m;
	}
	public void setReceive_addr_second_tier_city_num_6m(Integer receive_addr_second_tier_city_num_6m) {
		this.receive_addr_second_tier_city_num_6m = receive_addr_second_tier_city_num_6m;
	}
	public Integer getReceive_addr_third_tier_city_num_6m() {
		return receive_addr_third_tier_city_num_6m;
	}
	public void setReceive_addr_third_tier_city_num_6m(Integer receive_addr_third_tier_city_num_6m) {
		this.receive_addr_third_tier_city_num_6m = receive_addr_third_tier_city_num_6m;
	}
	public Integer getReceive_addr_fourth_tier_city_num_6m() {
		return receive_addr_fourth_tier_city_num_6m;
	}
	public void setReceive_addr_fourth_tier_city_num_6m(Integer receive_addr_fourth_tier_city_num_6m) {
		this.receive_addr_fourth_tier_city_num_6m = receive_addr_fourth_tier_city_num_6m;
	}
	public Integer getReceive_addr_first_tier_city_num_3m() {
		return receive_addr_first_tier_city_num_3m;
	}
	public void setReceive_addr_first_tier_city_num_3m(Integer receive_addr_first_tier_city_num_3m) {
		this.receive_addr_first_tier_city_num_3m = receive_addr_first_tier_city_num_3m;
	}
	public Integer getReceive_addr_second_tier_city_num_3m() {
		return receive_addr_second_tier_city_num_3m;
	}
	public void setReceive_addr_second_tier_city_num_3m(Integer receive_addr_second_tier_city_num_3m) {
		this.receive_addr_second_tier_city_num_3m = receive_addr_second_tier_city_num_3m;
	}
	public Integer getReceive_addr_third_tier_city_num_3m() {
		return receive_addr_third_tier_city_num_3m;
	}
	public void setReceive_addr_third_tier_city_num_3m(Integer receive_addr_third_tier_city_num_3m) {
		this.receive_addr_third_tier_city_num_3m = receive_addr_third_tier_city_num_3m;
	}
	public Integer getReceive_addr_fourth_tier_city_num_3m() {
		return receive_addr_fourth_tier_city_num_3m;
	}
	public void setReceive_addr_fourth_tier_city_num_3m(Integer receive_addr_fourth_tier_city_num_3m) {
		this.receive_addr_fourth_tier_city_num_3m = receive_addr_fourth_tier_city_num_3m;
	}
	public Integer getDiff_receive_addr_num_1y() {
		return diff_receive_addr_num_1y;
	}
	public void setDiff_receive_addr_num_1y(Integer diff_receive_addr_num_1y) {
		this.diff_receive_addr_num_1y = diff_receive_addr_num_1y;
	}
	public Integer getDiff_receive_addr_num_6m() {
		return diff_receive_addr_num_6m;
	}
	public void setDiff_receive_addr_num_6m(Integer diff_receive_addr_num_6m) {
		this.diff_receive_addr_num_6m = diff_receive_addr_num_6m;
	}
	public Integer getDiff_receive_addr_num_3m() {
		return diff_receive_addr_num_3m;
	}
	public void setDiff_receive_addr_num_3m(Integer diff_receive_addr_num_3m) {
		this.diff_receive_addr_num_3m = diff_receive_addr_num_3m;
	}
	public Integer getDiff_receive_user_num_1y() {
		return diff_receive_user_num_1y;
	}
	public void setDiff_receive_user_num_1y(Integer diff_receive_user_num_1y) {
		this.diff_receive_user_num_1y = diff_receive_user_num_1y;
	}
	public Integer getDiff_receive_user_num_6m() {
		return diff_receive_user_num_6m;
	}
	public void setDiff_receive_user_num_6m(Integer diff_receive_user_num_6m) {
		this.diff_receive_user_num_6m = diff_receive_user_num_6m;
	}
	public Integer getDiff_receive_user_num_3m() {
		return diff_receive_user_num_3m;
	}
	public void setDiff_receive_user_num_3m(Integer diff_receive_user_num_3m) {
		this.diff_receive_user_num_3m = diff_receive_user_num_3m;
	}
	public Integer getDiff_receive_phone_num_1y() {
		return diff_receive_phone_num_1y;
	}
	public void setDiff_receive_phone_num_1y(Integer diff_receive_phone_num_1y) {
		this.diff_receive_phone_num_1y = diff_receive_phone_num_1y;
	}
	public Integer getDiff_receive_phone_num_6m() {
		return diff_receive_phone_num_6m;
	}
	public void setDiff_receive_phone_num_6m(Integer diff_receive_phone_num_6m) {
		this.diff_receive_phone_num_6m = diff_receive_phone_num_6m;
	}
	public Integer getDiff_receive_phone_num_3m() {
		return diff_receive_phone_num_3m;
	}
	public void setDiff_receive_phone_num_3m(Integer diff_receive_phone_num_3m) {
		this.diff_receive_phone_num_3m = diff_receive_phone_num_3m;
	}
	public Integer getOnself_order_num_1y() {
		return onself_order_num_1y;
	}
	public void setOnself_order_num_1y(Integer onself_order_num_1y) {
		this.onself_order_num_1y = onself_order_num_1y;
	}
	public BigDecimal getOnself_order_num_prop_1y() {
		return onself_order_num_prop_1y;
	}
	public void setOnself_order_num_prop_1y(BigDecimal onself_order_num_prop_1y) {
		this.onself_order_num_prop_1y = onself_order_num_prop_1y;
	}
	public Integer getOnself_order_num_6m() {
		return onself_order_num_6m;
	}
	public void setOnself_order_num_6m(Integer onself_order_num_6m) {
		this.onself_order_num_6m = onself_order_num_6m;
	}
	public BigDecimal getOnself_order_num_prop_6m() {
		return onself_order_num_prop_6m;
	}
	public void setOnself_order_num_prop_6m(BigDecimal onself_order_num_prop_6m) {
		this.onself_order_num_prop_6m = onself_order_num_prop_6m;
	}
	public Integer getOnself_order_num_3m() {
		return onself_order_num_3m;
	}
	public void setOnself_order_num_3m(Integer onself_order_num_3m) {
		this.onself_order_num_3m = onself_order_num_3m;
	}
	public BigDecimal getOnself_order_num_prop_3m() {
		return onself_order_num_prop_3m;
	}
	public void setOnself_order_num_prop_3m(BigDecimal onself_order_num_prop_3m) {
		this.onself_order_num_prop_3m = onself_order_num_prop_3m;
	}
	public Integer getOnself_receive_addr_num_1y() {
		return onself_receive_addr_num_1y;
	}
	public void setOnself_receive_addr_num_1y(Integer onself_receive_addr_num_1y) {
		this.onself_receive_addr_num_1y = onself_receive_addr_num_1y;
	}
	public Integer getOnself_receive_addr_num_6m() {
		return onself_receive_addr_num_6m;
	}
	public void setOnself_receive_addr_num_6m(Integer onself_receive_addr_num_6m) {
		this.onself_receive_addr_num_6m = onself_receive_addr_num_6m;
	}
	public Integer getOnself_receive_addr_num_3m() {
		return onself_receive_addr_num_3m;
	}
	public void setOnself_receive_addr_num_3m(Integer onself_receive_addr_num_3m) {
		this.onself_receive_addr_num_3m = onself_receive_addr_num_3m;
	}
	public Integer getBank_card_num() {
		return bank_card_num;
	}
	public void setBank_card_num(Integer bank_card_num) {
		this.bank_card_num = bank_card_num;
	}
	public Integer getBank_num() {
		return bank_num;
	}
	public void setBank_num(Integer bank_num) {
		this.bank_num = bank_num;
	}
	public Integer getDebit_card_num() {
		return debit_card_num;
	}
	public void setDebit_card_num(Integer debit_card_num) {
		this.debit_card_num = debit_card_num;
	}
	public BigDecimal getDebit_card_prop() {
		return debit_card_prop;
	}
	public void setDebit_card_prop(BigDecimal debit_card_prop) {
		this.debit_card_prop = debit_card_prop;
	}
	public Integer getCredit_card_num() {
		return credit_card_num;
	}
	public void setCredit_card_num(Integer credit_card_num) {
		this.credit_card_num = credit_card_num;
	}
	public BigDecimal getCredit_card_prop() {
		return credit_card_prop;
	}
	public void setCredit_card_prop(BigDecimal credit_card_prop) {
		this.credit_card_prop = credit_card_prop;
	}
	public BigDecimal getTb_dawn_order_amt_max_1y() {
		return tb_dawn_order_amt_max_1y;
	}
	public void setTb_dawn_order_amt_max_1y(BigDecimal tb_dawn_order_amt_max_1y) {
		this.tb_dawn_order_amt_max_1y = tb_dawn_order_amt_max_1y;
	}
	public BigDecimal getTb_daytime_order_amt_max_1y() {
		return tb_daytime_order_amt_max_1y;
	}
	public void setTb_daytime_order_amt_max_1y(BigDecimal tb_daytime_order_amt_max_1y) {
		this.tb_daytime_order_amt_max_1y = tb_daytime_order_amt_max_1y;
	}
	public BigDecimal getTb_night_order_amt_max_1y() {
		return tb_night_order_amt_max_1y;
	}
	public void setTb_night_order_amt_max_1y(BigDecimal tb_night_order_amt_max_1y) {
		this.tb_night_order_amt_max_1y = tb_night_order_amt_max_1y;
	}
	public BigDecimal getTb_dawn_order_amt_prop_1y() {
		return tb_dawn_order_amt_prop_1y;
	}
	public void setTb_dawn_order_amt_prop_1y(BigDecimal tb_dawn_order_amt_prop_1y) {
		this.tb_dawn_order_amt_prop_1y = tb_dawn_order_amt_prop_1y;
	}
	public BigDecimal getTb_daytime_order_amt_prop_1y() {
		return tb_daytime_order_amt_prop_1y;
	}
	public void setTb_daytime_order_amt_prop_1y(BigDecimal tb_daytime_order_amt_prop_1y) {
		this.tb_daytime_order_amt_prop_1y = tb_daytime_order_amt_prop_1y;
	}
	public BigDecimal getTb_night_order_amt_prop_1y() {
		return tb_night_order_amt_prop_1y;
	}
	public void setTb_night_order_amt_prop_1y(BigDecimal tb_night_order_amt_prop_1y) {
		this.tb_night_order_amt_prop_1y = tb_night_order_amt_prop_1y;
	}
	public BigDecimal getTb_dawn_order_cnt_prop_1y() {
		return tb_dawn_order_cnt_prop_1y;
	}
	public void setTb_dawn_order_cnt_prop_1y(BigDecimal tb_dawn_order_cnt_prop_1y) {
		this.tb_dawn_order_cnt_prop_1y = tb_dawn_order_cnt_prop_1y;
	}
	public BigDecimal getTb_daytime_order_cnt_prop_1y() {
		return tb_daytime_order_cnt_prop_1y;
	}
	public void setTb_daytime_order_cnt_prop_1y(BigDecimal tb_daytime_order_cnt_prop_1y) {
		this.tb_daytime_order_cnt_prop_1y = tb_daytime_order_cnt_prop_1y;
	}
	public BigDecimal getTb_night_order_cnt_prop_1y() {
		return tb_night_order_cnt_prop_1y;
	}
	public void setTb_night_order_cnt_prop_1y(BigDecimal tb_night_order_cnt_prop_1y) {
		this.tb_night_order_cnt_prop_1y = tb_night_order_cnt_prop_1y;
	}
	public BigDecimal getTb_dawn_order_amt_month_stab_1y() {
		return tb_dawn_order_amt_month_stab_1y;
	}
	public void setTb_dawn_order_amt_month_stab_1y(BigDecimal tb_dawn_order_amt_month_stab_1y) {
		this.tb_dawn_order_amt_month_stab_1y = tb_dawn_order_amt_month_stab_1y;
	}
	public BigDecimal getTb_daytime_order_amt_month_stab_1y() {
		return tb_daytime_order_amt_month_stab_1y;
	}
	public void setTb_daytime_order_amt_month_stab_1y(BigDecimal tb_daytime_order_amt_month_stab_1y) {
		this.tb_daytime_order_amt_month_stab_1y = tb_daytime_order_amt_month_stab_1y;
	}
	public BigDecimal getTb_night_order_amt_month_stab_1y() {
		return tb_night_order_amt_month_stab_1y;
	}
	public void setTb_night_order_amt_month_stab_1y(BigDecimal tb_night_order_amt_month_stab_1y) {
		this.tb_night_order_amt_month_stab_1y = tb_night_order_amt_month_stab_1y;
	}
	public BigDecimal getTb_dawn_order_cnt_month_stab_1y() {
		return tb_dawn_order_cnt_month_stab_1y;
	}
	public void setTb_dawn_order_cnt_month_stab_1y(BigDecimal tb_dawn_order_cnt_month_stab_1y) {
		this.tb_dawn_order_cnt_month_stab_1y = tb_dawn_order_cnt_month_stab_1y;
	}
	public BigDecimal getTb_daytime_order_cnt_month_stab_1y() {
		return tb_daytime_order_cnt_month_stab_1y;
	}
	public void setTb_daytime_order_cnt_month_stab_1y(BigDecimal tb_daytime_order_cnt_month_stab_1y) {
		this.tb_daytime_order_cnt_month_stab_1y = tb_daytime_order_cnt_month_stab_1y;
	}
	public BigDecimal getTb_night_order_cnt_month_stab_1y() {
		return tb_night_order_cnt_month_stab_1y;
	}
	public void setTb_night_order_cnt_month_stab_1y(BigDecimal tb_night_order_cnt_month_stab_1y) {
		this.tb_night_order_cnt_month_stab_1y = tb_night_order_cnt_month_stab_1y;
	}
	public BigDecimal getTb_dawn_order_amt_max_6m() {
		return tb_dawn_order_amt_max_6m;
	}
	public void setTb_dawn_order_amt_max_6m(BigDecimal tb_dawn_order_amt_max_6m) {
		this.tb_dawn_order_amt_max_6m = tb_dawn_order_amt_max_6m;
	}
	public BigDecimal getTb_daytime_order_amt_max_6m() {
		return tb_daytime_order_amt_max_6m;
	}
	public void setTb_daytime_order_amt_max_6m(BigDecimal tb_daytime_order_amt_max_6m) {
		this.tb_daytime_order_amt_max_6m = tb_daytime_order_amt_max_6m;
	}
	public BigDecimal getTb_night_order_amt_max_6m() {
		return tb_night_order_amt_max_6m;
	}
	public void setTb_night_order_amt_max_6m(BigDecimal tb_night_order_amt_max_6m) {
		this.tb_night_order_amt_max_6m = tb_night_order_amt_max_6m;
	}
	public BigDecimal getTb_dawn_order_amt_prop_6m() {
		return tb_dawn_order_amt_prop_6m;
	}
	public void setTb_dawn_order_amt_prop_6m(BigDecimal tb_dawn_order_amt_prop_6m) {
		this.tb_dawn_order_amt_prop_6m = tb_dawn_order_amt_prop_6m;
	}
	public BigDecimal getTb_daytime_order_amt_prop_6m() {
		return tb_daytime_order_amt_prop_6m;
	}
	public void setTb_daytime_order_amt_prop_6m(BigDecimal tb_daytime_order_amt_prop_6m) {
		this.tb_daytime_order_amt_prop_6m = tb_daytime_order_amt_prop_6m;
	}
	public BigDecimal getTb_night_order_amt_prop_6m() {
		return tb_night_order_amt_prop_6m;
	}
	public void setTb_night_order_amt_prop_6m(BigDecimal tb_night_order_amt_prop_6m) {
		this.tb_night_order_amt_prop_6m = tb_night_order_amt_prop_6m;
	}
	public BigDecimal getTb_dawn_order_cnt_prop_6m() {
		return tb_dawn_order_cnt_prop_6m;
	}
	public void setTb_dawn_order_cnt_prop_6m(BigDecimal tb_dawn_order_cnt_prop_6m) {
		this.tb_dawn_order_cnt_prop_6m = tb_dawn_order_cnt_prop_6m;
	}
	public BigDecimal getTb_daytime_order_cnt_prop_6m() {
		return tb_daytime_order_cnt_prop_6m;
	}
	public void setTb_daytime_order_cnt_prop_6m(BigDecimal tb_daytime_order_cnt_prop_6m) {
		this.tb_daytime_order_cnt_prop_6m = tb_daytime_order_cnt_prop_6m;
	}
	public BigDecimal getTb_night_order_cnt_prop_6m() {
		return tb_night_order_cnt_prop_6m;
	}
	public void setTb_night_order_cnt_prop_6m(BigDecimal tb_night_order_cnt_prop_6m) {
		this.tb_night_order_cnt_prop_6m = tb_night_order_cnt_prop_6m;
	}
	public BigDecimal getTb_dawn_order_amt_max_3m() {
		return tb_dawn_order_amt_max_3m;
	}
	public void setTb_dawn_order_amt_max_3m(BigDecimal tb_dawn_order_amt_max_3m) {
		this.tb_dawn_order_amt_max_3m = tb_dawn_order_amt_max_3m;
	}
	public BigDecimal getTb_daytime_order_amt_max_3m() {
		return tb_daytime_order_amt_max_3m;
	}
	public void setTb_daytime_order_amt_max_3m(BigDecimal tb_daytime_order_amt_max_3m) {
		this.tb_daytime_order_amt_max_3m = tb_daytime_order_amt_max_3m;
	}
	public BigDecimal getTb_night_order_amt_max_3m() {
		return tb_night_order_amt_max_3m;
	}
	public void setTb_night_order_amt_max_3m(BigDecimal tb_night_order_amt_max_3m) {
		this.tb_night_order_amt_max_3m = tb_night_order_amt_max_3m;
	}
	public BigDecimal getTb_dawn_order_amt_prop_3m() {
		return tb_dawn_order_amt_prop_3m;
	}
	public void setTb_dawn_order_amt_prop_3m(BigDecimal tb_dawn_order_amt_prop_3m) {
		this.tb_dawn_order_amt_prop_3m = tb_dawn_order_amt_prop_3m;
	}
	public BigDecimal getTb_daytime_order_amt_prop_3m() {
		return tb_daytime_order_amt_prop_3m;
	}
	public void setTb_daytime_order_amt_prop_3m(BigDecimal tb_daytime_order_amt_prop_3m) {
		this.tb_daytime_order_amt_prop_3m = tb_daytime_order_amt_prop_3m;
	}
	public BigDecimal getTb_night_order_amt_prop_3m() {
		return tb_night_order_amt_prop_3m;
	}
	public void setTb_night_order_amt_prop_3m(BigDecimal tb_night_order_amt_prop_3m) {
		this.tb_night_order_amt_prop_3m = tb_night_order_amt_prop_3m;
	}
	public BigDecimal getTb_dawn_order_cnt_prop_3m() {
		return tb_dawn_order_cnt_prop_3m;
	}
	public void setTb_dawn_order_cnt_prop_3m(BigDecimal tb_dawn_order_cnt_prop_3m) {
		this.tb_dawn_order_cnt_prop_3m = tb_dawn_order_cnt_prop_3m;
	}
	public BigDecimal getTb_daytime_order_cnt_prop_3m() {
		return tb_daytime_order_cnt_prop_3m;
	}
	public void setTb_daytime_order_cnt_prop_3m(BigDecimal tb_daytime_order_cnt_prop_3m) {
		this.tb_daytime_order_cnt_prop_3m = tb_daytime_order_cnt_prop_3m;
	}
	public BigDecimal getTb_night_order_cnt_prop_3m() {
		return tb_night_order_cnt_prop_3m;
	}
	public void setTb_night_order_cnt_prop_3m(BigDecimal tb_night_order_cnt_prop_3m) {
		this.tb_night_order_cnt_prop_3m = tb_night_order_cnt_prop_3m;
	}
	public BigDecimal getTb_dawn_order_amt_max_1m() {
		return tb_dawn_order_amt_max_1m;
	}
	public void setTb_dawn_order_amt_max_1m(BigDecimal tb_dawn_order_amt_max_1m) {
		this.tb_dawn_order_amt_max_1m = tb_dawn_order_amt_max_1m;
	}
	public BigDecimal getTb_daytime_order_amt_max_1m() {
		return tb_daytime_order_amt_max_1m;
	}
	public void setTb_daytime_order_amt_max_1m(BigDecimal tb_daytime_order_amt_max_1m) {
		this.tb_daytime_order_amt_max_1m = tb_daytime_order_amt_max_1m;
	}
	public BigDecimal getTb_night_order_amt_max_1m() {
		return tb_night_order_amt_max_1m;
	}
	public void setTb_night_order_amt_max_1m(BigDecimal tb_night_order_amt_max_1m) {
		this.tb_night_order_amt_max_1m = tb_night_order_amt_max_1m;
	}
	public BigDecimal getTb_dawn_order_amt_prop_1m() {
		return tb_dawn_order_amt_prop_1m;
	}
	public void setTb_dawn_order_amt_prop_1m(BigDecimal tb_dawn_order_amt_prop_1m) {
		this.tb_dawn_order_amt_prop_1m = tb_dawn_order_amt_prop_1m;
	}
	public BigDecimal getTb_daytime_order_amt_prop_1m() {
		return tb_daytime_order_amt_prop_1m;
	}
	public void setTb_daytime_order_amt_prop_1m(BigDecimal tb_daytime_order_amt_prop_1m) {
		this.tb_daytime_order_amt_prop_1m = tb_daytime_order_amt_prop_1m;
	}
	public BigDecimal getTb_night_order_amt_prop_1m() {
		return tb_night_order_amt_prop_1m;
	}
	public void setTb_night_order_amt_prop_1m(BigDecimal tb_night_order_amt_prop_1m) {
		this.tb_night_order_amt_prop_1m = tb_night_order_amt_prop_1m;
	}
	public BigDecimal getTb_dawn_order_cnt_prop_1m() {
		return tb_dawn_order_cnt_prop_1m;
	}
	public void setTb_dawn_order_cnt_prop_1m(BigDecimal tb_dawn_order_cnt_prop_1m) {
		this.tb_dawn_order_cnt_prop_1m = tb_dawn_order_cnt_prop_1m;
	}
	public BigDecimal getTb_daytime_order_cnt_prop_1m() {
		return tb_daytime_order_cnt_prop_1m;
	}
	public void setTb_daytime_order_cnt_prop_1m(BigDecimal tb_daytime_order_cnt_prop_1m) {
		this.tb_daytime_order_cnt_prop_1m = tb_daytime_order_cnt_prop_1m;
	}
	public BigDecimal getTb_night_order_cnt_prop_1m() {
		return tb_night_order_cnt_prop_1m;
	}
	public void setTb_night_order_cnt_prop_1m(BigDecimal tb_night_order_cnt_prop_1m) {
		this.tb_night_order_cnt_prop_1m = tb_night_order_cnt_prop_1m;
	}
	public BigDecimal getTrade_dawn_amt_max_6m() {
		return trade_dawn_amt_max_6m;
	}
	public void setTrade_dawn_amt_max_6m(BigDecimal trade_dawn_amt_max_6m) {
		this.trade_dawn_amt_max_6m = trade_dawn_amt_max_6m;
	}
	public BigDecimal getTrade_daytime_amt_max_6m() {
		return trade_daytime_amt_max_6m;
	}
	public void setTrade_daytime_amt_max_6m(BigDecimal trade_daytime_amt_max_6m) {
		this.trade_daytime_amt_max_6m = trade_daytime_amt_max_6m;
	}
	public BigDecimal getTrade_night_amt_max_6m() {
		return trade_night_amt_max_6m;
	}
	public void setTrade_night_amt_max_6m(BigDecimal trade_night_amt_max_6m) {
		this.trade_night_amt_max_6m = trade_night_amt_max_6m;
	}
	public BigDecimal getTrade_dawn_amt_prop_6m() {
		return trade_dawn_amt_prop_6m;
	}
	public void setTrade_dawn_amt_prop_6m(BigDecimal trade_dawn_amt_prop_6m) {
		this.trade_dawn_amt_prop_6m = trade_dawn_amt_prop_6m;
	}
	public BigDecimal getTrade_daytime_amt_prop_6m() {
		return trade_daytime_amt_prop_6m;
	}
	public void setTrade_daytime_amt_prop_6m(BigDecimal trade_daytime_amt_prop_6m) {
		this.trade_daytime_amt_prop_6m = trade_daytime_amt_prop_6m;
	}
	public BigDecimal getTrade_night_amt_prop_6m() {
		return trade_night_amt_prop_6m;
	}
	public void setTrade_night_amt_prop_6m(BigDecimal trade_night_amt_prop_6m) {
		this.trade_night_amt_prop_6m = trade_night_amt_prop_6m;
	}
	public BigDecimal getTrade_dawn_cnt_prop_6m() {
		return trade_dawn_cnt_prop_6m;
	}
	public void setTrade_dawn_cnt_prop_6m(BigDecimal trade_dawn_cnt_prop_6m) {
		this.trade_dawn_cnt_prop_6m = trade_dawn_cnt_prop_6m;
	}
	public BigDecimal getTrade_daytime_cnt_prop_6m() {
		return trade_daytime_cnt_prop_6m;
	}
	public void setTrade_daytime_cnt_prop_6m(BigDecimal trade_daytime_cnt_prop_6m) {
		this.trade_daytime_cnt_prop_6m = trade_daytime_cnt_prop_6m;
	}
	public BigDecimal getTrade_night_cnt_prop_6m() {
		return trade_night_cnt_prop_6m;
	}
	public void setTrade_night_cnt_prop_6m(BigDecimal trade_night_cnt_prop_6m) {
		this.trade_night_cnt_prop_6m = trade_night_cnt_prop_6m;
	}
	public BigDecimal getTrade_dawn_amt_month_stab_6m() {
		return trade_dawn_amt_month_stab_6m;
	}
	public void setTrade_dawn_amt_month_stab_6m(BigDecimal trade_dawn_amt_month_stab_6m) {
		this.trade_dawn_amt_month_stab_6m = trade_dawn_amt_month_stab_6m;
	}
	public BigDecimal getTrade_daytime_amt_month_stab_6m() {
		return trade_daytime_amt_month_stab_6m;
	}
	public void setTrade_daytime_amt_month_stab_6m(BigDecimal trade_daytime_amt_month_stab_6m) {
		this.trade_daytime_amt_month_stab_6m = trade_daytime_amt_month_stab_6m;
	}
	public BigDecimal getTrade_night_amt_month_stab_6m() {
		return trade_night_amt_month_stab_6m;
	}
	public void setTrade_night_amt_month_stab_6m(BigDecimal trade_night_amt_month_stab_6m) {
		this.trade_night_amt_month_stab_6m = trade_night_amt_month_stab_6m;
	}
	public BigDecimal getTrade_dawn_cnt_month_stab_6m() {
		return trade_dawn_cnt_month_stab_6m;
	}
	public void setTrade_dawn_cnt_month_stab_6m(BigDecimal trade_dawn_cnt_month_stab_6m) {
		this.trade_dawn_cnt_month_stab_6m = trade_dawn_cnt_month_stab_6m;
	}
	public BigDecimal getTrade_daytime_cnt_month_stab_6m() {
		return trade_daytime_cnt_month_stab_6m;
	}
	public void setTrade_daytime_cnt_month_stab_6m(BigDecimal trade_daytime_cnt_month_stab_6m) {
		this.trade_daytime_cnt_month_stab_6m = trade_daytime_cnt_month_stab_6m;
	}
	public BigDecimal getTrade_night_cnt_month_stab_6m() {
		return trade_night_cnt_month_stab_6m;
	}
	public void setTrade_night_cnt_month_stab_6m(BigDecimal trade_night_cnt_month_stab_6m) {
		this.trade_night_cnt_month_stab_6m = trade_night_cnt_month_stab_6m;
	}
	public BigDecimal getTrade_amt_month_max_6m() {
		return trade_amt_month_max_6m;
	}
	public void setTrade_amt_month_max_6m(BigDecimal trade_amt_month_max_6m) {
		this.trade_amt_month_max_6m = trade_amt_month_max_6m;
	}
	public BigDecimal getTrade_amt_month_max_3m() {
		return trade_amt_month_max_3m;
	}
	public void setTrade_amt_month_max_3m(BigDecimal trade_amt_month_max_3m) {
		this.trade_amt_month_max_3m = trade_amt_month_max_3m;
	}
	public Integer getTrade_cnt_month_max_6m() {
		return trade_cnt_month_max_6m;
	}
	public void setTrade_cnt_month_max_6m(Integer trade_cnt_month_max_6m) {
		this.trade_cnt_month_max_6m = trade_cnt_month_max_6m;
	}
	public Integer getTrade_cnt_month_max_3m() {
		return trade_cnt_month_max_3m;
	}
	public void setTrade_cnt_month_max_3m(Integer trade_cnt_month_max_3m) {
		this.trade_cnt_month_max_3m = trade_cnt_month_max_3m;
	}
	public BigDecimal getTrade_amt_month_mean_6m() {
		return trade_amt_month_mean_6m;
	}
	public void setTrade_amt_month_mean_6m(BigDecimal trade_amt_month_mean_6m) {
		this.trade_amt_month_mean_6m = trade_amt_month_mean_6m;
	}
	public BigDecimal getTrade_amt_month_mean_3m() {
		return trade_amt_month_mean_3m;
	}
	public void setTrade_amt_month_mean_3m(BigDecimal trade_amt_month_mean_3m) {
		this.trade_amt_month_mean_3m = trade_amt_month_mean_3m;
	}
	public BigDecimal getTrade_cnt_month_mean_6m() {
		return trade_cnt_month_mean_6m;
	}
	public void setTrade_cnt_month_mean_6m(BigDecimal trade_cnt_month_mean_6m) {
		this.trade_cnt_month_mean_6m = trade_cnt_month_mean_6m;
	}
	public BigDecimal getTrade_cnt_month_mean_3m() {
		return trade_cnt_month_mean_3m;
	}
	public void setTrade_cnt_month_mean_3m(BigDecimal trade_cnt_month_mean_3m) {
		this.trade_cnt_month_mean_3m = trade_cnt_month_mean_3m;
	}
	public BigDecimal getTrade_time_span_stab_6m() {
		return trade_time_span_stab_6m;
	}
	public void setTrade_time_span_stab_6m(BigDecimal trade_time_span_stab_6m) {
		this.trade_time_span_stab_6m = trade_time_span_stab_6m;
	}
	public BigDecimal getTrade_amt_day_max_6m() {
		return trade_amt_day_max_6m;
	}
	public void setTrade_amt_day_max_6m(BigDecimal trade_amt_day_max_6m) {
		this.trade_amt_day_max_6m = trade_amt_day_max_6m;
	}
	public BigDecimal getTrade_amt_day_max_3m() {
		return trade_amt_day_max_3m;
	}
	public void setTrade_amt_day_max_3m(BigDecimal trade_amt_day_max_3m) {
		this.trade_amt_day_max_3m = trade_amt_day_max_3m;
	}
	public BigDecimal getTrade_amt_day_max_1m() {
		return trade_amt_day_max_1m;
	}
	public void setTrade_amt_day_max_1m(BigDecimal trade_amt_day_max_1m) {
		this.trade_amt_day_max_1m = trade_amt_day_max_1m;
	}
	public Integer getTrade_cnt_day_max_6m() {
		return trade_cnt_day_max_6m;
	}
	public void setTrade_cnt_day_max_6m(Integer trade_cnt_day_max_6m) {
		this.trade_cnt_day_max_6m = trade_cnt_day_max_6m;
	}
	public Integer getTrade_cnt_day_max_3m() {
		return trade_cnt_day_max_3m;
	}
	public void setTrade_cnt_day_max_3m(Integer trade_cnt_day_max_3m) {
		this.trade_cnt_day_max_3m = trade_cnt_day_max_3m;
	}
	public Integer getTrade_cnt_day_max_1m() {
		return trade_cnt_day_max_1m;
	}
	public void setTrade_cnt_day_max_1m(Integer trade_cnt_day_max_1m) {
		this.trade_cnt_day_max_1m = trade_cnt_day_max_1m;
	}
	public BigDecimal getTrade_amt_max_6m() {
		return trade_amt_max_6m;
	}
	public void setTrade_amt_max_6m(BigDecimal trade_amt_max_6m) {
		this.trade_amt_max_6m = trade_amt_max_6m;
	}
	public BigDecimal getTrade_amt_min_6m() {
		return trade_amt_min_6m;
	}
	public void setTrade_amt_min_6m(BigDecimal trade_amt_min_6m) {
		this.trade_amt_min_6m = trade_amt_min_6m;
	}
	public BigDecimal getTrade_amt_mean_6m() {
		return trade_amt_mean_6m;
	}
	public void setTrade_amt_mean_6m(BigDecimal trade_amt_mean_6m) {
		this.trade_amt_mean_6m = trade_amt_mean_6m;
	}
	public BigDecimal getTrade_amt_max_3m() {
		return trade_amt_max_3m;
	}
	public void setTrade_amt_max_3m(BigDecimal trade_amt_max_3m) {
		this.trade_amt_max_3m = trade_amt_max_3m;
	}
	public BigDecimal getTrade_amt_min_3m() {
		return trade_amt_min_3m;
	}
	public void setTrade_amt_min_3m(BigDecimal trade_amt_min_3m) {
		this.trade_amt_min_3m = trade_amt_min_3m;
	}
	public BigDecimal getTrade_amt_mean_3m() {
		return trade_amt_mean_3m;
	}
	public void setTrade_amt_mean_3m(BigDecimal trade_amt_mean_3m) {
		this.trade_amt_mean_3m = trade_amt_mean_3m;
	}
	public BigDecimal getTrade_amt_max_1m() {
		return trade_amt_max_1m;
	}
	public void setTrade_amt_max_1m(BigDecimal trade_amt_max_1m) {
		this.trade_amt_max_1m = trade_amt_max_1m;
	}
	public BigDecimal getTrade_amt_min_1m() {
		return trade_amt_min_1m;
	}
	public void setTrade_amt_min_1m(BigDecimal trade_amt_min_1m) {
		this.trade_amt_min_1m = trade_amt_min_1m;
	}
	public BigDecimal getTrade_amt_mean_1m() {
		return trade_amt_mean_1m;
	}
	public void setTrade_amt_mean_1m(BigDecimal trade_amt_mean_1m) {
		this.trade_amt_mean_1m = trade_amt_mean_1m;
	}
	public BigDecimal getTrade_amt_sum_6m() {
		return trade_amt_sum_6m;
	}
	public void setTrade_amt_sum_6m(BigDecimal trade_amt_sum_6m) {
		this.trade_amt_sum_6m = trade_amt_sum_6m;
	}
	public BigDecimal getTrade_amt_sum_3m() {
		return trade_amt_sum_3m;
	}
	public void setTrade_amt_sum_3m(BigDecimal trade_amt_sum_3m) {
		this.trade_amt_sum_3m = trade_amt_sum_3m;
	}
	public BigDecimal getTrade_amt_sum_1m() {
		return trade_amt_sum_1m;
	}
	public void setTrade_amt_sum_1m(BigDecimal trade_amt_sum_1m) {
		this.trade_amt_sum_1m = trade_amt_sum_1m;
	}
	public BigDecimal getTrade_cnt_sum_6m() {
		return trade_cnt_sum_6m;
	}
	public void setTrade_cnt_sum_6m(BigDecimal trade_cnt_sum_6m) {
		this.trade_cnt_sum_6m = trade_cnt_sum_6m;
	}
	public BigDecimal getTrade_cnt_sum_3m() {
		return trade_cnt_sum_3m;
	}
	public void setTrade_cnt_sum_3m(BigDecimal trade_cnt_sum_3m) {
		this.trade_cnt_sum_3m = trade_cnt_sum_3m;
	}
	public BigDecimal getTrade_cnt_sum_1m() {
		return trade_cnt_sum_1m;
	}
	public void setTrade_cnt_sum_1m(BigDecimal trade_cnt_sum_1m) {
		this.trade_cnt_sum_1m = trade_cnt_sum_1m;
	}
	public BigDecimal getTrade_time_span_max_6m() {
		return trade_time_span_max_6m;
	}
	public void setTrade_time_span_max_6m(BigDecimal trade_time_span_max_6m) {
		this.trade_time_span_max_6m = trade_time_span_max_6m;
	}
	public BigDecimal getTrade_time_span_min_6m() {
		return trade_time_span_min_6m;
	}
	public void setTrade_time_span_min_6m(BigDecimal trade_time_span_min_6m) {
		this.trade_time_span_min_6m = trade_time_span_min_6m;
	}
	public BigDecimal getTrade_time_span_mean_6m() {
		return trade_time_span_mean_6m;
	}
	public void setTrade_time_span_mean_6m(BigDecimal trade_time_span_mean_6m) {
		this.trade_time_span_mean_6m = trade_time_span_mean_6m;
	}
	public BigDecimal getTrade_lottery_order_amt_sum_1m() {
		return trade_lottery_order_amt_sum_1m;
	}
	public void setTrade_lottery_order_amt_sum_1m(BigDecimal trade_lottery_order_amt_sum_1m) {
		this.trade_lottery_order_amt_sum_1m = trade_lottery_order_amt_sum_1m;
	}
	public BigDecimal getTrade_lottery_order_amt_mean_1m() {
		return trade_lottery_order_amt_mean_1m;
	}
	public void setTrade_lottery_order_amt_mean_1m(BigDecimal trade_lottery_order_amt_mean_1m) {
		this.trade_lottery_order_amt_mean_1m = trade_lottery_order_amt_mean_1m;
	}
	public BigDecimal getTrade_lottery_order_amt_max_1m() {
		return trade_lottery_order_amt_max_1m;
	}
	public void setTrade_lottery_order_amt_max_1m(BigDecimal trade_lottery_order_amt_max_1m) {
		this.trade_lottery_order_amt_max_1m = trade_lottery_order_amt_max_1m;
	}
	public BigDecimal getTrade_lottery_order_amt_sum_prop_1m() {
		return trade_lottery_order_amt_sum_prop_1m;
	}
	public void setTrade_lottery_order_amt_sum_prop_1m(BigDecimal trade_lottery_order_amt_sum_prop_1m) {
		this.trade_lottery_order_amt_sum_prop_1m = trade_lottery_order_amt_sum_prop_1m;
	}
	public Integer getTrade_lottery_order_cnt_sum_1m() {
		return trade_lottery_order_cnt_sum_1m;
	}
	public void setTrade_lottery_order_cnt_sum_1m(Integer trade_lottery_order_cnt_sum_1m) {
		this.trade_lottery_order_cnt_sum_1m = trade_lottery_order_cnt_sum_1m;
	}
	public BigDecimal getTrade_lottery_order_cnt_sum_prop_1m() {
		return trade_lottery_order_cnt_sum_prop_1m;
	}
	public void setTrade_lottery_order_cnt_sum_prop_1m(BigDecimal trade_lottery_order_cnt_sum_prop_1m) {
		this.trade_lottery_order_cnt_sum_prop_1m = trade_lottery_order_cnt_sum_prop_1m;
	}
	public BigDecimal getTrade_lottery_order_amt_sum_3m() {
		return trade_lottery_order_amt_sum_3m;
	}
	public void setTrade_lottery_order_amt_sum_3m(BigDecimal trade_lottery_order_amt_sum_3m) {
		this.trade_lottery_order_amt_sum_3m = trade_lottery_order_amt_sum_3m;
	}
	public BigDecimal getTrade_lottery_order_amt_mean_3m() {
		return trade_lottery_order_amt_mean_3m;
	}
	public void setTrade_lottery_order_amt_mean_3m(BigDecimal trade_lottery_order_amt_mean_3m) {
		this.trade_lottery_order_amt_mean_3m = trade_lottery_order_amt_mean_3m;
	}
	public BigDecimal getTrade_lottery_order_amt_max_3m() {
		return trade_lottery_order_amt_max_3m;
	}
	public void setTrade_lottery_order_amt_max_3m(BigDecimal trade_lottery_order_amt_max_3m) {
		this.trade_lottery_order_amt_max_3m = trade_lottery_order_amt_max_3m;
	}
	public BigDecimal getTrade_lottery_order_amt_sum_prop_3m() {
		return trade_lottery_order_amt_sum_prop_3m;
	}
	public void setTrade_lottery_order_amt_sum_prop_3m(BigDecimal trade_lottery_order_amt_sum_prop_3m) {
		this.trade_lottery_order_amt_sum_prop_3m = trade_lottery_order_amt_sum_prop_3m;
	}
	public Integer getTrade_lottery_order_cnt_sum_3m() {
		return trade_lottery_order_cnt_sum_3m;
	}
	public void setTrade_lottery_order_cnt_sum_3m(Integer trade_lottery_order_cnt_sum_3m) {
		this.trade_lottery_order_cnt_sum_3m = trade_lottery_order_cnt_sum_3m;
	}
	public BigDecimal getTrade_lottery_order_cnt_sum_prop_3m() {
		return trade_lottery_order_cnt_sum_prop_3m;
	}
	public void setTrade_lottery_order_cnt_sum_prop_3m(BigDecimal trade_lottery_order_cnt_sum_prop_3m) {
		this.trade_lottery_order_cnt_sum_prop_3m = trade_lottery_order_cnt_sum_prop_3m;
	}
	public BigDecimal getTrade_lottery_order_amt_sum_6m() {
		return trade_lottery_order_amt_sum_6m;
	}
	public void setTrade_lottery_order_amt_sum_6m(BigDecimal trade_lottery_order_amt_sum_6m) {
		this.trade_lottery_order_amt_sum_6m = trade_lottery_order_amt_sum_6m;
	}
	public BigDecimal getTrade_lottery_order_amt_mean_6m() {
		return trade_lottery_order_amt_mean_6m;
	}
	public void setTrade_lottery_order_amt_mean_6m(BigDecimal trade_lottery_order_amt_mean_6m) {
		this.trade_lottery_order_amt_mean_6m = trade_lottery_order_amt_mean_6m;
	}
	public BigDecimal getTrade_lottery_order_amt_max_6m() {
		return trade_lottery_order_amt_max_6m;
	}
	public void setTrade_lottery_order_amt_max_6m(BigDecimal trade_lottery_order_amt_max_6m) {
		this.trade_lottery_order_amt_max_6m = trade_lottery_order_amt_max_6m;
	}
	public BigDecimal getTrade_lottery_order_amt_sum_prop_6m() {
		return trade_lottery_order_amt_sum_prop_6m;
	}
	public void setTrade_lottery_order_amt_sum_prop_6m(BigDecimal trade_lottery_order_amt_sum_prop_6m) {
		this.trade_lottery_order_amt_sum_prop_6m = trade_lottery_order_amt_sum_prop_6m;
	}
	public Integer getTrade_lottery_order_cnt_sum_6m() {
		return trade_lottery_order_cnt_sum_6m;
	}
	public void setTrade_lottery_order_cnt_sum_6m(Integer trade_lottery_order_cnt_sum_6m) {
		this.trade_lottery_order_cnt_sum_6m = trade_lottery_order_cnt_sum_6m;
	}
	public BigDecimal getTrade_lottery_order_cnt_sum_prop_6m() {
		return trade_lottery_order_cnt_sum_prop_6m;
	}
	public void setTrade_lottery_order_cnt_sum_prop_6m(BigDecimal trade_lottery_order_cnt_sum_prop_6m) {
		this.trade_lottery_order_cnt_sum_prop_6m = trade_lottery_order_cnt_sum_prop_6m;
	}
	public Integer getTrade_cheat_order_cnt_sum_1m() {
		return trade_cheat_order_cnt_sum_1m;
	}
	public void setTrade_cheat_order_cnt_sum_1m(Integer trade_cheat_order_cnt_sum_1m) {
		this.trade_cheat_order_cnt_sum_1m = trade_cheat_order_cnt_sum_1m;
	}
	public Integer getTrade_cheat_order_cnt_sum_2m() {
		return trade_cheat_order_cnt_sum_2m;
	}
	public void setTrade_cheat_order_cnt_sum_2m(Integer trade_cheat_order_cnt_sum_2m) {
		this.trade_cheat_order_cnt_sum_2m = trade_cheat_order_cnt_sum_2m;
	}
	public Integer getTrade_cheat_order_cnt_sum_3m() {
		return trade_cheat_order_cnt_sum_3m;
	}
	public void setTrade_cheat_order_cnt_sum_3m(Integer trade_cheat_order_cnt_sum_3m) {
		this.trade_cheat_order_cnt_sum_3m = trade_cheat_order_cnt_sum_3m;
	}
	public Integer getTrade_gambling_order_cnt_sum_1m() {
		return trade_gambling_order_cnt_sum_1m;
	}
	public void setTrade_gambling_order_cnt_sum_1m(Integer trade_gambling_order_cnt_sum_1m) {
		this.trade_gambling_order_cnt_sum_1m = trade_gambling_order_cnt_sum_1m;
	}
	public Integer getTrade_gambling_order_cnt_sum_3m() {
		return trade_gambling_order_cnt_sum_3m;
	}
	public void setTrade_gambling_order_cnt_sum_3m(Integer trade_gambling_order_cnt_sum_3m) {
		this.trade_gambling_order_cnt_sum_3m = trade_gambling_order_cnt_sum_3m;
	}
	public Integer getTrade_gambling_order_cnt_sum_6m() {
		return trade_gambling_order_cnt_sum_6m;
	}
	public void setTrade_gambling_order_cnt_sum_6m(Integer trade_gambling_order_cnt_sum_6m) {
		this.trade_gambling_order_cnt_sum_6m = trade_gambling_order_cnt_sum_6m;
	}
	public Integer getTrade_drug_order_cnt_sum_1m() {
		return trade_drug_order_cnt_sum_1m;
	}
	public void setTrade_drug_order_cnt_sum_1m(Integer trade_drug_order_cnt_sum_1m) {
		this.trade_drug_order_cnt_sum_1m = trade_drug_order_cnt_sum_1m;
	}
	public Integer getTrade_drug_order_cnt_sum_2m() {
		return trade_drug_order_cnt_sum_2m;
	}
	public void setTrade_drug_order_cnt_sum_2m(Integer trade_drug_order_cnt_sum_2m) {
		this.trade_drug_order_cnt_sum_2m = trade_drug_order_cnt_sum_2m;
	}
	public Integer getTrade_drug_order_cnt_sum_6m() {
		return trade_drug_order_cnt_sum_6m;
	}
	public void setTrade_drug_order_cnt_sum_6m(Integer trade_drug_order_cnt_sum_6m) {
		this.trade_drug_order_cnt_sum_6m = trade_drug_order_cnt_sum_6m;
	}
	public Integer getTrade_cashout_order_cnt_sum_1m() {
		return trade_cashout_order_cnt_sum_1m;
	}
	public void setTrade_cashout_order_cnt_sum_1m(Integer trade_cashout_order_cnt_sum_1m) {
		this.trade_cashout_order_cnt_sum_1m = trade_cashout_order_cnt_sum_1m;
	}
	public Integer getTrade_cashout_order_cnt_sum_3m() {
		return trade_cashout_order_cnt_sum_3m;
	}
	public void setTrade_cashout_order_cnt_sum_3m(Integer trade_cashout_order_cnt_sum_3m) {
		this.trade_cashout_order_cnt_sum_3m = trade_cashout_order_cnt_sum_3m;
	}
	public Integer getTrade_cashout_order_cnt_sum_6m() {
		return trade_cashout_order_cnt_sum_6m;
	}
	public void setTrade_cashout_order_cnt_sum_6m(Integer trade_cashout_order_cnt_sum_6m) {
		this.trade_cashout_order_cnt_sum_6m = trade_cashout_order_cnt_sum_6m;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((bank_card_num == null) ? 0 : bank_card_num.hashCode());
		result = prime * result + ((bank_num == null) ? 0 : bank_num.hashCode());
		result = prime * result + ((credit_card_num == null) ? 0 : credit_card_num.hashCode());
		result = prime * result + ((credit_card_prop == null) ? 0 : credit_card_prop.hashCode());
		result = prime * result + ((debit_card_num == null) ? 0 : debit_card_num.hashCode());
		result = prime * result + ((debit_card_prop == null) ? 0 : debit_card_prop.hashCode());
		result = prime * result + ((default_addr_city_level == null) ? 0 : default_addr_city_level.hashCode());
		result = prime * result + ((diff_receive_addr_num_1y == null) ? 0 : diff_receive_addr_num_1y.hashCode());
		result = prime * result + ((diff_receive_addr_num_3m == null) ? 0 : diff_receive_addr_num_3m.hashCode());
		result = prime * result + ((diff_receive_addr_num_6m == null) ? 0 : diff_receive_addr_num_6m.hashCode());
		result = prime * result + ((diff_receive_phone_num_1y == null) ? 0 : diff_receive_phone_num_1y.hashCode());
		result = prime * result + ((diff_receive_phone_num_3m == null) ? 0 : diff_receive_phone_num_3m.hashCode());
		result = prime * result + ((diff_receive_phone_num_6m == null) ? 0 : diff_receive_phone_num_6m.hashCode());
		result = prime * result + ((diff_receive_user_num_1y == null) ? 0 : diff_receive_user_num_1y.hashCode());
		result = prime * result + ((diff_receive_user_num_3m == null) ? 0 : diff_receive_user_num_3m.hashCode());
		result = prime * result + ((diff_receive_user_num_6m == null) ? 0 : diff_receive_user_num_6m.hashCode());
		result = prime * result + ((oneself_receive_addr_num == null) ? 0 : oneself_receive_addr_num.hashCode());
		result = prime * result + ((oneself_receive_phone_num == null) ? 0 : oneself_receive_phone_num.hashCode());
		result = prime * result + ((onself_order_num_1y == null) ? 0 : onself_order_num_1y.hashCode());
		result = prime * result + ((onself_order_num_3m == null) ? 0 : onself_order_num_3m.hashCode());
		result = prime * result + ((onself_order_num_6m == null) ? 0 : onself_order_num_6m.hashCode());
		result = prime * result + ((onself_order_num_prop_1y == null) ? 0 : onself_order_num_prop_1y.hashCode());
		result = prime * result + ((onself_order_num_prop_3m == null) ? 0 : onself_order_num_prop_3m.hashCode());
		result = prime * result + ((onself_order_num_prop_6m == null) ? 0 : onself_order_num_prop_6m.hashCode());
		result = prime * result + ((onself_receive_addr_num_1y == null) ? 0 : onself_receive_addr_num_1y.hashCode());
		result = prime * result + ((onself_receive_addr_num_3m == null) ? 0 : onself_receive_addr_num_3m.hashCode());
		result = prime * result + ((onself_receive_addr_num_6m == null) ? 0 : onself_receive_addr_num_6m.hashCode());
		result = prime * result + ((phone_receive_addr_num_1y == null) ? 0 : phone_receive_addr_num_1y.hashCode());
		result = prime * result + ((phone_receive_addr_num_3m == null) ? 0 : phone_receive_addr_num_3m.hashCode());
		result = prime * result + ((phone_receive_addr_num_6m == null) ? 0 : phone_receive_addr_num_6m.hashCode());
		result = prime * result + ((phone_receive_order_num_1y == null) ? 0 : phone_receive_order_num_1y.hashCode());
		result = prime * result + ((phone_receive_order_num_3m == null) ? 0 : phone_receive_order_num_3m.hashCode());
		result = prime * result + ((phone_receive_order_num_6m == null) ? 0 : phone_receive_order_num_6m.hashCode());
		result = prime * result + ((phone_stab_days_1y == null) ? 0 : phone_stab_days_1y.hashCode());
		result = prime * result + ((phone_use_num_1y == null) ? 0 : phone_use_num_1y.hashCode());
		result = prime * result
				+ ((receive_addr_first_tier_city_num_1y == null) ? 0 : receive_addr_first_tier_city_num_1y.hashCode());
		result = prime * result
				+ ((receive_addr_first_tier_city_num_3m == null) ? 0 : receive_addr_first_tier_city_num_3m.hashCode());
		result = prime * result
				+ ((receive_addr_first_tier_city_num_6m == null) ? 0 : receive_addr_first_tier_city_num_6m.hashCode());
		result = prime * result + ((receive_addr_fourth_tier_city_num_1y == null) ? 0
				: receive_addr_fourth_tier_city_num_1y.hashCode());
		result = prime * result + ((receive_addr_fourth_tier_city_num_3m == null) ? 0
				: receive_addr_fourth_tier_city_num_3m.hashCode());
		result = prime * result + ((receive_addr_fourth_tier_city_num_6m == null) ? 0
				: receive_addr_fourth_tier_city_num_6m.hashCode());
		result = prime * result + ((receive_addr_num == null) ? 0 : receive_addr_num.hashCode());
		result = prime * result + ((receive_addr_second_tier_city_num_1y == null) ? 0
				: receive_addr_second_tier_city_num_1y.hashCode());
		result = prime * result + ((receive_addr_second_tier_city_num_3m == null) ? 0
				: receive_addr_second_tier_city_num_3m.hashCode());
		result = prime * result + ((receive_addr_second_tier_city_num_6m == null) ? 0
				: receive_addr_second_tier_city_num_6m.hashCode());
		result = prime * result
				+ ((receive_addr_third_tier_city_num_1y == null) ? 0 : receive_addr_third_tier_city_num_1y.hashCode());
		result = prime * result
				+ ((receive_addr_third_tier_city_num_3m == null) ? 0 : receive_addr_third_tier_city_num_3m.hashCode());
		result = prime * result
				+ ((receive_addr_third_tier_city_num_6m == null) ? 0 : receive_addr_third_tier_city_num_6m.hashCode());
		result = prime * result + ((receive_phone_num == null) ? 0 : receive_phone_num.hashCode());
		result = prime * result + ((receive_user_num == null) ? 0 : receive_user_num.hashCode());
		result = prime * result + ((tb_dawn_order_amt_max_1m == null) ? 0 : tb_dawn_order_amt_max_1m.hashCode());
		result = prime * result + ((tb_dawn_order_amt_max_1y == null) ? 0 : tb_dawn_order_amt_max_1y.hashCode());
		result = prime * result + ((tb_dawn_order_amt_max_3m == null) ? 0 : tb_dawn_order_amt_max_3m.hashCode());
		result = prime * result + ((tb_dawn_order_amt_max_6m == null) ? 0 : tb_dawn_order_amt_max_6m.hashCode());
		result = prime * result
				+ ((tb_dawn_order_amt_month_stab_1y == null) ? 0 : tb_dawn_order_amt_month_stab_1y.hashCode());
		result = prime * result + ((tb_dawn_order_amt_prop_1m == null) ? 0 : tb_dawn_order_amt_prop_1m.hashCode());
		result = prime * result + ((tb_dawn_order_amt_prop_1y == null) ? 0 : tb_dawn_order_amt_prop_1y.hashCode());
		result = prime * result + ((tb_dawn_order_amt_prop_3m == null) ? 0 : tb_dawn_order_amt_prop_3m.hashCode());
		result = prime * result + ((tb_dawn_order_amt_prop_6m == null) ? 0 : tb_dawn_order_amt_prop_6m.hashCode());
		result = prime * result
				+ ((tb_dawn_order_cnt_month_stab_1y == null) ? 0 : tb_dawn_order_cnt_month_stab_1y.hashCode());
		result = prime * result + ((tb_dawn_order_cnt_prop_1m == null) ? 0 : tb_dawn_order_cnt_prop_1m.hashCode());
		result = prime * result + ((tb_dawn_order_cnt_prop_1y == null) ? 0 : tb_dawn_order_cnt_prop_1y.hashCode());
		result = prime * result + ((tb_dawn_order_cnt_prop_3m == null) ? 0 : tb_dawn_order_cnt_prop_3m.hashCode());
		result = prime * result + ((tb_dawn_order_cnt_prop_6m == null) ? 0 : tb_dawn_order_cnt_prop_6m.hashCode());
		result = prime * result + ((tb_daytime_order_amt_max_1m == null) ? 0 : tb_daytime_order_amt_max_1m.hashCode());
		result = prime * result + ((tb_daytime_order_amt_max_1y == null) ? 0 : tb_daytime_order_amt_max_1y.hashCode());
		result = prime * result + ((tb_daytime_order_amt_max_3m == null) ? 0 : tb_daytime_order_amt_max_3m.hashCode());
		result = prime * result + ((tb_daytime_order_amt_max_6m == null) ? 0 : tb_daytime_order_amt_max_6m.hashCode());
		result = prime * result
				+ ((tb_daytime_order_amt_month_stab_1y == null) ? 0 : tb_daytime_order_amt_month_stab_1y.hashCode());
		result = prime * result
				+ ((tb_daytime_order_amt_prop_1m == null) ? 0 : tb_daytime_order_amt_prop_1m.hashCode());
		result = prime * result
				+ ((tb_daytime_order_amt_prop_1y == null) ? 0 : tb_daytime_order_amt_prop_1y.hashCode());
		result = prime * result
				+ ((tb_daytime_order_amt_prop_3m == null) ? 0 : tb_daytime_order_amt_prop_3m.hashCode());
		result = prime * result
				+ ((tb_daytime_order_amt_prop_6m == null) ? 0 : tb_daytime_order_amt_prop_6m.hashCode());
		result = prime * result
				+ ((tb_daytime_order_cnt_month_stab_1y == null) ? 0 : tb_daytime_order_cnt_month_stab_1y.hashCode());
		result = prime * result
				+ ((tb_daytime_order_cnt_prop_1m == null) ? 0 : tb_daytime_order_cnt_prop_1m.hashCode());
		result = prime * result
				+ ((tb_daytime_order_cnt_prop_1y == null) ? 0 : tb_daytime_order_cnt_prop_1y.hashCode());
		result = prime * result
				+ ((tb_daytime_order_cnt_prop_3m == null) ? 0 : tb_daytime_order_cnt_prop_3m.hashCode());
		result = prime * result
				+ ((tb_daytime_order_cnt_prop_6m == null) ? 0 : tb_daytime_order_cnt_prop_6m.hashCode());
		result = prime * result + ((tb_night_order_amt_max_1m == null) ? 0 : tb_night_order_amt_max_1m.hashCode());
		result = prime * result + ((tb_night_order_amt_max_1y == null) ? 0 : tb_night_order_amt_max_1y.hashCode());
		result = prime * result + ((tb_night_order_amt_max_3m == null) ? 0 : tb_night_order_amt_max_3m.hashCode());
		result = prime * result + ((tb_night_order_amt_max_6m == null) ? 0 : tb_night_order_amt_max_6m.hashCode());
		result = prime * result
				+ ((tb_night_order_amt_month_stab_1y == null) ? 0 : tb_night_order_amt_month_stab_1y.hashCode());
		result = prime * result + ((tb_night_order_amt_prop_1m == null) ? 0 : tb_night_order_amt_prop_1m.hashCode());
		result = prime * result + ((tb_night_order_amt_prop_1y == null) ? 0 : tb_night_order_amt_prop_1y.hashCode());
		result = prime * result + ((tb_night_order_amt_prop_3m == null) ? 0 : tb_night_order_amt_prop_3m.hashCode());
		result = prime * result + ((tb_night_order_amt_prop_6m == null) ? 0 : tb_night_order_amt_prop_6m.hashCode());
		result = prime * result
				+ ((tb_night_order_cnt_month_stab_1y == null) ? 0 : tb_night_order_cnt_month_stab_1y.hashCode());
		result = prime * result + ((tb_night_order_cnt_prop_1m == null) ? 0 : tb_night_order_cnt_prop_1m.hashCode());
		result = prime * result + ((tb_night_order_cnt_prop_1y == null) ? 0 : tb_night_order_cnt_prop_1y.hashCode());
		result = prime * result + ((tb_night_order_cnt_prop_3m == null) ? 0 : tb_night_order_cnt_prop_3m.hashCode());
		result = prime * result + ((tb_night_order_cnt_prop_6m == null) ? 0 : tb_night_order_cnt_prop_6m.hashCode());
		result = prime * result + ((trade_amt_day_max_1m == null) ? 0 : trade_amt_day_max_1m.hashCode());
		result = prime * result + ((trade_amt_day_max_3m == null) ? 0 : trade_amt_day_max_3m.hashCode());
		result = prime * result + ((trade_amt_day_max_6m == null) ? 0 : trade_amt_day_max_6m.hashCode());
		result = prime * result + ((trade_amt_max_1m == null) ? 0 : trade_amt_max_1m.hashCode());
		result = prime * result + ((trade_amt_max_3m == null) ? 0 : trade_amt_max_3m.hashCode());
		result = prime * result + ((trade_amt_max_6m == null) ? 0 : trade_amt_max_6m.hashCode());
		result = prime * result + ((trade_amt_mean_1m == null) ? 0 : trade_amt_mean_1m.hashCode());
		result = prime * result + ((trade_amt_mean_3m == null) ? 0 : trade_amt_mean_3m.hashCode());
		result = prime * result + ((trade_amt_mean_6m == null) ? 0 : trade_amt_mean_6m.hashCode());
		result = prime * result + ((trade_amt_min_1m == null) ? 0 : trade_amt_min_1m.hashCode());
		result = prime * result + ((trade_amt_min_3m == null) ? 0 : trade_amt_min_3m.hashCode());
		result = prime * result + ((trade_amt_min_6m == null) ? 0 : trade_amt_min_6m.hashCode());
		result = prime * result + ((trade_amt_month_max_3m == null) ? 0 : trade_amt_month_max_3m.hashCode());
		result = prime * result + ((trade_amt_month_max_6m == null) ? 0 : trade_amt_month_max_6m.hashCode());
		result = prime * result + ((trade_amt_month_mean_3m == null) ? 0 : trade_amt_month_mean_3m.hashCode());
		result = prime * result + ((trade_amt_month_mean_6m == null) ? 0 : trade_amt_month_mean_6m.hashCode());
		result = prime * result + ((trade_amt_sum_1m == null) ? 0 : trade_amt_sum_1m.hashCode());
		result = prime * result + ((trade_amt_sum_3m == null) ? 0 : trade_amt_sum_3m.hashCode());
		result = prime * result + ((trade_amt_sum_6m == null) ? 0 : trade_amt_sum_6m.hashCode());
		result = prime * result
				+ ((trade_cashout_order_cnt_sum_1m == null) ? 0 : trade_cashout_order_cnt_sum_1m.hashCode());
		result = prime * result
				+ ((trade_cashout_order_cnt_sum_3m == null) ? 0 : trade_cashout_order_cnt_sum_3m.hashCode());
		result = prime * result
				+ ((trade_cashout_order_cnt_sum_6m == null) ? 0 : trade_cashout_order_cnt_sum_6m.hashCode());
		result = prime * result
				+ ((trade_cheat_order_cnt_sum_1m == null) ? 0 : trade_cheat_order_cnt_sum_1m.hashCode());
		result = prime * result
				+ ((trade_cheat_order_cnt_sum_2m == null) ? 0 : trade_cheat_order_cnt_sum_2m.hashCode());
		result = prime * result
				+ ((trade_cheat_order_cnt_sum_3m == null) ? 0 : trade_cheat_order_cnt_sum_3m.hashCode());
		result = prime * result + ((trade_cnt_day_max_1m == null) ? 0 : trade_cnt_day_max_1m.hashCode());
		result = prime * result + ((trade_cnt_day_max_3m == null) ? 0 : trade_cnt_day_max_3m.hashCode());
		result = prime * result + ((trade_cnt_day_max_6m == null) ? 0 : trade_cnt_day_max_6m.hashCode());
		result = prime * result + ((trade_cnt_month_max_3m == null) ? 0 : trade_cnt_month_max_3m.hashCode());
		result = prime * result + ((trade_cnt_month_max_6m == null) ? 0 : trade_cnt_month_max_6m.hashCode());
		result = prime * result + ((trade_cnt_month_mean_3m == null) ? 0 : trade_cnt_month_mean_3m.hashCode());
		result = prime * result + ((trade_cnt_month_mean_6m == null) ? 0 : trade_cnt_month_mean_6m.hashCode());
		result = prime * result + ((trade_cnt_sum_1m == null) ? 0 : trade_cnt_sum_1m.hashCode());
		result = prime * result + ((trade_cnt_sum_3m == null) ? 0 : trade_cnt_sum_3m.hashCode());
		result = prime * result + ((trade_cnt_sum_6m == null) ? 0 : trade_cnt_sum_6m.hashCode());
		result = prime * result + ((trade_dawn_amt_max_6m == null) ? 0 : trade_dawn_amt_max_6m.hashCode());
		result = prime * result
				+ ((trade_dawn_amt_month_stab_6m == null) ? 0 : trade_dawn_amt_month_stab_6m.hashCode());
		result = prime * result + ((trade_dawn_amt_prop_6m == null) ? 0 : trade_dawn_amt_prop_6m.hashCode());
		result = prime * result
				+ ((trade_dawn_cnt_month_stab_6m == null) ? 0 : trade_dawn_cnt_month_stab_6m.hashCode());
		result = prime * result + ((trade_dawn_cnt_prop_6m == null) ? 0 : trade_dawn_cnt_prop_6m.hashCode());
		result = prime * result + ((trade_daytime_amt_max_6m == null) ? 0 : trade_daytime_amt_max_6m.hashCode());
		result = prime * result
				+ ((trade_daytime_amt_month_stab_6m == null) ? 0 : trade_daytime_amt_month_stab_6m.hashCode());
		result = prime * result + ((trade_daytime_amt_prop_6m == null) ? 0 : trade_daytime_amt_prop_6m.hashCode());
		result = prime * result
				+ ((trade_daytime_cnt_month_stab_6m == null) ? 0 : trade_daytime_cnt_month_stab_6m.hashCode());
		result = prime * result + ((trade_daytime_cnt_prop_6m == null) ? 0 : trade_daytime_cnt_prop_6m.hashCode());
		result = prime * result + ((trade_drug_order_cnt_sum_1m == null) ? 0 : trade_drug_order_cnt_sum_1m.hashCode());
		result = prime * result + ((trade_drug_order_cnt_sum_2m == null) ? 0 : trade_drug_order_cnt_sum_2m.hashCode());
		result = prime * result + ((trade_drug_order_cnt_sum_6m == null) ? 0 : trade_drug_order_cnt_sum_6m.hashCode());
		result = prime * result
				+ ((trade_gambling_order_cnt_sum_1m == null) ? 0 : trade_gambling_order_cnt_sum_1m.hashCode());
		result = prime * result
				+ ((trade_gambling_order_cnt_sum_3m == null) ? 0 : trade_gambling_order_cnt_sum_3m.hashCode());
		result = prime * result
				+ ((trade_gambling_order_cnt_sum_6m == null) ? 0 : trade_gambling_order_cnt_sum_6m.hashCode());
		result = prime * result
				+ ((trade_lottery_order_amt_max_1m == null) ? 0 : trade_lottery_order_amt_max_1m.hashCode());
		result = prime * result
				+ ((trade_lottery_order_amt_max_3m == null) ? 0 : trade_lottery_order_amt_max_3m.hashCode());
		result = prime * result
				+ ((trade_lottery_order_amt_max_6m == null) ? 0 : trade_lottery_order_amt_max_6m.hashCode());
		result = prime * result
				+ ((trade_lottery_order_amt_mean_1m == null) ? 0 : trade_lottery_order_amt_mean_1m.hashCode());
		result = prime * result
				+ ((trade_lottery_order_amt_mean_3m == null) ? 0 : trade_lottery_order_amt_mean_3m.hashCode());
		result = prime * result
				+ ((trade_lottery_order_amt_mean_6m == null) ? 0 : trade_lottery_order_amt_mean_6m.hashCode());
		result = prime * result
				+ ((trade_lottery_order_amt_sum_1m == null) ? 0 : trade_lottery_order_amt_sum_1m.hashCode());
		result = prime * result
				+ ((trade_lottery_order_amt_sum_3m == null) ? 0 : trade_lottery_order_amt_sum_3m.hashCode());
		result = prime * result
				+ ((trade_lottery_order_amt_sum_6m == null) ? 0 : trade_lottery_order_amt_sum_6m.hashCode());
		result = prime * result
				+ ((trade_lottery_order_amt_sum_prop_1m == null) ? 0 : trade_lottery_order_amt_sum_prop_1m.hashCode());
		result = prime * result
				+ ((trade_lottery_order_amt_sum_prop_3m == null) ? 0 : trade_lottery_order_amt_sum_prop_3m.hashCode());
		result = prime * result
				+ ((trade_lottery_order_amt_sum_prop_6m == null) ? 0 : trade_lottery_order_amt_sum_prop_6m.hashCode());
		result = prime * result
				+ ((trade_lottery_order_cnt_sum_1m == null) ? 0 : trade_lottery_order_cnt_sum_1m.hashCode());
		result = prime * result
				+ ((trade_lottery_order_cnt_sum_3m == null) ? 0 : trade_lottery_order_cnt_sum_3m.hashCode());
		result = prime * result
				+ ((trade_lottery_order_cnt_sum_6m == null) ? 0 : trade_lottery_order_cnt_sum_6m.hashCode());
		result = prime * result
				+ ((trade_lottery_order_cnt_sum_prop_1m == null) ? 0 : trade_lottery_order_cnt_sum_prop_1m.hashCode());
		result = prime * result
				+ ((trade_lottery_order_cnt_sum_prop_3m == null) ? 0 : trade_lottery_order_cnt_sum_prop_3m.hashCode());
		result = prime * result
				+ ((trade_lottery_order_cnt_sum_prop_6m == null) ? 0 : trade_lottery_order_cnt_sum_prop_6m.hashCode());
		result = prime * result + ((trade_night_amt_max_6m == null) ? 0 : trade_night_amt_max_6m.hashCode());
		result = prime * result
				+ ((trade_night_amt_month_stab_6m == null) ? 0 : trade_night_amt_month_stab_6m.hashCode());
		result = prime * result + ((trade_night_amt_prop_6m == null) ? 0 : trade_night_amt_prop_6m.hashCode());
		result = prime * result
				+ ((trade_night_cnt_month_stab_6m == null) ? 0 : trade_night_cnt_month_stab_6m.hashCode());
		result = prime * result + ((trade_night_cnt_prop_6m == null) ? 0 : trade_night_cnt_prop_6m.hashCode());
		result = prime * result + ((trade_time_span_max_6m == null) ? 0 : trade_time_span_max_6m.hashCode());
		result = prime * result + ((trade_time_span_mean_6m == null) ? 0 : trade_time_span_mean_6m.hashCode());
		result = prime * result + ((trade_time_span_min_6m == null) ? 0 : trade_time_span_min_6m.hashCode());
		result = prime * result + ((trade_time_span_stab_6m == null) ? 0 : trade_time_span_stab_6m.hashCode());
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
		ecommerce_risk_rpt other = (ecommerce_risk_rpt) obj;
		if (bank_card_num == null) {
			if (other.bank_card_num != null)
				return false;
		} else if (!bank_card_num.equals(other.bank_card_num))
			return false;
		if (bank_num == null) {
			if (other.bank_num != null)
				return false;
		} else if (!bank_num.equals(other.bank_num))
			return false;
		if (credit_card_num == null) {
			if (other.credit_card_num != null)
				return false;
		} else if (!credit_card_num.equals(other.credit_card_num))
			return false;
		if (credit_card_prop == null) {
			if (other.credit_card_prop != null)
				return false;
		} else if (!credit_card_prop.equals(other.credit_card_prop))
			return false;
		if (debit_card_num == null) {
			if (other.debit_card_num != null)
				return false;
		} else if (!debit_card_num.equals(other.debit_card_num))
			return false;
		if (debit_card_prop == null) {
			if (other.debit_card_prop != null)
				return false;
		} else if (!debit_card_prop.equals(other.debit_card_prop))
			return false;
		if (default_addr_city_level == null) {
			if (other.default_addr_city_level != null)
				return false;
		} else if (!default_addr_city_level.equals(other.default_addr_city_level))
			return false;
		if (diff_receive_addr_num_1y == null) {
			if (other.diff_receive_addr_num_1y != null)
				return false;
		} else if (!diff_receive_addr_num_1y.equals(other.diff_receive_addr_num_1y))
			return false;
		if (diff_receive_addr_num_3m == null) {
			if (other.diff_receive_addr_num_3m != null)
				return false;
		} else if (!diff_receive_addr_num_3m.equals(other.diff_receive_addr_num_3m))
			return false;
		if (diff_receive_addr_num_6m == null) {
			if (other.diff_receive_addr_num_6m != null)
				return false;
		} else if (!diff_receive_addr_num_6m.equals(other.diff_receive_addr_num_6m))
			return false;
		if (diff_receive_phone_num_1y == null) {
			if (other.diff_receive_phone_num_1y != null)
				return false;
		} else if (!diff_receive_phone_num_1y.equals(other.diff_receive_phone_num_1y))
			return false;
		if (diff_receive_phone_num_3m == null) {
			if (other.diff_receive_phone_num_3m != null)
				return false;
		} else if (!diff_receive_phone_num_3m.equals(other.diff_receive_phone_num_3m))
			return false;
		if (diff_receive_phone_num_6m == null) {
			if (other.diff_receive_phone_num_6m != null)
				return false;
		} else if (!diff_receive_phone_num_6m.equals(other.diff_receive_phone_num_6m))
			return false;
		if (diff_receive_user_num_1y == null) {
			if (other.diff_receive_user_num_1y != null)
				return false;
		} else if (!diff_receive_user_num_1y.equals(other.diff_receive_user_num_1y))
			return false;
		if (diff_receive_user_num_3m == null) {
			if (other.diff_receive_user_num_3m != null)
				return false;
		} else if (!diff_receive_user_num_3m.equals(other.diff_receive_user_num_3m))
			return false;
		if (diff_receive_user_num_6m == null) {
			if (other.diff_receive_user_num_6m != null)
				return false;
		} else if (!diff_receive_user_num_6m.equals(other.diff_receive_user_num_6m))
			return false;
		if (oneself_receive_addr_num == null) {
			if (other.oneself_receive_addr_num != null)
				return false;
		} else if (!oneself_receive_addr_num.equals(other.oneself_receive_addr_num))
			return false;
		if (oneself_receive_phone_num == null) {
			if (other.oneself_receive_phone_num != null)
				return false;
		} else if (!oneself_receive_phone_num.equals(other.oneself_receive_phone_num))
			return false;
		if (onself_order_num_1y == null) {
			if (other.onself_order_num_1y != null)
				return false;
		} else if (!onself_order_num_1y.equals(other.onself_order_num_1y))
			return false;
		if (onself_order_num_3m == null) {
			if (other.onself_order_num_3m != null)
				return false;
		} else if (!onself_order_num_3m.equals(other.onself_order_num_3m))
			return false;
		if (onself_order_num_6m == null) {
			if (other.onself_order_num_6m != null)
				return false;
		} else if (!onself_order_num_6m.equals(other.onself_order_num_6m))
			return false;
		if (onself_order_num_prop_1y == null) {
			if (other.onself_order_num_prop_1y != null)
				return false;
		} else if (!onself_order_num_prop_1y.equals(other.onself_order_num_prop_1y))
			return false;
		if (onself_order_num_prop_3m == null) {
			if (other.onself_order_num_prop_3m != null)
				return false;
		} else if (!onself_order_num_prop_3m.equals(other.onself_order_num_prop_3m))
			return false;
		if (onself_order_num_prop_6m == null) {
			if (other.onself_order_num_prop_6m != null)
				return false;
		} else if (!onself_order_num_prop_6m.equals(other.onself_order_num_prop_6m))
			return false;
		if (onself_receive_addr_num_1y == null) {
			if (other.onself_receive_addr_num_1y != null)
				return false;
		} else if (!onself_receive_addr_num_1y.equals(other.onself_receive_addr_num_1y))
			return false;
		if (onself_receive_addr_num_3m == null) {
			if (other.onself_receive_addr_num_3m != null)
				return false;
		} else if (!onself_receive_addr_num_3m.equals(other.onself_receive_addr_num_3m))
			return false;
		if (onself_receive_addr_num_6m == null) {
			if (other.onself_receive_addr_num_6m != null)
				return false;
		} else if (!onself_receive_addr_num_6m.equals(other.onself_receive_addr_num_6m))
			return false;
		if (phone_receive_addr_num_1y == null) {
			if (other.phone_receive_addr_num_1y != null)
				return false;
		} else if (!phone_receive_addr_num_1y.equals(other.phone_receive_addr_num_1y))
			return false;
		if (phone_receive_addr_num_3m == null) {
			if (other.phone_receive_addr_num_3m != null)
				return false;
		} else if (!phone_receive_addr_num_3m.equals(other.phone_receive_addr_num_3m))
			return false;
		if (phone_receive_addr_num_6m == null) {
			if (other.phone_receive_addr_num_6m != null)
				return false;
		} else if (!phone_receive_addr_num_6m.equals(other.phone_receive_addr_num_6m))
			return false;
		if (phone_receive_order_num_1y == null) {
			if (other.phone_receive_order_num_1y != null)
				return false;
		} else if (!phone_receive_order_num_1y.equals(other.phone_receive_order_num_1y))
			return false;
		if (phone_receive_order_num_3m == null) {
			if (other.phone_receive_order_num_3m != null)
				return false;
		} else if (!phone_receive_order_num_3m.equals(other.phone_receive_order_num_3m))
			return false;
		if (phone_receive_order_num_6m == null) {
			if (other.phone_receive_order_num_6m != null)
				return false;
		} else if (!phone_receive_order_num_6m.equals(other.phone_receive_order_num_6m))
			return false;
		if (phone_stab_days_1y == null) {
			if (other.phone_stab_days_1y != null)
				return false;
		} else if (!phone_stab_days_1y.equals(other.phone_stab_days_1y))
			return false;
		if (phone_use_num_1y == null) {
			if (other.phone_use_num_1y != null)
				return false;
		} else if (!phone_use_num_1y.equals(other.phone_use_num_1y))
			return false;
		if (receive_addr_first_tier_city_num_1y == null) {
			if (other.receive_addr_first_tier_city_num_1y != null)
				return false;
		} else if (!receive_addr_first_tier_city_num_1y.equals(other.receive_addr_first_tier_city_num_1y))
			return false;
		if (receive_addr_first_tier_city_num_3m == null) {
			if (other.receive_addr_first_tier_city_num_3m != null)
				return false;
		} else if (!receive_addr_first_tier_city_num_3m.equals(other.receive_addr_first_tier_city_num_3m))
			return false;
		if (receive_addr_first_tier_city_num_6m == null) {
			if (other.receive_addr_first_tier_city_num_6m != null)
				return false;
		} else if (!receive_addr_first_tier_city_num_6m.equals(other.receive_addr_first_tier_city_num_6m))
			return false;
		if (receive_addr_fourth_tier_city_num_1y == null) {
			if (other.receive_addr_fourth_tier_city_num_1y != null)
				return false;
		} else if (!receive_addr_fourth_tier_city_num_1y.equals(other.receive_addr_fourth_tier_city_num_1y))
			return false;
		if (receive_addr_fourth_tier_city_num_3m == null) {
			if (other.receive_addr_fourth_tier_city_num_3m != null)
				return false;
		} else if (!receive_addr_fourth_tier_city_num_3m.equals(other.receive_addr_fourth_tier_city_num_3m))
			return false;
		if (receive_addr_fourth_tier_city_num_6m == null) {
			if (other.receive_addr_fourth_tier_city_num_6m != null)
				return false;
		} else if (!receive_addr_fourth_tier_city_num_6m.equals(other.receive_addr_fourth_tier_city_num_6m))
			return false;
		if (receive_addr_num == null) {
			if (other.receive_addr_num != null)
				return false;
		} else if (!receive_addr_num.equals(other.receive_addr_num))
			return false;
		if (receive_addr_second_tier_city_num_1y == null) {
			if (other.receive_addr_second_tier_city_num_1y != null)
				return false;
		} else if (!receive_addr_second_tier_city_num_1y.equals(other.receive_addr_second_tier_city_num_1y))
			return false;
		if (receive_addr_second_tier_city_num_3m == null) {
			if (other.receive_addr_second_tier_city_num_3m != null)
				return false;
		} else if (!receive_addr_second_tier_city_num_3m.equals(other.receive_addr_second_tier_city_num_3m))
			return false;
		if (receive_addr_second_tier_city_num_6m == null) {
			if (other.receive_addr_second_tier_city_num_6m != null)
				return false;
		} else if (!receive_addr_second_tier_city_num_6m.equals(other.receive_addr_second_tier_city_num_6m))
			return false;
		if (receive_addr_third_tier_city_num_1y == null) {
			if (other.receive_addr_third_tier_city_num_1y != null)
				return false;
		} else if (!receive_addr_third_tier_city_num_1y.equals(other.receive_addr_third_tier_city_num_1y))
			return false;
		if (receive_addr_third_tier_city_num_3m == null) {
			if (other.receive_addr_third_tier_city_num_3m != null)
				return false;
		} else if (!receive_addr_third_tier_city_num_3m.equals(other.receive_addr_third_tier_city_num_3m))
			return false;
		if (receive_addr_third_tier_city_num_6m == null) {
			if (other.receive_addr_third_tier_city_num_6m != null)
				return false;
		} else if (!receive_addr_third_tier_city_num_6m.equals(other.receive_addr_third_tier_city_num_6m))
			return false;
		if (receive_phone_num == null) {
			if (other.receive_phone_num != null)
				return false;
		} else if (!receive_phone_num.equals(other.receive_phone_num))
			return false;
		if (receive_user_num == null) {
			if (other.receive_user_num != null)
				return false;
		} else if (!receive_user_num.equals(other.receive_user_num))
			return false;
		if (tb_dawn_order_amt_max_1m == null) {
			if (other.tb_dawn_order_amt_max_1m != null)
				return false;
		} else if (!tb_dawn_order_amt_max_1m.equals(other.tb_dawn_order_amt_max_1m))
			return false;
		if (tb_dawn_order_amt_max_1y == null) {
			if (other.tb_dawn_order_amt_max_1y != null)
				return false;
		} else if (!tb_dawn_order_amt_max_1y.equals(other.tb_dawn_order_amt_max_1y))
			return false;
		if (tb_dawn_order_amt_max_3m == null) {
			if (other.tb_dawn_order_amt_max_3m != null)
				return false;
		} else if (!tb_dawn_order_amt_max_3m.equals(other.tb_dawn_order_amt_max_3m))
			return false;
		if (tb_dawn_order_amt_max_6m == null) {
			if (other.tb_dawn_order_amt_max_6m != null)
				return false;
		} else if (!tb_dawn_order_amt_max_6m.equals(other.tb_dawn_order_amt_max_6m))
			return false;
		if (tb_dawn_order_amt_month_stab_1y == null) {
			if (other.tb_dawn_order_amt_month_stab_1y != null)
				return false;
		} else if (!tb_dawn_order_amt_month_stab_1y.equals(other.tb_dawn_order_amt_month_stab_1y))
			return false;
		if (tb_dawn_order_amt_prop_1m == null) {
			if (other.tb_dawn_order_amt_prop_1m != null)
				return false;
		} else if (!tb_dawn_order_amt_prop_1m.equals(other.tb_dawn_order_amt_prop_1m))
			return false;
		if (tb_dawn_order_amt_prop_1y == null) {
			if (other.tb_dawn_order_amt_prop_1y != null)
				return false;
		} else if (!tb_dawn_order_amt_prop_1y.equals(other.tb_dawn_order_amt_prop_1y))
			return false;
		if (tb_dawn_order_amt_prop_3m == null) {
			if (other.tb_dawn_order_amt_prop_3m != null)
				return false;
		} else if (!tb_dawn_order_amt_prop_3m.equals(other.tb_dawn_order_amt_prop_3m))
			return false;
		if (tb_dawn_order_amt_prop_6m == null) {
			if (other.tb_dawn_order_amt_prop_6m != null)
				return false;
		} else if (!tb_dawn_order_amt_prop_6m.equals(other.tb_dawn_order_amt_prop_6m))
			return false;
		if (tb_dawn_order_cnt_month_stab_1y == null) {
			if (other.tb_dawn_order_cnt_month_stab_1y != null)
				return false;
		} else if (!tb_dawn_order_cnt_month_stab_1y.equals(other.tb_dawn_order_cnt_month_stab_1y))
			return false;
		if (tb_dawn_order_cnt_prop_1m == null) {
			if (other.tb_dawn_order_cnt_prop_1m != null)
				return false;
		} else if (!tb_dawn_order_cnt_prop_1m.equals(other.tb_dawn_order_cnt_prop_1m))
			return false;
		if (tb_dawn_order_cnt_prop_1y == null) {
			if (other.tb_dawn_order_cnt_prop_1y != null)
				return false;
		} else if (!tb_dawn_order_cnt_prop_1y.equals(other.tb_dawn_order_cnt_prop_1y))
			return false;
		if (tb_dawn_order_cnt_prop_3m == null) {
			if (other.tb_dawn_order_cnt_prop_3m != null)
				return false;
		} else if (!tb_dawn_order_cnt_prop_3m.equals(other.tb_dawn_order_cnt_prop_3m))
			return false;
		if (tb_dawn_order_cnt_prop_6m == null) {
			if (other.tb_dawn_order_cnt_prop_6m != null)
				return false;
		} else if (!tb_dawn_order_cnt_prop_6m.equals(other.tb_dawn_order_cnt_prop_6m))
			return false;
		if (tb_daytime_order_amt_max_1m == null) {
			if (other.tb_daytime_order_amt_max_1m != null)
				return false;
		} else if (!tb_daytime_order_amt_max_1m.equals(other.tb_daytime_order_amt_max_1m))
			return false;
		if (tb_daytime_order_amt_max_1y == null) {
			if (other.tb_daytime_order_amt_max_1y != null)
				return false;
		} else if (!tb_daytime_order_amt_max_1y.equals(other.tb_daytime_order_amt_max_1y))
			return false;
		if (tb_daytime_order_amt_max_3m == null) {
			if (other.tb_daytime_order_amt_max_3m != null)
				return false;
		} else if (!tb_daytime_order_amt_max_3m.equals(other.tb_daytime_order_amt_max_3m))
			return false;
		if (tb_daytime_order_amt_max_6m == null) {
			if (other.tb_daytime_order_amt_max_6m != null)
				return false;
		} else if (!tb_daytime_order_amt_max_6m.equals(other.tb_daytime_order_amt_max_6m))
			return false;
		if (tb_daytime_order_amt_month_stab_1y == null) {
			if (other.tb_daytime_order_amt_month_stab_1y != null)
				return false;
		} else if (!tb_daytime_order_amt_month_stab_1y.equals(other.tb_daytime_order_amt_month_stab_1y))
			return false;
		if (tb_daytime_order_amt_prop_1m == null) {
			if (other.tb_daytime_order_amt_prop_1m != null)
				return false;
		} else if (!tb_daytime_order_amt_prop_1m.equals(other.tb_daytime_order_amt_prop_1m))
			return false;
		if (tb_daytime_order_amt_prop_1y == null) {
			if (other.tb_daytime_order_amt_prop_1y != null)
				return false;
		} else if (!tb_daytime_order_amt_prop_1y.equals(other.tb_daytime_order_amt_prop_1y))
			return false;
		if (tb_daytime_order_amt_prop_3m == null) {
			if (other.tb_daytime_order_amt_prop_3m != null)
				return false;
		} else if (!tb_daytime_order_amt_prop_3m.equals(other.tb_daytime_order_amt_prop_3m))
			return false;
		if (tb_daytime_order_amt_prop_6m == null) {
			if (other.tb_daytime_order_amt_prop_6m != null)
				return false;
		} else if (!tb_daytime_order_amt_prop_6m.equals(other.tb_daytime_order_amt_prop_6m))
			return false;
		if (tb_daytime_order_cnt_month_stab_1y == null) {
			if (other.tb_daytime_order_cnt_month_stab_1y != null)
				return false;
		} else if (!tb_daytime_order_cnt_month_stab_1y.equals(other.tb_daytime_order_cnt_month_stab_1y))
			return false;
		if (tb_daytime_order_cnt_prop_1m == null) {
			if (other.tb_daytime_order_cnt_prop_1m != null)
				return false;
		} else if (!tb_daytime_order_cnt_prop_1m.equals(other.tb_daytime_order_cnt_prop_1m))
			return false;
		if (tb_daytime_order_cnt_prop_1y == null) {
			if (other.tb_daytime_order_cnt_prop_1y != null)
				return false;
		} else if (!tb_daytime_order_cnt_prop_1y.equals(other.tb_daytime_order_cnt_prop_1y))
			return false;
		if (tb_daytime_order_cnt_prop_3m == null) {
			if (other.tb_daytime_order_cnt_prop_3m != null)
				return false;
		} else if (!tb_daytime_order_cnt_prop_3m.equals(other.tb_daytime_order_cnt_prop_3m))
			return false;
		if (tb_daytime_order_cnt_prop_6m == null) {
			if (other.tb_daytime_order_cnt_prop_6m != null)
				return false;
		} else if (!tb_daytime_order_cnt_prop_6m.equals(other.tb_daytime_order_cnt_prop_6m))
			return false;
		if (tb_night_order_amt_max_1m == null) {
			if (other.tb_night_order_amt_max_1m != null)
				return false;
		} else if (!tb_night_order_amt_max_1m.equals(other.tb_night_order_amt_max_1m))
			return false;
		if (tb_night_order_amt_max_1y == null) {
			if (other.tb_night_order_amt_max_1y != null)
				return false;
		} else if (!tb_night_order_amt_max_1y.equals(other.tb_night_order_amt_max_1y))
			return false;
		if (tb_night_order_amt_max_3m == null) {
			if (other.tb_night_order_amt_max_3m != null)
				return false;
		} else if (!tb_night_order_amt_max_3m.equals(other.tb_night_order_amt_max_3m))
			return false;
		if (tb_night_order_amt_max_6m == null) {
			if (other.tb_night_order_amt_max_6m != null)
				return false;
		} else if (!tb_night_order_amt_max_6m.equals(other.tb_night_order_amt_max_6m))
			return false;
		if (tb_night_order_amt_month_stab_1y == null) {
			if (other.tb_night_order_amt_month_stab_1y != null)
				return false;
		} else if (!tb_night_order_amt_month_stab_1y.equals(other.tb_night_order_amt_month_stab_1y))
			return false;
		if (tb_night_order_amt_prop_1m == null) {
			if (other.tb_night_order_amt_prop_1m != null)
				return false;
		} else if (!tb_night_order_amt_prop_1m.equals(other.tb_night_order_amt_prop_1m))
			return false;
		if (tb_night_order_amt_prop_1y == null) {
			if (other.tb_night_order_amt_prop_1y != null)
				return false;
		} else if (!tb_night_order_amt_prop_1y.equals(other.tb_night_order_amt_prop_1y))
			return false;
		if (tb_night_order_amt_prop_3m == null) {
			if (other.tb_night_order_amt_prop_3m != null)
				return false;
		} else if (!tb_night_order_amt_prop_3m.equals(other.tb_night_order_amt_prop_3m))
			return false;
		if (tb_night_order_amt_prop_6m == null) {
			if (other.tb_night_order_amt_prop_6m != null)
				return false;
		} else if (!tb_night_order_amt_prop_6m.equals(other.tb_night_order_amt_prop_6m))
			return false;
		if (tb_night_order_cnt_month_stab_1y == null) {
			if (other.tb_night_order_cnt_month_stab_1y != null)
				return false;
		} else if (!tb_night_order_cnt_month_stab_1y.equals(other.tb_night_order_cnt_month_stab_1y))
			return false;
		if (tb_night_order_cnt_prop_1m == null) {
			if (other.tb_night_order_cnt_prop_1m != null)
				return false;
		} else if (!tb_night_order_cnt_prop_1m.equals(other.tb_night_order_cnt_prop_1m))
			return false;
		if (tb_night_order_cnt_prop_1y == null) {
			if (other.tb_night_order_cnt_prop_1y != null)
				return false;
		} else if (!tb_night_order_cnt_prop_1y.equals(other.tb_night_order_cnt_prop_1y))
			return false;
		if (tb_night_order_cnt_prop_3m == null) {
			if (other.tb_night_order_cnt_prop_3m != null)
				return false;
		} else if (!tb_night_order_cnt_prop_3m.equals(other.tb_night_order_cnt_prop_3m))
			return false;
		if (tb_night_order_cnt_prop_6m == null) {
			if (other.tb_night_order_cnt_prop_6m != null)
				return false;
		} else if (!tb_night_order_cnt_prop_6m.equals(other.tb_night_order_cnt_prop_6m))
			return false;
		if (trade_amt_day_max_1m == null) {
			if (other.trade_amt_day_max_1m != null)
				return false;
		} else if (!trade_amt_day_max_1m.equals(other.trade_amt_day_max_1m))
			return false;
		if (trade_amt_day_max_3m == null) {
			if (other.trade_amt_day_max_3m != null)
				return false;
		} else if (!trade_amt_day_max_3m.equals(other.trade_amt_day_max_3m))
			return false;
		if (trade_amt_day_max_6m == null) {
			if (other.trade_amt_day_max_6m != null)
				return false;
		} else if (!trade_amt_day_max_6m.equals(other.trade_amt_day_max_6m))
			return false;
		if (trade_amt_max_1m == null) {
			if (other.trade_amt_max_1m != null)
				return false;
		} else if (!trade_amt_max_1m.equals(other.trade_amt_max_1m))
			return false;
		if (trade_amt_max_3m == null) {
			if (other.trade_amt_max_3m != null)
				return false;
		} else if (!trade_amt_max_3m.equals(other.trade_amt_max_3m))
			return false;
		if (trade_amt_max_6m == null) {
			if (other.trade_amt_max_6m != null)
				return false;
		} else if (!trade_amt_max_6m.equals(other.trade_amt_max_6m))
			return false;
		if (trade_amt_mean_1m == null) {
			if (other.trade_amt_mean_1m != null)
				return false;
		} else if (!trade_amt_mean_1m.equals(other.trade_amt_mean_1m))
			return false;
		if (trade_amt_mean_3m == null) {
			if (other.trade_amt_mean_3m != null)
				return false;
		} else if (!trade_amt_mean_3m.equals(other.trade_amt_mean_3m))
			return false;
		if (trade_amt_mean_6m == null) {
			if (other.trade_amt_mean_6m != null)
				return false;
		} else if (!trade_amt_mean_6m.equals(other.trade_amt_mean_6m))
			return false;
		if (trade_amt_min_1m == null) {
			if (other.trade_amt_min_1m != null)
				return false;
		} else if (!trade_amt_min_1m.equals(other.trade_amt_min_1m))
			return false;
		if (trade_amt_min_3m == null) {
			if (other.trade_amt_min_3m != null)
				return false;
		} else if (!trade_amt_min_3m.equals(other.trade_amt_min_3m))
			return false;
		if (trade_amt_min_6m == null) {
			if (other.trade_amt_min_6m != null)
				return false;
		} else if (!trade_amt_min_6m.equals(other.trade_amt_min_6m))
			return false;
		if (trade_amt_month_max_3m == null) {
			if (other.trade_amt_month_max_3m != null)
				return false;
		} else if (!trade_amt_month_max_3m.equals(other.trade_amt_month_max_3m))
			return false;
		if (trade_amt_month_max_6m == null) {
			if (other.trade_amt_month_max_6m != null)
				return false;
		} else if (!trade_amt_month_max_6m.equals(other.trade_amt_month_max_6m))
			return false;
		if (trade_amt_month_mean_3m == null) {
			if (other.trade_amt_month_mean_3m != null)
				return false;
		} else if (!trade_amt_month_mean_3m.equals(other.trade_amt_month_mean_3m))
			return false;
		if (trade_amt_month_mean_6m == null) {
			if (other.trade_amt_month_mean_6m != null)
				return false;
		} else if (!trade_amt_month_mean_6m.equals(other.trade_amt_month_mean_6m))
			return false;
		if (trade_amt_sum_1m == null) {
			if (other.trade_amt_sum_1m != null)
				return false;
		} else if (!trade_amt_sum_1m.equals(other.trade_amt_sum_1m))
			return false;
		if (trade_amt_sum_3m == null) {
			if (other.trade_amt_sum_3m != null)
				return false;
		} else if (!trade_amt_sum_3m.equals(other.trade_amt_sum_3m))
			return false;
		if (trade_amt_sum_6m == null) {
			if (other.trade_amt_sum_6m != null)
				return false;
		} else if (!trade_amt_sum_6m.equals(other.trade_amt_sum_6m))
			return false;
		if (trade_cashout_order_cnt_sum_1m == null) {
			if (other.trade_cashout_order_cnt_sum_1m != null)
				return false;
		} else if (!trade_cashout_order_cnt_sum_1m.equals(other.trade_cashout_order_cnt_sum_1m))
			return false;
		if (trade_cashout_order_cnt_sum_3m == null) {
			if (other.trade_cashout_order_cnt_sum_3m != null)
				return false;
		} else if (!trade_cashout_order_cnt_sum_3m.equals(other.trade_cashout_order_cnt_sum_3m))
			return false;
		if (trade_cashout_order_cnt_sum_6m == null) {
			if (other.trade_cashout_order_cnt_sum_6m != null)
				return false;
		} else if (!trade_cashout_order_cnt_sum_6m.equals(other.trade_cashout_order_cnt_sum_6m))
			return false;
		if (trade_cheat_order_cnt_sum_1m == null) {
			if (other.trade_cheat_order_cnt_sum_1m != null)
				return false;
		} else if (!trade_cheat_order_cnt_sum_1m.equals(other.trade_cheat_order_cnt_sum_1m))
			return false;
		if (trade_cheat_order_cnt_sum_2m == null) {
			if (other.trade_cheat_order_cnt_sum_2m != null)
				return false;
		} else if (!trade_cheat_order_cnt_sum_2m.equals(other.trade_cheat_order_cnt_sum_2m))
			return false;
		if (trade_cheat_order_cnt_sum_3m == null) {
			if (other.trade_cheat_order_cnt_sum_3m != null)
				return false;
		} else if (!trade_cheat_order_cnt_sum_3m.equals(other.trade_cheat_order_cnt_sum_3m))
			return false;
		if (trade_cnt_day_max_1m == null) {
			if (other.trade_cnt_day_max_1m != null)
				return false;
		} else if (!trade_cnt_day_max_1m.equals(other.trade_cnt_day_max_1m))
			return false;
		if (trade_cnt_day_max_3m == null) {
			if (other.trade_cnt_day_max_3m != null)
				return false;
		} else if (!trade_cnt_day_max_3m.equals(other.trade_cnt_day_max_3m))
			return false;
		if (trade_cnt_day_max_6m == null) {
			if (other.trade_cnt_day_max_6m != null)
				return false;
		} else if (!trade_cnt_day_max_6m.equals(other.trade_cnt_day_max_6m))
			return false;
		if (trade_cnt_month_max_3m == null) {
			if (other.trade_cnt_month_max_3m != null)
				return false;
		} else if (!trade_cnt_month_max_3m.equals(other.trade_cnt_month_max_3m))
			return false;
		if (trade_cnt_month_max_6m == null) {
			if (other.trade_cnt_month_max_6m != null)
				return false;
		} else if (!trade_cnt_month_max_6m.equals(other.trade_cnt_month_max_6m))
			return false;
		if (trade_cnt_month_mean_3m == null) {
			if (other.trade_cnt_month_mean_3m != null)
				return false;
		} else if (!trade_cnt_month_mean_3m.equals(other.trade_cnt_month_mean_3m))
			return false;
		if (trade_cnt_month_mean_6m == null) {
			if (other.trade_cnt_month_mean_6m != null)
				return false;
		} else if (!trade_cnt_month_mean_6m.equals(other.trade_cnt_month_mean_6m))
			return false;
		if (trade_cnt_sum_1m == null) {
			if (other.trade_cnt_sum_1m != null)
				return false;
		} else if (!trade_cnt_sum_1m.equals(other.trade_cnt_sum_1m))
			return false;
		if (trade_cnt_sum_3m == null) {
			if (other.trade_cnt_sum_3m != null)
				return false;
		} else if (!trade_cnt_sum_3m.equals(other.trade_cnt_sum_3m))
			return false;
		if (trade_cnt_sum_6m == null) {
			if (other.trade_cnt_sum_6m != null)
				return false;
		} else if (!trade_cnt_sum_6m.equals(other.trade_cnt_sum_6m))
			return false;
		if (trade_dawn_amt_max_6m == null) {
			if (other.trade_dawn_amt_max_6m != null)
				return false;
		} else if (!trade_dawn_amt_max_6m.equals(other.trade_dawn_amt_max_6m))
			return false;
		if (trade_dawn_amt_month_stab_6m == null) {
			if (other.trade_dawn_amt_month_stab_6m != null)
				return false;
		} else if (!trade_dawn_amt_month_stab_6m.equals(other.trade_dawn_amt_month_stab_6m))
			return false;
		if (trade_dawn_amt_prop_6m == null) {
			if (other.trade_dawn_amt_prop_6m != null)
				return false;
		} else if (!trade_dawn_amt_prop_6m.equals(other.trade_dawn_amt_prop_6m))
			return false;
		if (trade_dawn_cnt_month_stab_6m == null) {
			if (other.trade_dawn_cnt_month_stab_6m != null)
				return false;
		} else if (!trade_dawn_cnt_month_stab_6m.equals(other.trade_dawn_cnt_month_stab_6m))
			return false;
		if (trade_dawn_cnt_prop_6m == null) {
			if (other.trade_dawn_cnt_prop_6m != null)
				return false;
		} else if (!trade_dawn_cnt_prop_6m.equals(other.trade_dawn_cnt_prop_6m))
			return false;
		if (trade_daytime_amt_max_6m == null) {
			if (other.trade_daytime_amt_max_6m != null)
				return false;
		} else if (!trade_daytime_amt_max_6m.equals(other.trade_daytime_amt_max_6m))
			return false;
		if (trade_daytime_amt_month_stab_6m == null) {
			if (other.trade_daytime_amt_month_stab_6m != null)
				return false;
		} else if (!trade_daytime_amt_month_stab_6m.equals(other.trade_daytime_amt_month_stab_6m))
			return false;
		if (trade_daytime_amt_prop_6m == null) {
			if (other.trade_daytime_amt_prop_6m != null)
				return false;
		} else if (!trade_daytime_amt_prop_6m.equals(other.trade_daytime_amt_prop_6m))
			return false;
		if (trade_daytime_cnt_month_stab_6m == null) {
			if (other.trade_daytime_cnt_month_stab_6m != null)
				return false;
		} else if (!trade_daytime_cnt_month_stab_6m.equals(other.trade_daytime_cnt_month_stab_6m))
			return false;
		if (trade_daytime_cnt_prop_6m == null) {
			if (other.trade_daytime_cnt_prop_6m != null)
				return false;
		} else if (!trade_daytime_cnt_prop_6m.equals(other.trade_daytime_cnt_prop_6m))
			return false;
		if (trade_drug_order_cnt_sum_1m == null) {
			if (other.trade_drug_order_cnt_sum_1m != null)
				return false;
		} else if (!trade_drug_order_cnt_sum_1m.equals(other.trade_drug_order_cnt_sum_1m))
			return false;
		if (trade_drug_order_cnt_sum_2m == null) {
			if (other.trade_drug_order_cnt_sum_2m != null)
				return false;
		} else if (!trade_drug_order_cnt_sum_2m.equals(other.trade_drug_order_cnt_sum_2m))
			return false;
		if (trade_drug_order_cnt_sum_6m == null) {
			if (other.trade_drug_order_cnt_sum_6m != null)
				return false;
		} else if (!trade_drug_order_cnt_sum_6m.equals(other.trade_drug_order_cnt_sum_6m))
			return false;
		if (trade_gambling_order_cnt_sum_1m == null) {
			if (other.trade_gambling_order_cnt_sum_1m != null)
				return false;
		} else if (!trade_gambling_order_cnt_sum_1m.equals(other.trade_gambling_order_cnt_sum_1m))
			return false;
		if (trade_gambling_order_cnt_sum_3m == null) {
			if (other.trade_gambling_order_cnt_sum_3m != null)
				return false;
		} else if (!trade_gambling_order_cnt_sum_3m.equals(other.trade_gambling_order_cnt_sum_3m))
			return false;
		if (trade_gambling_order_cnt_sum_6m == null) {
			if (other.trade_gambling_order_cnt_sum_6m != null)
				return false;
		} else if (!trade_gambling_order_cnt_sum_6m.equals(other.trade_gambling_order_cnt_sum_6m))
			return false;
		if (trade_lottery_order_amt_max_1m == null) {
			if (other.trade_lottery_order_amt_max_1m != null)
				return false;
		} else if (!trade_lottery_order_amt_max_1m.equals(other.trade_lottery_order_amt_max_1m))
			return false;
		if (trade_lottery_order_amt_max_3m == null) {
			if (other.trade_lottery_order_amt_max_3m != null)
				return false;
		} else if (!trade_lottery_order_amt_max_3m.equals(other.trade_lottery_order_amt_max_3m))
			return false;
		if (trade_lottery_order_amt_max_6m == null) {
			if (other.trade_lottery_order_amt_max_6m != null)
				return false;
		} else if (!trade_lottery_order_amt_max_6m.equals(other.trade_lottery_order_amt_max_6m))
			return false;
		if (trade_lottery_order_amt_mean_1m == null) {
			if (other.trade_lottery_order_amt_mean_1m != null)
				return false;
		} else if (!trade_lottery_order_amt_mean_1m.equals(other.trade_lottery_order_amt_mean_1m))
			return false;
		if (trade_lottery_order_amt_mean_3m == null) {
			if (other.trade_lottery_order_amt_mean_3m != null)
				return false;
		} else if (!trade_lottery_order_amt_mean_3m.equals(other.trade_lottery_order_amt_mean_3m))
			return false;
		if (trade_lottery_order_amt_mean_6m == null) {
			if (other.trade_lottery_order_amt_mean_6m != null)
				return false;
		} else if (!trade_lottery_order_amt_mean_6m.equals(other.trade_lottery_order_amt_mean_6m))
			return false;
		if (trade_lottery_order_amt_sum_1m == null) {
			if (other.trade_lottery_order_amt_sum_1m != null)
				return false;
		} else if (!trade_lottery_order_amt_sum_1m.equals(other.trade_lottery_order_amt_sum_1m))
			return false;
		if (trade_lottery_order_amt_sum_3m == null) {
			if (other.trade_lottery_order_amt_sum_3m != null)
				return false;
		} else if (!trade_lottery_order_amt_sum_3m.equals(other.trade_lottery_order_amt_sum_3m))
			return false;
		if (trade_lottery_order_amt_sum_6m == null) {
			if (other.trade_lottery_order_amt_sum_6m != null)
				return false;
		} else if (!trade_lottery_order_amt_sum_6m.equals(other.trade_lottery_order_amt_sum_6m))
			return false;
		if (trade_lottery_order_amt_sum_prop_1m == null) {
			if (other.trade_lottery_order_amt_sum_prop_1m != null)
				return false;
		} else if (!trade_lottery_order_amt_sum_prop_1m.equals(other.trade_lottery_order_amt_sum_prop_1m))
			return false;
		if (trade_lottery_order_amt_sum_prop_3m == null) {
			if (other.trade_lottery_order_amt_sum_prop_3m != null)
				return false;
		} else if (!trade_lottery_order_amt_sum_prop_3m.equals(other.trade_lottery_order_amt_sum_prop_3m))
			return false;
		if (trade_lottery_order_amt_sum_prop_6m == null) {
			if (other.trade_lottery_order_amt_sum_prop_6m != null)
				return false;
		} else if (!trade_lottery_order_amt_sum_prop_6m.equals(other.trade_lottery_order_amt_sum_prop_6m))
			return false;
		if (trade_lottery_order_cnt_sum_1m == null) {
			if (other.trade_lottery_order_cnt_sum_1m != null)
				return false;
		} else if (!trade_lottery_order_cnt_sum_1m.equals(other.trade_lottery_order_cnt_sum_1m))
			return false;
		if (trade_lottery_order_cnt_sum_3m == null) {
			if (other.trade_lottery_order_cnt_sum_3m != null)
				return false;
		} else if (!trade_lottery_order_cnt_sum_3m.equals(other.trade_lottery_order_cnt_sum_3m))
			return false;
		if (trade_lottery_order_cnt_sum_6m == null) {
			if (other.trade_lottery_order_cnt_sum_6m != null)
				return false;
		} else if (!trade_lottery_order_cnt_sum_6m.equals(other.trade_lottery_order_cnt_sum_6m))
			return false;
		if (trade_lottery_order_cnt_sum_prop_1m == null) {
			if (other.trade_lottery_order_cnt_sum_prop_1m != null)
				return false;
		} else if (!trade_lottery_order_cnt_sum_prop_1m.equals(other.trade_lottery_order_cnt_sum_prop_1m))
			return false;
		if (trade_lottery_order_cnt_sum_prop_3m == null) {
			if (other.trade_lottery_order_cnt_sum_prop_3m != null)
				return false;
		} else if (!trade_lottery_order_cnt_sum_prop_3m.equals(other.trade_lottery_order_cnt_sum_prop_3m))
			return false;
		if (trade_lottery_order_cnt_sum_prop_6m == null) {
			if (other.trade_lottery_order_cnt_sum_prop_6m != null)
				return false;
		} else if (!trade_lottery_order_cnt_sum_prop_6m.equals(other.trade_lottery_order_cnt_sum_prop_6m))
			return false;
		if (trade_night_amt_max_6m == null) {
			if (other.trade_night_amt_max_6m != null)
				return false;
		} else if (!trade_night_amt_max_6m.equals(other.trade_night_amt_max_6m))
			return false;
		if (trade_night_amt_month_stab_6m == null) {
			if (other.trade_night_amt_month_stab_6m != null)
				return false;
		} else if (!trade_night_amt_month_stab_6m.equals(other.trade_night_amt_month_stab_6m))
			return false;
		if (trade_night_amt_prop_6m == null) {
			if (other.trade_night_amt_prop_6m != null)
				return false;
		} else if (!trade_night_amt_prop_6m.equals(other.trade_night_amt_prop_6m))
			return false;
		if (trade_night_cnt_month_stab_6m == null) {
			if (other.trade_night_cnt_month_stab_6m != null)
				return false;
		} else if (!trade_night_cnt_month_stab_6m.equals(other.trade_night_cnt_month_stab_6m))
			return false;
		if (trade_night_cnt_prop_6m == null) {
			if (other.trade_night_cnt_prop_6m != null)
				return false;
		} else if (!trade_night_cnt_prop_6m.equals(other.trade_night_cnt_prop_6m))
			return false;
		if (trade_time_span_max_6m == null) {
			if (other.trade_time_span_max_6m != null)
				return false;
		} else if (!trade_time_span_max_6m.equals(other.trade_time_span_max_6m))
			return false;
		if (trade_time_span_mean_6m == null) {
			if (other.trade_time_span_mean_6m != null)
				return false;
		} else if (!trade_time_span_mean_6m.equals(other.trade_time_span_mean_6m))
			return false;
		if (trade_time_span_min_6m == null) {
			if (other.trade_time_span_min_6m != null)
				return false;
		} else if (!trade_time_span_min_6m.equals(other.trade_time_span_min_6m))
			return false;
		if (trade_time_span_stab_6m == null) {
			if (other.trade_time_span_stab_6m != null)
				return false;
		} else if (!trade_time_span_stab_6m.equals(other.trade_time_span_stab_6m))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "ecommerce_risk_rpt [phone_receive_order_num_1y=" + phone_receive_order_num_1y
				+ ", phone_receive_order_num_6m=" + phone_receive_order_num_6m + ", phone_receive_order_num_3m="
				+ phone_receive_order_num_3m + ", phone_receive_addr_num_1y=" + phone_receive_addr_num_1y
				+ ", phone_receive_addr_num_6m=" + phone_receive_addr_num_6m + ", phone_receive_addr_num_3m="
				+ phone_receive_addr_num_3m + ", phone_stab_days_1y=" + phone_stab_days_1y + ", phone_use_num_1y="
				+ phone_use_num_1y + ", oneself_receive_addr_num=" + oneself_receive_addr_num
				+ ", oneself_receive_phone_num=" + oneself_receive_phone_num + ", receive_addr_num=" + receive_addr_num
				+ ", receive_user_num=" + receive_user_num + ", receive_phone_num=" + receive_phone_num
				+ ", default_addr_city_level=" + default_addr_city_level + ", receive_addr_first_tier_city_num_1y="
				+ receive_addr_first_tier_city_num_1y + ", receive_addr_second_tier_city_num_1y="
				+ receive_addr_second_tier_city_num_1y + ", receive_addr_third_tier_city_num_1y="
				+ receive_addr_third_tier_city_num_1y + ", receive_addr_fourth_tier_city_num_1y="
				+ receive_addr_fourth_tier_city_num_1y + ", receive_addr_first_tier_city_num_6m="
				+ receive_addr_first_tier_city_num_6m + ", receive_addr_second_tier_city_num_6m="
				+ receive_addr_second_tier_city_num_6m + ", receive_addr_third_tier_city_num_6m="
				+ receive_addr_third_tier_city_num_6m + ", receive_addr_fourth_tier_city_num_6m="
				+ receive_addr_fourth_tier_city_num_6m + ", receive_addr_first_tier_city_num_3m="
				+ receive_addr_first_tier_city_num_3m + ", receive_addr_second_tier_city_num_3m="
				+ receive_addr_second_tier_city_num_3m + ", receive_addr_third_tier_city_num_3m="
				+ receive_addr_third_tier_city_num_3m + ", receive_addr_fourth_tier_city_num_3m="
				+ receive_addr_fourth_tier_city_num_3m + ", diff_receive_addr_num_1y=" + diff_receive_addr_num_1y
				+ ", diff_receive_addr_num_6m=" + diff_receive_addr_num_6m + ", diff_receive_addr_num_3m="
				+ diff_receive_addr_num_3m + ", diff_receive_user_num_1y=" + diff_receive_user_num_1y
				+ ", diff_receive_user_num_6m=" + diff_receive_user_num_6m + ", diff_receive_user_num_3m="
				+ diff_receive_user_num_3m + ", diff_receive_phone_num_1y=" + diff_receive_phone_num_1y
				+ ", diff_receive_phone_num_6m=" + diff_receive_phone_num_6m + ", diff_receive_phone_num_3m="
				+ diff_receive_phone_num_3m + ", onself_order_num_1y=" + onself_order_num_1y
				+ ", onself_order_num_prop_1y=" + onself_order_num_prop_1y + ", onself_order_num_6m="
				+ onself_order_num_6m + ", onself_order_num_prop_6m=" + onself_order_num_prop_6m
				+ ", onself_order_num_3m=" + onself_order_num_3m + ", onself_order_num_prop_3m="
				+ onself_order_num_prop_3m + ", onself_receive_addr_num_1y=" + onself_receive_addr_num_1y
				+ ", onself_receive_addr_num_6m=" + onself_receive_addr_num_6m + ", onself_receive_addr_num_3m="
				+ onself_receive_addr_num_3m + ", bank_card_num=" + bank_card_num + ", bank_num=" + bank_num
				+ ", debit_card_num=" + debit_card_num + ", debit_card_prop=" + debit_card_prop + ", credit_card_num="
				+ credit_card_num + ", credit_card_prop=" + credit_card_prop + ", tb_dawn_order_amt_max_1y="
				+ tb_dawn_order_amt_max_1y + ", tb_daytime_order_amt_max_1y=" + tb_daytime_order_amt_max_1y
				+ ", tb_night_order_amt_max_1y=" + tb_night_order_amt_max_1y + ", tb_dawn_order_amt_prop_1y="
				+ tb_dawn_order_amt_prop_1y + ", tb_daytime_order_amt_prop_1y=" + tb_daytime_order_amt_prop_1y
				+ ", tb_night_order_amt_prop_1y=" + tb_night_order_amt_prop_1y + ", tb_dawn_order_cnt_prop_1y="
				+ tb_dawn_order_cnt_prop_1y + ", tb_daytime_order_cnt_prop_1y=" + tb_daytime_order_cnt_prop_1y
				+ ", tb_night_order_cnt_prop_1y=" + tb_night_order_cnt_prop_1y + ", tb_dawn_order_amt_month_stab_1y="
				+ tb_dawn_order_amt_month_stab_1y + ", tb_daytime_order_amt_month_stab_1y="
				+ tb_daytime_order_amt_month_stab_1y + ", tb_night_order_amt_month_stab_1y="
				+ tb_night_order_amt_month_stab_1y + ", tb_dawn_order_cnt_month_stab_1y="
				+ tb_dawn_order_cnt_month_stab_1y + ", tb_daytime_order_cnt_month_stab_1y="
				+ tb_daytime_order_cnt_month_stab_1y + ", tb_night_order_cnt_month_stab_1y="
				+ tb_night_order_cnt_month_stab_1y + ", tb_dawn_order_amt_max_6m=" + tb_dawn_order_amt_max_6m
				+ ", tb_daytime_order_amt_max_6m=" + tb_daytime_order_amt_max_6m + ", tb_night_order_amt_max_6m="
				+ tb_night_order_amt_max_6m + ", tb_dawn_order_amt_prop_6m=" + tb_dawn_order_amt_prop_6m
				+ ", tb_daytime_order_amt_prop_6m=" + tb_daytime_order_amt_prop_6m + ", tb_night_order_amt_prop_6m="
				+ tb_night_order_amt_prop_6m + ", tb_dawn_order_cnt_prop_6m=" + tb_dawn_order_cnt_prop_6m
				+ ", tb_daytime_order_cnt_prop_6m=" + tb_daytime_order_cnt_prop_6m + ", tb_night_order_cnt_prop_6m="
				+ tb_night_order_cnt_prop_6m + ", tb_dawn_order_amt_max_3m=" + tb_dawn_order_amt_max_3m
				+ ", tb_daytime_order_amt_max_3m=" + tb_daytime_order_amt_max_3m + ", tb_night_order_amt_max_3m="
				+ tb_night_order_amt_max_3m + ", tb_dawn_order_amt_prop_3m=" + tb_dawn_order_amt_prop_3m
				+ ", tb_daytime_order_amt_prop_3m=" + tb_daytime_order_amt_prop_3m + ", tb_night_order_amt_prop_3m="
				+ tb_night_order_amt_prop_3m + ", tb_dawn_order_cnt_prop_3m=" + tb_dawn_order_cnt_prop_3m
				+ ", tb_daytime_order_cnt_prop_3m=" + tb_daytime_order_cnt_prop_3m + ", tb_night_order_cnt_prop_3m="
				+ tb_night_order_cnt_prop_3m + ", tb_dawn_order_amt_max_1m=" + tb_dawn_order_amt_max_1m
				+ ", tb_daytime_order_amt_max_1m=" + tb_daytime_order_amt_max_1m + ", tb_night_order_amt_max_1m="
				+ tb_night_order_amt_max_1m + ", tb_dawn_order_amt_prop_1m=" + tb_dawn_order_amt_prop_1m
				+ ", tb_daytime_order_amt_prop_1m=" + tb_daytime_order_amt_prop_1m + ", tb_night_order_amt_prop_1m="
				+ tb_night_order_amt_prop_1m + ", tb_dawn_order_cnt_prop_1m=" + tb_dawn_order_cnt_prop_1m
				+ ", tb_daytime_order_cnt_prop_1m=" + tb_daytime_order_cnt_prop_1m + ", tb_night_order_cnt_prop_1m="
				+ tb_night_order_cnt_prop_1m + ", trade_dawn_amt_max_6m=" + trade_dawn_amt_max_6m
				+ ", trade_daytime_amt_max_6m=" + trade_daytime_amt_max_6m + ", trade_night_amt_max_6m="
				+ trade_night_amt_max_6m + ", trade_dawn_amt_prop_6m=" + trade_dawn_amt_prop_6m
				+ ", trade_daytime_amt_prop_6m=" + trade_daytime_amt_prop_6m + ", trade_night_amt_prop_6m="
				+ trade_night_amt_prop_6m + ", trade_dawn_cnt_prop_6m=" + trade_dawn_cnt_prop_6m
				+ ", trade_daytime_cnt_prop_6m=" + trade_daytime_cnt_prop_6m + ", trade_night_cnt_prop_6m="
				+ trade_night_cnt_prop_6m + ", trade_dawn_amt_month_stab_6m=" + trade_dawn_amt_month_stab_6m
				+ ", trade_daytime_amt_month_stab_6m=" + trade_daytime_amt_month_stab_6m
				+ ", trade_night_amt_month_stab_6m=" + trade_night_amt_month_stab_6m + ", trade_dawn_cnt_month_stab_6m="
				+ trade_dawn_cnt_month_stab_6m + ", trade_daytime_cnt_month_stab_6m=" + trade_daytime_cnt_month_stab_6m
				+ ", trade_night_cnt_month_stab_6m=" + trade_night_cnt_month_stab_6m + ", trade_amt_month_max_6m="
				+ trade_amt_month_max_6m + ", trade_amt_month_max_3m=" + trade_amt_month_max_3m
				+ ", trade_cnt_month_max_6m=" + trade_cnt_month_max_6m + ", trade_cnt_month_max_3m="
				+ trade_cnt_month_max_3m + ", trade_amt_month_mean_6m=" + trade_amt_month_mean_6m
				+ ", trade_amt_month_mean_3m=" + trade_amt_month_mean_3m + ", trade_cnt_month_mean_6m="
				+ trade_cnt_month_mean_6m + ", trade_cnt_month_mean_3m=" + trade_cnt_month_mean_3m
				+ ", trade_time_span_stab_6m=" + trade_time_span_stab_6m + ", trade_amt_day_max_6m="
				+ trade_amt_day_max_6m + ", trade_amt_day_max_3m=" + trade_amt_day_max_3m + ", trade_amt_day_max_1m="
				+ trade_amt_day_max_1m + ", trade_cnt_day_max_6m=" + trade_cnt_day_max_6m + ", trade_cnt_day_max_3m="
				+ trade_cnt_day_max_3m + ", trade_cnt_day_max_1m=" + trade_cnt_day_max_1m + ", trade_amt_max_6m="
				+ trade_amt_max_6m + ", trade_amt_min_6m=" + trade_amt_min_6m + ", trade_amt_mean_6m="
				+ trade_amt_mean_6m + ", trade_amt_max_3m=" + trade_amt_max_3m + ", trade_amt_min_3m="
				+ trade_amt_min_3m + ", trade_amt_mean_3m=" + trade_amt_mean_3m + ", trade_amt_max_1m="
				+ trade_amt_max_1m + ", trade_amt_min_1m=" + trade_amt_min_1m + ", trade_amt_mean_1m="
				+ trade_amt_mean_1m + ", trade_amt_sum_6m=" + trade_amt_sum_6m + ", trade_amt_sum_3m="
				+ trade_amt_sum_3m + ", trade_amt_sum_1m=" + trade_amt_sum_1m + ", trade_cnt_sum_6m=" + trade_cnt_sum_6m
				+ ", trade_cnt_sum_3m=" + trade_cnt_sum_3m + ", trade_cnt_sum_1m=" + trade_cnt_sum_1m
				+ ", trade_time_span_max_6m=" + trade_time_span_max_6m + ", trade_time_span_min_6m="
				+ trade_time_span_min_6m + ", trade_time_span_mean_6m=" + trade_time_span_mean_6m
				+ ", trade_lottery_order_amt_sum_1m=" + trade_lottery_order_amt_sum_1m
				+ ", trade_lottery_order_amt_mean_1m=" + trade_lottery_order_amt_mean_1m
				+ ", trade_lottery_order_amt_max_1m=" + trade_lottery_order_amt_max_1m
				+ ", trade_lottery_order_amt_sum_prop_1m=" + trade_lottery_order_amt_sum_prop_1m
				+ ", trade_lottery_order_cnt_sum_1m=" + trade_lottery_order_cnt_sum_1m
				+ ", trade_lottery_order_cnt_sum_prop_1m=" + trade_lottery_order_cnt_sum_prop_1m
				+ ", trade_lottery_order_amt_sum_3m=" + trade_lottery_order_amt_sum_3m
				+ ", trade_lottery_order_amt_mean_3m=" + trade_lottery_order_amt_mean_3m
				+ ", trade_lottery_order_amt_max_3m=" + trade_lottery_order_amt_max_3m
				+ ", trade_lottery_order_amt_sum_prop_3m=" + trade_lottery_order_amt_sum_prop_3m
				+ ", trade_lottery_order_cnt_sum_3m=" + trade_lottery_order_cnt_sum_3m
				+ ", trade_lottery_order_cnt_sum_prop_3m=" + trade_lottery_order_cnt_sum_prop_3m
				+ ", trade_lottery_order_amt_sum_6m=" + trade_lottery_order_amt_sum_6m
				+ ", trade_lottery_order_amt_mean_6m=" + trade_lottery_order_amt_mean_6m
				+ ", trade_lottery_order_amt_max_6m=" + trade_lottery_order_amt_max_6m
				+ ", trade_lottery_order_amt_sum_prop_6m=" + trade_lottery_order_amt_sum_prop_6m
				+ ", trade_lottery_order_cnt_sum_6m=" + trade_lottery_order_cnt_sum_6m
				+ ", trade_lottery_order_cnt_sum_prop_6m=" + trade_lottery_order_cnt_sum_prop_6m
				+ ", trade_cheat_order_cnt_sum_1m=" + trade_cheat_order_cnt_sum_1m + ", trade_cheat_order_cnt_sum_2m="
				+ trade_cheat_order_cnt_sum_2m + ", trade_cheat_order_cnt_sum_3m=" + trade_cheat_order_cnt_sum_3m
				+ ", trade_gambling_order_cnt_sum_1m=" + trade_gambling_order_cnt_sum_1m
				+ ", trade_gambling_order_cnt_sum_3m=" + trade_gambling_order_cnt_sum_3m
				+ ", trade_gambling_order_cnt_sum_6m=" + trade_gambling_order_cnt_sum_6m
				+ ", trade_drug_order_cnt_sum_1m=" + trade_drug_order_cnt_sum_1m + ", trade_drug_order_cnt_sum_2m="
				+ trade_drug_order_cnt_sum_2m + ", trade_drug_order_cnt_sum_6m=" + trade_drug_order_cnt_sum_6m
				+ ", trade_cashout_order_cnt_sum_1m=" + trade_cashout_order_cnt_sum_1m
				+ ", trade_cashout_order_cnt_sum_3m=" + trade_cashout_order_cnt_sum_3m
				+ ", trade_cashout_order_cnt_sum_6m=" + trade_cashout_order_cnt_sum_6m + "]";
	}
	
	
	
}
