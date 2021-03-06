package com.neusoft.mid.cloong.identity.bean;

import java.util.List;

import com.neusoft.mid.cloong.identity.bean.UserBean;
/**
 * 业务信息
 * @author <a href="mailto:nan.liu@neusoft.com">liunan</a>
 * @version 创建时间：2014-12-24 下午4:23:23
 */
public class App  {

    /**
     * 业务ID
     */
    private String appId;
    /**
     * 业务名称
     */
    private String appName;
    /**
     * 描述
     */
    private String description;
    /**
     * 描述
     */
    private String create_flag;
    
    /**
     * 联系人名称
     */
    private String app_contacts;
    
    /**
     * 联系人名称
     */
    private List<UserBean> appContactList;
   
    /**
     * 创建用户ID
     */
    private String create_user;
    /**
     * 创建时间
     */
    private String create_time;
    /**
     * 更新用户ID
     */
    private String update_user;
    /**
     * 更新时间
     */
    private String update_time;
    
    /**
     * 查询条件业务ID
     */
    private String app_id_tmp;
    
    /**
     * 查询条件业务名称
     */
    private String app_name_tmp;
    
    /**
     * 查询创建起始时间
     */
    private String startTime;
    
    /**
     * 查询创建结束时间
     */
    private String endTime;
    
    /**
     * 创建时间
     */
    private String createTime;

    /**
     * 创建人
     */
    private String createUser;

    /**
     * 更新时间
     */
    private String updateTime;

    /**
     * 更新人
     */
    private String updateUser;
    
    /**
     * 资源池对应ID
     */
    private String templateId;

    public String getTemplateId() {
        return templateId;
    }

    public void setTemplateId(String templateId) {
        this.templateId = templateId;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public String getCreateUser() {
        return createUser;
    }

    public void setCreateUser(String createUser) {
        this.createUser = createUser;
    }

    public String getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
    }

    public String getUpdateUser() {
        return updateUser;
    }

    public void setUpdateUser(String updateUser) {
        this.updateUser = updateUser;
    }


	/**
	 * @return the appId
	 */
	public String getAppId() {
		return appId;
	}

	/**
	 * @param appId the appId to set
	 */
	public void setAppId(String appId) {
		this.appId = appId;
	}

	/**
	 
	/**
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * @return the appName
	 */
	public String getAppName() {
		return appName;
	}

	/**
	 * @param appName the appName to set
	 */
	public void setAppName(String appName) {
		this.appName = appName;
	}

	/**
	 * @param description the description to set
	 */
	public void setDescription(String description) {
		this.description = description;
	}

	
	
	
	
	/**
	 * @return the app_contacts
	 */
	public String getApp_contacts() {
		return app_contacts;
	}

	/**
	 * @param app_contacts the app_contacts to set
	 */
	public void setApp_contacts(String app_contacts) {
		this.app_contacts = app_contacts;
	}

	
	
	
	

	/**
	 * @return the create_user
	 */
	public String getCreate_user() {
		return create_user;
	}

	/**
	 * @param create_user the create_user to set
	 */
	public void setCreate_user(String create_user) {
		this.create_user = create_user;
	}

	/**
	 * @return the create_time
	 */
	public String getCreate_time() {
		return create_time;
	}

	/**
	 * @param create_time the create_time to set
	 */
	public void setCreate_time(String create_time) {
		this.create_time = create_time;
	}

	/**
	 * @return the update_user
	 */
	public String getUpdate_user() {
		return update_user;
	}

	/**
	 * @param update_user the update_user to set
	 */
	public void setUpdate_user(String update_user) {
		this.update_user = update_user;
	}

	/**
	 * @return the update_time
	 */
	public String getUpdate_time() {
		return update_time;
	}

	/**
	 * @param update_time the update_time to set
	 */
	public void setUpdate_time(String update_time) {
		this.update_time = update_time;
	}

	/**
	 * @return the app_id_tmp
	 */
	public String getApp_id_tmp() {
		return app_id_tmp;
	}

	/**
	 * @param app_id_tmp the app_id_tmp to set
	 */
	public void setApp_id_tmp(String app_id_tmp) {
		this.app_id_tmp = app_id_tmp;
	}

	/**
	 * @return the app_name_tmp
	 */
	public String getApp_name_tmp() {
		return app_name_tmp;
	}

	/**
	 * @param app_name_tmp the app_name_tmp to set
	 */
	public void setApp_name_tmp(String app_name_tmp) {
		this.app_name_tmp = app_name_tmp;
	}

	/**
	 * @return the startTime
	 */
	public String getStartTime() {
		return startTime;
	}

	/**
	 * @param startTime the startTime to set
	 */
	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}

	/**
	 * @return the endTime
	 */
	public String getEndTime() {
		return endTime;
	}

	/**
	 * @param endTime the endTime to set
	 */
	public void setEndTime(String endTime) {
		this.endTime = endTime;
	}

	public String getCreate_flag() {
		return create_flag;
	}

	public void setCreate_flag(String create_flag) {
		this.create_flag = create_flag;
	}

	/**
	 * @param appList
	 */
	public void setUsers(List<App> appList) {
		// TODO Auto-generated method stub
		
	}

	/**
	 * @return the appContactList
	 */
	public List<UserBean> getAppContactList() {
		return appContactList;
	}

	/**
	 * @param appContactList the appContactList to set
	 */
	public void setAppContactList(List<UserBean> appContactList) {
		this.appContactList = appContactList;
	}

	

    
}
