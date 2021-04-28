/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
//de poder realizar la conexion con la bd
import java.sql.Connection;
import java.sql.DriverManager;
//de poder realizar las sentencias sql, create, insert, delete, drop, update, alter
import java.sql.Statement;
//de poder realizar las consultas a la bd
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletConfig;

/**
 *
 * @author EMOA1
 */
public class Editar extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    
    private Connection con;
    private Statement set;
    private ResultSet rs;
    
    //vamos a crear el metodo constructor
    
    public void init(ServletConfig cfg) throws ServletException{
        //para conectarnos con la bd
        String url = "jdbc:mysql:3306//localhost/registro4iv7";
                    //driver:gestorbd:puerto//IP/nombrebd
                    
        String userName = "root";
        String password = "Edgar777";
        
        try{
            
            Class.forName("com.mysql.jdbc.Driver");
            /*
            a veces el driver ya maneja por defecto el puerto de comunicacion
            es por ello que pueden mandar un error, en ese caso
            url = "jdbc:mysql://localhost/registro4iv7";
            */
            url = "jdbc:mysql://localhost/registro4iv7";
            con = DriverManager.getConnection(url, userName, password);
            set = con.createStatement();
            
            System.out.println("Se ha conectado a la BD");
        
        }catch(Exception e ){
            System.out.println("No se ha conectado a la BD");
            System.out.println(e.getMessage());
            System.out.println(e.getStackTrace());
        
        }
    }
    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
        throws ServletException, IOException {
       response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet Editar</title>");   
            out.println("<link rel='stylesheet' href='css/Estilo.css'>");
            out.println("</head>");
            out.println("<body>");
            
            int option; 
            int id,Nedad;
            String Nnom,Nappat,Napmat,Ncorreo;
            
            id = Integer.parseInt(request.getParameter("ideditar"));
            option = Integer.parseInt(request.getParameter("Noperacion"));
            Nnom = request.getParameter("nombreN");
            Nappat = request.getParameter("appatN");
            Napmat = request.getParameter("appmatN");
            Ncorreo = request.getParameter("emailN");
            Nedad = Integer.parseInt(request.getParameter("edadN"));
            
            /*
            para poder eliminar es 
            delete from nombretabla where atributo (condicion) valor
            */
            String q1,q2,q3,q4,q5,q6;
            
            try{
                String w = "select * from mregistro";
                set = con.createStatement();
                rs = set.executeQuery(w);
                int idRegistados;
                while(rs.next()){
                    idRegistados = rs.getInt("id_usu");
                    if(idRegistados == id){
                        
                                        switch(option){
                                case 1:
                                    q1="UPDATE mregistro SET nom_usu = '"+Nnom+"' where id_usu ="+id; 
                                    try{
                                            set.executeUpdate(q1);
                                            System.out.println("Registro modificado con exito");

                                            out.println("<h1>Registro Modificado</h1>");
                                        }catch(Exception e){
                                            out.println("<h1>El registro no se pudo modificar, sucedio un error</h1>");
                                            System.out.println("Error al modificar el registro");
                                            System.out.println(e.getMessage());
                                            System.out.println(e.getStackTrace());
                                        }
                                    break;
                               case 2:
                                    q2="UPDATE mregistro SET appat_usu = '"+Nappat+"' where id_usu ="+id;
                                    try{
                                            set.executeUpdate(q2);
                                            System.out.println("Registro modificado con exito");

                                            out.println("<h1>Registro Modificado</h1>");
                                        }catch(Exception e){
                                            out.println("<h1>El registro no se pudo modificar, sucedio un error</h1>");
                                            System.out.println("Error al modificar el registro");
                                            System.out.println(e.getMessage());
                                            System.out.println(e.getStackTrace());
                                        }
                                    break;
                               case 3:
                                   q3="UPDATE mregistro SET apmat_usu = '"+Napmat+"' where id_usu ="+id; 
                                   try{
                                            set.executeUpdate(q3);
                                            System.out.println("Registro modificado con exito");

                                            out.println("<h1>Registro Modificado</h1>");
                                        }catch(Exception e){
                                            out.println("<h1>El registro no se pudo modificar, sucedio un error</h1>");
                                            System.out.println("Error al modificar el registro");
                                            System.out.println(e.getMessage());
                                            System.out.println(e.getStackTrace());
                                        }
                                    break;
                                case 4:
                                    q4="UPDATE mregistro SET edad_usu = '"+Nedad+"' where id_usu ="+id; 
                                    try{
                                            set.executeUpdate(q4);
                                            System.out.println("Registro modificado con exito");

                                            out.println("<h1>Registro Modificado</h1>");
                                        }catch(Exception e){
                                            out.println("<h1>El registro no se pudo modificar, sucedio un error</h1>");
                                            System.out.println("Error al modificar el registro");
                                            System.out.println(e.getMessage());
                                            System.out.println(e.getStackTrace());
                                        }
                                    break;
                                case 5:
                                     q5="UPDATE mregistro SET email_usu = '"+Ncorreo+"' where id_usu ="+id; 
                                     try{
                                            set.executeUpdate(q5);
                                            System.out.println("Registro modificado con exito");

                                            out.println("<h1>Registro Modificado</h1>");
                                        }catch(Exception e){
                                            out.println("<h1>El registro no se pudo modificar, sucedio un error</h1>");
                                            System.out.println("Error al modificar el registro");
                                            System.out.println(e.getMessage());
                                            System.out.println(e.getStackTrace());
                                        }
                                    break;
                                case 6:
                                    q6="UPDATE mregistro SET nom_usu = '"+Nnom+"', appat_usu = '"+Nappat+"',"
                                            + " apmat_usu = '"+Napmat+"', edad_usu = '"+Nedad+"', email_usu = '"+Ncorreo+"' where id_usu ="+id; 
                                     try{
                                            set.executeUpdate(q6);
                                            System.out.println("Registro modificado con exito");

                                            out.println("<h1>Registro Modificado</h1>");
                                        }catch(Exception e){
                                            out.println("<h1>El registro no se pudo modificar, sucedio un error</h1>");
                                            System.out.println("Error al modificar el registro");
                                            System.out.println(e.getMessage());
                                            System.out.println(e.getStackTrace());
                                        }

                                    break;
                            }

                           out.println("<a href='index.html'>Regresar al Formulario</a>"
                                    + "<br>"
                                    + "<a href='Registro'>Registrar un Nuevo Usuario</a>"
                                    + "<br>"
                                    + "<a href='Consultar'>Consultar la Tabla General de Usuarios</a>");
                            out.println("</body>");
            out.println("</html>");
                        
                    }
                }
                
            
            }catch(Exception e){
                    System.out.println("No se ha podido Consultar");
                    System.out.println(e.getMessage());
                    System.out.println(e.getStackTrace());}
            
            
            
        }
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
