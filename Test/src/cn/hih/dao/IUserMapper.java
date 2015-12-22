/**
 * 
 */
package cn.hih.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import cn.hih.beans.User;

/**
 * @author Administrator
 *
 */
@Repository
public interface IUserMapper {
	public List<User> get();
}
