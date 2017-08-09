package temp;

import static org.junit.Assert.*;

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
import com.lhfeiyu.po.Orders;
import com.lhfeiyu.service.OrdersService;

public class Atest {
	private ApplicationContext applicationContext;
	@Before
	public void setUp() throws Exception {
		applicationContext = new FileSystemXmlApplicationContext
				("src/main/resources/applicationContext.xml");
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testFind() {
		
		OrdersService service = (OrdersService) applicationContext.getBean("OrdersService");
		Map map = new HashMap();
		
		
		List<Orders> list = service.findOrders(map);
		JSONArray array = new JSONArray(list);
		System.out.println(array);
		
		
		
		
		
		
		
	}

	@Test
	public void testAdd(){
		
	}
}
