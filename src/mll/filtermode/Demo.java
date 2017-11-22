package mll.filtermode;

import java.util.ArrayList;
import java.util.List;

import mll.filtermode.payment.chain.MonitorPaymentChain;
import mll.filtermode.payment.factoyimpl.PaymentStatusMonitor;
import mll.filtermode.payment.factoyimpl.TwiceCallMonitor;
import mll.filtermode.yb.chain.MonitorYBChain;
import mll.filtermode.yb.factoryimpl.FailedBeyondMonitor;
import mll.filtermode.yb.factoryimpl.OrderstatusMonitor;
import mll.filtermode.yb.factoryimpl.FilterOrderLogMonitor;

/**
 * <p>��������</br>������д��ע��</p>
 * @author liushengling Email:liushengling@co-mall.com
 * @company ���������ȷ�����������޹�˾@��Ȩ����
 * @version 
 * @since 2017��3��8������3:50:35
 */

public class Demo {
	
	public static void main(String[] args) {
		/*MonitorYBChain ybChain = new MonitorYBChain();
		ybChain.addFilter(new FilterOrderLogMonitor());
		ybChain.addFilter(new OrderstatusMonitor());
		ybChain.addFilter(new FailedBeyondMonitor());
		ybChain.execute("����ӆ��");
		
		System.out.println("\n");
		MonitorPaymentChain paymentChain = new MonitorPaymentChain();
		paymentChain.addFilter(new PaymentStatusMonitor());
		paymentChain.addFilter(new TwiceCallMonitor());
		paymentChain.execute("֧��У�");*/
		
		List<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(4);
		Integer num = 4;
		System.out.println(list.contains(num));
	}
	
}
