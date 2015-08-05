package cn.edu.sjtu.se.dclab.server.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import cn.edu.sjtu.se.dclab.server.entity.Item;
import cn.edu.sjtu.se.dclab.server.service.ItemService;


/**
 * 2015年1月19日 上午10:53:57
 *
 * @author changyi yuan
 */
@Controller
@RequestMapping("/item/")
public class ItemController {

	private Logger logger = Logger.getLogger(ItemController.class);

	@Autowired
	private ItemService itemService;

	@RequestMapping(value="{id}",method = RequestMethod.GET)
	@ResponseBody
	public String getItem(@PathVariable("id") int id) {
		Item item = itemService.getItemById(id);
		return "index";
	}

	@RequestMapping(value="create",method = RequestMethod.GET)
	@ResponseBody
	public String createItem(HttpServletRequest request,
			HttpServletResponse response) {
		logger.info("test...log");
		logger.error("error...log");
		return "index";
	}

}
