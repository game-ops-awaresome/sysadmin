package com.matete.agentmanage.model.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * Generated by JFinal, do not modify this file.
 */
@SuppressWarnings({"serial", "unchecked"})
public abstract class BaseAgent<M extends BaseAgent<M>> extends Model<M> implements IBean {

	public M setID(java.lang.Integer ID) {
		set("ID", ID);
		return (M)this;
	}

	public java.lang.Integer getID() {
		return get("ID");
	}

	public M setName(java.lang.String Name) {
		set("Name", Name);
		return (M)this;
	}

	public java.lang.String getName() {
		return get("Name");
	}

	public M setPhone(java.lang.String Phone) {
		set("Phone", Phone);
		return (M)this;
	}

	public java.lang.String getPhone() {
		return get("Phone");
	}

	public M setQQ(java.lang.String QQ) {
		set("QQ", QQ);
		return (M)this;
	}

	public java.lang.String getQQ() {
		return get("QQ");
	}

	public M setPassword(java.lang.String Password) {
		set("Password", Password);
		return (M)this;
	}

	public java.lang.String getPassword() {
		return get("Password");
	}

	public M setAgentLevel(java.lang.Integer AgentLevel) {
		set("AgentLevel", AgentLevel);
		return (M)this;
	}

	public java.lang.Integer getAgentLevel() {
		return get("AgentLevel");
	}

	public M setTotalHouseCardCount(java.lang.Integer TotalHouseCardCount) {
		set("TotalHouseCardCount", TotalHouseCardCount);
		return (M)this;
	}

	public java.lang.Integer getTotalHouseCardCount() {
		return get("TotalHouseCardCount");
	}

	public M setCurHouseCardCount(java.lang.Integer CurHouseCardCount) {
		set("CurHouseCardCount", CurHouseCardCount);
		return (M)this;
	}

	public java.lang.Integer getCurHouseCardCount() {
		return get("CurHouseCardCount");
	}

	public M setParentId(java.lang.Integer ParentId) {
		set("ParentId", ParentId);
		return (M)this;
	}

	public java.lang.Integer getParentId() {
		return get("ParentId");
	}

	public M setState(java.lang.Integer State) {
		set("State", State);
		return (M)this;
	}

	public java.lang.Integer getState() {
		return get("State");
	}

	public M setMaxAgentCount(java.lang.Integer MaxAgentCount) {
		set("MaxAgentCount", MaxAgentCount);
		return (M)this;
	}

	public java.lang.Integer getMaxAgentCount() {
		return get("MaxAgentCount");
	}

	public M setAgentCount(java.lang.Integer AgentCount) {
		set("AgentCount", AgentCount);
		return (M)this;
	}

	public java.lang.Integer getAgentCount() {
		return get("AgentCount");
	}

	public M setCreateTime(java.util.Date CreateTime) {
		set("CreateTime", CreateTime);
		return (M)this;
	}

	public java.util.Date getCreateTime() {
		return get("CreateTime");
	}

	public M setLoginStatus(java.lang.Integer LoginStatus) {
		set("LoginStatus", LoginStatus);
		return (M)this;
	}

	public java.lang.Integer getLoginStatus() {
		return get("LoginStatus");
	}

}
