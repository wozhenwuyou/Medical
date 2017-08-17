package temp;

import static org.junit.Assert.*;

import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.json.JSONArray;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.alibaba.fastjson.JSONObject;
import com.lhfeiyu.service.*;

public class Atest {
	/*private ApplicationContext applicationContext;
	private OrdersService ordersService;
	private OrdersparticularService ordersparticularService;
	@Before
	public void setUp() throws Exception {
		applicationContext = new FileSystemXmlApplicationContext
				("src/main/resources/applicationContext.xml");
		ordersService = (OrdersService) applicationContext.getBean("OrdersService");
		ordersparticularService = (OrdersparticularService) applicationContext.getBean("OrdersparticularService");
	}

	@After
	public void tearDown() throws Exception {
		
		
	}

	
	@Test
	public void testFind() {
		List list = ordersService.findOrders(new HashMap());
		for (int i = 0; i < list.size(); i++) {
			Orders o = (Orders) list.get(i);
			System.out.println(o.getOrdersid());
		}
		

	}

	
	public void testAdd() throws Exception{
		Calendar calendar = Calendar.getInstance();
		Map map = new HashMap();
		map.put("createuserid", 1);
		map.put("createtime",calendar.getTime());
		map.put("inuserid", null);
		map.put("inserttime", null);
		ordersService.addOrders(map);
		
		int i = Integer.parseInt(map.get("id").toString());
		System.out.println(i);
		//添加详情
		map.clear();
		map.put("ordersno", "111001010");
		map.put("productname", "测试产品001");
		map.put("productid", 1);
		map.put("size", "text x3");
		map.put("num", "111001010");
		map.put("mununit", "测试单位");
		map.put("createproduct", "测试单位");//改为供货商与生产商合并
		map.put("supplierid", 1);//通过下拉列表获取的供货商数据与createproduct同时传递
		map.put("producttypeid", 1);
		map.put("orders_id", i);//关联外键		
		System.out.println("添加成功");
		
	}*/
}
