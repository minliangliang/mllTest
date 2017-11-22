package mll.filtermode.payment.chain;

import java.util.ArrayList;
import java.util.List;

import mll.filtermode.payment.factoyimpl.MonitorPaymentFactory;

/**
 * <p>描述内容</br>这里填写类注释</p>
 * @author liushengling Email:liushengling@co-mall.com
 * @company 北京科码先锋软件技术有限公司@版权所有
 * @version 
 * @since 2017年3月8日下午3:30:00
 */

public class MonitorPaymentChain {
	private List<MonitorPaymentFactory> filters = new ArrayList<MonitorPaymentFactory>();

	public void addFilter(MonitorPaymentFactory filter) {
		filters.add(filter);
	}

	public void execute(String request) {
		for (MonitorPaymentFactory filter : filters) {
			filter.monitor(request);
		}
	}
}
