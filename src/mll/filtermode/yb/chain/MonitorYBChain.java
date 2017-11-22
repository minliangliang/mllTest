package mll.filtermode.yb.chain;

import java.util.ArrayList;
import java.util.List;

import mll.filtermode.yb.factoryimpl.MonitorYBFactory;

/**
 * <p>描述内容</br>这里填写类注释</p>
 * @author liushengling Email:liushengling@co-mall.com
 * @company 北京科码先锋软件技术有限公司@版权所有
 * @version 
 * @since 2017年3月8日下午3:30:00
 */

public class MonitorYBChain {
	private List<MonitorYBFactory> filters = new ArrayList<MonitorYBFactory>();

	public void addFilter(MonitorYBFactory filter) {
		filters.add(filter);
	}

	public void execute(String request) {
		for (MonitorYBFactory filter : filters) {
			filter.monitor(request);
		}
	}
}
