package mll.filtermode.payment.chain;

import java.util.ArrayList;
import java.util.List;

import mll.filtermode.payment.factoyimpl.MonitorPaymentFactory;

/**
 * <p>��������</br>������д��ע��</p>
 * @author liushengling Email:liushengling@co-mall.com
 * @company ���������ȷ�����������޹�˾@��Ȩ����
 * @version 
 * @since 2017��3��8������3:30:00
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
