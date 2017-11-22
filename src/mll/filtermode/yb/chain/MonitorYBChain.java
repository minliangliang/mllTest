package mll.filtermode.yb.chain;

import java.util.ArrayList;
import java.util.List;

import mll.filtermode.yb.factoryimpl.MonitorYBFactory;

/**
 * <p>��������</br>������д��ע��</p>
 * @author liushengling Email:liushengling@co-mall.com
 * @company ���������ȷ�����������޹�˾@��Ȩ����
 * @version 
 * @since 2017��3��8������3:30:00
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
