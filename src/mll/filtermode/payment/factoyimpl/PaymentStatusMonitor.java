package mll.filtermode.payment.factoyimpl;



/**
 * <p>��������</br>������д��ע��</p>
 * @author liushengling Email:liushengling@co-mall.com
 * @company ���������ȷ�����������޹�˾@��Ȩ����
 * @version 
 * @since 2017��3��8������3:34:27
 */

public class PaymentStatusMonitor implements MonitorPaymentFactory {

	@Override
	public void monitor(String request) {
		System.out.println("֧���ɹ���B��һ�±O��  request: " + request);
	}

}
