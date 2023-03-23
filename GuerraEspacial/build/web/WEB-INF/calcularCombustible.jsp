<%@ page language="java" %>
<!DOCTYPE html>
<html>

    <link href="estilos.css" rel="stylesheet" type="text/css"/>
<style>
            
            
            h1 {
                font-size: 70px;
                text-align: center;
                color: greenyellow;
            }

            body {
                background-image: url(https://estaticos-cdn.prensaiberica.es/clip/e9683705-6726-4b1c-82a2-230b6a19ca21_16-9-aspect-ratio_default_0.jpg);
                background-position: downcenter ;
                background-repeat: no-repeat;
                background-size: cover;
            }

        </style>
<body>
  <h1 class="estilo-texto">resultados</h1>
  
</body>
</html>
<%@ page import="java.util.ArrayList" %>
<%@ page import="java.util.List" %>
<%@ page import="javax.servlet.http.*" %>
<%@ page import="javax.servlet.*" %>
<%@ page import="GuerraCivilImperial" %>
<%@ page import="HalconMilenario" %>
<%@ page import="DestructorEstelar" %>
<%@ page import="LanzaderaImperial" %>
<%
// Recuperar los valores enviados por el formulario
int halconCantidad = Integer.parseInt(request.getParameter("halcon-milenario-cantidad"));
int halconPersonas = Integer.parseInt(request.getParameter("halcon-milenario-personas"));
double halconConsumo = Double.parseDouble(request.getParameter("halcon-milenario-consumo"));

int destructorCantidad = Integer.parseInt(request.getParameter("destructor-estelar-cantidad"));
int destructorPersonas = Integer.parseInt(request.getParameter("destructor-estelar-personas"));
double destructorConsumo = Double.parseDouble(request.getParameter("destructor-estelar-consumo"));

int lanzaderaCantidad = Integer.parseInt(request.getParameter("lanzadera-imperial-cantidad"));
int lanzaderaPersonas = Integer.parseInt(request.getParameter("lanzadera-imperial-personas"));
double lanzaderaConsumo = Double.parseDouble(request.getParameter("lanzadera-imperial-consumo"));

int supremacyCantidad = Integer.parseInt(request.getParameter("supremacy-cantidad"));
int supremacyPersonas = Integer.parseInt(request.getParameter("supremacy-personas"));
double supremacyConsumo = Double.parseDouble(request.getParameter("supremacy-consumo"));
int supremacyNaves = Integer.parseInt(request.getParameter("supremacy-naves-transportables"));

int atatCantidad = Integer.parseInt(request.getParameter("at-at-cantidad"));
int atatPersonas = Integer.parseInt(request.getParameter("at-at-personas"));
double atatConsumo = Double.parseDouble(request.getParameter("at-at-consumo"));

// Crear las instancias de cada tipo de nave
HalconMilenario halcon = new HalconMilenario(halconPersonas, halconConsumo);
DestructorEstelar destructor = new DestructorEstelar(destructorPersonas, destructorConsumo);
LanzaderaImperial lanzadera = new LanzaderaImperial(lanzaderaPersonas, lanzaderaConsumo);
Supremacy supremacy = new Supremacy(supremacyPersonas, supremacyConsumo, supremacyNaves);
AtAt atat = new AtAt(atatPersonas, atatConsumo);

// Agregar las instancias a una lista
List<Nave> naves = new ArrayList<>();
for (int i = 0; i < halconCantidad; i++) {
    naves.add(halcon);
}
for (int i = 0; i < destructorCantidad; i++) {
    naves.add(destructor);
}
for (int i = 0; i < lanzaderaCantidad; i++) {
    naves.add(lanzadera);
}
for (int i = 0; i < supremacyCantidad; i++) {
    naves.add(supremacy);
}
for (int i = 0; i < atatCantidad; i++) {
    naves.add(atat);
}

// Calcular el combustible total necesario
double parsecs = Double.parseDouble(request.getParameter("parsecs"));
double combustibleTotal = 0;
for (Nave nave : naves) {
    if (nave instanceof Supremacy) {
        combustibleTotal += nave.calcularCombustible(parsecs, 1.1);
    } else if (nave instanceof AtAt) {
        combustibleTotal += nave.calcularCombustible(parsecs, 0.75);
    } else {
        combustibleTotal += nave.calcularCombustible(parsecs);
    }
}

// Mostrar el resultado
out.println("<html>");
out.println("<head><title>Combustible necesario</title></head>");
out.println("<body>");
out.println("<p>El combustible total necesario es: " + combustibleTotal + " L</p>");
out.println("</body>");
out.println("</html>");
%>