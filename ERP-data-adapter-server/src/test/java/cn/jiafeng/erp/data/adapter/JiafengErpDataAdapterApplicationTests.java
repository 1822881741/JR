package cn.jiafeng.erp.data.adapter;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import cn.jiafeng.erp.data.adapter.util.MapperUtil;

//@RunWith(SpringRunner.class)
//@SpringBootTest
public class JiafengErpDataAdapterApplicationTests {

	@Test
	public void test() {
		int number = 2222;
		String temp = "000000".concat(String.valueOf(number));
		temp = temp.substring(temp.length() - 5, temp.length());
		System.out.println(temp);
	}

	public class D {
		private String mouldSign;// 短信模板标志（表示相同内容的模板）
		private Integer mouldId;// 短信模板id
		private String sign;// 签名
		private Long userId;// 用户id
		private String[] params;// 模板参数，为空时传空数组
		private String[] userPhone;// 电话号码

		public String getMouldSign() {
			return mouldSign;
		}

		public void setMouldSign(String mouldSign) {
			this.mouldSign = mouldSign;
		}

		public Integer getMouldId() {
			return mouldId;
		}

		public void setMouldId(Integer mouldId) {
			this.mouldId = mouldId;
		}

		public String getSign() {
			return sign;
		}

		public void setSign(String sign) {
			this.sign = sign;
		}

		public Long getUserId() {
			return userId;
		}

		public void setUserId(Long userId) {
			this.userId = userId;
		}

		public String[] getParams() {
			return params;
		}

		public void setParams(String[] params) {
			this.params = params;
		}

		public String[] getUserPhone() {
			return userPhone;
		}

		public void setUserPhone(String[] userPhone) {
			this.userPhone = userPhone;
		}

	}

}
