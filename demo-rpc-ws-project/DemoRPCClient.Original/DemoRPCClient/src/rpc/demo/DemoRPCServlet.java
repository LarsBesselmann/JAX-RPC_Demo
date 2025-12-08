package rpc.demo;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.xml.rpc.ServiceException;
import javax.xml.rpc.Stub;
import javax.xml.rpc.holders.StringHolder;


/**
 * Servlet implementation class HelloServlet
 */
@WebServlet("/DemoRPCServlet")
public class DemoRPCServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public DemoRPCServlet() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
        String firstName = request.getParameter("firstName");
        String lastName = request.getParameter("lastName");
        request.setAttribute("firstName", firstName);
        request.setAttribute("lastName", lastName);
        
        Person lookup = new Person();
        lookup.setFirstName(firstName);
        lookup.setLastName(lastName);
        
        Stub stub = createProxy();
        DemoRPC_PortType demo= (DemoRPC_PortType)stub;
        Person foundPerson = demo.demoPerson(lookup);

        request.setAttribute("firstName", foundPerson.getFirstName());
        request.setAttribute("lastName", foundPerson.getLastName());
		request.setAttribute("placeOfBirth", foundPerson.getPlaceOfBirth());
		request.setAttribute("age", foundPerson.getAge());
		request.getRequestDispatcher("webservice_demo.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}
	
    private static Stub createProxy() {
        // Note: MyHello_Impl is implementation-specific.
        try {
			return (Stub)(new DemoRPC_ServiceLocator().getPort(DemoRPC_PortType.class));
		} catch (ServiceException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
    }

}
