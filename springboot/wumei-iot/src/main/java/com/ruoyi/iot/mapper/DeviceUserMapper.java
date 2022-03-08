package com.ruoyi.iot.mapper;

import java.util.List;
import com.ruoyi.iot.domain.DeviceUser;
import org.springframework.stereotype.Repository;

/**
 * 设备用户Mapper接口
 * 
 * @author kerwincui
 * @date 2021-12-16
 */
@Repository
public interface DeviceUserMapper 
{
    /**
     * 查询设备用户
     * 
     * @param deviceId 设备用户主键
     * @return 设备用户
     */
    public DeviceUser selectDeviceUserByDeviceId(Long deviceId);

    /**
     * 查询设备用户列表
     * 
     * @param deviceUser 设备用户
     * @return 设备用户集合
     */
    public List<DeviceUser> selectDeviceUserList(DeviceUser deviceUser);

    /**
     * 新增设备用户
     * 
     * @param deviceUser 设备用户
     * @return 结果
     */
    public int insertDeviceUser(DeviceUser deviceUser);

    /**
     * 修改设备用户
     * 
     * @param deviceUser 设备用户
     * @return 结果
     */
    public int updateDeviceUser(DeviceUser deviceUser);

    /**
     * 删除设备用户
     * 
     * @param deviceId 设备用户主键
     * @return 结果
     */
    public int deleteDeviceUserByDeviceId(Long deviceId);

    /**
     * 批量删除设备用户
     * 
     * @param deviceIds 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteDeviceUserByDeviceIds(Long[] deviceIds);
}
