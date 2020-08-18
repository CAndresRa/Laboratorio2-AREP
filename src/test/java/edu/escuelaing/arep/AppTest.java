package edu.escuelaing.arep;

import static org.junit.Assert.assertTrue;

import edu.escuelaing.arep.model.CalculateMeanAndDeviationService;
import org.junit.Assert;
import org.junit.Test;
import static org.junit.Assert.fail;
import java.util.LinkedList;
import java.util.List;

/**
 * Unit test for simple App.
 */
public class AppTest {

    @Test
    public void TheMeanShouldBeCalculatedCorrectlyPrueba1() {
        try {
            List<String> data = new LinkedList<>();
            data.add("160");
            data.add("591");
            data.add("114");
            data.add("229");
            data.add("230");
            data.add("270");
            data.add("128");
            data.add("1657");
            data.add("624");
            data.add("1503");
            CalculateMeanAndDeviationService service = new CalculateMeanAndDeviationService(data);
            String answer = service.calculateMean();
            Assert.assertEquals("550.6" , answer );
        }
        catch (Exception e) {
            fail();
        }
    }

    @Test
    public void TheMeanShouldBeCalculatedCorrectlyPrueba2() {
        try {
            List<String> data = new LinkedList<>();
            data.add("15.0");
            data.add("69.9");
            data.add("6.5");
            data.add("22.4");
            data.add("28.4");
            data.add("65.9");
            data.add("19.4");
            data.add("198.7");
            data.add("38.8");
            data.add("138.2");

            CalculateMeanAndDeviationService service = new CalculateMeanAndDeviationService(data);
            String answer = service.calculateMean();
            Assert.assertEquals("60.32000000000001" , answer );
        }
        catch (Exception e) {
            fail();
        }
    }

    @Test
    public void TheDeviationShouldBeCalculatedCorrectlyPrueba1() {
        try {
            List<String> data = new LinkedList<>();
            data.add("160");
            data.add("591");
            data.add("114");
            data.add("229");
            data.add("230");
            data.add("270");
            data.add("128");
            data.add("1657");
            data.add("624");
            data.add("1503");
            CalculateMeanAndDeviationService service = new CalculateMeanAndDeviationService(data);
            String answer = service.calculateStandardDeviation();
            Assert.assertEquals("572.026844746915" , answer );
        }
        catch (Exception e) {
            fail();
        }
    }

    @Test
    public void TheDeviationShouldBeCalculatedCorrectlyPrueba2() {
        try {
            List<String> data = new LinkedList<>();
            data.add("15.0");
            data.add("69.9");
            data.add("6.5");
            data.add("22.4");
            data.add("28.4");
            data.add("65.9");
            data.add("19.4");
            data.add("198.7");
            data.add("38.8");
            data.add("138.2");

            CalculateMeanAndDeviationService service = new CalculateMeanAndDeviationService(data);
            String answer = service.calculateStandardDeviation();
            Assert.assertEquals("62.25583060601187" , answer );
        }
        catch (Exception e) {
            fail();
        }
    }

}
