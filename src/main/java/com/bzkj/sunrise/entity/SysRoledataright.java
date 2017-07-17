package com.bzkj.sunrise.entity;

import java.io.Serializable;
import java.util.Date;

import com.baomidou.mybatisplus.activerecord.Model;

/**
 */
public class SysRoledataright extends Model<SysRoledataright> {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	// Fields
	private String roleCode;
	private String dataCode;
	private String dataType;


	private String rightClass;
	private String operSpecial;
	private Date updateTime;
	private String updateStaffId;
	private String updateDepartId;

	// Constructors

	/** default constructor */
	public SysRoledataright() {
	}

	/** minimal constructor */


	public String getRightClass() {
		return this.rightClass;
	}

	public void setRightClass(String rightClass) {
		this.rightClass = rightClass;
	}

	public String getOperSpecial() {
		return this.operSpecial;
	}

	public void setOperSpecial(String operSpecial) {
		this.operSpecial = operSpecial;
	}

	public Date getUpdateTime() {
		return this.updateTime;
	}

	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}

	public String getUpdateStaffId() {
		return this.updateStaffId;
	}

	public void setUpdateStaffId(String updateStaffId) {
		this.updateStaffId = updateStaffId;
	}

	public String getUpdateDepartId() {
		return this.updateDepartId;
	}

	public void setUpdateDepartId(String updateDepartId) {
		this.updateDepartId = updateDepartId;
	}

	
	
	public String getRoleCode() {
		return roleCode;
	}

	public void setRoleCode(String roleCode) {
		this.roleCode = roleCode;
	}

	public String getDataCode() {
		return dataCode;
	}

	public void setDataCode(String dataCode) {
		this.dataCode = dataCode;
	}

	public String getDataType() {
		return dataType;
	}

	public void setDataType(String dataType) {
		this.dataType = dataType;
	}

	@Override
	protected Serializable pkVal() {
		// TODO Auto-generated method stub
		return null;
	}

}