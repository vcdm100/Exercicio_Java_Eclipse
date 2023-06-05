

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Servlet implementation class CadastroAlunoServlet
 */
public class CadastroAlunoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CadastroAlunoServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
    //Quando quero pegar uma informaçâo que vem da url usamos o doGET
    //Quando tivermos uma chamada por url usamos GET
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//Quando quer uma informação que vem da url
    	String nome = request.getParameter("nome");
		String idade = request.getParameter("idade");
		// TODO Auto-generated method stub
		response.getWriter().append("Nome do Aluno: ").append(nome);
		response.getWriter().append("\n");
		response.getWriter().append("Idade do Aluno: ").append(idade);
		
		Aluno aluno = new Aluno(nome, Integer.parseInt(idade));
		request.setAttribute("nome", aluno.nome);
		RequestDispatcher view = request.getRequestDispatcher("novoAluno.jsp");
		view.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
