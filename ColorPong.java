package com.sephiasky.app;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class ColorPong
 */
@WebServlet("/JHbfnY1JXms")
public class ColorPong extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     *
     * @see HttpServlet#HttpServlet()
     */
    public ColorPong() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String state_call = request.getParameter("s");
		HttpSession session = request.getSession();
		String game_name = (String) session.getAttribute("GameName");
		RequestDispatcher error = request.getRequestDispatcher("/Error.html");
	    if(state_call == null && game_name.equals("color pong")) {
	    	doGameDesc(request, response);
	    }else if(game_name.equals("color pong")) {
	    	if(state_call.contentEquals("play")) {
		    	doSimpleGame(request, response);
		    }else if(state_call.contentEquals("main1")) {
		    	session.invalidate();
		    	response.sendRedirect("http://www.sephiasky.com/ColorGame.html");
		    }else if(state_call.contentEquals("main2")) {
		    	session.invalidate();
		    	response.sendRedirect("http://www.sephiasky.com/CasualGames.html");
		    }else if(state_call.contentEquals("main3")) {
		    	session.invalidate();
		    	response.sendRedirect("http://www.sephiasky.com/ActionGames.html");
		    }else {
		    	error.forward(request, response);
		    }
	    }else {
	    	error.forward(request, response);
	    }
	    
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
		doGet(request, response);
	}
	
	protected void doGameDesc(HttpServletRequest request, HttpServletResponse response) throws ServletException {
		response.setContentType("text/html");
	    PrintWriter out;
		try {
			out = response.getWriter();
		    out.println("<!doctype html>\r\n" + 
		    		"<html lang=\"en\">\r\n" + 
		    		"  <head>\r\n" + 
		    		"    <!-- Required meta tags -->\r\n" + 
		    		"    <meta charset=\"utf-8\">\r\n" + 
		    		"    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n" + 
		    		"    <meta http-http-equiv=\"X-UA-Compatible\" content=\"ie=edge\">\r\n" + 
		    		"    <link rel=\"stylesheet\" href=\"bootstrap/css/bootstrap.min.css\" integrity=\"sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO\" crossorigin=\"anonymous\">\r\n" + 
		    		"\r\n" + 
		    		"    <title>SEPHIA SKY</title>\r\n" + 
		    		"  </head>\r\n" + 
		    		"  <body>\r\n" + 
		    		"    <div class=\"container\">\r\n" + 
		    		"      <nav class=\"navbar navbar-dark bg-dark m-4\">\r\n" + 
		    		"        <a href=\"http://www.sephiasky.com/index.html\" class=\"navbar-brand font-weight-bold\">\r\n" + 
		    		"        SEPHIA SKY\r\n" + 
		    		"      </a>\r\n" + 
		    		"        <button class=\"navbar-toggler ml-auto\"\r\n" + 
		    		"            type=\"button\"\r\n" + 
		    		"            data-toggle=\"collapse\"\r\n" + 
		    		"            data-target=\"#nav2\">\r\n" + 
		    		"          <span class=\"navbar-toggler-icon\">\r\n" + 
		    		"        </span>\r\n" + 
		    		"        </button>\r\n" + 
		    		"        <div class=\"navbar-collapse collapse\"\r\n" + 
		    		"          id=\"nav2\">\r\n" + 
		    		"          <ul class=\"navbar-nav mx-auto\">\r\n" + 
		    		"            <li class=\"nav-item dropdown\">\r\n" + 
		    		"              <a class=\"nav-link dropdown-toggle\" id=\"navbarDropdownMenuLink\" data-toggle=\"dropdown\"\r\n" + 
		    		"                        aria-haspopup=\"true\" aria-expanded=\"false\">Games</a>\r\n" + 
		    		"                          <div class=\"dropdown-menu dropdown-primary bg-dark\" aria-labelledby=\"navbarDropdownMenuLink\">\r\n" + 
		    		"                                <a class=\"dropdown-item text-light bg-dark\" href=\"/serv/toport?game=ColoredPong&s=main1\">Colorfu</a>\r\n" + 
		    		"                                <a class=\"dropdown-item text-light bg-dark\" href=\"/serv/toport?game=ColoredPong&s=main3\">Action</a>\r\n" + 
		    		"                                <a class=\"dropdown-item text-light bg-dark\" href=\"/serv/toport?game=ColoredPong&s=main2\">Casual</a>\r\n" + 
		    		"                          </div>\r\n" + 
		    		"              </li>\r\n" + 
		    		"            <li class=\"nav-item\">\r\n" + 
		    		"              <a class=\"nav-link\"\r\n" + 
		    		"              href=\"http://www.sephiasky.com/About.html\">About</a>\r\n" + 
		    		"            </li>\r\n" + 
		    		"            <li class=\"nav-item\">\r\n" + 
		    		"              <a class=\"nav-link\"\r\n" + 
		    		"              href=\"http://www.sephiasky.com/ContactUs.html\">Contact Us</a>\r\n" + 
		    		"            </li>\r\n" + 
		    		"          </ul>\r\n" + 
		    		"        </div>\r\n" + 
		    		"      </nav>");
		    out.println("        <div class=\"row\">\r\n" + 
		    		"          <div class=\"card col-4 offset-1\" style=\"width: 1rem;\">\r\n" + 
		    		"              <img src=\"bootstrap/images/1pic.jpg\" class=\"card-img-top\" alt=\"...\">\r\n" + 
		    		"              <div class=\"card-body\">\r\n" + 
		    		"                <h5 class=\"card-title\">Card title</h5>\r\n" + 
		    		"                <p class=\"card-text\">Some quick example text to build on the card title and make up the bulk of the card's content.</p>\r\n" + 
		    		"                <a href=\"/serv/toport?game=ColoredPong&s=play\" class=\"card-link\">Play</a>\r\n" + 
		    		"              </div>\r\n" + 
		    		"            </div>\r\n" + 
		    		"        </div>\r\n" + 
		    		"    </div>\r\n" + 
		    		"\r\n" + 
		    		"    <script src=\"bootstrap/js/jquery-3.3.1.slim.min.js\" integrity=\"sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo\" crossorigin=\"anonymous\"></script>\r\n" + 
		    		"    <script src=\"bootstrap/js/bootstrap.bundle.min.js\"></script>\r\n" + 
		    		"  </body>\r\n" + 
		    		"</html>");
		    out.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block

		}

	}
	
	protected void doSimpleGame(HttpServletRequest request, HttpServletResponse response) {
		response.setContentType("text/html");
	    PrintWriter out;
		try {
			out = response.getWriter();
		    out.println("<!DOCTYPE html>\r\n" + 
		    		"<html lang=\"\">\r\n" + 
		    		"<head>\r\n" + 
		    		"    <meta charset=\"UTF-8\">\r\n" + 
		    		"    <meta name=\"viewport\" content=\"user-scalable=0, initial-scale=1,minimum-scale=1, maximum-scale=1, width=device-width, minimal-ui=1\">\r\n" + 
		    		"    <meta http-http-equiv=\"X-UA-Compatible\" content=\"ie=edge\">\r\n" + 
		    		"    <link rel=\"stylesheet\" href=\"bootstrap/css/bootstrap.min.css\" integrity=\"sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO\" crossorigin=\"anonymous\">\r\n" + 
		    		"    <title>Game Title Here</title>\r\n" + 
		    		"    <script src=\"phaser/phaser.min.js\">\r\n" + 
		    		"    </script>\r\n" + 
		    		"    <script src=\"colorpong/js/main.js\"></script>\r\n" +
		    		"    <script src=\"colorpong/js/fontLoader.js\"></script>\r\n" +
		    		"    <script src=\"colorpong/js/constants.js\"></script>\r\n" +
		    		"    <script src=\"colorpong/js/scenes/sceneMain.js\"></script>\r\n" + 
		    		"    <script src=\"colorpong/js/scenes/sceneTitle.js\"></script>\r\n" + 
		    		"    <script src=\"colorpong/js/scenes/sceneOver.js\"></script>\r\n" + 
		    		"    <script src=\"colorpong/js/scenes/sceneLoad.js\"></script>\r\n" + 
		    		"    <script src=\"colorpong/js/classes/mc/model.js\"></script>\r\n" + 
		    		"    <script src=\"colorpong/js/classes/mc/controller.js\"></script>\r\n" + 
		    		"    <script src=\"colorpong/js/classes/comps/scoreBox.js\"></script>\r\n" + 
		    		"    <script src=\"colorpong/js/classes/comps/bar.js\"></script>\r\n" + 
		    		"    <script src=\"colorpong/js/classes/util/align.js\"></script>\r\n" + 
		    		"    <script src=\"colorpong/js/classes/util/alignGrid.js\"></script>\r\n" +
		    		"    <script src=\"colorpong/js/classes/util/collision.js\"></script>\r\n" +
		    		"    <script src=\"colorpong/js/classes/util/mediaManager.js\"></script>\r\n" +
		    		"    <script src=\"colorpong/js/classes/ui/flatButton.js\"></script>\r\n" +
		    		"    <script src=\"colorpong/js/classes/ui/toggleButton.js\"></script>\r\n" + 
		    		"    <script src=\"colorpong/js/classes/ui/soundButtons.js\"></script>\r\n" + 
		    		"</head>");
		    out.println("<body>\r\n" + 
		    		"  <div class=\"container\">\r\n" + 
		    		"    <nav class=\"navbar navbar-dark bg-dark m-4\">\r\n" + 
		    		"      <a href=\"http://www.sephiasky.com/index.html\" class=\"navbar-brand font-weight-bold\">\r\n" + 
		    		"      SEPHIA SKY\r\n" + 
		    		"    </a>\r\n" + 
		    		"      <button class=\"navbar-toggler ml-auto\"\r\n" + 
		    		"          type=\"button\"\r\n" + 
		    		"          data-toggle=\"collapse\"\r\n" + 
		    		"          data-target=\"#nav2\">\r\n" + 
		    		"        <span class=\"navbar-toggler-icon\">\r\n" + 
		    		"      </span>\r\n" + 
		    		"      </button>\r\n" + 
		    		"      <div class=\"navbar-collapse collapse\"\r\n" + 
		    		"        id=\"nav2\">\r\n" + 
		    		"        <ul class=\"navbar-nav mx-auto\">\r\n" + 
		    		"          <li class=\"nav-item dropdown\">\r\n" + 
		    		"            <a class=\"nav-link dropdown-toggle\" id=\"navbarDropdownMenuLink\" data-toggle=\"dropdown\"\r\n" + 
		    		"                      aria-haspopup=\"true\" aria-expanded=\"false\">Games</a>\r\n" + 
		    		"                          <div class=\"dropdown-menu dropdown-primary bg-dark\" aria-labelledby=\"navbarDropdownMenuLink\">\r\n" + 
		    		"                                <a class=\"dropdown-item text-light bg-dark\" href=\"/serv/toport?game=ColoredPong&s=main1\">Colorfu</a>\r\n" + 
		    		"                                <a class=\"dropdown-item text-light bg-dark\" href=\"/serv/toport?game=ColoredPong&s=main3\">Action</a>\r\n" + 
		    		"                                <a class=\"dropdown-item text-light bg-dark\" href=\"/serv/toport?game=ColoredPong&s=main2\">Casual</a>\r\n" + 
		    		"                          </div>\r\n" +  
		    		"            </li>\r\n" + 
		    		"          <li class=\"nav-item\">\r\n" + 
		    		"            <a class=\"nav-link\"\r\n" + 
		    		"            href=\"http://www.sephiasky.com/About.html\">About</a>\r\n" + 
		    		"          </li>\r\n" + 
		    		"          <li class=\"nav-item\">\r\n" + 
		    		"            <a class=\"nav-link\"\r\n" + 
		    		"            href=\"http://www.sephiasky.com/ContactUs.html\">Contact Us</a>\r\n" + 
		    		"          </li>\r\n" + 
		    		"        </ul>\r\n" + 
		    		"      </div>\r\n" + 
		    		"    </nav>\r\n" + 
		    		"    <div class=\"container text-center\" id='phaser-game'>\r\n" + 
		    		"  </div>");
		    out.println("<script src=\"bootstrap/js/jquery-3.3.1.slim.min.js\" integrity=\"sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo\" crossorigin=\"anonymous\"></script>\r\n" + 
		    		"<script src=\"bootstrap/js/bootstrap.bundle.min.js\"></script>\r\n" + 
		    		"</body>\r\n" + 
		    		"</html>");
		    out.close();
		} catch (IOException e) {
			
		}

	}

}
