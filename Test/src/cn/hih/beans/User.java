/**
 * 
 */
package cn.hih.beans;

/**
 * @author Administrator
 *
 */
public class User {
	private String userId;

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public User() {
	}

	@Override
	public String toString() {
		return "User [userId=" + userId + "]";
	}
	
	
}
