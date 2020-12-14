package com.sephiasky.app;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * How to use Get to send and pass parameter localhost/webapp/toport?parameter=value&parameter2=value2
 * Servlet implementation class FrontEnd
 */
@WebServlet("/toport")
public class FrontEnd extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public FrontEnd() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String game_params =request.getParameter("game");
		RequestDispatcher color_pong = request.getRequestDispatcher("/JHbfnY1JXms");
		RequestDispatcher dodge_challenge = request.getRequestDispatcher("/b4Jxbvj1lRs");
		RequestDispatcher neutral_zone = request.getRequestDispatcher("/3rksBUjOz8E");
		HttpSession session = request.getSession();
		
		 try {	
					if(game_params.equals("ColoredPong")){if(session.isNew() || session== null) {session.setAttribute("GameName", "color pong");}color_pong.forward(request, response);
					}else 
					if(game_params.equals("DodgeRacing")){if(session.isNew() || session== null) {session.setAttribute("GameName", "dodge car");}dodge_challenge.forward(request, response);
					}else 
					if(game_params.equals("StarShipBattle")){if(session.isNew() || session== null) {session.setAttribute("GameName", "neutral zone");}neutral_zone.forward(request, response);
					}
			
		  }catch(NullPointerException ex) {
			  
		  }catch(Exception ex){
		    
		  }
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
