<%@page import="java.math.BigDecimal"%>
<%@page import="java.util.Date"%>
<%@page import="entity.Duck"%>
<%@page import="session.DuckFacadeLocal"%>
<%@page import="javax.naming.InitialContext"%>
<%
    try {
        InitialContext ctx = new InitialContext();
        DuckFacadeLocal duckEjb = (DuckFacadeLocal)ctx.lookup("java:comp/env/duck");
        
        Duck duck = new Duck(null, "Roy", new Date(), "WHITE", BigDecimal.valueOf(1.00), true);
        
        if(!duckEjb.createDuck(duck)) {
            throw new Exception("Failed already la..");
        }
        out.print("OK.");
    } catch(Exception e) {
        e.printStackTrace();
        out.print("Error: " + e.getMessage() + ".");
    } %>