package pojo;

import java.math.BigDecimal;

/**
 * ecommerce_info.ecommerce_loan_rpt（借贷历史）
 * @author Administrator
 *
 */
public class ecommerce_loan_rpt {
	
	Integer trade_loan_repay_cnt_6m;//	Integer	否	近6个月信贷还款总次数
	BigDecimal trade_loan_repay_amt_6m;//	BigDecimal	否	近6个月信贷还款总金额
	Integer trade_loan_repay_cnt_3m;//	Integer	否	近3个月信贷还款总次数
	BigDecimal trade_loan_repay_amt_3m;//	BigDecimal	否	近3个月信贷还款总金额
	Integer trade_loan_repay_cnt_1m;//Integer	否	近1个月信贷还款总次数
	BigDecimal trade_loan_repay_amt_1m;//	BigDecimal	否	近1个月信贷还款总金额
	BigDecimal trade_loan_repay_amt_prop_6m;//	BigDecimal	否	近6个月信贷还款金额占总支出金额比
	BigDecimal trade_loan_repay_amt_prop_3m;//	BigDecimal	否	近3个月信贷还款金额占总支出金额比
	BigDecimal trade_loan_repay_amt_prop_1m;//	BigDecimal	否	近1个月信贷还款金额占总支出金额比
	Integer trade_loan_repay_scene_num_6m;//	Integer	否	近6个月信贷还款场景个数
	Integer trade_loan_repay_scene_num_3m;//	Integer	否	近3个月信贷还款场景个数
	Integer trade_loan_repay_scene_num_1m;//	Integer	否	近1个月信贷还款场景个数
	Integer trade_loan_repay_months_6m;//	Integer	否	近6个月有信贷还款的月份数
	Integer trade_loan_repay_months_3m;//	Integer	否	近3个月有信贷还款的月份数
	Integer trade_credit_repay_cnt_6m;//	Integer	否	近6个月信用卡还款的还款次数
	BigDecimal trade_credit_repay_amt_6m;//	BigDecimal	否	近6个月信用卡还款的还款金额
	BigDecimal trade_credit_repay_amt_prop_6m;//	BigDecimal	否	近6个月信用卡还款的还款金额占总借贷还款金额比
	Integer trade_credit_repay_cnt_3m;//	Integer	否	近3个月信用卡还款的还款次数
	BigDecimal trade_credit_repay_amt_3m;//	BigDecimal	否	近3个月信用卡还款的还款金额
	BigDecimal trade_credit_repay_amt_prop_3m;//	BigDecimal	否	近3个月信用卡还款的还款金额占总借贷还款金额比
	Integer trade_credit_repay_cnt_1m;//	Integer	否	近1个月信用卡还款的还款次数
	BigDecimal trade_credit_repay_amt_1m;//	BigDecimal	否	近1个月信用卡还款的还款金额
	BigDecimal trade_credit_repay_amt_prop_1m;//	BigDecimal	否	近1个月信用卡还款的还款金额占总借贷还款金额比
	Integer trade_receip_repay_cnt_6m;//	Integer	否	近6个月借条还款的还款次数
	BigDecimal trade_receip_repay_amt_6m;//	BigDecimal	否	近6个月借条还款的还款金额
	BigDecimal trade_receip_repay_amt_prop_6m;//	BigDecimal	否	近6个月借条还款的还款金额占总借贷还款金额比
	Integer trade_receip_repay_cnt_3m;//	Integer	否	近3个月借条还款的还款次数
	BigDecimal trade_receip_repay_amt_3m;//	BigDecimal	否	近3个月借条还款的还款金额
	BigDecimal trade_receip_repay_amt_prop_3m;//	BigDecimal	否	近3个月借条还款的还款金额占总借贷还款金额比
	Integer trade_receip_repay_cnt_1m;//	Integer	否	近1个月借条还款的还款次数
	BigDecimal trade_receip_repay_amt_1m;//	BigDecimal	否	近1个月借条还款的还款金额
	BigDecimal trade_receip_repay_amt_prop_1m;//	BigDecimal	否	近1个月借条还款的还款金额占总借贷还款金额比
	Integer trade_non_receip_repay_cnt_6m;//	Integer	否	近6个月非借条还款的还款次数
	BigDecimal trade_non_receip_repay_amt_6m;//	BigDecimal	否	近6个月非借条还款的还款金额
	BigDecimal trade_non_receip_repay_amt_prop_6m;//	BigDecimal	否	近6个月非借条还款的还款金额占总借贷还款金额比
	Integer trade_non_receip_repay_cnt_3m;//	Integer	否	近3个月非借条还款的还款次数
	BigDecimal trade_non_receip_repay_amt_3m;//	BigDecimal	否	近3个月非借条还款的还款金额
	BigDecimal trade_non_receip_repay_amt_prop_3m;//	BigDecimal	否	近3个月非借条还款的还款金额占总借贷还款金额比
	Integer trade_non_receip_repay_cnt_1m;//	Integer	否	近1个月非借条还款的还款次数
	BigDecimal trade_non_receip_repay_amt_1m;//	BigDecimal	否	近1个月非借条还款的还款金额
	BigDecimal trade_non_receip_repay_amt_prop_1m;//	BigDecimal	否	近1个月非借条还款的还款金额占总借贷还款金额比
	public Integer getTrade_loan_repay_cnt_6m() {
		return trade_loan_repay_cnt_6m;
	}
	public void setTrade_loan_repay_cnt_6m(Integer trade_loan_repay_cnt_6m) {
		this.trade_loan_repay_cnt_6m = trade_loan_repay_cnt_6m;
	}
	public BigDecimal getTrade_loan_repay_amt_6m() {
		return trade_loan_repay_amt_6m;
	}
	public void setTrade_loan_repay_amt_6m(BigDecimal trade_loan_repay_amt_6m) {
		this.trade_loan_repay_amt_6m = trade_loan_repay_amt_6m;
	}
	public Integer getTrade_loan_repay_cnt_3m() {
		return trade_loan_repay_cnt_3m;
	}
	public void setTrade_loan_repay_cnt_3m(Integer trade_loan_repay_cnt_3m) {
		this.trade_loan_repay_cnt_3m = trade_loan_repay_cnt_3m;
	}
	public BigDecimal getTrade_loan_repay_amt_3m() {
		return trade_loan_repay_amt_3m;
	}
	public void setTrade_loan_repay_amt_3m(BigDecimal trade_loan_repay_amt_3m) {
		this.trade_loan_repay_amt_3m = trade_loan_repay_amt_3m;
	}
	public Integer getTrade_loan_repay_cnt_1m() {
		return trade_loan_repay_cnt_1m;
	}
	public void setTrade_loan_repay_cnt_1m(Integer trade_loan_repay_cnt_1m) {
		this.trade_loan_repay_cnt_1m = trade_loan_repay_cnt_1m;
	}
	public BigDecimal getTrade_loan_repay_amt_1m() {
		return trade_loan_repay_amt_1m;
	}
	public void setTrade_loan_repay_amt_1m(BigDecimal trade_loan_repay_amt_1m) {
		this.trade_loan_repay_amt_1m = trade_loan_repay_amt_1m;
	}
	public BigDecimal getTrade_loan_repay_amt_prop_6m() {
		return trade_loan_repay_amt_prop_6m;
	}
	public void setTrade_loan_repay_amt_prop_6m(BigDecimal trade_loan_repay_amt_prop_6m) {
		this.trade_loan_repay_amt_prop_6m = trade_loan_repay_amt_prop_6m;
	}
	public BigDecimal getTrade_loan_repay_amt_prop_3m() {
		return trade_loan_repay_amt_prop_3m;
	}
	public void setTrade_loan_repay_amt_prop_3m(BigDecimal trade_loan_repay_amt_prop_3m) {
		this.trade_loan_repay_amt_prop_3m = trade_loan_repay_amt_prop_3m;
	}
	public BigDecimal getTrade_loan_repay_amt_prop_1m() {
		return trade_loan_repay_amt_prop_1m;
	}
	public void setTrade_loan_repay_amt_prop_1m(BigDecimal trade_loan_repay_amt_prop_1m) {
		this.trade_loan_repay_amt_prop_1m = trade_loan_repay_amt_prop_1m;
	}
	public Integer getTrade_loan_repay_scene_num_6m() {
		return trade_loan_repay_scene_num_6m;
	}
	public void setTrade_loan_repay_scene_num_6m(Integer trade_loan_repay_scene_num_6m) {
		this.trade_loan_repay_scene_num_6m = trade_loan_repay_scene_num_6m;
	}
	public Integer getTrade_loan_repay_scene_num_3m() {
		return trade_loan_repay_scene_num_3m;
	}
	public void setTrade_loan_repay_scene_num_3m(Integer trade_loan_repay_scene_num_3m) {
		this.trade_loan_repay_scene_num_3m = trade_loan_repay_scene_num_3m;
	}
	public Integer getTrade_loan_repay_scene_num_1m() {
		return trade_loan_repay_scene_num_1m;
	}
	public void setTrade_loan_repay_scene_num_1m(Integer trade_loan_repay_scene_num_1m) {
		this.trade_loan_repay_scene_num_1m = trade_loan_repay_scene_num_1m;
	}
	public Integer getTrade_loan_repay_months_6m() {
		return trade_loan_repay_months_6m;
	}
	public void setTrade_loan_repay_months_6m(Integer trade_loan_repay_months_6m) {
		this.trade_loan_repay_months_6m = trade_loan_repay_months_6m;
	}
	public Integer getTrade_loan_repay_months_3m() {
		return trade_loan_repay_months_3m;
	}
	public void setTrade_loan_repay_months_3m(Integer trade_loan_repay_months_3m) {
		this.trade_loan_repay_months_3m = trade_loan_repay_months_3m;
	}
	public Integer getTrade_credit_repay_cnt_6m() {
		return trade_credit_repay_cnt_6m;
	}
	public void setTrade_credit_repay_cnt_6m(Integer trade_credit_repay_cnt_6m) {
		this.trade_credit_repay_cnt_6m = trade_credit_repay_cnt_6m;
	}
	public BigDecimal getTrade_credit_repay_amt_6m() {
		return trade_credit_repay_amt_6m;
	}
	public void setTrade_credit_repay_amt_6m(BigDecimal trade_credit_repay_amt_6m) {
		this.trade_credit_repay_amt_6m = trade_credit_repay_amt_6m;
	}
	public BigDecimal getTrade_credit_repay_amt_prop_6m() {
		return trade_credit_repay_amt_prop_6m;
	}
	public void setTrade_credit_repay_amt_prop_6m(BigDecimal trade_credit_repay_amt_prop_6m) {
		this.trade_credit_repay_amt_prop_6m = trade_credit_repay_amt_prop_6m;
	}
	public Integer getTrade_credit_repay_cnt_3m() {
		return trade_credit_repay_cnt_3m;
	}
	public void setTrade_credit_repay_cnt_3m(Integer trade_credit_repay_cnt_3m) {
		this.trade_credit_repay_cnt_3m = trade_credit_repay_cnt_3m;
	}
	public BigDecimal getTrade_credit_repay_amt_3m() {
		return trade_credit_repay_amt_3m;
	}
	public void setTrade_credit_repay_amt_3m(BigDecimal trade_credit_repay_amt_3m) {
		this.trade_credit_repay_amt_3m = trade_credit_repay_amt_3m;
	}
	public BigDecimal getTrade_credit_repay_amt_prop_3m() {
		return trade_credit_repay_amt_prop_3m;
	}
	public void setTrade_credit_repay_amt_prop_3m(BigDecimal trade_credit_repay_amt_prop_3m) {
		this.trade_credit_repay_amt_prop_3m = trade_credit_repay_amt_prop_3m;
	}
	public Integer getTrade_credit_repay_cnt_1m() {
		return trade_credit_repay_cnt_1m;
	}
	public void setTrade_credit_repay_cnt_1m(Integer trade_credit_repay_cnt_1m) {
		this.trade_credit_repay_cnt_1m = trade_credit_repay_cnt_1m;
	}
	public BigDecimal getTrade_credit_repay_amt_1m() {
		return trade_credit_repay_amt_1m;
	}
	public void setTrade_credit_repay_amt_1m(BigDecimal trade_credit_repay_amt_1m) {
		this.trade_credit_repay_amt_1m = trade_credit_repay_amt_1m;
	}
	public BigDecimal getTrade_credit_repay_amt_prop_1m() {
		return trade_credit_repay_amt_prop_1m;
	}
	public void setTrade_credit_repay_amt_prop_1m(BigDecimal trade_credit_repay_amt_prop_1m) {
		this.trade_credit_repay_amt_prop_1m = trade_credit_repay_amt_prop_1m;
	}
	public Integer getTrade_receip_repay_cnt_6m() {
		return trade_receip_repay_cnt_6m;
	}
	public void setTrade_receip_repay_cnt_6m(Integer trade_receip_repay_cnt_6m) {
		this.trade_receip_repay_cnt_6m = trade_receip_repay_cnt_6m;
	}
	public BigDecimal getTrade_receip_repay_amt_6m() {
		return trade_receip_repay_amt_6m;
	}
	public void setTrade_receip_repay_amt_6m(BigDecimal trade_receip_repay_amt_6m) {
		this.trade_receip_repay_amt_6m = trade_receip_repay_amt_6m;
	}
	public BigDecimal getTrade_receip_repay_amt_prop_6m() {
		return trade_receip_repay_amt_prop_6m;
	}
	public void setTrade_receip_repay_amt_prop_6m(BigDecimal trade_receip_repay_amt_prop_6m) {
		this.trade_receip_repay_amt_prop_6m = trade_receip_repay_amt_prop_6m;
	}
	public Integer getTrade_receip_repay_cnt_3m() {
		return trade_receip_repay_cnt_3m;
	}
	public void setTrade_receip_repay_cnt_3m(Integer trade_receip_repay_cnt_3m) {
		this.trade_receip_repay_cnt_3m = trade_receip_repay_cnt_3m;
	}
	public BigDecimal getTrade_receip_repay_amt_3m() {
		return trade_receip_repay_amt_3m;
	}
	public void setTrade_receip_repay_amt_3m(BigDecimal trade_receip_repay_amt_3m) {
		this.trade_receip_repay_amt_3m = trade_receip_repay_amt_3m;
	}
	public BigDecimal getTrade_receip_repay_amt_prop_3m() {
		return trade_receip_repay_amt_prop_3m;
	}
	public void setTrade_receip_repay_amt_prop_3m(BigDecimal trade_receip_repay_amt_prop_3m) {
		this.trade_receip_repay_amt_prop_3m = trade_receip_repay_amt_prop_3m;
	}
	public Integer getTrade_receip_repay_cnt_1m() {
		return trade_receip_repay_cnt_1m;
	}
	public void setTrade_receip_repay_cnt_1m(Integer trade_receip_repay_cnt_1m) {
		this.trade_receip_repay_cnt_1m = trade_receip_repay_cnt_1m;
	}
	public BigDecimal getTrade_receip_repay_amt_1m() {
		return trade_receip_repay_amt_1m;
	}
	public void setTrade_receip_repay_amt_1m(BigDecimal trade_receip_repay_amt_1m) {
		this.trade_receip_repay_amt_1m = trade_receip_repay_amt_1m;
	}
	public BigDecimal getTrade_receip_repay_amt_prop_1m() {
		return trade_receip_repay_amt_prop_1m;
	}
	public void setTrade_receip_repay_amt_prop_1m(BigDecimal trade_receip_repay_amt_prop_1m) {
		this.trade_receip_repay_amt_prop_1m = trade_receip_repay_amt_prop_1m;
	}
	public Integer getTrade_non_receip_repay_cnt_6m() {
		return trade_non_receip_repay_cnt_6m;
	}
	public void setTrade_non_receip_repay_cnt_6m(Integer trade_non_receip_repay_cnt_6m) {
		this.trade_non_receip_repay_cnt_6m = trade_non_receip_repay_cnt_6m;
	}
	public BigDecimal getTrade_non_receip_repay_amt_6m() {
		return trade_non_receip_repay_amt_6m;
	}
	public void setTrade_non_receip_repay_amt_6m(BigDecimal trade_non_receip_repay_amt_6m) {
		this.trade_non_receip_repay_amt_6m = trade_non_receip_repay_amt_6m;
	}
	public BigDecimal getTrade_non_receip_repay_amt_prop_6m() {
		return trade_non_receip_repay_amt_prop_6m;
	}
	public void setTrade_non_receip_repay_amt_prop_6m(BigDecimal trade_non_receip_repay_amt_prop_6m) {
		this.trade_non_receip_repay_amt_prop_6m = trade_non_receip_repay_amt_prop_6m;
	}
	public Integer getTrade_non_receip_repay_cnt_3m() {
		return trade_non_receip_repay_cnt_3m;
	}
	public void setTrade_non_receip_repay_cnt_3m(Integer trade_non_receip_repay_cnt_3m) {
		this.trade_non_receip_repay_cnt_3m = trade_non_receip_repay_cnt_3m;
	}
	public BigDecimal getTrade_non_receip_repay_amt_3m() {
		return trade_non_receip_repay_amt_3m;
	}
	public void setTrade_non_receip_repay_amt_3m(BigDecimal trade_non_receip_repay_amt_3m) {
		this.trade_non_receip_repay_amt_3m = trade_non_receip_repay_amt_3m;
	}
	public BigDecimal getTrade_non_receip_repay_amt_prop_3m() {
		return trade_non_receip_repay_amt_prop_3m;
	}
	public void setTrade_non_receip_repay_amt_prop_3m(BigDecimal trade_non_receip_repay_amt_prop_3m) {
		this.trade_non_receip_repay_amt_prop_3m = trade_non_receip_repay_amt_prop_3m;
	}
	public Integer getTrade_non_receip_repay_cnt_1m() {
		return trade_non_receip_repay_cnt_1m;
	}
	public void setTrade_non_receip_repay_cnt_1m(Integer trade_non_receip_repay_cnt_1m) {
		this.trade_non_receip_repay_cnt_1m = trade_non_receip_repay_cnt_1m;
	}
	public BigDecimal getTrade_non_receip_repay_amt_1m() {
		return trade_non_receip_repay_amt_1m;
	}
	public void setTrade_non_receip_repay_amt_1m(BigDecimal trade_non_receip_repay_amt_1m) {
		this.trade_non_receip_repay_amt_1m = trade_non_receip_repay_amt_1m;
	}
	public BigDecimal getTrade_non_receip_repay_amt_prop_1m() {
		return trade_non_receip_repay_amt_prop_1m;
	}
	public void setTrade_non_receip_repay_amt_prop_1m(BigDecimal trade_non_receip_repay_amt_prop_1m) {
		this.trade_non_receip_repay_amt_prop_1m = trade_non_receip_repay_amt_prop_1m;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((trade_credit_repay_amt_1m == null) ? 0 : trade_credit_repay_amt_1m.hashCode());
		result = prime * result + ((trade_credit_repay_amt_3m == null) ? 0 : trade_credit_repay_amt_3m.hashCode());
		result = prime * result + ((trade_credit_repay_amt_6m == null) ? 0 : trade_credit_repay_amt_6m.hashCode());
		result = prime * result
				+ ((trade_credit_repay_amt_prop_1m == null) ? 0 : trade_credit_repay_amt_prop_1m.hashCode());
		result = prime * result
				+ ((trade_credit_repay_amt_prop_3m == null) ? 0 : trade_credit_repay_amt_prop_3m.hashCode());
		result = prime * result
				+ ((trade_credit_repay_amt_prop_6m == null) ? 0 : trade_credit_repay_amt_prop_6m.hashCode());
		result = prime * result + ((trade_credit_repay_cnt_1m == null) ? 0 : trade_credit_repay_cnt_1m.hashCode());
		result = prime * result + ((trade_credit_repay_cnt_3m == null) ? 0 : trade_credit_repay_cnt_3m.hashCode());
		result = prime * result + ((trade_credit_repay_cnt_6m == null) ? 0 : trade_credit_repay_cnt_6m.hashCode());
		result = prime * result + ((trade_loan_repay_amt_1m == null) ? 0 : trade_loan_repay_amt_1m.hashCode());
		result = prime * result + ((trade_loan_repay_amt_3m == null) ? 0 : trade_loan_repay_amt_3m.hashCode());
		result = prime * result + ((trade_loan_repay_amt_6m == null) ? 0 : trade_loan_repay_amt_6m.hashCode());
		result = prime * result
				+ ((trade_loan_repay_amt_prop_1m == null) ? 0 : trade_loan_repay_amt_prop_1m.hashCode());
		result = prime * result
				+ ((trade_loan_repay_amt_prop_3m == null) ? 0 : trade_loan_repay_amt_prop_3m.hashCode());
		result = prime * result
				+ ((trade_loan_repay_amt_prop_6m == null) ? 0 : trade_loan_repay_amt_prop_6m.hashCode());
		result = prime * result + ((trade_loan_repay_cnt_1m == null) ? 0 : trade_loan_repay_cnt_1m.hashCode());
		result = prime * result + ((trade_loan_repay_cnt_3m == null) ? 0 : trade_loan_repay_cnt_3m.hashCode());
		result = prime * result + ((trade_loan_repay_cnt_6m == null) ? 0 : trade_loan_repay_cnt_6m.hashCode());
		result = prime * result + ((trade_loan_repay_months_3m == null) ? 0 : trade_loan_repay_months_3m.hashCode());
		result = prime * result + ((trade_loan_repay_months_6m == null) ? 0 : trade_loan_repay_months_6m.hashCode());
		result = prime * result
				+ ((trade_loan_repay_scene_num_1m == null) ? 0 : trade_loan_repay_scene_num_1m.hashCode());
		result = prime * result
				+ ((trade_loan_repay_scene_num_3m == null) ? 0 : trade_loan_repay_scene_num_3m.hashCode());
		result = prime * result
				+ ((trade_loan_repay_scene_num_6m == null) ? 0 : trade_loan_repay_scene_num_6m.hashCode());
		result = prime * result
				+ ((trade_non_receip_repay_amt_1m == null) ? 0 : trade_non_receip_repay_amt_1m.hashCode());
		result = prime * result
				+ ((trade_non_receip_repay_amt_3m == null) ? 0 : trade_non_receip_repay_amt_3m.hashCode());
		result = prime * result
				+ ((trade_non_receip_repay_amt_6m == null) ? 0 : trade_non_receip_repay_amt_6m.hashCode());
		result = prime * result
				+ ((trade_non_receip_repay_amt_prop_1m == null) ? 0 : trade_non_receip_repay_amt_prop_1m.hashCode());
		result = prime * result
				+ ((trade_non_receip_repay_amt_prop_3m == null) ? 0 : trade_non_receip_repay_amt_prop_3m.hashCode());
		result = prime * result
				+ ((trade_non_receip_repay_amt_prop_6m == null) ? 0 : trade_non_receip_repay_amt_prop_6m.hashCode());
		result = prime * result
				+ ((trade_non_receip_repay_cnt_1m == null) ? 0 : trade_non_receip_repay_cnt_1m.hashCode());
		result = prime * result
				+ ((trade_non_receip_repay_cnt_3m == null) ? 0 : trade_non_receip_repay_cnt_3m.hashCode());
		result = prime * result
				+ ((trade_non_receip_repay_cnt_6m == null) ? 0 : trade_non_receip_repay_cnt_6m.hashCode());
		result = prime * result + ((trade_receip_repay_amt_1m == null) ? 0 : trade_receip_repay_amt_1m.hashCode());
		result = prime * result + ((trade_receip_repay_amt_3m == null) ? 0 : trade_receip_repay_amt_3m.hashCode());
		result = prime * result + ((trade_receip_repay_amt_6m == null) ? 0 : trade_receip_repay_amt_6m.hashCode());
		result = prime * result
				+ ((trade_receip_repay_amt_prop_1m == null) ? 0 : trade_receip_repay_amt_prop_1m.hashCode());
		result = prime * result
				+ ((trade_receip_repay_amt_prop_3m == null) ? 0 : trade_receip_repay_amt_prop_3m.hashCode());
		result = prime * result
				+ ((trade_receip_repay_amt_prop_6m == null) ? 0 : trade_receip_repay_amt_prop_6m.hashCode());
		result = prime * result + ((trade_receip_repay_cnt_1m == null) ? 0 : trade_receip_repay_cnt_1m.hashCode());
		result = prime * result + ((trade_receip_repay_cnt_3m == null) ? 0 : trade_receip_repay_cnt_3m.hashCode());
		result = prime * result + ((trade_receip_repay_cnt_6m == null) ? 0 : trade_receip_repay_cnt_6m.hashCode());
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
		ecommerce_loan_rpt other = (ecommerce_loan_rpt) obj;
		if (trade_credit_repay_amt_1m == null) {
			if (other.trade_credit_repay_amt_1m != null)
				return false;
		} else if (!trade_credit_repay_amt_1m.equals(other.trade_credit_repay_amt_1m))
			return false;
		if (trade_credit_repay_amt_3m == null) {
			if (other.trade_credit_repay_amt_3m != null)
				return false;
		} else if (!trade_credit_repay_amt_3m.equals(other.trade_credit_repay_amt_3m))
			return false;
		if (trade_credit_repay_amt_6m == null) {
			if (other.trade_credit_repay_amt_6m != null)
				return false;
		} else if (!trade_credit_repay_amt_6m.equals(other.trade_credit_repay_amt_6m))
			return false;
		if (trade_credit_repay_amt_prop_1m == null) {
			if (other.trade_credit_repay_amt_prop_1m != null)
				return false;
		} else if (!trade_credit_repay_amt_prop_1m.equals(other.trade_credit_repay_amt_prop_1m))
			return false;
		if (trade_credit_repay_amt_prop_3m == null) {
			if (other.trade_credit_repay_amt_prop_3m != null)
				return false;
		} else if (!trade_credit_repay_amt_prop_3m.equals(other.trade_credit_repay_amt_prop_3m))
			return false;
		if (trade_credit_repay_amt_prop_6m == null) {
			if (other.trade_credit_repay_amt_prop_6m != null)
				return false;
		} else if (!trade_credit_repay_amt_prop_6m.equals(other.trade_credit_repay_amt_prop_6m))
			return false;
		if (trade_credit_repay_cnt_1m == null) {
			if (other.trade_credit_repay_cnt_1m != null)
				return false;
		} else if (!trade_credit_repay_cnt_1m.equals(other.trade_credit_repay_cnt_1m))
			return false;
		if (trade_credit_repay_cnt_3m == null) {
			if (other.trade_credit_repay_cnt_3m != null)
				return false;
		} else if (!trade_credit_repay_cnt_3m.equals(other.trade_credit_repay_cnt_3m))
			return false;
		if (trade_credit_repay_cnt_6m == null) {
			if (other.trade_credit_repay_cnt_6m != null)
				return false;
		} else if (!trade_credit_repay_cnt_6m.equals(other.trade_credit_repay_cnt_6m))
			return false;
		if (trade_loan_repay_amt_1m == null) {
			if (other.trade_loan_repay_amt_1m != null)
				return false;
		} else if (!trade_loan_repay_amt_1m.equals(other.trade_loan_repay_amt_1m))
			return false;
		if (trade_loan_repay_amt_3m == null) {
			if (other.trade_loan_repay_amt_3m != null)
				return false;
		} else if (!trade_loan_repay_amt_3m.equals(other.trade_loan_repay_amt_3m))
			return false;
		if (trade_loan_repay_amt_6m == null) {
			if (other.trade_loan_repay_amt_6m != null)
				return false;
		} else if (!trade_loan_repay_amt_6m.equals(other.trade_loan_repay_amt_6m))
			return false;
		if (trade_loan_repay_amt_prop_1m == null) {
			if (other.trade_loan_repay_amt_prop_1m != null)
				return false;
		} else if (!trade_loan_repay_amt_prop_1m.equals(other.trade_loan_repay_amt_prop_1m))
			return false;
		if (trade_loan_repay_amt_prop_3m == null) {
			if (other.trade_loan_repay_amt_prop_3m != null)
				return false;
		} else if (!trade_loan_repay_amt_prop_3m.equals(other.trade_loan_repay_amt_prop_3m))
			return false;
		if (trade_loan_repay_amt_prop_6m == null) {
			if (other.trade_loan_repay_amt_prop_6m != null)
				return false;
		} else if (!trade_loan_repay_amt_prop_6m.equals(other.trade_loan_repay_amt_prop_6m))
			return false;
		if (trade_loan_repay_cnt_1m == null) {
			if (other.trade_loan_repay_cnt_1m != null)
				return false;
		} else if (!trade_loan_repay_cnt_1m.equals(other.trade_loan_repay_cnt_1m))
			return false;
		if (trade_loan_repay_cnt_3m == null) {
			if (other.trade_loan_repay_cnt_3m != null)
				return false;
		} else if (!trade_loan_repay_cnt_3m.equals(other.trade_loan_repay_cnt_3m))
			return false;
		if (trade_loan_repay_cnt_6m == null) {
			if (other.trade_loan_repay_cnt_6m != null)
				return false;
		} else if (!trade_loan_repay_cnt_6m.equals(other.trade_loan_repay_cnt_6m))
			return false;
		if (trade_loan_repay_months_3m == null) {
			if (other.trade_loan_repay_months_3m != null)
				return false;
		} else if (!trade_loan_repay_months_3m.equals(other.trade_loan_repay_months_3m))
			return false;
		if (trade_loan_repay_months_6m == null) {
			if (other.trade_loan_repay_months_6m != null)
				return false;
		} else if (!trade_loan_repay_months_6m.equals(other.trade_loan_repay_months_6m))
			return false;
		if (trade_loan_repay_scene_num_1m == null) {
			if (other.trade_loan_repay_scene_num_1m != null)
				return false;
		} else if (!trade_loan_repay_scene_num_1m.equals(other.trade_loan_repay_scene_num_1m))
			return false;
		if (trade_loan_repay_scene_num_3m == null) {
			if (other.trade_loan_repay_scene_num_3m != null)
				return false;
		} else if (!trade_loan_repay_scene_num_3m.equals(other.trade_loan_repay_scene_num_3m))
			return false;
		if (trade_loan_repay_scene_num_6m == null) {
			if (other.trade_loan_repay_scene_num_6m != null)
				return false;
		} else if (!trade_loan_repay_scene_num_6m.equals(other.trade_loan_repay_scene_num_6m))
			return false;
		if (trade_non_receip_repay_amt_1m == null) {
			if (other.trade_non_receip_repay_amt_1m != null)
				return false;
		} else if (!trade_non_receip_repay_amt_1m.equals(other.trade_non_receip_repay_amt_1m))
			return false;
		if (trade_non_receip_repay_amt_3m == null) {
			if (other.trade_non_receip_repay_amt_3m != null)
				return false;
		} else if (!trade_non_receip_repay_amt_3m.equals(other.trade_non_receip_repay_amt_3m))
			return false;
		if (trade_non_receip_repay_amt_6m == null) {
			if (other.trade_non_receip_repay_amt_6m != null)
				return false;
		} else if (!trade_non_receip_repay_amt_6m.equals(other.trade_non_receip_repay_amt_6m))
			return false;
		if (trade_non_receip_repay_amt_prop_1m == null) {
			if (other.trade_non_receip_repay_amt_prop_1m != null)
				return false;
		} else if (!trade_non_receip_repay_amt_prop_1m.equals(other.trade_non_receip_repay_amt_prop_1m))
			return false;
		if (trade_non_receip_repay_amt_prop_3m == null) {
			if (other.trade_non_receip_repay_amt_prop_3m != null)
				return false;
		} else if (!trade_non_receip_repay_amt_prop_3m.equals(other.trade_non_receip_repay_amt_prop_3m))
			return false;
		if (trade_non_receip_repay_amt_prop_6m == null) {
			if (other.trade_non_receip_repay_amt_prop_6m != null)
				return false;
		} else if (!trade_non_receip_repay_amt_prop_6m.equals(other.trade_non_receip_repay_amt_prop_6m))
			return false;
		if (trade_non_receip_repay_cnt_1m == null) {
			if (other.trade_non_receip_repay_cnt_1m != null)
				return false;
		} else if (!trade_non_receip_repay_cnt_1m.equals(other.trade_non_receip_repay_cnt_1m))
			return false;
		if (trade_non_receip_repay_cnt_3m == null) {
			if (other.trade_non_receip_repay_cnt_3m != null)
				return false;
		} else if (!trade_non_receip_repay_cnt_3m.equals(other.trade_non_receip_repay_cnt_3m))
			return false;
		if (trade_non_receip_repay_cnt_6m == null) {
			if (other.trade_non_receip_repay_cnt_6m != null)
				return false;
		} else if (!trade_non_receip_repay_cnt_6m.equals(other.trade_non_receip_repay_cnt_6m))
			return false;
		if (trade_receip_repay_amt_1m == null) {
			if (other.trade_receip_repay_amt_1m != null)
				return false;
		} else if (!trade_receip_repay_amt_1m.equals(other.trade_receip_repay_amt_1m))
			return false;
		if (trade_receip_repay_amt_3m == null) {
			if (other.trade_receip_repay_amt_3m != null)
				return false;
		} else if (!trade_receip_repay_amt_3m.equals(other.trade_receip_repay_amt_3m))
			return false;
		if (trade_receip_repay_amt_6m == null) {
			if (other.trade_receip_repay_amt_6m != null)
				return false;
		} else if (!trade_receip_repay_amt_6m.equals(other.trade_receip_repay_amt_6m))
			return false;
		if (trade_receip_repay_amt_prop_1m == null) {
			if (other.trade_receip_repay_amt_prop_1m != null)
				return false;
		} else if (!trade_receip_repay_amt_prop_1m.equals(other.trade_receip_repay_amt_prop_1m))
			return false;
		if (trade_receip_repay_amt_prop_3m == null) {
			if (other.trade_receip_repay_amt_prop_3m != null)
				return false;
		} else if (!trade_receip_repay_amt_prop_3m.equals(other.trade_receip_repay_amt_prop_3m))
			return false;
		if (trade_receip_repay_amt_prop_6m == null) {
			if (other.trade_receip_repay_amt_prop_6m != null)
				return false;
		} else if (!trade_receip_repay_amt_prop_6m.equals(other.trade_receip_repay_amt_prop_6m))
			return false;
		if (trade_receip_repay_cnt_1m == null) {
			if (other.trade_receip_repay_cnt_1m != null)
				return false;
		} else if (!trade_receip_repay_cnt_1m.equals(other.trade_receip_repay_cnt_1m))
			return false;
		if (trade_receip_repay_cnt_3m == null) {
			if (other.trade_receip_repay_cnt_3m != null)
				return false;
		} else if (!trade_receip_repay_cnt_3m.equals(other.trade_receip_repay_cnt_3m))
			return false;
		if (trade_receip_repay_cnt_6m == null) {
			if (other.trade_receip_repay_cnt_6m != null)
				return false;
		} else if (!trade_receip_repay_cnt_6m.equals(other.trade_receip_repay_cnt_6m))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "ecommerce_loan_rpt [trade_loan_repay_cnt_6m=" + trade_loan_repay_cnt_6m + ", trade_loan_repay_amt_6m="
				+ trade_loan_repay_amt_6m + ", trade_loan_repay_cnt_3m=" + trade_loan_repay_cnt_3m
				+ ", trade_loan_repay_amt_3m=" + trade_loan_repay_amt_3m + ", trade_loan_repay_cnt_1m="
				+ trade_loan_repay_cnt_1m + ", trade_loan_repay_amt_1m=" + trade_loan_repay_amt_1m
				+ ", trade_loan_repay_amt_prop_6m=" + trade_loan_repay_amt_prop_6m + ", trade_loan_repay_amt_prop_3m="
				+ trade_loan_repay_amt_prop_3m + ", trade_loan_repay_amt_prop_1m=" + trade_loan_repay_amt_prop_1m
				+ ", trade_loan_repay_scene_num_6m=" + trade_loan_repay_scene_num_6m
				+ ", trade_loan_repay_scene_num_3m=" + trade_loan_repay_scene_num_3m
				+ ", trade_loan_repay_scene_num_1m=" + trade_loan_repay_scene_num_1m + ", trade_loan_repay_months_6m="
				+ trade_loan_repay_months_6m + ", trade_loan_repay_months_3m=" + trade_loan_repay_months_3m
				+ ", trade_credit_repay_cnt_6m=" + trade_credit_repay_cnt_6m + ", trade_credit_repay_amt_6m="
				+ trade_credit_repay_amt_6m + ", trade_credit_repay_amt_prop_6m=" + trade_credit_repay_amt_prop_6m
				+ ", trade_credit_repay_cnt_3m=" + trade_credit_repay_cnt_3m + ", trade_credit_repay_amt_3m="
				+ trade_credit_repay_amt_3m + ", trade_credit_repay_amt_prop_3m=" + trade_credit_repay_amt_prop_3m
				+ ", trade_credit_repay_cnt_1m=" + trade_credit_repay_cnt_1m + ", trade_credit_repay_amt_1m="
				+ trade_credit_repay_amt_1m + ", trade_credit_repay_amt_prop_1m=" + trade_credit_repay_amt_prop_1m
				+ ", trade_receip_repay_cnt_6m=" + trade_receip_repay_cnt_6m + ", trade_receip_repay_amt_6m="
				+ trade_receip_repay_amt_6m + ", trade_receip_repay_amt_prop_6m=" + trade_receip_repay_amt_prop_6m
				+ ", trade_receip_repay_cnt_3m=" + trade_receip_repay_cnt_3m + ", trade_receip_repay_amt_3m="
				+ trade_receip_repay_amt_3m + ", trade_receip_repay_amt_prop_3m=" + trade_receip_repay_amt_prop_3m
				+ ", trade_receip_repay_cnt_1m=" + trade_receip_repay_cnt_1m + ", trade_receip_repay_amt_1m="
				+ trade_receip_repay_amt_1m + ", trade_receip_repay_amt_prop_1m=" + trade_receip_repay_amt_prop_1m
				+ ", trade_non_receip_repay_cnt_6m=" + trade_non_receip_repay_cnt_6m
				+ ", trade_non_receip_repay_amt_6m=" + trade_non_receip_repay_amt_6m
				+ ", trade_non_receip_repay_amt_prop_6m=" + trade_non_receip_repay_amt_prop_6m
				+ ", trade_non_receip_repay_cnt_3m=" + trade_non_receip_repay_cnt_3m
				+ ", trade_non_receip_repay_amt_3m=" + trade_non_receip_repay_amt_3m
				+ ", trade_non_receip_repay_amt_prop_3m=" + trade_non_receip_repay_amt_prop_3m
				+ ", trade_non_receip_repay_cnt_1m=" + trade_non_receip_repay_cnt_1m
				+ ", trade_non_receip_repay_amt_1m=" + trade_non_receip_repay_amt_1m
				+ ", trade_non_receip_repay_amt_prop_1m=" + trade_non_receip_repay_amt_prop_1m + "]";
	}
	
	
	
	
}
