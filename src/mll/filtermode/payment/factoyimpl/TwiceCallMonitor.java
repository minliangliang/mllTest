package mll.filtermode.payment.factoyimpl;



/**
 * <p>描述内容</br>这里填写类注释</p>
 * @author liushengling Email:liushengling@co-mall.com
 * @company 北京科码先锋软件技术有限公司@版权所有
 * @version 
 * @since 2017年3月8日下午3:34:27
 */

public class TwiceCallMonitor implements MonitorPaymentFactory {

	@Override
	public void monitor(String request) {
		System.out.println("iowait回調多次監控 request: " + request);
	}

}
