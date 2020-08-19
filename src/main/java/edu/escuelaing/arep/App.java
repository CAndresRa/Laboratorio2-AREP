package edu.escuelaing.arep;
import edu.escuelaing.arep.model.CalculateMeanAndDeviationService;
import java.util.Arrays;

import java.util.List;
import static spark.Spark.*;


/**
 * @author  Carlos Andrés Ramírez Torres
 */

public class App {
    public static void main( String[] args ) {
        port(getPort());
        get("/", (req, res) -> {
            return "<form action=\"/calculate\" method=\"get\">\n" +
                    "  <div>\n" +
                    "    <label for=\"decir\"> Ingrese los datos separados por coma (,) </label>\n" +
                    "    <input required name=\"lista\" id=\"lista\" value=\"\">\n" +
                    "  </div>\n" +
                    "    <button> Calcular </ button>\n" +
                    "  </div>\n" +
                    "</form>";
        });

        get("/calculate", (req, res) -> {
            String numbers = req.queryParams("lista");
            List<String> data;

            String mean;
            String standardDeviation;

            data = Arrays.asList(numbers.split(","));
            try{
                CalculateMeanAndDeviationService service = new CalculateMeanAndDeviationService(data);
                mean = "La media es: " + service.calculateMean();
                standardDeviation = "La desviación estandar es: "+ service.calculateStandardDeviation();
            }catch (Exception e){
                mean = "Por favor verifique los datos ingresados, ej (1,2,3)";
                standardDeviation = "Por favor verifique los datos ingresados, ej (1.0,2.0,3.0)";
            }


            return "<form action=\"/\" method=\"get\">\n" +
                    "  <div>\n" +
                    "    <label>"+ mean + "</label>\n" +
                    "  </div>\n" +
                    "  <div>\n" +
                    "    <label>"+ standardDeviation +"</label>\n" +
                    "  </div>\n" +
                    "    <button> Ingresar nuevos valores </ button>\n" +
                    "  </div>\n" +
                    "</form>";
        });
    }



    static int getPort() {
        if (System.getenv("PORT") != null) {
            return Integer.parseInt(System.getenv("PORT"));
        }
        return 4567; //returns default port if heroku-port isn't set (i.e. on localhost)
    }
}
