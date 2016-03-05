package com.huami.hessian;

import com.caucho.hessian.client.HessianProxyFactory;
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;

/**
 * @author Peter Karich, peat_hal ‘at’ users ‘dot’ sourceforge ‘dot’ net
 */
public class Client {

	public static void main(String[] args) throws Exception {
		String url = "http://10.0.2.4:8080/server/test";
//		String url = "http://localhost:8080/server/test";
		HessianProxyFactory factory = new HessianProxyFactory();
		final CommunicationService basic = (CommunicationService) factory.create(CommunicationService.class, url);
		System.out.println("Server said, " + basic.communicate(""));
	}
}