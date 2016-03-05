package com.huami.hessian;

import com.caucho.hessian.server.HessianServlet;
import org.mortbay.jetty.Server;
import org.mortbay.jetty.servlet.Context;

/**
 * @author Peter Karich, peat_hal ‘at’ users ‘dot’ sourceforge ‘dot’ net
 */
public class MyServlet extends HessianServlet implements CommunicationService {

    private static final long serialVersionUID = -3429056066423924965L;

    public String communicate(String str) {
        return "Hello World! " + str;
    }

    public static void main(String[] args) throws Exception {
        Server server = new Server(8080);
        Context context = new Context(server, "/", Context.SESSIONS);
        context.addServlet(MyServlet.class, "/communication-service");
        server.start();
    }
}
