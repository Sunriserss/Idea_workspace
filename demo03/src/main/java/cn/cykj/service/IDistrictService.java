package cn.cykj.service;

import java.util.List;

import cn.cykj.entity.District;

/**
 * 处理省/市/区数据的业务层接口
 */
public interface IDistrictService {

	/**
	 * 根据父级代号获取所有省/某省的所有市/某市的所有区的列表
	 * @param parent 父级代码，如果获取所有省的列表，则应该使用"86"
	 * @return 匹配的省/市/区的列表
	 */
	List<District> getListByParent(String parent);

	/**
	 * 根据省/市/区的代号获取详情
	 * @param code 省/市/区的代号
	 * @return 匹配的省/市/区的详情，如果没有匹配的数据，则返回null
	 */
	District getByCode(String code);
	
}
