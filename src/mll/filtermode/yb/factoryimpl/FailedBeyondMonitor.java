package mll.filtermode.yb.factoryimpl;



/**
 * <p>��������</br>������д��ע��</p>
 * @author liushengling Email:liushengling@co-mall.com
 * @company ���������ȷ�����������޹�˾@��Ȩ����
 * @version 
 * @since 2017��3��8������3:34:27
 */

public class FailedBeyondMonitor implements MonitorYBFactory {

	@Override
	public void monitor(String request) {
		System.out.println("����ƶ�ʧ�ܼ��  request: " + request);
	}

}
