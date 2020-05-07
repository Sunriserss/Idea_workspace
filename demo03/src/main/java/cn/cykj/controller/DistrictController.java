package cn.cykj.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import cn.cykj.entity.District;
import cn.cykj.service.IDistrictService;
import cn.cykj.util.ResponseResult;

@RestController
@RequestMapping("districts")
public class DistrictController 
	extends BaseController {
	
	@Autowired
	private IDistrictService districtService;

	@GetMapping("/")
	public ResponseResult<List<District>> 
		getListByParent(
			@RequestParam("parent") String parent) {
		List<District> data 
			= districtService
				.getListByParent(parent);
		return new ResponseResult<List<District>>(
				SUCCESS, data);
	}
	
	@GetMapping("{code}")
	public ResponseResult<District> getByCode(
		@PathVariable("code") String code) {
		District data
			= districtService.getByCode(code);
		return new ResponseResult<District>(SUCCESS, data);
	}
	
}







